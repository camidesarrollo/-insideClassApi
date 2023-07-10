package com.springboot.insideClass.controllers;
import com.springboot.insideClass.entity.TipoAreaEntity;
import com.springboot.insideClass.payload.request.TipoArea.BuscarTipoAreaRequest;
import com.springboot.insideClass.service.TipoAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tipo-area")
public class TipoAreaController {

    @Autowired
    private TipoAreaService tipoAreaService;

    @PostMapping("/obtenerTodos")
    public ResponseEntity<List<TipoAreaEntity>> obtenerTodosLosTiposArea() {
        List<TipoAreaEntity> tiposArea = tipoAreaService.obtenerTodosLosTiposArea();
        return new ResponseEntity<>(tiposArea, HttpStatus.OK);
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<TipoAreaEntity> obtenerTipoAreaPorId(@Validated @RequestBody  Long id) {
        Optional<TipoAreaEntity> tipoArea = tipoAreaService.obtenerTipoAreaPorId(id);
        return tipoArea.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<TipoAreaEntity>> buscarTiposAreaPorFiltro(@Validated @RequestBody  BuscarTipoAreaRequest request) {
        List<TipoAreaEntity> tiposArea = tipoAreaService.buscarTiposAreaPorFiltro(request.getTipo_area_id(), request.getTipo_area_nombre());
        return new ResponseEntity<>(tiposArea, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TipoAreaEntity> guardarTipoArea(@Validated @RequestBody  TipoAreaEntity tipoArea) {
        TipoAreaEntity tipoAreaGuardado = tipoAreaService.guardarTipoArea(tipoArea);
        return new ResponseEntity<>(tipoAreaGuardado, HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<Void> eliminarVigencia(@Validated @RequestBody Long id) {
        tipoAreaService.eliminarTipoArea(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
