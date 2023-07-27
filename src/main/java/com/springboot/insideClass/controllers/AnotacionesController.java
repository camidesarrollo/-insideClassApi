package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Metodos;
import com.springboot.insideClass.entity.AnotacionesEntity;
import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.entity.DocenteAsignaturaEntity;
import com.springboot.insideClass.entity.Docente_Asignatura_Curso_EstablecimientoEntity;
import com.springboot.insideClass.payload.request.Anotaciones.BuscarAnotacionesRequest;
import com.springboot.insideClass.payload.request.Anotaciones.CrearAnotacionRequest;
import com.springboot.insideClass.payload.request.Anotaciones.EditarAnotacionesRequest;
import com.springboot.insideClass.payload.response.Matricula.DatosMatriculaResponse;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/api/anotaciones")
public class AnotacionesController {

    @Autowired private AnotacionesService anotacionesService;

    @Autowired private MatriculaService matriculaService;

    @Autowired private CursoEstablecimientoService cursoEstablecimientoService;

    @Autowired private DocenteAsignaturaService docenteAsignaturaService;

    @Autowired private Docente_Asignatura_Curso_EstablecimientoService docente_asignatura_curso_establecimientoService;

    @Autowired private Metodos metodos;

    @PostMapping("/Get")
    public ResponseEntity<?> obtenerAnotaciones(@Valid @RequestBody BuscarAnotacionesRequest request) {
        try{
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(anotacionesService.obtenerDatosAlumnoAnotacion(
                            request.isMatricula_vigencia(), request.getEstablecimiento_id(),request.getApoderado_id(),request.getAlumno_run(), request.getAnotaciones_matricula_id(),
                            request.getDocente_run(), request.getAsignatura_id(), request.getCurso_id())
                    ); //
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/Create")
    public ResponseEntity<?> ingresarAnotacion(@Valid @RequestBody CrearAnotacionRequest anotacionRequest) {

        try{

// Validar campos obligatorios
        if (StringUtils.isEmpty(anotacionRequest.getRun())
                || anotacionRequest.getEstablecimiento() == null
                || anotacionRequest.getAsignatura() == null
                || anotacionRequest.getFecha() == null
                || StringUtils.isEmpty(anotacionRequest.getDescripcion())
                || StringUtils.isEmpty(anotacionRequest.getGravedad())
                || StringUtils.isEmpty(anotacionRequest.getRun_docente())) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Todos los campos son obligatorios"));
        }

        LocalDate localDate = anotacionRequest.getFecha().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year = localDate.getYear();

        List<DatosMatriculaResponse> matricula = matriculaService.obtenerDatosMatricula(true, year, -1L, "-1", -1L, anotacionRequest.getRun());

        if(matricula == null){
            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar anotacion!1"));
        }


        Optional<CursoEstablecimientoEntity> cursoEstablecimiento = cursoEstablecimientoService.obtenerCursosEstablecimientoPorId(matricula.get(0).getMatricula_curso_establecimiento_id().longValue());

        if(cursoEstablecimiento == null){
            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar anotacion!2"));
        }

        List<DocenteAsignaturaEntity> asignaturaDocente = docenteAsignaturaService.obtenerDocenteAsignaturaPorFiltro(anotacionRequest.getAsignatura(),
                "-1",
                -1L,
                anotacionRequest.getRun_docente()
        );


        if(asignaturaDocente == null || asignaturaDocente.size() == 0){
            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar anotacion!3"));
        }

        System.out.println(-1L);
        System.out.println( cursoEstablecimiento.get().getCurso_establecimiento_id());
        System.out.println( asignaturaDocente.get(0).getDocente_asignatura_id());
        System.out.println(-1);
        System.out.println(-1);
        System.out.println(metodos.convertirFechaACalendar(new Date()).get(Calendar.YEAR));
        System.out.println(metodos.convertirFechaACalendar(new Date()).get(Calendar.YEAR));

        List<Docente_Asignatura_Curso_EstablecimientoEntity> docente_asignatura_curso_establecimientoEntities =
                docente_asignatura_curso_establecimientoService.obtenerDocenteAsignaturaCursoEstablecimientoPorFiltro(
                        -1L,
                        cursoEstablecimiento.get().getCurso_establecimiento_id(),
                        asignaturaDocente.get(0).getDocente_asignatura_id(),
                        "-1", "-1",
                        metodos.convertirFechaACalendar(new Date()).get(Calendar.YEAR),
                        metodos.convertirFechaACalendar(new Date()).get(Calendar.YEAR));


        if(docente_asignatura_curso_establecimientoEntities.size() == 0){
            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar anotacion!4"));
        }

        // Crear nueva entidad AnotacionesEntity
        AnotacionesEntity anotacion = new AnotacionesEntity();
        anotacion.setMatricula(matriculaService.obtenerMatriculaPorId(matricula.get(0).getMatricula_id().longValue()).get());
        anotacion.setDocente_asignatura_curso_establecimiento(docente_asignatura_curso_establecimientoEntities.get(0));
        anotacion.setFecha(anotacionRequest.getFecha());
        anotacion.setDescripcion(anotacionRequest.getDescripcion());
        anotacion.setGravedad(anotacionRequest.getGravedad());

        // Guardar la nueva entidad en la base de datos
        anotacionesService.guardarAnotacion(anotacion);

        /* correo.enviarCorreoAnotacion(anotacionRequest.getFecha().toString(),asignaturaDocente.getAsignaturaEntity().getAsignatura_nombre(), matricula.getAlumnoEntity().getPersonaEntity().getPersona_nombre(),  asignaturaDocente.getDocenteCursoEntity().getDocenteEntity().getPersonaEntity().getPersona_nombre(), anotacionRequest.getDescripcion(),anotacionRequest.getGravedad());*/
        return ResponseEntity.ok(new MessageResponse("Se ha registrado anotacion con exito!"));

        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar anotacion!"));

        }




    }

    @PutMapping("/Edit")
    public ResponseEntity<?> editarAnotacion(@Valid @RequestBody EditarAnotacionesRequest anotacionRequest) {

        try {
            // Validar campos obligatorios
            if (anotacionRequest.getId_anotacion() == null
                    || anotacionRequest.getFecha() == null
                    || StringUtils.isEmpty(anotacionRequest.getDescripcion())
                    || StringUtils.isEmpty(anotacionRequest.getGravedad())) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: Todos los campos son obligatorios"));
            }

            // Editar nueva entidad AnotacionesEntity
            Optional<AnotacionesEntity> opanotacion = anotacionesService.obtenerAnotacionPorId(anotacionRequest.getId_anotacion());

            if(opanotacion == null){
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encontrado la anotación"));
            }
            AnotacionesEntity anotacion = opanotacion.get();
            anotacion.setFecha(anotacionRequest.getFecha());
            anotacion.setDescripcion(anotacionRequest.getDescripcion());
            anotacion.setGravedad(anotacionRequest.getGravedad());

            // Guardar la nueva entidad en la base de datos
            anotacionesService.guardarAnotacion(anotacion);

            return ResponseEntity.ok(new MessageResponse("Se ha editado anotacion con exito!"));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado editar anotacion!"));
        }
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<?> deleteAnotacion(@PathVariable("id") Long id) {

        try{

            // Crear nueva entidad AnotacionesEntity
            Optional<AnotacionesEntity> anotacion = anotacionesService.obtenerAnotacionPorId(id);

            if(anotacion == null){
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encontrado la anotación"));
            }

            // Guardar la nueva entidad en la base de datos
            anotacionesService.eliminarAnotacion(anotacion.get().getAnotaciones_id());

            return ResponseEntity.ok(new MessageResponse("Se ha eliminado anotacion con exito!"));


        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado eliminar anotacion!"));

        }
    }
}
