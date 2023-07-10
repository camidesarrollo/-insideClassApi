package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Metodos;
import com.springboot.insideClass.entity.CursoEntity;
import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.payload.request.Curso.BuscarCursoPorApoderado;
import com.springboot.insideClass.payload.request.Curso.BuscarCursoPorDirector;
import com.springboot.insideClass.payload.request.Curso.BuscarCursoPorDocenteRequest;
import com.springboot.insideClass.payload.request.Curso.BuscarCursoRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.CursoEstablecimientoService;
import com.springboot.insideClass.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @Autowired
    private CursoEstablecimientoService cursoEstablecimientoService;

    @Autowired
    private Metodos metodos;

    @PostMapping("/obtenerTodosLosCursos")
    public ResponseEntity<?> obtenerTodosLosCursos() {
        return ResponseEntity.ok(cursoService.obtenerTodosLosCursos());
    }

    @PostMapping("/obtenerCursoPorId")
    public ResponseEntity<?> obtenerCursoPorId(@Valid @RequestBody Long id) {
        return ResponseEntity.ok(cursoService.obtenerCursoPorId(id));
    }
    @PostMapping("/obtenerCursoPorFiltro")
    public ResponseEntity<?>  obtenerCursoPorFiltro(@Valid @RequestBody BuscarCursoRequest buscarCursoRequest) {
        return ResponseEntity.ok(cursoService.obtenerCursoPorFiltro(buscarCursoRequest.getCurso_id(), buscarCursoRequest.getCurso_nombre(), buscarCursoRequest.getCurso_nivel()));
    }

    @PostMapping("/guardarCurso")
    public ResponseEntity<?> guardarCurso(@Valid @RequestBody CursoEntity curso) {
        return ResponseEntity.ok(cursoService.guardarCurso(curso));
    }

    @PostMapping("/eliminarCurso")
    public ResponseEntity<?> eliminarCurso(@Valid @RequestBody Long id) {
        cursoService.eliminarCurso(id);
        return ResponseEntity.ok(new MessageResponse("Curso eliminado con éxito!"));
    }

    @PostMapping("/obtenerCursosEstablecimiento")
    public ResponseEntity<?>  obtenerCursosEstablecimiento(@Valid @RequestParam("id_establecimient") Long establecimiento_id) {

        List<CursoEstablecimientoEntity> cursoEstablecimientoEntities = cursoEstablecimientoService.obtenerCursosEstablecimientoPorFiltro(-1L, -1L, establecimiento_id, true);

        List<CursoEntity> curso = new ArrayList<>();

        for (CursoEstablecimientoEntity cursoEstablecimiento : cursoEstablecimientoEntities){
            Optional<CursoEntity> curso1 = cursoService.obtenerCursoPorId(cursoEstablecimiento.getCurso_establecimiento_id());

            if(curso1 != null){
                curso.add(curso1.get());
            }
        }

        return ResponseEntity.ok(curso);
    }

    @PostMapping("/obtenerPorDocente")
    public ResponseEntity<?>  obtenerPorDocente(@Valid @RequestBody BuscarCursoPorDocenteRequest buscarCursoPorDocenteRequest) {

        List<CursoEntity> curso = cursoService.obtenerPorDocente(
                buscarCursoPorDocenteRequest.getDocente_asignatura_docente_id(),
                buscarCursoPorDocenteRequest.getDocente_asignatura_id_asignatura_id(),
                metodos.formatDate(buscarCursoPorDocenteRequest.getFecha_fin()),
                buscarCursoPorDocenteRequest.isVigencia(),
                buscarCursoPorDocenteRequest.getCurso_establecimiento_curso_id(),
                buscarCursoPorDocenteRequest.getCurso_establecimiento_establecimiento_id());


        return ResponseEntity.ok(curso);
    }

    @PostMapping("/obtenerPorApoderado")
    public ResponseEntity<?>  obtenerPorApoderado(@Valid @RequestBody BuscarCursoPorApoderado buscarCursoPorApoderado) {

        List<CursoEntity> curso = cursoService.obtenerPorApoderado(buscarCursoPorApoderado.getVigencia(),
                buscarCursoPorApoderado.getCurso_establecimiento_curso_id(),
                buscarCursoPorApoderado.getCurso_establecimiento_establecimiento_id(),
                buscarCursoPorApoderado.getVigenciaMatricula(), buscarCursoPorApoderado.getCurso_agno(), buscarCursoPorApoderado.getMatricula_apoderado_id(), buscarCursoPorApoderado.getMatricula_alumno_id());


        return ResponseEntity.ok(curso);
    }

    @PostMapping("/obtenerPorDirector")
    public ResponseEntity<?>  obtenerPorDirector(@Valid @RequestBody BuscarCursoPorDirector buscarCursoPorDirector) {

        List<CursoEntity> curso = cursoService.obtenerPorDirector(buscarCursoPorDirector.getVigencia(), buscarCursoPorDirector.getCurso_establecimiento_curso_id(), buscarCursoPorDirector.getCurso_establecimiento_establecimiento_id(), buscarCursoPorDirector.getDirector_id(), buscarCursoPorDirector.getDirector_persona_run());


        return ResponseEntity.ok(curso);
    }


}
