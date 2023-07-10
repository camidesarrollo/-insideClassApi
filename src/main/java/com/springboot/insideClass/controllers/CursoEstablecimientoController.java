package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.payload.request.CursoEstablecimiento.BuscarCursoEstablecimientoRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.CursoEstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/cursoEstablecimiento")
public class CursoEstablecimientoController {


    @Autowired
    private CursoEstablecimientoService cursoEstablecimientoService;

    @PostMapping("/obtenerTodosLosCursos")
    public ResponseEntity<?> obtenerTodosLosCursosEstablecimiento() {
        return ResponseEntity.ok(cursoEstablecimientoService.obtenerTodosLosCursosEstablecimiento());
    }

    @PostMapping("/obtenerCursoPorId")
    public ResponseEntity<?> obtenerCursosEstablecimientoPorId(@Valid @RequestBody Long id) {
        return ResponseEntity.ok(cursoEstablecimientoService.obtenerCursosEstablecimientoPorId(id));
    }
    @PostMapping("/obtenerCursoPorFiltro")
    public ResponseEntity<?>  obtenerCursosEstablecimientoPorFiltro(@Valid @RequestBody BuscarCursoEstablecimientoRequest buscarCursoEstablecimientoRequest) {
        return ResponseEntity.ok(cursoEstablecimientoService.obtenerCursosEstablecimientoPorFiltro(
                buscarCursoEstablecimientoRequest.getCurso_establecimiento_id(),
                buscarCursoEstablecimientoRequest.getCurso_establecimiento_curso_id(),
                buscarCursoEstablecimientoRequest.getCurso_establecimiento_establecimiento_id(),
                buscarCursoEstablecimientoRequest.getVigencia()
               ));
    }

    @PostMapping("/guardarCurso")
    public ResponseEntity<?> guardarCursosEstablecimiento(@Valid @RequestBody CursoEstablecimientoEntity cursoEstablecimiento) {
        return ResponseEntity.ok(cursoEstablecimientoService.guardarCursosEstablecimiento(cursoEstablecimiento));
    }

    @PostMapping("/eliminarCurso")
    public ResponseEntity<?> eliminarCursosEstablecimiento(@Valid @RequestBody Long id) {
        cursoEstablecimientoService.eliminarCursosEstablecimiento(id);
        return ResponseEntity.ok(new MessageResponse("Curso eliminado con éxito!"));
    }
}
