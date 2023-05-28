package com.springboot.insideClass.controllers;

import com.springboot.insideClass.configuration.security.jwt.JwtUtils;
import com.springboot.insideClass.entity.PerfilEntity;
import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.entity.UsuarioEntity;
import com.springboot.insideClass.entity.VigenciaEntity;
import com.springboot.insideClass.payload.request.LoginRequest;
import com.springboot.insideClass.payload.request.SignupRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.payload.response.UserInfoResponse;
import com.springboot.insideClass.repository.UsuarioRepository;
import com.springboot.insideClass.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UsuarioRepository userRepository;

  @Autowired
  PasswordEncoder encoder;

  @Autowired
  JwtUtils jwtUtils;

  @Autowired
  PerfilService perfilService;

  @Autowired
  VigenciaService vigenciaService;

  @Autowired
  PersonaService personaService;

  @Autowired
  EmailSenderService emailSenderService;

  @Autowired
  DirectorService directorService;

    @Autowired
    DocenteService docenteService;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    ApoderadoService apoderadoService;


  @PostMapping("/signin") //LOGIN
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

    UsuarioEntity usuario = usuarioService.VerificaIngresor(loginRequest.getUsername());
    String userName = loginRequest.getUsername();
    if(usuario != null){
        System.out.println("Usuario no da null " + usuario.getUsername());
        userName = usuario.getUsername();
    }
    Authentication authentication = authenticationManager
        .authenticate(new UsernamePasswordAuthenticationToken(userName, loginRequest.getPassword()));

    SecurityContextHolder.getContext().setAuthentication(authentication);

    UsuarioDetailsImpl userDetails = (UsuarioDetailsImpl) authentication.getPrincipal();

    ResponseCookie jwtCookie = jwtUtils.generateJwtCookie(userDetails);

    List<String> roles = userDetails.getAuthorities().stream()
        .map(item -> item.getAuthority())
        .collect(Collectors.toList());

    System.out.println(roles.get(0));

    roles.forEach(role -> System.out.println(role));


    Object[] arr = new Object[4];



    PersonaEntity personaEntity = personaService.findByRun(usuario.getPersonaEntity().getPersona_run());
    List<PerfilEntity> perfilList = perfilService.findByUsuarioRun(usuario.getPersonaEntity().getPersona_run());

      List<String> roles2 = perfilList.stream()
              .map(PerfilEntity::getPerfil_nombre)
              .collect(Collectors.toList());


      arr[0] = new UserInfoResponse(userDetails.getId(),
            userDetails.getUsername(),
            userDetails.getEmail(),
              roles2,
            jwtCookie.toString() );
      arr[1] = personaEntity;
      arr[2] = usuario.getPerfilEntity();


    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, jwtCookie.toString())
        .body(arr);
  }

  @PostMapping("/signup")
  public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
    if (userRepository.existsByUsername(signUpRequest.getUsername())>0) {
      return ResponseEntity.badRequest().body(new MessageResponse("Error: Username is already taken!"));
    }

    if (userRepository.existsByEmail(signUpRequest.getEmail()) > 0) {
      return ResponseEntity.badRequest().body(new MessageResponse("Error: Email is already in use!"));
    }
System.out.println(signUpRequest.getPassword());    // Create new user's account
    UsuarioEntity user = new UsuarioEntity(signUpRequest.getUsername(),
                         signUpRequest.getEmail(),
                         encoder.encode(signUpRequest.getPassword()));


    PerfilEntity perfil = perfilService.findByName(signUpRequest.getPerfil());
    VigenciaEntity vigencia = vigenciaService.findByName(signUpRequest.getVigencia());
    PersonaEntity persona = personaService.findByRun(signUpRequest.getRut());
    if(perfil == null){
      return ResponseEntity.ok(new MessageResponse("No se han encontrado el perfil"));
    }else if(vigencia == null){
      return ResponseEntity.ok(new MessageResponse("No se han encontrado la vigencia"));
    }else if(persona == null){
      return ResponseEntity.ok(new MessageResponse("No se han encontrado la persona"));
    }

    user.setPerfilEntity(perfil);
    user.setVigenciaEntity(vigencia);
    user.setPersonaEntity(persona);

    userRepository.save(user);

    String body = "Creación de cuenta con exito. Username:" + signUpRequest.getUsername() + "Password: " + signUpRequest.getPassword();

    emailSenderService.sendSimpleEmail(signUpRequest.getEmail(), body, "Creacion de cuenta");

    return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
  }

  @PostMapping("/signout")
  public ResponseEntity<?> logoutUser() {
    ResponseCookie cookie = jwtUtils.getCleanJwtCookie();
    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, cookie.toString())
        .body(new MessageResponse("You've been signed out!"));
  }
}
