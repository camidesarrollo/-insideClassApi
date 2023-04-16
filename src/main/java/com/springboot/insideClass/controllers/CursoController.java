package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.AsignaturaDocenteEntity;
import com.springboot.insideClass.entity.AsignaturaEntity;
import com.springboot.insideClass.entity.DocenteCursoEntity;
import com.springboot.insideClass.payload.request.Curso.DC_CreateRequest;
import com.springboot.insideClass.payload.request.Curso.DC_DeleteRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.repository.AsignaturaDocenteRepository;
import com.springboot.insideClass.repository.DocenteCursoRepository;
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
    private DocenteCursoService docenteCursoService;

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

    @Autowired
    private DocenteCursoRepository docenteCursoRepo;
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
            if (docenteCursoService.findDocenteCursoByRunAndEstablecimientoByFecha(docenteService.findDocenteByRun(
                            docenteCursoRequest.getPersona_run()).getDocente_id(),
                    docenteCursoRequest.getEstablecimiento_id(),
                    docenteCursoRequest.getFecha_inicio(),
                    docenteCursoRequest.getFecha_fin()
            ) == null) {

                DocenteCursoEntity docenteCurso = new DocenteCursoEntity();


                if (cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(
                        docenteCursoRequest.getCurso_id(),  docenteCursoRequest.getEstablecimiento_id()) != null) {

                    docenteCurso.setDocenteEntity(docenteService.findDocenteByRun( docenteCursoRequest.getPersona_run()));
                    docenteCurso.setCursoEstablecimientoEntity(cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(docenteCursoRequest.getCurso_id(),  docenteCursoRequest.getEstablecimiento_id()));
                    docenteCurso.setDocente_curso_fecha_inicio(docenteCursoRequest.getFecha_inicio());
                    docenteCurso.setDocente_cuso_fecha_fin(docenteCursoRequest.getFecha_fin());
                    docenteCurso.setDocente_jefe(docenteCurso.getDocente_jefe());
                    docenteCursoRepo.save(docenteCurso);
                    System.out.println("Se guardo el docente-curso");
                } else {
                    System.out.println("No se pudo insertar Curso Establecimiento");
                }
            }

            var docenteCurso = docenteCursoService.findDocenteCursoByRunAndEstablecimientoByFecha(docenteService.findDocenteByRun(
                            docenteCursoRequest.getPersona_run()).getDocente_id(),
                    cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(
                            docenteCursoRequest.getCurso_id(),  docenteCursoRequest.getEstablecimiento_id()).getCurso_establ_id(),
                    docenteCursoRequest.getFecha_inicio(),
                    docenteCursoRequest.getFecha_fin()
            );

            System.out.println(docenteCurso.getDocente_curso_id());

            AsignaturaDocenteEntity asignaturaDocente =
                    asignaturaDocenteService.findAsignaturaDocenteByAsignaturaAndDocente
                            (docenteCursoRequest.getAsignatura_id(),
                                    docenteCurso.getDocente_curso_id()
                            );

            if (asignaturaDocente == null) {
                AsignaturaEntity asignatura = asignaturaService.findAsignaturaById(docenteCursoRequest.getAsignatura_id());

                AsignaturaDocenteEntity asignaturaDocente1 = new AsignaturaDocenteEntity();

                asignaturaDocente1.setAsignaturaEntity(asignatura);
                asignaturaDocente1.setDocenteCursoEntity(docenteCurso);

                asignaturaDocente1.setAsignatura_doc_inicio(docenteCursoRequest.getFecha_inicio());
                asignaturaDocente1.setAsignatura_doc_fin(docenteCursoRequest.getFecha_fin());
                asignaturaDocenteRepository.save(asignaturaDocente1);
                System.out.println("Se guardo el asignatura-docente");
            } else {
                System.out.println("No se pudo insertar Asignatura Docente");
            }


            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(new MessageResponse("Curso agregado a docente correctamente!"));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado guardar el curso correctamente!"));
        }
    }

    @DeleteMapping("/docente-curso//Delete")
    public void eliminarDocente(@Valid @RequestBody DC_DeleteRequest eliminarRequest) {
        try {

        } catch (Exception e) {

        }
    }

}
