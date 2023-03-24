package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.*;
import com.springboot.insideClass.payload.request.EditMatriculaRequest;
import com.springboot.insideClass.payload.request.Matricula.EliminarRequest;
import com.springboot.insideClass.payload.request.MatriculaRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.repository.MatriculaRepository;
import com.springboot.insideClass.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/matricula")
public class MatriculaController {
    @Autowired
    private AlumnoService alumnoService;

    @Autowired
    private PersonaService personaService;

    @Autowired
    private ApoderadoService apoderadoService;

    @Autowired
    private CursoEstablecimientoService cursoEstablecimientoService;
    @Autowired
    private MatriculaService matriculaService;
    @Autowired
    private CursoService cursoService;
    @Autowired
    private MatriculaRepository matriculaRepository;

    @PostMapping("/agregarMatricula")
    public ResponseEntity<?> agregarMatricula(@Valid @RequestParam MatriculaRequest matriculaRequest) {
        try{
            if(alumnoService.findAlumnoByRun(matriculaRequest.getAlumno().getPersona_run())  == null){
                if(personaService.findByRun(matriculaRequest.getAlumno().getPersona_run()) == null){
                    PersonaEntity personaEntity = new PersonaEntity(matriculaRequest.getAlumno().getPersona_run(),
                            matriculaRequest.getAlumno().getPersona_nombre(),
                            matriculaRequest.getAlumno().getPersona_apellido_paterno(),
                            matriculaRequest.getAlumno().getPersona_apellido_materno(),
                            matriculaRequest.getAlumno().getPersona_fecha_nacimiento(),
                            matriculaRequest.getAlumno().getPersona_sexo(),
                            matriculaRequest.getAlumno().getPersona_numero_telefonico(),
                            matriculaRequest.getAlumno().getPersona_numero_celular());
                    personaService.save(personaEntity);
                }

                PersonaEntity personaEntity = personaService.findByRun(matriculaRequest.getAlumno().getPersona_run());
                AlumnoEntity alumno = new AlumnoEntity(personaEntity);
                alumnoService.save(alumno);
            }

            AlumnoEntity alumno =  alumnoService.findAlumnoByRun(matriculaRequest.getAlumno().getPersona_run());

            if(apoderadoService.findApoderadoByRun(matriculaRequest.getApoderado().getPersona_run()) == null){
                if(personaService.findByRun(matriculaRequest.getApoderado().getPersona_run()) == null){
                    PersonaEntity personaEntity = new PersonaEntity(matriculaRequest.getApoderado().getPersona_run(),
                            matriculaRequest.getApoderado().getPersona_nombre(),
                            matriculaRequest.getApoderado().getPersona_apellido_paterno(),
                            matriculaRequest.getApoderado().getPersona_apellido_materno(),
                            matriculaRequest.getApoderado().getPersona_fecha_nacimiento(),
                            matriculaRequest.getApoderado().getPersona_sexo(),
                            matriculaRequest.getApoderado().getPersona_numero_telefonico(),
                            matriculaRequest.getApoderado().getPersona_numero_celular());
                    personaService.save(personaEntity);
                }

                PersonaEntity personaEntity = personaService.findByRun(matriculaRequest.getApoderado().getPersona_run());
                ApoderadoEntity apoderado = new ApoderadoEntity(personaEntity);
                apoderadoService.save(apoderado);
            }


            ApoderadoEntity apoderado = apoderadoService.findApoderadoByRun(matriculaRequest.getApoderado().getPersona_run());

           CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(matriculaRequest.getCurso(), matriculaRequest.getEstablecimiento());

            System.out.println(cursoEstablecimiento.getCurso_establ_id());

            MatriculaEntity matricula = matriculaService.findEstablecimientoByAll(cursoEstablecimiento.getCurso_establ_id(), alumno.getAlumno_id(), matriculaRequest.getAgno());

            if(matricula == null){
                MatriculaEntity matricula1 = new MatriculaEntity(alumno, apoderado, cursoEstablecimiento, matriculaRequest.getAgno());
                matriculaService.save(matricula1);
            }

            return ResponseEntity.ok(new MessageResponse("Alumno matriculado con registrado con exito!"));

        }catch (Exception e){
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }
    }

    @PostMapping("/editarCursoMatricula")
    public ResponseEntity<?>editarCursoMatricula(@Valid @RequestBody MatriculaRequest editMatriculaRequest){
        try{

            return ResponseEntity.ok(new MessageResponse("Matricula editada con registrado con exito!"));

        }catch (Exception e){
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }

    }

    @GetMapping("/ObtenerMatriculaByAlumno")
    public ResponseEntity<?>ObtenerMatriculaByAlumno(@RequestParam("rut_alumno") String run_alumno,@RequestParam("id_establecimiento") long id_establecimiento, @RequestParam("curso_nombre") String curso_nombre, @RequestParam("curso_agno") String curso_agno ){
        CursoEntity curso = cursoService.findCursoByName(curso_nombre);

        if(curso != null){
            CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(curso.getCurso_id(), id_establecimiento);
            if(cursoEstablecimiento != null){
                AlumnoEntity alumno = alumnoService.findAlumnoByRun(run_alumno);
                if(alumno != null){
                    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                            .body(matriculaService.findEstablecimientoByAll(cursoEstablecimiento.getCurso_establ_id(), alumno.getAlumno_id(), curso_agno));

                }else{
                    return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encotrado alumno en el sistema!"));
                }
            }else{
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encotrado curso en el colegio en el sistema!"));

            }

        }else{
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encotrado curso en el sistema!"));

        }
    }
    @PostMapping("/Delete")
    public ResponseEntity<?> eliminarMatricula(@Valid @RequestParam EliminarRequest eliminarMatricula ) {
        try{
            System.out.println("Nombre del curso");
            System.out.println(eliminarMatricula.getCurso_nombre());
            CursoEntity curso = cursoService.findCursoByName(eliminarMatricula.getCurso_nombre());
            if(curso != null){
                CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(curso.getCurso_id(), eliminarMatricula.getEstablecimiento_id());
                if(cursoEstablecimiento != null){
                    AlumnoEntity alumno = alumnoService.findAlumnoByRun(eliminarMatricula.getRut_alumno());
                    if(alumno != null){
                        MatriculaEntity matricula = matriculaService.findEstablecimientoByAll(cursoEstablecimiento.getCurso_establ_id(), alumno.getAlumno_id(), eliminarMatricula.getCurso_agno());
                        matricula.setMatricula_vigencia(false);
                        matriculaRepository.save(matricula);
                        System.out.println(matricula.getMatricula_id());
                        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                                .body(new MessageResponse("Matricula eliminada con exito"));

                    }else{
                        return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encotrado alumno en el sistema!"));
                    }
                }else{
                    return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encotrado curso en el colegio en el sistema!"));

                }

            }else{
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encotrado curso en el sistema!"));

            }
        }catch (Exception e){
            System.out.println("Error:");
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(new MessageResponse("No se encontro matricula vigente!"));

        }

    }


}
