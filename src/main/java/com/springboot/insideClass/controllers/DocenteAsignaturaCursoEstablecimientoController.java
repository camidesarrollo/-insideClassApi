package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Metodos;
import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.entity.DocenteAsignaturaEntity;
import com.springboot.insideClass.entity.DocenteEntity;
import com.springboot.insideClass.entity.Docente_Asignatura_Curso_EstablecimientoEntity;
import com.springboot.insideClass.payload.request.Docente.TraerDocenteRequest;
import com.springboot.insideClass.payload.request.DocenteAsignaturaCursoEstablecimiento.EliminarDocenteAsignaturaCursoEstablecimientoRequest;
import com.springboot.insideClass.payload.response.Docente.InfoDocenteResponse;
import com.springboot.insideClass.payload.response.DocenteAsingaturaCursoEstablecimiento.IcursoAsignaturaEstablecimiento;
import com.springboot.insideClass.payload.response.DocenteAsingaturaCursoEstablecimiento.InfoDocenteCursoAsignaturaResponse;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.CursoEstablecimientoService;
import com.springboot.insideClass.service.DocenteAsignaturaService;
import com.springboot.insideClass.service.DocenteService;
import com.springboot.insideClass.service.Docente_Asignatura_Curso_EstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
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

    @Autowired
    private Docente_Asignatura_Curso_EstablecimientoService docenteAsignaturaCursoEstablecimientoService;

    @Autowired private Docente_Asignatura_Curso_EstablecimientoService docente_asignatura_curso_establecimientoService;
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

    @PostMapping("/guardar")
    public ResponseEntity<Docente_Asignatura_Curso_EstablecimientoEntity> guardarDocenteAsignaturaCursoEstablecimiento(@Valid @RequestBody Docente_Asignatura_Curso_EstablecimientoEntity cursoEstablecimiento) {
        Docente_Asignatura_Curso_EstablecimientoEntity nuevoCursoEstablecimiento = docenteAsignaturaCursoEstablecimientoService.guardarDocenteAsignaturaCursoEstablecimiento(cursoEstablecimiento);
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

        List<DocenteAsignaturaEntity> docenteAsignaturaEntities = docenteAsignaturaService.obtenerDocenteAsignaturaPorFiltro(request.getAsignatura_id(), "-1", docenteEntities.get(0).getDocente_id(), docenteEntities.get(0).getPersonaEntity().getPersona_run() );

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
    public ResponseEntity<InfoDocenteCursoAsignaturaResponse> TraerDocenteCursoAsignatura(@Valid @RequestBody TraerDocenteRequest traerDocenteRequest) {

        List <IcursoAsignaturaEstablecimiento> lista = new ArrayList<>();
        InfoDocenteResponse docente = docenteService.infoDocente(traerDocenteRequest.getEstablecimiento(), traerDocenteRequest.getDocente_run(), -1L).get(0);

        List<CursoEstablecimientoEntity> cursoEstablecimiento = cursoEstablecimientoService.obtenerCursosEstablecimientoPorFiltro(
                -1L, -1L,traerDocenteRequest.getEstablecimiento(), true
        );


        for (CursoEstablecimientoEntity cursoEstablecimiento1 : cursoEstablecimiento) {
            List<DocenteAsignaturaEntity> da = docenteAsignaturaService.obtenerDocenteAsignaturaPorFiltro(
                    -1L, "-1", docente.getDocente_id().longValue(), docente.getDocente_persona_run()
            );

            for (DocenteAsignaturaEntity docenteAsignatura : da) {

                List<Docente_Asignatura_Curso_EstablecimientoEntity> dace = docente_asignatura_curso_establecimientoService.obtenerDocenteAsignaturaCursoEstablecimientoPorFiltro(
                        -1L,cursoEstablecimiento1.getCurso_establecimiento_id(),
                        docenteAsignatura.getDocente_asignatura_id(), "-1", "-1",metodos.convertirFechaACalendar(
                                new Date()
                        ).get(Calendar.YEAR), metodos.convertirFechaACalendar(
                                new Date()
                        ).get(Calendar.YEAR)
                );
                for (Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimiento : dace) {

                    lista.add(new IcursoAsignaturaEstablecimiento(
                            docente_asignatura_curso_establecimiento.getCursoEstablecimientoEntity().getCursoEntity(),
                            docente_asignatura_curso_establecimiento.getDocenteAsignaturaEntity().getAsignaturaEntity(),
                            docente_asignatura_curso_establecimiento.getCursoEstablecimientoEntity().getEstablecimientoEntity()
                    ));
                }



            }
        }



        InfoDocenteCursoAsignaturaResponse infoDocenteResponse = new InfoDocenteCursoAsignaturaResponse(
                docente.getDocente_id().longValue(),
                docente.getPersona_run(),
                lista
        );

        return ResponseEntity.ok(infoDocenteResponse);
    }
}

