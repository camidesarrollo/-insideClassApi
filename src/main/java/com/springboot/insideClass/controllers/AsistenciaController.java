package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Correo;
import com.springboot.insideClass.entity.AsistenciaEntity;
import com.springboot.insideClass.entity.MatriculaEntity;
import com.springboot.insideClass.payload.request.Asistencia.BuscarAsistenciaRequest;
import com.springboot.insideClass.payload.request.Asistencia.CrearAsistenciaRequest;
import com.springboot.insideClass.payload.request.Asistencia.EditarAsistencia;
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
import java.util.Optional;

public class AsistenciaController {

    @Autowired
    AsistenciaService asistenciaService;

    @Autowired
    MatriculaService matriculaService;

    @Autowired
    private Correo correo;

    @PostMapping("/Get")
    public ResponseEntity<?> obtenerAsistencia(@Valid @RequestBody BuscarAsistenciaRequest request) {
        try{

            if (request.getEstablecimiento_id() == null || StringUtils.isEmpty(request.getAlumno_persona_run())) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: establecimiento_id y run_alumno son campos obligatorios"));
            }

            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(asistenciaService.obtenerAsistenciasPorFiltros(
                          request.getCurso_agno(),
                          request.isMatricula_vigencia(),
                          request.getAlumno_persona_run(),
                          request.getFecha(),
                          request.getAnio(),
                          request.getEstablecimiento_id(),
                          request.getCurso_id()
                    ));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/Create")
    public ResponseEntity<?> ingresarAsistencia(@Valid @RequestBody CrearAsistenciaRequest asistenciaRequest) {
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
                Optional<MatriculaEntity> matriculaenty = matriculaService.obtenerMatriculaPorId(matricula);

                if (matriculaenty == null) {
                    return ResponseEntity.badRequest().body(new MessageResponse("Error: No se encontró la matrícula con ID: " + matricula));
                }

                AsistenciaEntity asistencia1 = new AsistenciaEntity(matriculaenty.get(), asistenciaRequest.getFecha());

                correo.enviarCorreoAsistencia(matriculaenty.get().getAlumno().getPersona().getPersona_nombre(),
                        asistenciaRequest.getFecha().toString(),
                        "Asistio",
                        matriculaenty.get().getCursoEstablecimiento().getEstablecimiento().getEstablecimiento_nombre()
                );

                asistenciaService.guardarAsistencia(asistencia1);
            }

            return ResponseEntity.ok(new MessageResponse("Se ha registrado asistencia con éxito!"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar asistencia!"));
        }
    }
    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<?> eliminarAsistencia(@PathVariable("id") Long id) {
        try {
            if (id <= 0) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: El ID de asistencia no es válido."));
            }

            AsistenciaEntity asistencia = asistenciaService.obtenerAsistenciaPorId(id);

            if (asistencia != null) {
                asistenciaService.eliminarAsistencia(asistencia.getAsistencia_id());
                return ResponseEntity.ok(new MessageResponse("Se ha eliminado la asistencia con éxito!"));
            } else {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se encontró la asistencia con el ID: " + id));
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado eliminar la asistencia!"));
        }
    }

    @PutMapping("/Edit")
    public ResponseEntity<?> editarAsistencia(@Valid @RequestBody EditarAsistencia editAsistencia) {
        try {
            // Verificar si el ID de asistencia es válido
            if (editAsistencia.getAsistencia_id() <= 0) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: El ID de asistencia no es válido."));
            }

            // Obtener el objeto AsistenciaEntity que se va a editar
            AsistenciaEntity optionalAsistencia = asistenciaService.obtenerAsistenciaPorId(editAsistencia.getAsistencia_id());
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
            asistenciaService.guardarAsistencia(optionalAsistencia);

            return ResponseEntity.ok(new MessageResponse("Se ha editado asistencia con éxito!"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado editar asistencia!"));
        }
    }
}
