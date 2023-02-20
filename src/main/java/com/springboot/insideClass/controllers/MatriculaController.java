package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.*;
import com.springboot.insideClass.payload.request.EditMatriculaRequest;
import com.springboot.insideClass.payload.request.MatriculaRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.*;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/agregarMatricula")
    public ResponseEntity<?> agregarMatricula(@Valid @RequestBody MatriculaRequest matriculaRequest) {
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

           /* CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(matriculaRequest.getCurso(), matriculaRequest.getEstablecimiento());

            System.out.println(cursoEstablecimiento.getCurso_establ_id());

            MatriculaEntity matricula = matriculaService.findEstablecimientoByAll(cursoEstablecimiento.getCurso_establ_id(), alumno.getAlumno_id(), apoderado.getApoderado_id(), matriculaRequest.getAgno());

            if(matricula == null){
                MatriculaEntity matricula1 = new MatriculaEntity(alumno, apoderado, cursoEstablecimiento, matriculaRequest.getAgno());
                matriculaService.save(matricula1);
            }*/

            return ResponseEntity.ok(new MessageResponse("Alumno matriculado con registrado con exito!"));

        }catch (Exception e){
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }
    }

    @PostMapping("/editarCursoMatricula")
    public ResponseEntity<?>editarCursoMatricula(@Valid @RequestBody EditMatriculaRequest editMatriculaRequest){
        try{

            AlumnoEntity alumno =  alumnoService.findAlumnoByRun(editMatriculaRequest.getAlumno_run());

            ApoderadoEntity apoderado = apoderadoService.findApoderadoByRun(editMatriculaRequest.getApoderado_run());

            /*CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(editMatriculaRequest.getCurso_id(), editMatriculaRequest.getEstablecimiento_id());

            MatriculaEntity matricula = matriculaService.findMatriculaById(editMatriculaRequest.getMatricula_id());

            if(alumno != null && apoderado != null && cursoEstablecimiento != null && matricula != null){
                matricula.setCursoEstablecimientoEntity(cursoEstablecimiento);
                matriculaService.save(matricula);
            }*/

            return ResponseEntity.ok(new MessageResponse("Matricula editada con registrado con exito!"));

        }catch (Exception e){
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }

    }
}
