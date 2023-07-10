package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.ComunaEntity;
import com.springboot.insideClass.payload.request.Comuna.BuscarComunaRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.ComunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/comuna")
public class ComunaController {

    @Autowired
    private ComunaService comunaService;

    @PostMapping("/obtenerTodasLasComunas")
    public ResponseEntity<?> obtenerTodasLasComunas() {
        return ResponseEntity.ok(comunaService.obtenerTodosLasComunas());
    }

    @PostMapping("/obtenerComunaPorId")
    public ResponseEntity<?> obtenerComunaPorId(@Valid @RequestBody Long id) {
        return ResponseEntity.ok(comunaService.obtenerComunaPorId(id));
    }

    @PostMapping("/obtenerComunaPorFiltro")
    public ResponseEntity<?>  obtenerComunaPorFiltro(@Valid @RequestBody BuscarComunaRequest buscarComunaRequest) {
        return ResponseEntity.ok(comunaService.obtenerComunaPorFiltro(buscarComunaRequest.getComuna_id(),
                buscarComunaRequest.getComuna_nombre(),buscarComunaRequest.getComuna_provincia_id(), buscarComunaRequest.getComuna_deprov_id()));
    }

    @PostMapping("/guardarComuna")
    public ResponseEntity<?> guardarComuna(@Valid @RequestBody ComunaEntity comuna) {
        return ResponseEntity.ok(comunaService.guardarComuna(comuna));
    }

    @PostMapping("/eliminarComuna")
    public ResponseEntity<?> eliminarComuna(@Valid @RequestBody Long id) {
        comunaService.eliminarComuna(id);
        return ResponseEntity.ok(new MessageResponse("Comuna eliminada con éxito!"));
    }
}
