package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Correo;
import com.springboot.insideClass.entity.ComunicacionesEntity;
import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.entity.EstablecimientoEntity;
import com.springboot.insideClass.payload.request.Comunicacion.CreateComunicacionesRequest;
import com.springboot.insideClass.payload.request.Comunicacion.EditComunicacionesRequest;
import com.springboot.insideClass.payload.request.Comunicacion.GetComunicacionesRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.ComunicacionesService;
import com.springboot.insideClass.service.CursoEstablecimientoService;
import com.springboot.insideClass.service.EstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/comunicaciones")
public class ComunicacionesController {

    @Autowired
    ComunicacionesService comunicacionesService;


    @Autowired
    private EstablecimientoService establecimientoService;

    @Autowired
    private CursoEstablecimientoService cursoEstablecimientoService;

    @Autowired
    private Correo correo;

    @PostMapping("/Get")
    public ResponseEntity<?> obtenerComunicacion(@Valid @RequestBody GetComunicacionesRequest request) {
        try {
            // Validar campos obligatorios
            if (request.getId_establecimiento() == null) {
                return ResponseEntity.badRequest().body("El campo 'id_establecimiento' es obligatorio.");
            }
            if (request.getId_curos() == null) {
                return ResponseEntity.badRequest().body("El campo 'id_curos' es obligatorio.");
            }
            if (request.getFecha() == null || request.getFecha().isEmpty()) {
                return ResponseEntity.badRequest().body("El campo 'fecha' es obligatorio.");
            }
            if (request.getRun() == null || request.getRun().isEmpty()) {
                return ResponseEntity.badRequest().body("El campo 'run' es obligatorio.");
            }

            return ResponseEntity.ok()
                    .header(HttpHeaders.SET_COOKIE)
                    .body(comunicacionesService.obtenerInfoComunicaciones(request.getRun(), request.getId_curos(), request.getId_establecimiento(), request.getFecha()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/Create")
    public ResponseEntity<?> ingresarComunicacion(@Valid @RequestBody CreateComunicacionesRequest comunicacionRequest) {
        try {
            // Validar campos obligatorios
            if (comunicacionRequest.getEstablecimiento() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'establecimiento' es obligatorio."));
            }
            if (comunicacionRequest.getCurso() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'curso' es obligatorio."));
            }
            if (comunicacionRequest.getRun_docente() == null || comunicacionRequest.getRun_docente().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'run_docente' es obligatorio."));
            }
            if (comunicacionRequest.getFecha() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'fecha' es obligatorio."));
            }
            if (comunicacionRequest.getDescripcion() == null || comunicacionRequest.getDescripcion().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'descripcion' es obligatorio."));
            }
            if (comunicacionRequest.getTipo() == null || comunicacionRequest.getTipo().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'tipo' es obligatorio."));
            }

            EstablecimientoEntity establecimiento = establecimientoService.findEstablecimientoById(comunicacionRequest.getEstablecimiento());

            if (establecimiento == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar comunicación!"));
            }
            Date fechaInicio = comunicacionRequest.getFecha();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaInicio);
            int year = calendar.get(Calendar.YEAR);

            Date fechaFin =comunicacionRequest.getFecha();
            calendar.setTime(fechaFin);
            int yearFin = calendar.get(Calendar.YEAR);

            CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(
                    comunicacionRequest.getCurso(),
                    -1,
                    year,
                    yearFin);

            if (cursoEstablecimiento == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar comunicación!"));
            }

            ComunicacionesEntity comunicaciones = new ComunicacionesEntity();
            comunicaciones.setCursoEstablecimiento(cursoEstablecimiento);
            comunicaciones.setTipo(comunicacionRequest.getTipo());
            comunicaciones.setFecha(comunicacionRequest.getFecha());
            comunicaciones.setDescripcion(comunicacionRequest.getDescripcion());

            comunicacionesService.save(comunicaciones);

            LocalDate localDate = comunicaciones.getFecha().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE MMMM yyyy", new Locale("es", "ES"));
            String fecha = localDate.format(formatter);
            System.out.println(fecha);

            /* correo.enviarCorreoComunicacion(fecha, comunicaciones.getTipo(), comunicaciones.getDescripcion()); */

            return ResponseEntity.ok(new MessageResponse("Se ha registrado comunicación con éxito!"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar comunicación!"));
        }
    }


    @PutMapping("/Edit")
    public ResponseEntity<?> editarComunicacion(@Valid @RequestBody EditComunicacionesRequest editRequest) {
        try {
            // Validar campos obligatorios
            if (editRequest.getId_comunicacion() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'id_comunicacion' es obligatorio."));
            }
            if (editRequest.getFecha() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'fecha' es obligatorio."));
            }
            if (editRequest.getDescripcion() == null || editRequest.getDescripcion().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'descripcion' es obligatorio."));
            }
            if (editRequest.getTipo() == null || editRequest.getTipo().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'tipo' es obligatorio."));
            }

            // Editar entidad ComunicacionesEntity
            ComunicacionesEntity comunicaciones = comunicacionesService.findById(editRequest.getId_comunicacion());
            if (comunicaciones == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("No se encontró la comunicación a editar."));
            }
            comunicaciones.setFecha(editRequest.getFecha());
            comunicaciones.setDescripcion(editRequest.getDescripcion());
            comunicaciones.setTipo(editRequest.getTipo());

            // Guardar la entidad editada en la base de datos
            comunicacionesService.save(comunicaciones);

            return ResponseEntity.ok(new MessageResponse("Se ha editado comunicación con éxito!"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado editar comunicación!"));
        }
    }


    @DeleteMapping("/Delete")
    public ResponseEntity<?> deleteComunicacion(@Valid @RequestBody EditComunicacionesRequest editRequest) {

        try{

            // Validar campos obligatorios
            if (editRequest.getId_comunicacion() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'id_comunicacion' es obligatorio."));
            }
            if (editRequest.getFecha() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'fecha' es obligatorio."));
            }
            if (editRequest.getDescripcion() == null || editRequest.getDescripcion().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'descripcion' es obligatorio."));
            }
            if (editRequest.getTipo() == null || editRequest.getTipo().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'tipo' es obligatorio."));
            }

            // Eliminar entidad ComunicacionesEntity
            ComunicacionesEntity comunicaciones = comunicacionesService.findById(editRequest.getId_comunicacion());
            if (comunicaciones == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("No se encontró la comunicación a editar."));
            }

            comunicacionesService.delete(comunicaciones);
            return ResponseEntity.ok(new MessageResponse("Se ha eliminado comunicacion con exito!"));


        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado eliminar comunicacion!"));

        }
    }
}
