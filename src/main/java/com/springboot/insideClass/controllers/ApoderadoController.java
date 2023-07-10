package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.ApoderadoEntity;
import com.springboot.insideClass.payload.request.Apoderado.BuscarApoderadoRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.ApoderadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/apoderado")
public class ApoderadoController {

    @Autowired
    private ApoderadoService apoderadoService;

    @PostMapping("/obtenerTodosLosApoderados")
    public ResponseEntity<?> obtenerTodosLosApoderados() {
        return ResponseEntity.ok(apoderadoService.obtenerTodosLosApoderados());
    }

    @PostMapping("/obtenerApoderadoPorId")
    public ResponseEntity<?> obtenerApoderadoPorId(@Valid @RequestBody Long id) {
        return ResponseEntity.ok(apoderadoService.obtenerApoderadoPorId(id));
    }

    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<?>  obtenerPorFiltro(@Valid @RequestBody BuscarApoderadoRequest buscarApoderadoRequest) {
        return ResponseEntity.ok(apoderadoService.obtenerApoderadoPorFiltro(buscarApoderadoRequest.getId(), buscarApoderadoRequest.getApoderado_persona_run()));
    }

    @PostMapping("/guardarApoderado")
    public ResponseEntity<?> guardarApoderado(@Valid @RequestBody ApoderadoEntity apoderado) {
        return ResponseEntity.ok(apoderadoService.guardarApoderado(apoderado));
    }

    @DeleteMapping("/eliminarApoderado")
    public ResponseEntity<?> eliminarApoderado(@Valid @RequestBody Long id) {
        apoderadoService.eliminarApoderado(id);
        return ResponseEntity.ok(new MessageResponse("Apoderado eliminado con éxito!"));
    }
}
