package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Metodos;
import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.entity.DocenteAsignaturaEntity;
import com.springboot.insideClass.entity.Docente_Asignatura_Curso_EstablecimientoEntity;
import com.springboot.insideClass.entity.NotasEntity;
import com.springboot.insideClass.payload.request.Notas.BuscarNotasRequest;
import com.springboot.insideClass.payload.request.Notas.CrearNotasRequest;
import com.springboot.insideClass.payload.request.Notas.EditarNotasRequest;
import com.springboot.insideClass.payload.response.Matricula.DatosMatriculaResponse;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/notas")
public class NotasController {

    @Autowired
    private NotasService notasService;

    @Autowired private MatriculaService matriculaService;

    @Autowired private CursoEstablecimientoService cursoEstablecimientoService;

    @Autowired private DocenteAsignaturaService docenteAsignaturaService;

    @Autowired private Docente_Asignatura_Curso_EstablecimientoService docente_asignatura_curso_establecimientoService;

    @Autowired private Metodos metodos;

    @PostMapping("/Get")
    public ResponseEntity<?> obtenerNotas(@Valid @RequestBody BuscarNotasRequest request) {
        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                .body(notasService.obtenerDatosAlumnoNotas(
                        request.isMatricula_vigencia(),
                        request.getEstablecimiento_id(),
                        request.getApoderado_id(),
                        request.getAlumno_run(),
                        request.getNotas_matricula_id(),
                        request.getDocente_run(), request.getAsignatura_id(), request.getCurso_id())
                ); //

       /* try{

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }*/
    }

    @PostMapping("/Create")
    public ResponseEntity<?> ingresarAnotacion(@Valid @RequestBody CrearNotasRequest notasRequest) {

        try{

            // Validar campos obligatorios
            if (StringUtils.isEmpty(notasRequest.getRun())
                    || notasRequest.getEstablecimiento() == null
                    || notasRequest.getAsignatura() == null
                    || notasRequest.getNotas_fecha() == null
                    || StringUtils.isEmpty(notasRequest.getRun_docente())) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: Todos los campos son obligatorios"));
            }

            LocalDate localDate = notasRequest.getNotas_fecha().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int year = localDate.getYear();

            List<DatosMatriculaResponse> matricula = matriculaService.obtenerDatosMatricula(
                    true,
                    year,
                    -1L,
                    "-1",
                    -1L, notasRequest.getRun(), notasRequest.getEstablecimiento(),-1L);

            if(matricula == null){
                return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar anotacion!"));
            }


            Optional<CursoEstablecimientoEntity> cursoEstablecimiento = cursoEstablecimientoService.obtenerCursosEstablecimientoPorId(matricula.get(0).getMatricula_curso_establecimiento_id().longValue());

            if(cursoEstablecimiento == null){
                return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar anotacion!"));
            }

            List<DocenteAsignaturaEntity> asignaturaDocente = docenteAsignaturaService.obtenerDocenteAsignaturaPorFiltro(
                    notasRequest.getAsignatura(),
                    "-1",
                    -1L,
                    notasRequest.getRun_docente()
            );


            if(asignaturaDocente == null){
                return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar anotacion!"));
            }

            List<Docente_Asignatura_Curso_EstablecimientoEntity> docente_asignatura_curso_establecimientoEntities =
                    docente_asignatura_curso_establecimientoService.obtenerDocenteAsignaturaCursoEstablecimientoPorFiltro(
                            -1L,
                            cursoEstablecimiento.get().getEstablecimiento().getEstablecimiento_id(),
                            asignaturaDocente.get(0).getDocente_asignatura_id(),
                            "-1", "-1",
                            metodos.convertirFechaACalendar(new Date()).get(Calendar.YEAR),
                            metodos.convertirFechaACalendar(new Date()).get(Calendar.YEAR));


            if(docente_asignatura_curso_establecimientoEntities.size() == 0){
                return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar anotacion!"));
            }

            // Crear nueva entidad NotasEntity
            NotasEntity notas = new NotasEntity();
            notas.setMatricula(matriculaService.obtenerMatriculaPorId(matricula.get(0).getMatricula_id().longValue()).get());
            notas.setDocente_asignatura_curso_establecimiento(docente_asignatura_curso_establecimientoEntities.get(0));
            notas.setNotas_fecha(notasRequest.getNotas_fecha());
            notas.setNotas_posicion(notasRequest.getNotas_posicion());
            notas.setNota(notasRequest.getNota());
            notas.setNotas_fecha(notasRequest.getNotas_fecha());

            // Guardar la nueva entidad en la base de datos
            notasService.guardarNota(notas);

            /* correo.enviarCorreoAnotacion(anotacionRequest.getFecha().toString(),asignaturaDocente.getAsignaturaEntity().getAsignatura_nombre(), matricula.getAlumnoEntity().getPersonaEntity().getPersona_nombre(),  asignaturaDocente.getDocenteCursoEntity().getDocenteEntity().getPersonaEntity().getPersona_nombre(), anotacionRequest.getDescripcion(),anotacionRequest.getGravedad());*/
            return ResponseEntity.ok(new MessageResponse("Se ha registrado anotacion con exito!"));


        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar asistencia!"));

        }
    }

    @PutMapping("/Edit")
    public ResponseEntity<?> editarNota(@Valid @RequestBody EditarNotasRequest notasRequest) {

        try {
            // Validar campos obligatorios
            if (notasRequest.getDace_notas_id() == null
                    || notasRequest.getNotas_fecha() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: Todos los campos son obligatorios"));
            }

            // Editar nueva entidad AnotacionesEntity
            NotasEntity opanota = notasService.obtenerNotaPorId(notasRequest.getDace_notas_id());

            if(opanota == null){
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encontrado la anotación"));
            }

            opanota.setNotas_fecha(notasRequest.getNotas_fecha());
            opanota.setNotas_posicion(notasRequest.getNotas_posicion());
            opanota.setNota(notasRequest.getNota());
            opanota.setNotas_fecha(notasRequest.getNotas_fecha());

            // Guardar la nueva entidad en la base de datos
            notasService.guardarNota(opanota);

            return ResponseEntity.ok(new MessageResponse("Se ha editado anotacion con exito!"));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado editar anotacion!"));
        }
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<?> deleteAnotacion(@PathVariable("id") Long id) {

        try{


            // Crear nueva entidad AnotacionesEntity
            NotasEntity nota = notasService.obtenerNotaPorId(id);

            if(nota == null){
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encontrado la anotación"));
            }

            // Guardar la nueva entidad en la base de datos
            notasService.eliminarNota(nota.getDace_notas_id());

            return ResponseEntity.ok(new MessageResponse("Se ha eliminado anotacion con exito!"));


        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado eliminar anotacion!"));

        }
    }


}
