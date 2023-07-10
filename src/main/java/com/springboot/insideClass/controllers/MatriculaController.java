package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.*;
import com.springboot.insideClass.payload.request.Matricula.BuscarDatosMatriculaRequest;
import com.springboot.insideClass.payload.request.Matricula.CrearMatriculaRequest;
import com.springboot.insideClass.payload.request.Matricula.EditarMatriculaRequest;
import com.springboot.insideClass.payload.response.Matricula.DatosMatriculaResponse;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

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
    PerfilService perfilService;

    @Autowired
    VigenciaService vigenciaService;
    @Autowired
    UsuarioService usuarioService;


    @Autowired
    EstablecimientoService establecimientoService;

    @Autowired
    CursoEstablecimientoService cursoMatri;

    @PostMapping("/Get")
    public ResponseEntity<?> obtenerDatosMatriculaPorFiltros(@Valid @RequestBody BuscarDatosMatriculaRequest buscarDatosMatriculaRequest) {

        List<DatosMatriculaResponse> datos = matriculaService.obtenerDatosMatricula(buscarDatosMatriculaRequest.isMatricula_vigencia(),
                buscarDatosMatriculaRequest.getCurso_agno(), buscarDatosMatriculaRequest.getApoderado_id(), buscarDatosMatriculaRequest.getApoderado_persona_run(), buscarDatosMatriculaRequest.getAlumno_id(), buscarDatosMatriculaRequest.getAlumno_persona_run());

        return ResponseEntity.ok(datos);
    }

    @PostMapping("/Create")
    public ResponseEntity<?> agregarMatricula(@Valid @RequestBody CrearMatriculaRequest matriculaRequest) {
        // Validar existencia del alumno
        String alumnoRun = matriculaRequest.getAlumno().getPersona_run();
        List<AlumnoEntity> alumno = alumnoService.obtenerAlumnoPorFiltro(-1L,
                alumnoRun);
        if (alumno == null || alumno.size() == 0) {
            // Buscar datos de la persona del alumno
            List<PersonaEntity> personaAlumno = personaService.obtenerPersonasPorFiltro(alumnoRun,"-1",
                    "-1", "-1", "-1", "-1", "-1", "-1"
            );
            if (personaAlumno == null || personaAlumno.size() == 0) {
                // Insertar nueva persona para el alumno
                PersonaEntity personaEntity = new PersonaEntity(
                        matriculaRequest.getAlumno().getPersona_run(),
                        matriculaRequest.getAlumno().getPersona_nombre(),
                        matriculaRequest.getAlumno().getPersona_apellido_paterno(),
                        matriculaRequest.getAlumno().getPersona_apellido_materno(),
                        matriculaRequest.getAlumno().getPersona_fecha_nacimiento(),
                        matriculaRequest.getAlumno().getPersona_sexo(),
                        matriculaRequest.getAlumno().getPersona_numero_telefonico(),
                        matriculaRequest.getAlumno().getPersona_numero_celular()
                );
                personaService.guardarPersona(personaEntity);
            }
            // Insertar nuevo alumno

            PersonaEntity per = personaService.obtenerPersonasPorFiltro(alumnoRun,"-1",
                    "-1", "-1", "-1", "-1", "-1", "-1"
            ).get(0);

            AlumnoEntity al = new AlumnoEntity(per);
            alumnoService.guardarAlumno(al);
        }

        // Validar existencia del apoderado
        String apoderadoRun = matriculaRequest.getApoderado().getPersona_run();
        List<ApoderadoEntity> apoderado = apoderadoService.obtenerApoderadoPorFiltro(-1L, apoderadoRun);
        if (apoderado == null || apoderado.size() == 0) {
            // Buscar datos de la persona del apoderado
            List<PersonaEntity> personaApoderado = personaService.obtenerPersonasPorFiltro(apoderadoRun,"-1",
                    "-1", "-1", "-1", "-1", "-1", "-1"
            );
            if (personaApoderado == null || personaApoderado.size() == 0) {
                // Insertar nueva persona para el apoderado
                PersonaEntity personaApo = new PersonaEntity(
                        matriculaRequest.getApoderado().getPersona_run(),
                        matriculaRequest.getApoderado().getPersona_nombre(),
                        matriculaRequest.getApoderado().getPersona_apellido_paterno(),
                        matriculaRequest.getApoderado().getPersona_apellido_materno(),
                        matriculaRequest.getApoderado().getPersona_fecha_nacimiento(),
                        matriculaRequest.getApoderado().getPersona_sexo(),
                        matriculaRequest.getApoderado().getPersona_numero_telefonico(),
                        matriculaRequest.getApoderado().getPersona_numero_celular()
                );
                personaService.guardarPersona(personaApo);
            }
            // Insertar nuevo apoderado
            ApoderadoEntity apodera = new ApoderadoEntity(personaService.obtenerPersonasPorFiltro(apoderadoRun,"-1",
                    "-1", "-1", "-1", "-1", "-1", "-1"
            ).get(0));
            apoderadoService.guardarApoderado(apodera);
        }

        // Buscar curso y establecimiento
        List<CursoEstablecimientoEntity> cursoEstablecimientoFind = cursoEstablecimientoService.obtenerCursosEstablecimientoPorFiltro(
                -1L, matriculaRequest.getCurso(), matriculaRequest.getEstablecimiento(), true
        );

        if (cursoEstablecimientoFind == null  || cursoEstablecimientoFind.size() == 0) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se encontró un curso y establecimiento válido."));
        }

        // Buscar matrícula
        List<DatosMatriculaResponse> matricula = matriculaService.obtenerDatosMatricula(true,matriculaRequest.getAgno(),
                apoderadoService.obtenerApoderadoPorFiltro(-1L, matriculaRequest.getApoderado().getPersona_run()).get(0).getApoderado_id(),
                matriculaRequest.getApoderado().getPersona_run(),
                alumnoService.obtenerAlumnoPorFiltro(-1L, matriculaRequest.getAlumno().getPersona_run()).get(0).getAlumno_id(),
                matriculaRequest.getAlumno().getPersona_run()
        );


        if (matricula == null || matricula.size() == 0) {
            // Insertar nueva matrícula
            MatriculaEntity matricula1 = new MatriculaEntity(
                    alumnoService.obtenerAlumnoPorFiltro(-1L, matriculaRequest.getAlumno().getPersona_run()).get(0),
                    apoderadoService.obtenerApoderadoPorFiltro(-1L, matriculaRequest.getApoderado().getPersona_run()).get(0),
                    cursoEstablecimientoFind.get(0),
                    matriculaRequest.getAgno(),
                    true);
            matriculaService.guardarMatricula(matricula1);

            // Crear nuevo usuario
            List<PerfilEntity> perfil = perfilService.obtenerPerfilesPorFiltro(-1L, "Apoderado");
            List<VigenciaEntity> vigencia = vigenciaService.buscarVigenciasPorFiltro(-1L, "Vigente");
            PersonaEntity persona = personaService.obtenerPersonasPorFiltro(apoderadoRun,"-1",
                    "-1", "-1", "-1", "-1", "-1", "-1"
            ).get(0);
            usuarioService.createUsuario(perfil.get(0), vigencia.get(0), persona, matriculaRequest.getCorreo());
        }

        return ResponseEntity.ok(new MessageResponse("Alumno matriculado registrado exitosamente!"));
    }

    @PutMapping("/Edit")
    public ResponseEntity<?> editarMatricula(@Valid @RequestBody EditarMatriculaRequest matriculaRequest) {
        try {
            Optional<CursoEntity> curso = cursoService.obtenerCursoPorId(matriculaRequest.getCurso());
            Long establecimientoId = matriculaRequest.getEstablecimiento();
            String Alumno_run = matriculaRequest.getAlumno().getPersona_run();
            String Apoderado_run = matriculaRequest.getApoderado().getPersona_run();

            if (curso == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encontrado el curso en el sistema!"));
            }

            List<CursoEstablecimientoEntity> cursoEstablecimiento = cursoEstablecimientoService.obtenerCursosEstablecimientoPorFiltro(
                    -1L, curso.get().getCurso_id(), establecimientoId, true);

            if (cursoEstablecimiento == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encontrado el curso en el colegio en el sistema!"));
            }

            List<AlumnoEntity> alumno = alumnoService.obtenerAlumnoPorFiltro(-1L, Alumno_run);
            if (alumno == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encontrado el alumno en el sistema!"));
            }

            List<ApoderadoEntity> apoderado = apoderadoService.obtenerApoderadoPorFiltro(-1L, Apoderado_run);
            if (apoderado == null) {
                PersonaEntity persona = personaService.obtenerPersonasPorFiltro(Apoderado_run, "-1", "-1", "-1", "-1", "-1", "-1", "-1").get(0);
                if (persona == null) {
                    PersonaEntity personaEntity = new PersonaEntity(Apoderado_run,
                            matriculaRequest.getApoderado().getPersona_nombre(),
                            matriculaRequest.getApoderado().getPersona_apellido_paterno(),
                            matriculaRequest.getApoderado().getPersona_apellido_materno(),
                            matriculaRequest.getApoderado().getPersona_fecha_nacimiento(),
                            matriculaRequest.getApoderado().getPersona_sexo(),
                            matriculaRequest.getApoderado().getPersona_numero_telefonico(),
                            matriculaRequest.getApoderado().getPersona_numero_celular());
                    personaService.guardarPersona(personaEntity);
                }
                PersonaEntity personaEntity = personaService.obtenerPersonasPorFiltro(Apoderado_run, "-1", "-1", "-1", "-1", "-1", "-1", "-1").get(0);
                ApoderadoEntity apoderadoSave = new ApoderadoEntity(personaEntity);
                apoderadoService.guardarApoderado(apoderadoSave);
            }

            apoderado = apoderadoService.obtenerApoderadoPorFiltro(-1L, Apoderado_run);

            MatriculaEntity matricula = new MatriculaEntity();
            matricula.setAlumnoEntity(alumno.get(0));
            matricula.setApoderadoEntity(apoderado.get(0));
            matricula.setCursoEstablecimientoEntity(cursoEstablecimiento.get(0));

            matriculaService.guardarMatricula(matricula);

            return ResponseEntity.ok(new MessageResponse("La matrícula ha sido actualizada exitosamente!"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado actualizar la matrícula!"));
        }
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<?> deleteMatricula(@PathVariable("id") Long id) {

        Optional<MatriculaEntity> matricula = matriculaService.obtenerMatriculaPorId(id);

        if(matricula == null){
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encontrado matricula en el sistema!"));
        }

        matricula.get().setMatricula_vigencia(false);

        matriculaService.guardarMatricula(matricula.get());

        return ResponseEntity.ok(new MessageResponse("La matrícula ha sido eliminado exitosamente!"));
    }

}
