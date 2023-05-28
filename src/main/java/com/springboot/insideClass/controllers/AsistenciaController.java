package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Correo;
import com.springboot.insideClass.entity.AsistenciaEntity;
import com.springboot.insideClass.entity.MatriculaEntity;
import com.springboot.insideClass.payload.request.Asistencia.EditAsistencia;
import com.springboot.insideClass.payload.request.Asistencia.GetAsistenciaRequest;
import com.springboot.insideClass.payload.request.AsistenciaRequest;
import com.springboot.insideClass.payload.request.AsistenciasRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.AsistenciaService;
import com.springboot.insideClass.service.MatriculaService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/asistencia")
public class AsistenciaController {

    @Autowired
    AsistenciaService asistenciaService;

    @Autowired
    MatriculaService matriculaService;

    @Autowired
    private Correo correo;

    @PostMapping("/Get")
    public ResponseEntity<?> obtenerAsistencia(@Valid @RequestBody GetAsistenciaRequest request) {
        try{

            if (request.getEstablecimiento_id() == null || StringUtils.isEmpty(request.getRun_alumno())) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: establecimiento_id y run_alumno son campos obligatorios"));
            }

            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(asistenciaService.obtenerInfoAsistencia(request.getEstablecimiento_id(), request.getRun_alumno(), request.getFecha().toString()));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/Create")
    public ResponseEntity<?> ingresarAsistencia(@Valid @RequestBody AsistenciasRequest asistenciaRequest) {
        try {
            if (asistenciaRequest.getMatricula() == null || asistenciaRequest.getMatricula().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: La lista de matrículas está vacía."));
            }

            if (asistenciaRequest.getFecha() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: La fecha de asistencia no puede ser nula."));
            }

            System.out.println(asistenciaRequest.getFecha());

            List<Long> matriculas = asistenciaRequest.getMatricula();
            for (Long matricula : matriculas) {
                // Aquí puedes hacer lo que necesites con cada elemento de la lista
                System.out.println(matricula);
                MatriculaEntity matriculaenty = matriculaService.findMatriculaById(matricula);

                if (matriculaenty == null) {
                    return ResponseEntity.badRequest().body(new MessageResponse("Error: No se encontró la matrícula con ID: " + matricula));
                }

                AsistenciaEntity asistencia1 = new AsistenciaEntity(matriculaenty, asistenciaRequest.getFecha());

              //  correo.enviarCorreoAsistencia(matriculaenty.getAlumnoEntity().getPersonaEntity().getPersona_nombre(), asistenciaRequest.getFecha().toString(), "Asistio", matriculaenty.getCursoEstablecimientoEntity().getEstablecimientoEntity().getEstabl_nombre());

                asistenciaService.save(asistencia1);
            }

            return ResponseEntity.ok(new MessageResponse("Se ha registrado asistencia con éxito!"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar asistencia!"));
        }
    }
    @DeleteMapping("/Delete")
    public ResponseEntity<?> eliminarAsistencia(@Valid @RequestBody AsistenciaRequest asistencia) {
        try {
            if (asistencia.getAsistencia_id() <= 0) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: El ID de asistencia no es válido."));
            }

            AsistenciaEntity asistencia1 = asistenciaService.findById(asistencia.getAsistencia_id());

            if (asistencia1 != null) {
                asistenciaService.delete(asistencia1);
            } else {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se encontró la asistencia con el ID: " + asistencia.getAsistencia_id()));
            }

            return ResponseEntity.ok(new MessageResponse("Se ha eliminado la asistencia con éxito!"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado eliminar la asistencia!"));
        }
    }

    @PostMapping("/Edit")
    public ResponseEntity<?> editarAsistencia(@Valid @RequestBody EditAsistencia editAsistencia) {
        try {
            // Verificar si el ID de asistencia es válido
            if (editAsistencia.getAsistencia_id() <= 0) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: El ID de asistencia no es válido."));
            }

            // Obtener el objeto AsistenciaEntity que se va a editar
            AsistenciaEntity optionalAsistencia = asistenciaService.findById(editAsistencia.getAsistencia_id());
            if (optionalAsistencia == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: La asistencia que se desea editar no existe"));
            }

            // Verificar si la fecha es nula
            if (editAsistencia.getFecha() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: La fecha de asistencia no puede ser nula."));
            }

            // Actualizar la fecha de la asistencia con la fecha proporcionada
            optionalAsistencia.setFecha(editAsistencia.getFecha());

            // Guardar los cambios en la base de datos
            asistenciaService.save(optionalAsistencia);

            return ResponseEntity.ok(new MessageResponse("Se ha editado asistencia con éxito!"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado editar asistencia!"));
        }
    }


}
