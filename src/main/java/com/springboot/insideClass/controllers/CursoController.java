package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.*;
import com.springboot.insideClass.payload.request.Curso.DC_CreateRequest;
import com.springboot.insideClass.payload.request.Curso.DC_DeleteRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.repository.AsignaturaDocenteRepository;
import com.springboot.insideClass.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/curso")
public class CursoController {

    @Autowired
    DocenteService docenteService;

    @Autowired
    private CursoEstablecimientoService cursoEstablecimientoService;

    @Autowired
    AsignaturaService asignaturaService;
    @Autowired
    CursoService cursoService;
    @Autowired
    private AsignaturaDocenteRepository asignaturaDocenteRepository;
    @Autowired
    AsignaturaDocenteService asignaturaDocenteService;

    @PostMapping("/Get")
    public ResponseEntity<?> obtenerCurso() throws ParseException {

        try {

            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(cursoService.get());

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado obtener cursos!"));
        }

    }

    @PostMapping("/GetByEstablecimiento")
    public ResponseEntity<?> obtenerCursoByEstablecimiento(@RequestParam("id_establecimient") long id_establecimient) throws ParseException {
        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                .body(cursoService.getCursoByEstablecimiento(id_establecimient));

    }

    @PostMapping("/docente-curso/Create")
    public ResponseEntity<?> agregarCursoDocente(@Valid @RequestBody DC_CreateRequest docenteCursoRequest) {
        try {

            // Validar campos obligatorios
            if (docenteCursoRequest.getPersona_run() == null || docenteCursoRequest.getPersona_run().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'persona_run' es obligatorio."));
            }
            if (docenteCursoRequest.getCurso_id() == 0) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'curso_id' es obligatorio."));
            }
            if (docenteCursoRequest.getFecha_inicio() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'fecha_inicio' es obligatorio."));
            }
            if (docenteCursoRequest.getFecha_fin() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'fecha_fin' es obligatorio."));
            }
            if (docenteCursoRequest.getAsignatura_id() == 0) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'asignatura_id' es obligatorio."));
            }
            if (docenteCursoRequest.getEstablecimiento_id() == 0) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'establecimiento_id' es obligatorio."));
            }

            /*if (docenteCursoService.findDocenteCursoByRunAndEstablecimientoByFecha(docenteService.findDocenteByRun(
                            docenteCursoRequest.getPersona_run()).getDocente_id(),
                    docenteCursoRequest.getEstablecimiento_id(),
                    docenteCursoRequest.getFecha_inicio(),
                    docenteCursoRequest.getFecha_fin()
            ) == null) {

                DocenteCursoEntity docenteCurso = new DocenteCursoEntity();


                if (cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(
                        docenteCursoRequest.getCurso_id(), docenteCursoRequest.getEstablecimiento_id()) != null) {

                    docenteCurso.setDocenteEntity(docenteService.findDocenteByRun(docenteCursoRequest.getPersona_run()));
                    docenteCurso.setCursoEstablecimientoEntity(cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(docenteCursoRequest.getCurso_id(), docenteCursoRequest.getEstablecimiento_id()));
                    docenteCurso.setDocente_curso_fecha_inicio(docenteCursoRequest.getFecha_inicio());
                    docenteCurso.setDocente_cuso_fecha_fin(docenteCursoRequest.getFecha_fin());
                    docenteCurso.setDocente_jefe(docenteCurso.getDocente_jefe());
                    docenteCursoRepo.save(docenteCurso);
                    System.out.println("Se guardo el docente-curso");
                } else {
                    System.out.println("No se pudo insertar Curso Establecimiento");
                }
            }*/


    /*        AsignaturaDocenteEntity asignaturaDocente =
                    asignaturaDocenteService.findAsignaturaDocenteByAsignaturaAndDocente
                            (docenteCursoRequest.getAsignatura_id(),
                                   100
                            );

            if (asignaturaDocente == null) {
                AsignaturaEntity asignatura = asignaturaService.findAsignaturaById(docenteCursoRequest.getAsignatura_id());

                AsignaturaDocenteEntity asignaturaDocente1 = new AsignaturaDocenteEntity();

                asignaturaDocente1.setAsignaturaEntity(asignatura);
                asignaturaDocente1.setAsignatura_doc_inicio(docenteCursoRequest.getFecha_inicio());
                asignaturaDocente1.setAsignatura_doc_fin(docenteCursoRequest.getFecha_fin());
                asignaturaDocenteRepository.save(asignaturaDocente1);
                System.out.println("Se guardo el asignatura-docente");
            } else {
                System.out.println("No se pudo insertar Asignatura Docente");
            }
*/

            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(new MessageResponse("Curso agregado a docente correctamente!"));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado guardar el curso correctamente!"));
        }
    }

    @DeleteMapping("/docente-curso/Delete")
    public ResponseEntity<?> eliminarDocente(@Valid @RequestBody DC_DeleteRequest eliminarRequest) {
        try {
            // Validar campos obligatorios
            if (eliminarRequest.getCurso_nombre() == null || eliminarRequest.getCurso_nombre().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'curso_nombre' es obligatorio."));
            }
            if (eliminarRequest.getAsignatura_nombre() == null || eliminarRequest.getAsignatura_nombre().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'asignatura_nombre' es obligatorio."));
            }
            if (eliminarRequest.getPersona_run() == null || eliminarRequest.getPersona_run().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'persona_run' es obligatorio."));
            }

            System.out.println(eliminarRequest.getPersona_run());
            CursoEntity curso = cursoService.findCursoByName(eliminarRequest.getCurso_nombre());
            AsignaturaEntity asignatura = asignaturaService.findAsignaturaByName(eliminarRequest.getAsignatura_nombre());
            DocenteEntity docente = docenteService.findDocenteByRun(eliminarRequest.getPersona_run());
            if (docente != null) {
                AsignaturaDocenteEntity asignaturaDocente = asignaturaDocenteService.findDocenteCursoByCursoAsignatura(curso.getCurso_id(), docente.getDocente_id(), asignatura.getAsignatura_id());
                if (asignaturaDocente != null) {
                    asignaturaDocenteRepository.delete(asignaturaDocente);
                    return ResponseEntity.ok().body(new MessageResponse("Se ha eliminado con éxito"));
                }
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encontrado el docente en el sistema!"));
            } else {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encontrado el docente en el sistema!"));
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha podido eliminar el curso del sistema!"));
        }
    }

}
