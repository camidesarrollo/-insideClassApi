package com.springboot.insideClass.controllers;
import com.springboot.insideClass.entity.VigenciaEntity;
import com.springboot.insideClass.payload.request.Vigencia.BuscarVigenciaRequest;
import com.springboot.insideClass.service.VigenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vigencia")
public class VigenciaController {

    @Autowired
    private VigenciaService vigenciaService;

    @PostMapping("/obtenerTodos")
    public ResponseEntity<List<VigenciaEntity>> obtenerTodasLasVigencias() {
        List<VigenciaEntity> vigencias = vigenciaService.obtenerTodasLasVigencias();
        return new ResponseEntity<>(vigencias, HttpStatus.OK);
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<VigenciaEntity> obtenerVigenciaPorId(@Valid @RequestBody Long id) {
        Optional<VigenciaEntity> vigencia = vigenciaService.obtenerVigenciaPorId(id);
        return vigencia.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<VigenciaEntity>> buscarVigenciasPorFiltro(@Valid @RequestBody BuscarVigenciaRequest request) {
        List<VigenciaEntity> vigencias = vigenciaService.buscarVigenciasPorFiltro(request.getVigencia_id(), request.getVigencia_nombre());
        return new ResponseEntity<>(vigencias, HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<VigenciaEntity> guardarVigencia(@Valid @RequestBody VigenciaEntity vigencia) {
        VigenciaEntity vigenciaGuardada = vigenciaService.guardarVigencia(vigencia);
        return new ResponseEntity<>(vigenciaGuardada, HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<Void> eliminarVigencia(@Valid @RequestBody Long id) {
        vigenciaService.eliminarVigencia(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
