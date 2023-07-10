package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.DependenciaEntity;
import com.springboot.insideClass.payload.request.Dependencia.BuscarDependenciaRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.DependenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/dependencias")
public class DependenciaController {

    @Autowired
    private DependenciaService dependenciaService;

    @PostMapping("/obtenerTodos")
    public List<DependenciaEntity> obtenerTodosLasDependencias() {
        return dependenciaService.obtenerTodosLasDependencias();
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<DependenciaEntity> obtenerDependenciaPorId(@Valid @RequestBody Long id) {
        Optional<DependenciaEntity> dependencia = dependenciaService.obtenerDependenciaPorId(id);
        if (dependencia.isPresent()) {
            return ResponseEntity.ok(dependencia.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<DependenciaEntity>> obtenerDependenciasPorFiltro(@Valid @RequestBody BuscarDependenciaRequest buscarDependenciaRequest) {
        List<DependenciaEntity> dependencias = dependenciaService.obtenerDependenciasPorFiltro(
                buscarDependenciaRequest.getDependencia_id(),
                buscarDependenciaRequest.getDependencia_nombre());

        if (dependencias.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(dependencias);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<DependenciaEntity> guardarDependencia(@Valid @RequestBody DependenciaEntity dependencia) {
        DependenciaEntity nuevaDependencia = dependenciaService.guardarDependencia(dependencia);
        return ResponseEntity.ok(nuevaDependencia);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<MessageResponse> eliminarDependencia(@Valid @RequestBody  Long id) {
        dependenciaService.eliminarDependencia(id);
        return ResponseEntity.ok(new MessageResponse("Dependencia eliminada con éxito!"));
    }
}
