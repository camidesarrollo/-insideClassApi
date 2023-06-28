package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Correo;
import com.springboot.insideClass.entity.AnotacionesEntity;
import com.springboot.insideClass.entity.AsignaturaDocenteEntity;
import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.entity.MatriculaEntity;
import com.springboot.insideClass.payload.request.Anotacion.CreateAnotacion;
import com.springboot.insideClass.payload.request.Anotacion.EditAnotacion;
import com.springboot.insideClass.payload.request.Anotacion.GetAnotacion;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.AnotacionesService;
import com.springboot.insideClass.service.AsignaturaDocenteService;
import com.springboot.insideClass.service.CursoEstablecimientoService;
import com.springboot.insideClass.service.MatriculaService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.ZoneId;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/anotaciones")
public class AnotacionesController {
    @Autowired
    private AnotacionesService anotacionesService;
    @Autowired
    private MatriculaService matriculaService;

    @Autowired
    private CursoEstablecimientoService cursoEstablecimientoService;

    @Autowired
    private AsignaturaDocenteService asignaturaDocenteService;

    @Autowired
    private Correo correo;

    @PostMapping("/Get")
    public ResponseEntity<?> obtenerAnotaciones(@Valid @RequestBody GetAnotacion request) {
        try {
            // Validar campos fecha y run
            if (StringUtils.isEmpty(request.getFecha())) {
                return ResponseEntity.badRequest().body("El campo 'fecha' no puede estar vacío");
            }
            if (StringUtils.isEmpty(request.getRun())) {
                return ResponseEntity.badRequest().body("El campo 'run' no puede estar vacío");
            }

            return ResponseEntity.ok()
                    .header(HttpHeaders.SET_COOKIE)
                    .body(anotacionesService.obtenerInfoAnotaciones(request.getRun(), request.getId_curos(), request.getId_asignatura(), request.getId_establecimiento(),  request.getFecha()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/Create")
    public ResponseEntity<?> ingresarAnotacion(@Valid @RequestBody CreateAnotacion anotacionRequest) {

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

            MatriculaEntity matricula = matriculaService.findMatriculaByRunAndCurso(anotacionRequest.getRun(), year, anotacionRequest.getEstablecimiento());

            if(matricula == null){
                return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar anotacion!"));
            }


           CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientosByCursoAndEstablecimientos(-1, anotacionRequest.getEstablecimiento(), matricula.getMatricula_id().intValue(), matricula.getCurso_agno(), matricula.getCurso_agno()).get(0);

            if(cursoEstablecimiento == null){
                return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar anotacion!"));
            }

         AsignaturaDocenteEntity asignaturaDocente = asignaturaDocenteService.findDocenteCursoByRunAndAsignaturaAndEstablecimiento(
                 year,
                 year,
                 anotacionRequest.getRun_docente(),anotacionRequest.getAsignatura() );


            if(asignaturaDocente == null){
                return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar anotacion!"));
            }


             // Crear nueva entidad AnotacionesEntity
                    AnotacionesEntity anotacion = new AnotacionesEntity();
                    anotacion.setMatriculaEntity(matricula);
                    anotacion.setAsignaturaDocenteEntity(asignaturaDocente);
                    anotacion.setFecha(anotacionRequest.getFecha());
                    anotacion.setDescripcion(anotacionRequest.getDescripcion());
                    anotacion.setGravedad(anotacionRequest.getGravedad());

        // Guardar la nueva entidad en la base de datos
                    anotacionesService.save(anotacion);

           /* correo.enviarCorreoAnotacion(anotacionRequest.getFecha().toString(),asignaturaDocente.getAsignaturaEntity().getAsignatura_nombre(), matricula.getAlumnoEntity().getPersonaEntity().getPersona_nombre(),  asignaturaDocente.getDocenteCursoEntity().getDocenteEntity().getPersonaEntity().getPersona_nombre(), anotacionRequest.getDescripcion(),anotacionRequest.getGravedad());*/
            return ResponseEntity.ok(new MessageResponse("Se ha registrado anotacion con exito!"));


        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar asistencia!"));

        }
    }

    @PutMapping("/Edit")
    public ResponseEntity<?> editarAnotacion(@Valid @RequestBody EditAnotacion anotacionRequest) {

        try {
            // Validar campos obligatorios
            if (anotacionRequest.getId_anotacion() == null
                    || anotacionRequest.getFecha() == null
                    || StringUtils.isEmpty(anotacionRequest.getDescripcion())
                    || StringUtils.isEmpty(anotacionRequest.getGravedad())) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: Todos los campos son obligatorios"));
            }

            // Editar nueva entidad AnotacionesEntity
            AnotacionesEntity anotacion = anotacionesService.findById(anotacionRequest.getId_anotacion());
            anotacion.setFecha(anotacionRequest.getFecha());
            anotacion.setDescripcion(anotacionRequest.getDescripcion());
            anotacion.setGravedad(anotacionRequest.getGravedad());

            // Guardar la nueva entidad en la base de datos
            anotacionesService.save(anotacion);

            return ResponseEntity.ok(new MessageResponse("Se ha editado anotacion con exito!"));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado editar anotacion!"));
        }
    }

    @DeleteMapping("/Delete")
    public ResponseEntity<?> deleteAnotacion(@Valid @RequestBody EditAnotacion anotacionRequest) {

        try{

            if (anotacionRequest.getId_anotacion() == null
                    || anotacionRequest.getFecha() == null
                    || StringUtils.isEmpty(anotacionRequest.getDescripcion())
                    || StringUtils.isEmpty(anotacionRequest.getGravedad())) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: Todos los campos son obligatorios"));
            }

            // Crear nueva entidad AnotacionesEntity
            AnotacionesEntity anotacion = anotacionesService.findById(anotacionRequest.getId_anotacion());
            // Guardar la nueva entidad en la base de datos
            anotacionesService.delete(anotacion);

            return ResponseEntity.ok(new MessageResponse("Se ha eliminado anotacion con exito!"));


        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado eliminar anotacion!"));

        }
    }
}
