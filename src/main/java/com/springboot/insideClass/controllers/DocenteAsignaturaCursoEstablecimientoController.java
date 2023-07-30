package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Metodos;
import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.entity.DocenteAsignaturaEntity;
import com.springboot.insideClass.entity.DocenteEntity;
import com.springboot.insideClass.entity.Docente_Asignatura_Curso_EstablecimientoEntity;
import com.springboot.insideClass.payload.request.DocenteAsignaturaCursoEstablecimiento.CrearRequest;
import com.springboot.insideClass.payload.request.DocenteAsignaturaCursoEstablecimiento.EliminarDocenteAsignaturaCursoEstablecimientoRequest;
import com.springboot.insideClass.payload.request.DocenteAsignaturaCursoEstablecimiento.ObtenerPorIndexadoRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/docente_asignatura_curso_establecimiento")
public class DocenteAsignaturaCursoEstablecimientoController {

    @Autowired private CursoEstablecimientoService cursoEstablecimientoService;

    @Autowired private DocenteAsignaturaService docenteAsignaturaService;

    @Autowired private DocenteService docenteService;

    @Autowired private AsignaturaService asignaturaService;

    @Autowired
    private Docente_Asignatura_Curso_EstablecimientoService docenteAsignaturaCursoEstablecimientoService;

    @Autowired private Docente_Asignatura_Curso_EstablecimientoService docente_asignatura_curso_establecimientoService;
    @Autowired private ComunicacionesService comunicacionesService;

    @Autowired private Metodos metodos;


    @PostMapping("/obtenerTodos")
    public ResponseEntity<List<Docente_Asignatura_Curso_EstablecimientoEntity>> obtenerTodosLosDocenteAsignaturaCursoEstablecimiento() {
        List<Docente_Asignatura_Curso_EstablecimientoEntity> lista = docenteAsignaturaCursoEstablecimientoService.obtenerTodosLosDocenteAsignaturaCursoEstablecimiento();
        return ResponseEntity.ok(lista);
    }

    @PostMapping("/obtenerDocenteAsignaturaCursoEstablecimientoPorId")
    public ResponseEntity<Docente_Asignatura_Curso_EstablecimientoEntity> obtenerDocenteAsignaturaCursoEstablecimientoPorId(@Valid @RequestBody Long id) {
        return docenteAsignaturaCursoEstablecimientoService.obtenerDocenteAsignaturaCursoEstablecimientoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/Create")
    public ResponseEntity<Docente_Asignatura_Curso_EstablecimientoEntity> guardarDocenteAsignaturaCursoEstablecimiento(@Valid @RequestBody CrearRequest cursoEstablecimiento) {

        if(docenteAsignaturaService.obtenerDocenteAsignaturaPorFiltro(cursoEstablecimiento.getAsignatura_id(), "-1", -1L, cursoEstablecimiento.getPersona_run()).size() == 0){
            DocenteAsignaturaEntity docenteAsignatura = docenteAsignaturaService.guardarDocenteAsignatura(new DocenteAsignaturaEntity(
                    asignaturaService.obtenerAsignaturaPorId(cursoEstablecimiento.getAsignatura_id()).get(),
                    docenteService.obtenerDocentesPorFiltro(-1L,cursoEstablecimiento.getPersona_run()).get(0)
            ));
        }

        CursoEstablecimientoEntity cursoEstablecimiento1 = cursoEstablecimientoService.obtenerCursosEstablecimientoPorFiltro(
                -1L, cursoEstablecimiento.getCurso_id(), cursoEstablecimiento.getEstablecimiento_id(), true
        ).get(0);

        System.out.println(cursoEstablecimiento1.getCurso_establecimiento_id());

        Docente_Asignatura_Curso_EstablecimientoEntity nuevoCursoEstablecimiento = docenteAsignaturaCursoEstablecimientoService.guardarDocenteAsignaturaCursoEstablecimiento(
                new Docente_Asignatura_Curso_EstablecimientoEntity(
                        docenteAsignaturaService.obtenerDocenteAsignaturaPorFiltro(cursoEstablecimiento.getAsignatura_id(), "-1", -1L, cursoEstablecimiento.getPersona_run()).get(0),
                        cursoEstablecimiento1,
                        cursoEstablecimiento.getFecha_inicio(),
                        cursoEstablecimiento.getFecha_fin(),
                        cursoEstablecimiento.getDocente_jefe()
                )
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoCursoEstablecimiento);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<?> eliminarDocenteAsignaturaCursoEstablecimiento(@Valid @RequestBody Long id) {
        docenteAsignaturaCursoEstablecimientoService.eliminarDocenteAsignaturaCursoEstablecimiento(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/desactivar")
    public ResponseEntity<?> desactivarDocenteAsignaturaCursoEstablecimiento(@Valid @RequestBody EliminarDocenteAsignaturaCursoEstablecimientoRequest request) {
        List<CursoEstablecimientoEntity> cursoEstablecimiento = cursoEstablecimientoService.obtenerCursosEstablecimientoPorFiltro(-1L, request.getCurso_id(), request.getEstablecimiento_id(), true);

        if(cursoEstablecimiento.size() == 0){
            return ResponseEntity.badRequest().body(new MessageResponse("no se ha encontrado curso registradp para el establecimiento"));
        }

        List<DocenteEntity> docenteEntities = docenteService.obtenerDocentesPorFiltro(-1L, request.getRun_docente());

        if(docenteEntities.size() == 0){
            return ResponseEntity.badRequest().body(new MessageResponse("no se ha encontrado docente registrado en el sistema"));
        }

        List<DocenteAsignaturaEntity> docenteAsignaturaEntities = docenteAsignaturaService.obtenerDocenteAsignaturaPorFiltro(request.getAsignatura_id(), "-1", docenteEntities.get(0).getDocente_id(), docenteEntities.get(0).getPersona().getPersona_run() );

        if(docenteAsignaturaEntities.size() == 0){
            return ResponseEntity.badRequest().body(new MessageResponse("no se ha encontrado docente registrado para la asignatura indicada"));

        }

        List<Docente_Asignatura_Curso_EstablecimientoEntity> docente_asignatura_curso_establecimiento =
                docenteAsignaturaCursoEstablecimientoService.obtenerDocenteAsignaturaCursoEstablecimientoPorFiltro(-1L,cursoEstablecimiento.get(0).getCurso_establecimiento_id() ,docenteAsignaturaEntities.get(0).getDocente_asignatura_id(), "-1", "-1", metodos.convertirFechaACalendar(request.getFecha_inicio()).get(Calendar.YEAR),metodos.convertirFechaACalendar(request.getFecha_fin()).get(Calendar.YEAR));

        if(docente_asignatura_curso_establecimiento.size() == 0){
            return ResponseEntity.badRequest().body(new MessageResponse("no se ha encontrado docente registrado en el establecimiento, asigatura ni curso indicado"));
        }

        Docente_Asignatura_Curso_EstablecimientoEntity dace = docente_asignatura_curso_establecimiento.get(0);
        dace.setFecha_fin(new Date());
        docenteAsignaturaCursoEstablecimientoService.guardarDocenteAsignaturaCursoEstablecimiento(dace);
        return ResponseEntity.ok(new MessageResponse("Docente desactivado con exito!"));
    }

    @PostMapping("/TraerDocenteCursoAsignatura")
    public ResponseEntity<List<Docente_Asignatura_Curso_EstablecimientoEntity>> TraerDocenteCursoAsignatura(@Valid @RequestBody ObtenerPorIndexadoRequest traerDocenteRequest) {


        return ResponseEntity.ok(docente_asignatura_curso_establecimientoService.obtenerDocenteAsignaturaCursoEstablecimientoPorFiltroIndexado(
                traerDocenteRequest.getDocente_id(),
                traerDocenteRequest.getDocente_persona_run(),
                traerDocenteRequest.getAsignatura_id(),
                traerDocenteRequest.getAsignatura_nombre(),
                traerDocenteRequest.getCurso_id(),
                traerDocenteRequest.getCurso_nivel(),
                traerDocenteRequest.getCurso_nombre(),
                traerDocenteRequest.getEstablecimiento_id(),
                traerDocenteRequest.getEstablecimiento_nombre(),
                traerDocenteRequest.getFecha_inicio(),
                traerDocenteRequest.getFecha_fin(),
                traerDocenteRequest.getAnio_incio(),
                traerDocenteRequest.getAnio_fin()));
    }

    @PostMapping("/TraerDocenteCursoAsignaturaVigente")
    public ResponseEntity<List<Docente_Asignatura_Curso_EstablecimientoEntity>> TraerDocenteCursoAsignaturaVigente(@Valid @RequestBody ObtenerPorIndexadoRequest traerDocenteRequest) {


        return ResponseEntity.ok(docente_asignatura_curso_establecimientoService.obtenerDocenteAsignaturaCursoEstablecimientoPorFiltroVigente(
                traerDocenteRequest.getDocente_id(),
                traerDocenteRequest.getDocente_persona_run(),
                traerDocenteRequest.getAsignatura_id(),
                traerDocenteRequest.getAsignatura_nombre(),
                traerDocenteRequest.getCurso_id(),
                traerDocenteRequest.getCurso_nivel(),
                traerDocenteRequest.getCurso_nombre(),
                traerDocenteRequest.getEstablecimiento_id(),
                traerDocenteRequest.getEstablecimiento_nombre(),
                traerDocenteRequest.getFecha_inicio(),
                traerDocenteRequest.getFecha_fin(),
                traerDocenteRequest.getAnio_incio(),
                traerDocenteRequest.getAnio_fin()));
    }
}

