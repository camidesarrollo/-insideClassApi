package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.PerfilEntity;
import com.springboot.insideClass.payload.request.Perfil.BuscarPerfilRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/perfil")
public class PerfilController {

    @Autowired
    private PerfilService perfilService;

    @PostMapping("/obtenerTodos")
    public List<PerfilEntity> obtenerTodosLosPerfiles() {
        return perfilService.obtenerTodosLosPerfiles();
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<PerfilEntity> obtenerPerfilPorId(@Valid @RequestBody  Long id) {
        Optional<PerfilEntity> perfil = perfilService.obtenerPerfilPorId(id);
        if (perfil.isPresent()) {
            return ResponseEntity.ok(perfil.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<PerfilEntity>> obtenerPerfilesPorFiltro(@Valid @RequestBody BuscarPerfilRequest buscarPerfilRequest) {
        List<PerfilEntity> perfiles = perfilService.obtenerPerfilesPorFiltro(
                buscarPerfilRequest.getPerfil_id(),
                buscarPerfilRequest.getPerfil_nombre());

        if (perfiles.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(perfiles);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<PerfilEntity> guardarPerfil(@Valid @RequestBody PerfilEntity perfil) {
        PerfilEntity nuevoPerfil = perfilService.guardarPerfil(perfil);
        return ResponseEntity.ok(nuevoPerfil);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<MessageResponse> eliminarPerfil(@Valid @RequestBody  Long id) {
        perfilService.eliminarPerfil(id);
        return ResponseEntity.ok(new MessageResponse("Perfil eliminado con éxito!"));
    }
}
