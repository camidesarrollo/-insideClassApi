package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.*;
import com.springboot.insideClass.payload.request.Matricula.DeleteRequest;
import com.springboot.insideClass.payload.request.Matricula.GetAlumnoRequest;
import com.springboot.insideClass.payload.request.Matricula.GetRequest;
import com.springboot.insideClass.payload.request.Matricula.M_CreateRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.repository.MatriculaRepository;
import com.springboot.insideClass.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;

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

    @Autowired
    PerfilService perfilService;

    @Autowired
    VigenciaService vigenciaService;
    @Autowired
    UsuarioService usuarioService;


    @Autowired
    EstablecimientoService establecimientoService;



    @PostMapping("/alumno/Get")
    public ResponseEntity<?>ObtenerMatriculaByAlumno(@Valid @RequestBody GetAlumnoRequest getAlumnoRequest){
        if(getAlumnoRequest.isValid()){
            CursoEntity curso = cursoService.findCursoByName(getAlumnoRequest.getCurso_nombre());

            if(curso != null && getAlumnoRequest.getEstablecimiento() != null){
                CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(
                        curso.getCurso_id(), getAlumnoRequest.getEstablecimiento(), -1, getAlumnoRequest.getAgno(), getAlumnoRequest.getAgno());
                if(cursoEstablecimiento != null){
                    AlumnoEntity alumno = alumnoService.findAlumnoByRun(getAlumnoRequest.getPersona_run());
                    if(alumno != null){
                        /*return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                                .body(matriculaService.findEstablecimientoByAll(cursoEstablecimiento.getCurso_establ_id(), alumno.getAlumno_id(), getAlumnoRequest.getAgno()));*/

                    }else{
                        return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encotrado alumno en el sistema!"));
                    }
                }else{
                    return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encotrado curso en el colegio en el sistema!"));

                }

            }

            return ResponseEntity.badRequest().body(new MessageResponse("Error: al momento de Obtener la matricula del alumno!"));
        }

        return ResponseEntity.badRequest().body(new MessageResponse("Error: al momento de Obtener la matricula del alumno!"));
    }


    @PostMapping("/Get")
    public ResponseEntity<Object> tablaAlumno(@Valid @RequestBody GetRequest getRequest) {

        try {
            if(getRequest.isValid()){
                return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                        .body(matriculaService.getInfoAlumno(getRequest.getEstablecimiento(),getRequest.getPersona_run(), getRequest.getCurso_id(), getRequest.getVigencia(), "-1"));
            }
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Por favor valide los datos ingresados"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }
    }
    @PostMapping("/Create")
    public ResponseEntity<?> agregarMatricula(@Valid @RequestBody M_CreateRequest matriculaRequest) {
        try{
            System.out.println("-----------------Validacion de los parametos de matricula-----------------------------");
            if(matriculaService.isValidCreate(matriculaRequest)){
                System.out.println("-----------------Busqueda del alumno (Si existe o  no sus datos en la base de datos)-----------------------------");
                if(alumnoService.findAlumnoByRun(matriculaRequest.getAlumno().getPersona_run())  == null){
                    System.out.println("-----------------Busqueda del persona (Buscar datos de la persona)-----------------------------");
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
                    System.out.println("-----------------Insertamos  el alumno -----------------------------");
                    PersonaEntity personaEntity = personaService.findByRun(matriculaRequest.getAlumno().getPersona_run());
                    AlumnoEntity alumno = new AlumnoEntity(personaEntity);
                    alumnoService.save(alumno);
                }

                AlumnoEntity alumno =  alumnoService.findAlumnoByRun(matriculaRequest.getAlumno().getPersona_run());
                System.out.println("-----------------Busqueda del Apoderado (Buscar datos del apoderado)-----------------------------");
                if(apoderadoService.findApoderadoByRun(matriculaRequest.getApoderado().getPersona_run()) == null){
                    System.out.println("-----------------Busqueda del persona (Buscar datos de la persona)-----------------------------");
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
                    System.out.println("-----------------Insertamos  el apoderado -----------------------------");
                    PersonaEntity personaEntity = personaService.findByRun(matriculaRequest.getApoderado().getPersona_run());
                    ApoderadoEntity apoderado = new ApoderadoEntity(personaEntity);
                    apoderadoService.save(apoderado);
                }


                ApoderadoEntity apoderado = apoderadoService.findApoderadoByRun(matriculaRequest.getApoderado().getPersona_run());
                System.out.println("-----------------Busqueda los datos del establecimiento curso matricula-----------------------------");
                CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(matriculaRequest.getCurso(), matriculaRequest.getEstablecimiento(), -1,matriculaRequest.getAgno(), matriculaRequest.getAgno());

                System.out.println("-----------------Busqueda la matricula para el año curso y estableimiento y alumno-----------------------------");
                MatriculaEntity matricula = matriculaService.findEstablecimientoByAll(
                        alumno.getAlumno_id(),
                        1,
                        matriculaRequest.getAgno(),
                        matriculaRequest.getCurso(),
                        matriculaRequest.getEstablecimiento());

                PerfilEntity perfil = perfilService.findByName("Apoderado");


                if(matricula == null){
                    System.out.println("-----------------Insertamos la matriucla-----------------------------");
                    MatriculaEntity matricula1 = new MatriculaEntity(alumno, apoderado, matriculaRequest.getAgno(), true);
                    matriculaService.save(matricula1);

                    VigenciaEntity vigencia = vigenciaService.findByName("Vigente");
                    PersonaEntity persona = personaService.findByRun(apoderado.getPersonaEntity().getPersona_run());
                    System.out.println("-----------------Buscamos si existe una curso y establecimiento sin esa matricula-----------------------------");
                    //Insertar en curso_establecimiento matricula
                    CursoEstablecimientoEntity cursoEstablecimiento1 = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(matriculaRequest.getCurso(),
                            matriculaRequest.getEstablecimiento(), matricula1.getMatricula_id().intValue(), matriculaRequest.getAgno(), matriculaRequest.getAgno()
                    );


                    if(cursoEstablecimiento1 == null){
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                        System.out.println("-----------------Insertamos el  curso estambleimiento matricula-----------------------------");
                        CursoEstablecimientoEntity cursoEstablecimiento2 = new CursoEstablecimientoEntity(
                                cursoService.findById(matriculaRequest.getCurso()),
                                establecimientoService.findEstablecimientoById(matriculaRequest.getEstablecimiento()),
                                dateFormat.parse( matriculaRequest.getAgno() + "/01/01"),
                                dateFormat.parse( matriculaRequest.getAgno() + "/12/01"),
                                true,
                                matricula1
                                );
                        cursoEstablecimientoService.save(cursoEstablecimiento2);
                    }

                    // Create new user's account
                    usuarioService.createUsuario(perfil, vigencia, persona, matriculaRequest.getApoderado().getCorreo());
                }

                return ResponseEntity.ok(new MessageResponse("Alumno matriculado con registrado con exito!"));

            }

            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));
        }catch (Exception e){
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }
    }

    @PutMapping("/Update")
    public ResponseEntity<?> editarMatricula(@Valid @RequestBody M_CreateRequest matriculaRequest) {

        try{
            if(matriculaService.isValidCreate(matriculaRequest)){
                CursoEntity curso = cursoService.findById(matriculaRequest.getCurso());
                MatriculaEntity matricula = new MatriculaEntity();
                if(curso != null && matriculaRequest.getEstablecimiento() != 0){
                    CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(curso.getCurso_id(),
                            matriculaRequest.getEstablecimiento(),-1, matriculaRequest.getAgno(), matriculaRequest.getAgno());
                    if(cursoEstablecimiento != null){
                        AlumnoEntity alumno = alumnoService.findAlumnoByRun(matriculaRequest.getAlumno().getPersona_run());
                        if(alumno != null){
                            System.out.println(alumno.getAlumno_id());
                         /*   matricula = matriculaService.findEstablecimientoByAll(cursoEstablecimiento.getCurso_establ_id(), alumno.getAlumno_id(), matriculaRequest.getAgno());
                            if(matricula.getMatricula_id() == null){
                                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encotrado matricula en el sistema!"));
                            }*/
                            System.out.println("Imprimir Id de matricula");
                            System.out.println(matricula.getMatricula_id());
                        }else{
                            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encotrado alumno en el sistema!"));
                        }
                    }else{
                        return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encotrado curso en el colegio en el sistema!"));

                    }

                }else{
                    return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encotrado curso en el sistema!"));

                }

                AlumnoEntity alumno = alumnoService.findAlumnoByRun(matriculaRequest.getAlumno().getPersona_run());

                if(alumno == null){
                    return ResponseEntity.badRequest().body(new MessageResponse("Error: El alumno con ID " + matriculaRequest.getAlumno().getPersona_run() + " no existe!"));
                }

                ApoderadoEntity apoderado = apoderadoService.findApoderadoByRun(matriculaRequest.getApoderado().getPersona_run());

                if(apoderado == null){
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
                    ApoderadoEntity apoderadosave = new ApoderadoEntity(personaEntity);
                    apoderadoService.save(apoderadosave);
                }
                apoderado = apoderadoService.findApoderadoByRun(matriculaRequest.getApoderado().getPersona_run());


                CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(matriculaRequest.getCurso(), matriculaRequest.getEstablecimiento(),-1, matriculaRequest.getAgno(), matriculaRequest.getAgno());

                if(cursoEstablecimiento == null){
                    return ResponseEntity.badRequest().body(new MessageResponse("Error: El curso establecimiento con ID " + matriculaRequest.getEstablecimiento() + " no existe!"));
                }

                matricula.setAlumnoEntity(alumno);
                matricula.setApoderadoEntity(apoderado);
                matricula.setApoderadoEntity(apoderado);
               /* matricula.setCursoEstablecimientoEntity(cursoEstablecimiento);*/
                matricula.setApoderadoEntity(apoderado);


                matriculaService.save(matricula);

                return ResponseEntity.ok(new MessageResponse("La matrícula  ha sido actualizada exitosamente!"));
            }

            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logró obtener la información requerida!"));
        }catch (Exception e){
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logró obtener la información requerida!"));

        }
    }

      @DeleteMapping("/Delete")
    public ResponseEntity<?> eliminarMatricula(@Valid @RequestBody DeleteRequest eliminarMatricula ) {
        try{
            if(eliminarMatricula.IsValid()){
                System.out.println("Nombre del curso");
                System.out.println(eliminarMatricula.getCurso_nombre());
                CursoEntity curso = cursoService.findCursoByName(eliminarMatricula.getCurso_nombre());
                if(curso != null){
                    CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(curso.getCurso_id(), eliminarMatricula.getEstablecimiento_id(),-1, eliminarMatricula.getCurso_agno(), eliminarMatricula.getCurso_agno());
                    if(cursoEstablecimiento != null){
                        AlumnoEntity alumno = alumnoService.findAlumnoByRun(eliminarMatricula.getRut_alumno());
                        if(alumno != null){
                            /*MatriculaEntity matricula = matriculaService.findEstablecimientoByAll(cursoEstablecimiento.getCurso_establ_id(), alumno.getAlumno_id(), eliminarMatricula.getCurso_agno());
                            matricula.setMatricula_vigencia(false);
                            matriculaRepository.save(matricula);
                            System.out.println(matricula.getMatricula_id());*/
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
            }

            return ResponseEntity.badRequest().body(new MessageResponse("No se encontro matricula vigente!"));

        }catch (Exception e){
            System.out.println("Error:");
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(new MessageResponse("No se encontro matricula vigente!"));

        }

    }


}
