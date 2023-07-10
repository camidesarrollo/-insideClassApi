package com.springboot.insideClass.controllers;

import com.springboot.insideClass.configuration.security.jwt.JwtUtils;
import com.springboot.insideClass.entity.PerfilEntity;
import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.entity.UsuarioEntity;
import com.springboot.insideClass.payload.request.LoginRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.payload.response.UserInfoResponse;
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
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UsuarioService usuarioService;

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
    DocenteService docenteService;

    @Autowired
    ApoderadoService apoderadoService;


  @PostMapping("/signin") //LOGIN
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

    List<UsuarioEntity> buscarUsuariosPorFiltroUserName = usuarioService.buscarUsuariosPorFiltro(-1L,
            "-1", "-1", loginRequest.getUsername(), -1L, "-1", -1L);

      List<UsuarioEntity> buscarUsuariosPorFiltroEmail = usuarioService.buscarUsuariosPorFiltro(-1L,
              loginRequest.getUsername(), "-1", "-1", -1L, "-1", -1L);

      List<UsuarioEntity> buscarUsuariosPorFiltroRun = usuarioService.buscarUsuariosPorFiltro(-1L,
             "-1", "-1", "-1", -1L, loginRequest.getUsername(), -1L);

      String userName ="";
      PersonaEntity persona =new PersonaEntity();
      UsuarioEntity usuario = new UsuarioEntity();

      if(buscarUsuariosPorFiltroUserName.size() > 0 ){
          userName = buscarUsuariosPorFiltroUserName.get(0).getUsername();
          persona = buscarUsuariosPorFiltroUserName.get(0).getPersonaEntity();
          usuario = buscarUsuariosPorFiltroUserName.get(0);
      }
      if(buscarUsuariosPorFiltroEmail.size() > 0 ){
          userName = buscarUsuariosPorFiltroEmail.get(0).getUsername();
          persona = buscarUsuariosPorFiltroEmail.get(0).getPersonaEntity();
          usuario = buscarUsuariosPorFiltroEmail.get(0);
      }

      if(buscarUsuariosPorFiltroRun.size() > 0 ){
          userName = buscarUsuariosPorFiltroRun.get(0).getUsername();
          persona = buscarUsuariosPorFiltroRun.get(0).getPersonaEntity();
          usuario = buscarUsuariosPorFiltroRun.get(0);
      }

      if(userName != ""){
        System.out.println("Usuario no encontrado " + loginRequest.getUsername());
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


      List<UsuarioEntity> usuarioList = usuarioService.buscarUsuariosPorFiltro(-1L, "-1", "-1", "-1", -1L, persona.getPersona_run(), 1L);
      List<PerfilEntity> perfilList = new ArrayList<>();

      for (UsuarioEntity usuario1 : usuarioList) {
          perfilList.add(usuario1.getPerfilEntity());
      }

      List<String> roles2 = perfilList.stream()
              .map(PerfilEntity::getPerfil_nombre)
              .collect(Collectors.toList());


      arr[0] = new UserInfoResponse(userDetails.getId(),
            userDetails.getUsername(),
            userDetails.getEmail(),
              roles2,
            jwtCookie.toString() );
      arr[1] = persona;
      arr[2] = usuario.getPerfilEntity();


    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, jwtCookie.toString())
        .body(arr);
  }


  @PostMapping("/signout")
  public ResponseEntity<?> logoutUser() {
    ResponseCookie cookie = jwtUtils.getCleanJwtCookie();
    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, cookie.toString())
        .body(new MessageResponse("You've been signed out!"));
  }
}
