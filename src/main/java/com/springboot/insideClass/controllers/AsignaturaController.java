package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.AsignaturaEntity;
import com.springboot.insideClass.payload.request.Asignatura.BuscarAsignaturaCursoDocenteEstablecimientoRequest;
import com.springboot.insideClass.payload.request.Asignatura.BuscarAsignaturaRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.AsignaturaService;
import com.springboot.insideClass.service.CursoEstablecimientoService;
import com.springboot.insideClass.service.Docente_Asignatura_Curso_EstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/asignatura")
public class AsignaturaController {

    @Autowired
    AsignaturaService asignaturaService;

    @Autowired
    Docente_Asignatura_Curso_EstablecimientoService docente_asignatura_curso_establecimientoService;

    @Autowired
    CursoEstablecimientoService cursoEstablecimientoService;

    @PostMapping("/Get")
    public  ResponseEntity<?> obtenerTodosLasAsignaturas() {

        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                .body(asignaturaService.obtenerTodosLasAsignaturas());
    }

    @PostMapping("/GetById")
    public ResponseEntity<AsignaturaEntity> obtenerAsignaturaPorId(@Valid @RequestBody Long id) {
        Optional<AsignaturaEntity> asignatura = asignaturaService.obtenerAsignaturaPorId(id);
        if (asignatura.isPresent()) {
            return ResponseEntity.ok(asignatura.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/GetByFilter")
    public ResponseEntity<List<AsignaturaEntity>> obtenerPerfilesPorFiltro(@Valid @RequestBody BuscarAsignaturaRequest buscarAsignaturaRequest) {
        List<AsignaturaEntity> asignatura = asignaturaService.obtenerAsignaturaPorFiltro(
                buscarAsignaturaRequest.getAsignatura_id(),
                buscarAsignaturaRequest.getAsignatura_nombre());

        if (asignatura.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(asignatura);
        }
    }

    @PostMapping("/Save")
    public ResponseEntity<AsignaturaEntity> guardarAsignatura(@Valid @RequestBody AsignaturaEntity asignatura) {
        AsignaturaEntity nuevoAsignatura = asignaturaService.guardarAsignatura(asignatura);
        return ResponseEntity.ok(nuevoAsignatura);
    }

    @DeleteMapping("/Delete")
    public ResponseEntity<MessageResponse> eliminarAsignatura(@Valid @RequestBody  Long id) {
        asignaturaService.eliminarAsignatura(id);
        return ResponseEntity.ok(new MessageResponse("Asignatura eliminado con éxito!"));
    }
    @PostMapping("/obtenerAsignaturaPorDocenteEstablcimiento")
    public ResponseEntity<?>  obtenerAsignaturaPorDocenteEstablcimiento(@Valid @RequestBody BuscarAsignaturaCursoDocenteEstablecimientoRequest buscarAsignaturaDocenteEstablecimientoRequest) {
        return ResponseEntity.ok(asignaturaService.findByAsignaturaCursoDocente(buscarAsignaturaDocenteEstablecimientoRequest.getAsignatura_id(),
                buscarAsignaturaDocenteEstablecimientoRequest.getAsignatura_nombre()
        , buscarAsignaturaDocenteEstablecimientoRequest.getCurso_id(),
                buscarAsignaturaDocenteEstablecimientoRequest.getCurso_nombre(),
                buscarAsignaturaDocenteEstablecimientoRequest.getDocente_id(),
                buscarAsignaturaDocenteEstablecimientoRequest.getDocente_persona_run(),
                buscarAsignaturaDocenteEstablecimientoRequest.getCurso_establecimiento_establecimiento_id()));
    }

}
