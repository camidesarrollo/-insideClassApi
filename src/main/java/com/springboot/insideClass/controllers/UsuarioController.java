package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.PerfilEntity;
import com.springboot.insideClass.entity.UsuarioEntity;
import com.springboot.insideClass.entity.VigenciaEntity;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.PerfilService;
import com.springboot.insideClass.service.UsuarioService;
import com.springboot.insideClass.service.VigenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    VigenciaService vigenciaService;

    @Autowired
    PerfilService perfilService;


    @PostMapping("/cambioVigencia")
    public ResponseEntity<MessageResponse> cambioVigencia(@RequestParam("id_usuario") Long id_usuario, @RequestParam("nombre_vigencia") String nombre_vigencia) {

        try {

            UsuarioEntity usuario = new UsuarioEntity();
            usuario = usuarioService.findById(id_usuario);
            if (usuario != null) {
                VigenciaEntity vigencia = vigenciaService.findByName(nombre_vigencia);
                usuario.setVigenciaEntity(vigencia);
                usuarioService.save(usuario);
            }
            return ResponseEntity.ok(new MessageResponse("Se ha cambiado la vigencia correctamente"));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Al momento de cambiar vigencia del usuario!"));
        }

    }

    @PostMapping("Search/ByRunPerfil")
    public ResponseEntity<Object> findByRunPerfil(@RequestParam("run") String run, @RequestParam("nombre_perfil") String nombre_perfil) {

        long id = -1;

        List<UsuarioEntity> usuarios = usuarioService.findByRunPerfil(run, id);

        PerfilEntity perfil1 = new PerfilEntity();
        System.out.println(nombre_perfil);
        perfil1 = perfilService.findByName(nombre_perfil);


        if(nombre_perfil.equals("-1")){
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE).body(usuarios);
        }


        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE).body(usuarios.get(0));


        /*try {

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Al momento de obtener la informacion!"));

        }*/
    }
}

