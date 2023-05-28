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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
            if (id_usuario == null || id_usuario <= 0) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: El ID de usuario no es válido"));
            }

            if (nombre_vigencia == null || nombre_vigencia.isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: El nombre de la vigencia no es válido"));
            }

            UsuarioEntity usuario = usuarioService.findById(id_usuario);
            if (usuario == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessageResponse("Error: No se encontró el usuario con el ID especificado"));
            }

            VigenciaEntity vigencia = vigenciaService.findByName(nombre_vigencia);
            if (vigencia == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessageResponse("Error: No se encontró la vigencia con el nombre especificado"));
            }

            usuario.setVigenciaEntity(vigencia);
            usuarioService.save(usuario);

            return ResponseEntity.ok(new MessageResponse("Se ha cambiado la vigencia correctamente"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new MessageResponse("Error: Al momento de cambiar vigencia del usuario"));
        }
    }

    @PostMapping("Search/ByRunPerfil")
    public ResponseEntity<Object> findByRunPerfil(@RequestParam("run") String run, @RequestParam("nombre_perfil") String nombre_perfil) {
        try {
            if (run == null || run.isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: El valor del campo 'run' no es válido"));
            }

            if (nombre_perfil == null || nombre_perfil.isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: El valor del campo 'nombre_perfil' no es válido"));
            }

            long id = -1;
            List<UsuarioEntity> usuarios = usuarioService.findByRunPerfil(run, id);

            PerfilEntity perfil1 = perfilService.findByName(nombre_perfil);

            if (nombre_perfil.equals("-1")) {
                return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE).body(usuarios);
            }

            if (usuarios.size() > 0) {
                return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE).body(usuarios.get(0));
            }

            return ResponseEntity.ok().body(new MessageResponse("No se ha encontrado usuario con ese rut"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new MessageResponse("Error: Al momento de obtener la información"));
        }
    }
}

