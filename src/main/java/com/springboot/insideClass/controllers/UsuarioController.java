package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.PerfilEntity;
import com.springboot.insideClass.entity.UsuarioEntity;
import com.springboot.insideClass.entity.VigenciaEntity;
import com.springboot.insideClass.payload.request.Usuario.BuscarUsuarioRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.PerfilService;
import com.springboot.insideClass.service.UsuarioService;
import com.springboot.insideClass.service.VigenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private VigenciaService vigenciaService;

    @Autowired
    private PerfilService perfilService;

    @PostMapping("/obtenerTodos")
    public ResponseEntity<List<UsuarioEntity>> obtenerTodosLosUsuarios() {
        List<UsuarioEntity> usuarios = usuarioService.obtenerTodosLosUsuarios();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<UsuarioEntity> obtenerUsuarioPorId(@Validated @RequestBody  Long id) {
        Optional<UsuarioEntity> usuario = usuarioService.obtenerUsuarioPorId(id);
        return usuario.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<UsuarioEntity>> buscarUsuariosPorFiltro(@Validated @RequestBody  BuscarUsuarioRequest request) {
        List<UsuarioEntity> usuarios = usuarioService.buscarUsuariosPorFiltro(request.getId(), request.getUsername(), request.getEmail(), request.getPassword(), request.getUsuario_perfil_id(), request.getUsuario_persona_run(),  request.getUsuario_vigencia_id());
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<UsuarioEntity> guardarUsuario(@Validated @RequestBody  UsuarioEntity usuario) {
        UsuarioEntity usuarioGuardado = usuarioService.guardarUsuario(usuario);
        return new ResponseEntity<>(usuarioGuardado, HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<Void> eliminarVigencia(@Valid @RequestBody Long id) {
        usuarioService.eliminarUsuario(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/cambioVigencia")
    public ResponseEntity<MessageResponse> cambioVigencia(@RequestParam("id_usuario") Long id_usuario, @RequestParam("nombre_vigencia") String nombre_vigencia) {
        try {
            if (id_usuario == null || id_usuario <= 0) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: El ID de usuario no es válido"));
            }

            if (nombre_vigencia == null || nombre_vigencia.isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: El nombre de la vigencia no es válido"));
            }

            Optional<UsuarioEntity> usuarios = usuarioService.obtenerUsuarioPorId(id_usuario);
            if (usuarios == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessageResponse("Error: No se encontró el usuario con el ID especificado"));
            }

            List<VigenciaEntity> vigencia = vigenciaService.buscarVigenciasPorFiltro(-1L,nombre_vigencia);
            if (vigencia == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessageResponse("Error: No se encontró la vigencia con el nombre especificado"));
            }
            UsuarioEntity usuario = usuarios.get();
            usuario.setVigencia(vigencia.get(0));
            usuarioService.guardarUsuario(usuario);

            return ResponseEntity.ok(new MessageResponse("Se ha cambiado la vigencia correctamente"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new MessageResponse("Error: Al momento de cambiar vigencia del usuario"));
        }
    }

    @PostMapping("Search/ByRunPerfil")
    public ResponseEntity<Object> findByRunPerfil(@RequestParam("run") String run, @RequestParam("nombre_perfil") String nombre_perfil) {
       /* try {

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new MessageResponse("Error: Al momento de obtener la información"));
        }*/

        if (run == null || run.isEmpty()) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: El valor del campo 'run' no es válido"));
        }

        if (nombre_perfil == null || nombre_perfil.isEmpty()) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: El valor del campo 'nombre_perfil' no es válido"));
        }

        long id = -1;
        List<UsuarioEntity> usuarios = usuarioService.buscarUsuariosPorFiltro(-1L,
                "-1", "-1", "-1", id, run, 1L);

        List<PerfilEntity> perfil1 = perfilService.obtenerPerfilesPorFiltro(-1L,nombre_perfil);

        if (nombre_perfil.equals("-1")) {
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE).body(usuarios);
        }

        if (usuarios.size() > 0) {
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE).body(usuarios.get(0));
        }

        return ResponseEntity.ok().body(new MessageResponse("No se ha encontrado usuario con ese rut"));
    }
}
