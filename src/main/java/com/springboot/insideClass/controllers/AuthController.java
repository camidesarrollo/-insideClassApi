package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Correo;
import com.springboot.insideClass.componet.SecurityCodeGenerator;
import com.springboot.insideClass.configuration.security.jwt.JwtUtils;
import com.springboot.insideClass.entity.PerfilEntity;
import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.entity.RecoveryCodeEntity;
import com.springboot.insideClass.entity.UsuarioEntity;
import com.springboot.insideClass.payload.request.CambiarContraseña.cambiarContraseñaRequest;
import com.springboot.insideClass.payload.request.CodigoRecuperacion.CodigoVerificacionRequest;
import com.springboot.insideClass.payload.request.CodigoRecuperacion.RecuperarContrasenaRequest;
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
import java.util.Calendar;
import java.util.Date;
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


    @Autowired
    RecoveryCodeService recoveryCodeService;

    @Autowired
    SecurityCodeGenerator generator;

  @Autowired private Correo correo;

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
          persona = buscarUsuariosPorFiltroUserName.get(0).getPersona();
          usuario = buscarUsuariosPorFiltroUserName.get(0);
      }
      if(buscarUsuariosPorFiltroEmail.size() > 0 ){
          userName = buscarUsuariosPorFiltroEmail.get(0).getUsername();
          persona = buscarUsuariosPorFiltroEmail.get(0).getPersona();
          usuario = buscarUsuariosPorFiltroEmail.get(0);
      }

      if(buscarUsuariosPorFiltroRun.size() > 0 ){
          userName = buscarUsuariosPorFiltroRun.get(0).getUsername();
          persona = buscarUsuariosPorFiltroRun.get(0).getPersona();
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

    roles.forEach(role -> System.out.println(role));


    Object[] arr = new Object[4];


      List<UsuarioEntity> usuarioList = usuarioService.buscarUsuariosPorFiltro(-1L, "-1", "-1", "-1", -1L, persona.getPersona_run(), 1L);
      List<PerfilEntity> perfilList = new ArrayList<>();

      for (UsuarioEntity usuario1 : usuarioList) {
        System.out.println("Obteniendo roles");
        System.out.println(usuario1.getPerfil().getPerfil_id());
          perfilList.add(usuario1.getPerfil());
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
      arr[2] = usuario.getPerfil();


    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, jwtCookie.toString())
        .body(arr);
  }


  @PostMapping("/signout")
  public ResponseEntity<?> logoutUser() {
    ResponseCookie cookie = jwtUtils.getCleanJwtCookie();
    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, cookie.toString())
        .body(new MessageResponse("You've been signed out!"));
  }


  @PostMapping("/enviar-codigo")
  public ResponseEntity<?> enviarCodigo(@Valid @RequestBody RecuperarContrasenaRequest recuperarContrasenaRequest) {
    if (recuperarContrasenaRequest.getRut() == null || recuperarContrasenaRequest.getRut().isEmpty()
            || recuperarContrasenaRequest.getCorreo() == null || recuperarContrasenaRequest.getCorreo().isEmpty()) {
      return ResponseEntity.badRequest().body(new MessageResponse("Faltan campos por completar."));
    }

    // El objeto recuperarContrasenaRequest es válido, procede con la lógica de tu aplicación
    // Verificar si corresponde a un usuario
    List<UsuarioEntity> buscarUsuariosPorFiltroUserName = usuarioService.buscarUsuariosPorFiltro(-1L,
            recuperarContrasenaRequest.getCorreo(), "-1", "-1", -1L, recuperarContrasenaRequest.getRut(), -1L);

    if(buscarUsuariosPorFiltroUserName.size() == 0){

    }
    Calendar calendar = Calendar.getInstance(); // Obtiene la fecha y hora actual
    calendar.add(Calendar.MINUTE, 20); // Agrega 20 minutos

    RecoveryCodeEntity recoveryCodeEntity = new RecoveryCodeEntity(
            generator.generarCodigoSeguridad(8),
            buscarUsuariosPorFiltroUserName.get(0),
            calendar.getTime()
    );


    recoveryCodeService.crearRecoveryCode(recoveryCodeEntity);

    correo.enviarCorreoCodigoVerificacion(recuperarContrasenaRequest.getCorreo(), recoveryCodeEntity.getRecoveryCode());

    return ResponseEntity.ok(new MessageResponse("Se ha enviado codigo de verificación al correo."));
  }

  @PostMapping("/verificar-codigo")
  public ResponseEntity<?> verificarCodigo(@Valid @RequestBody CodigoVerificacionRequest codigoVerificacionRequest) {

    // Verifica que los campos no estén vacíos
    if (codigoVerificacionRequest.getRut() == null || codigoVerificacionRequest.getRut().isEmpty()
            || codigoVerificacionRequest.getCorreo() == null || codigoVerificacionRequest.getCorreo().isEmpty()
            || codigoVerificacionRequest.getCodigoVerificacion() == null || codigoVerificacionRequest.getCodigoVerificacion().isEmpty()) {
      return ResponseEntity.badRequest().body("Los campos 'rut', 'correo' y 'codigoVerificacion' son requeridos.");
    }

    List<UsuarioEntity> buscarUsuariosPorFiltroUserName = usuarioService.buscarUsuariosPorFiltro(-1L,
            codigoVerificacionRequest.getCorreo(), "-1", "-1", -1L, codigoVerificacionRequest.getRut(), -1L);

    if(buscarUsuariosPorFiltroUserName.size() == 0){
      return ResponseEntity.badRequest().body("Error");
    }

    System.out.println(codigoVerificacionRequest.getCodigoVerificacion());
    System.out.println(buscarUsuariosPorFiltroUserName.get(0).getId());
    RecoveryCodeEntity recoveryCodeEntity = recoveryCodeService.obtenerCodigoVerificacionFiltros(-1L,"-1",codigoVerificacionRequest.getCodigoVerificacion(), buscarUsuariosPorFiltroUserName.get(0).getId());

    if(recoveryCodeEntity == null){
      return ResponseEntity.badRequest().body("Error");
    }

    if (recoveryCodeEntity.getExpirationDateTime().before(new Date())) {
      return ResponseEntity.ok(new MessageResponse("Codigo expirado"));
    }


    return ResponseEntity.ok(new MessageResponse("Codigo verificado correctamente"));
  }

  @PostMapping("/cambiar-contraseña")
  public ResponseEntity<?> cambiarContraseña(@Valid @RequestBody cambiarContraseñaRequest cambiarContraseñaRequest) {

    List<UsuarioEntity> buscarUsuariosPorFiltroUserName = usuarioService.buscarUsuariosPorFiltro(-1L,
            cambiarContraseñaRequest.getCorreo(), "-1", "-1", -1L, cambiarContraseñaRequest.getRut(), -1L);


    if(buscarUsuariosPorFiltroUserName.size() == 0){
      return ResponseEntity.badRequest().body("Error");
    }

    UsuarioEntity user = buscarUsuariosPorFiltroUserName.get(0);

    user.setPassword(encoder.encode(cambiarContraseñaRequest.getContraseña()));

    usuarioService.guardarUsuario(user);

    return ResponseEntity.ok(new MessageResponse("contraseña cambiada con exito"));
  }



}
