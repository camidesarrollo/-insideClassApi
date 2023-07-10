package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.SostenedorEntity;
import com.springboot.insideClass.service.SostenedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sostenedor")
public class SostenedorController {

    @Autowired
    private SostenedorService sostenedorService;

    @PostMapping("/obtenerTodos")
    public ResponseEntity<List<SostenedorEntity>> obtenerTodosLosSostenedores() {
        List<SostenedorEntity> sostenedores = sostenedorService.obtenerTodosLosSostenedores();
        return new ResponseEntity<>(sostenedores, HttpStatus.OK);
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<SostenedorEntity> obtenerSostenedorPorId(@Validated @RequestBody  Long id) {
        Optional<SostenedorEntity> sostenedor = sostenedorService.obtenerSostenedorPorId(id);
        return sostenedor.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

  /*  @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<SostenedorEntity>> buscarSostenedoresPorFiltro(@Validated @RequestBody  BuscarSostenedorRequest request) {
        List<SostenedorEntity> sostenedores = sostenedorService.buscarSostenedoresPorFiltro(request.getSostenedor_id(), request.getSostenedor_nombre(), request.getSostenedor_representante_legal_id());
        return new ResponseEntity<>(sostenedores, HttpStatus.OK);
    }*/

    @PostMapping("/guardar")
    public ResponseEntity<SostenedorEntity> guardarSostenedor(@Validated @RequestBody  SostenedorEntity sostenedor) {
        SostenedorEntity sostenedorGuardado = sostenedorService.guardarSostenedor(sostenedor);
        return new ResponseEntity<>(sostenedorGuardado, HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<Void> eliminarVigencia(@Validated @RequestBody  Long id) {
        sostenedorService.eliminarSostenedor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
