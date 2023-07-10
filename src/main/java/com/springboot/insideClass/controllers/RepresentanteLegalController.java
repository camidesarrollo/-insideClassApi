package com.springboot.insideClass.controllers;
import com.springboot.insideClass.entity.RepresentanteLegalEntity;
import com.springboot.insideClass.payload.request.RepresentanteLegal.BuscarRepresentanteLegalRequest;
import com.springboot.insideClass.service.RepresentanteLegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/representante-legal")
public class RepresentanteLegalController {

    @Autowired
    private RepresentanteLegalService representanteLegalService;

    @PostMapping("/obtenerTodos")
    public ResponseEntity<List<RepresentanteLegalEntity>> obtenerTodosLosRepresentantesLegales() {
        List<RepresentanteLegalEntity> representantesLegales = representanteLegalService.obtenerTodosLosRepresentantesLegales();
        return new ResponseEntity<>(representantesLegales, HttpStatus.OK);
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<RepresentanteLegalEntity> obtenerRepresentanteLegalPorId(@Validated @RequestBody  Long id) {
        Optional<RepresentanteLegalEntity> representanteLegal = representanteLegalService.obtenerRepresentanteLegalPorId(id);
        return representanteLegal.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<RepresentanteLegalEntity>> buscarRepresentantesLegalesPorFiltro(@Validated @RequestBody  BuscarRepresentanteLegalRequest request) {
        List<RepresentanteLegalEntity> representantesLegales = representanteLegalService.buscarRepresentantesLegalesPorFiltro(request.getRepresentante_legal_id(), request.getRepresentante_legal_persona_run());
        return new ResponseEntity<>(representantesLegales, HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<RepresentanteLegalEntity> guardarRepresentanteLegal(@Validated @RequestBody  RepresentanteLegalEntity representanteLegal) {
        RepresentanteLegalEntity representanteLegalGuardado = representanteLegalService.guardarRepresentanteLegal(representanteLegal);
        return new ResponseEntity<>(representanteLegalGuardado, HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<Void> eliminarVigencia(@Valid @RequestBody Long id) {
        representanteLegalService.eliminarRepresentanteLegal(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
