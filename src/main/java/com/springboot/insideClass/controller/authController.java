package com.springboot.insideClass.controller;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;


import com.springboot.insideClass.entity.perfilEntity;
import com.springboot.insideClass.entity.personaEntity;
import com.springboot.insideClass.entity.usuarioEntity;
import com.springboot.insideClass.entity.vigenciaEntity;
import com.springboot.insideClass.payload.request.LoginRequest;
import com.springboot.insideClass.payload.request.SignupRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.payload.response.UserInfoResponse;
import com.springboot.insideClass.repository.personaRepository;
import com.springboot.insideClass.repository.usuarioRepository;
import com.springboot.insideClass.service.perfilService;
import com.springboot.insideClass.service.personaService;
import com.springboot.insideClass.service.vigenciaService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
@SecurityRequirement(name = "insideClassapi")
public class authController {

    @Autowired
    usuarioRepository userRepository;


    @Autowired
    personaService personaSer;

    @Autowired
    perfilService perfilSer;

    @Autowired
    vigenciaService vigenciaSer;

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signupRequest) {

        if (userRepository.existsByUsername(signupRequest.getUsuario_nickName()) == 0) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Username is already taken!"));
        }

        personaEntity persona =  personaSer.findByUsuarioName(signupRequest.getUsuario_nickName());
        perfilEntity perfil = perfilSer.findByUsuarioId(signupRequest.getUsuario_nickName());
        vigenciaEntity vigencia = vigenciaSer.findByUsername(signupRequest.getUsuario_nickName());
        usuarioEntity user = new usuarioEntity(
        persona,
        signupRequest.getUsuario_nickName(),
        signupRequest.getUsuario_password(),
                vigencia,
        perfil);

        userRepository.save(user);

        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }



}
