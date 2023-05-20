package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Correo;
import com.springboot.insideClass.entity.ComunicacionesEntity;
import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.entity.EstablecimientoEntity;
import com.springboot.insideClass.payload.request.Comunicacion.CreateRequest;
import com.springboot.insideClass.payload.request.Comunicacion.EditRequest;
import com.springboot.insideClass.payload.request.Comunicacion.GetRequest;
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
    public ResponseEntity<?> obtenerComunicacion(@Valid @RequestBody GetRequest request) {
        try{
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(comunicacionesService.obtenerInfoComunicaciones(request.getRun(), request.getId_curos(), request.getId_establecimiento(), request.getFecha()));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/Create")
    public ResponseEntity<?> ingresarComunicacion(@Valid @RequestBody CreateRequest comunicacionRequest) {

        try{
            EstablecimientoEntity establecimiento = establecimientoService.findEstablecimientoById(comunicacionRequest.getEstablecimiento());

            if(establecimiento == null){
                return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar comunicación!"));
            }

            CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(establecimiento.getEstabl_id(), comunicacionRequest.getCurso());

            if(cursoEstablecimiento == null){
                return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar comunicación!"));
            }

            ComunicacionesEntity comunicaciones = new ComunicacionesEntity();
            comunicaciones.setCursoEstablecimiento(cursoEstablecimiento);
            comunicaciones.setTipo(comunicaciones.getTipo());
            comunicaciones.setFecha(comunicaciones.getFecha());
            comunicaciones.setDescripcion(comunicaciones.getDescripcion());

            comunicacionesService.save(comunicaciones);


            correo.enviarCorreoComunicacion(comunicaciones.getFecha().toString(), comunicaciones.getTipo(), comunicaciones.getDescripcion());

            return ResponseEntity.ok(new MessageResponse("Se ha registrado comunicación con exito!"));


        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar comunicación!"));

        }
    }

    @PutMapping("/Edit")
    public ResponseEntity<?> editarComunicacion(@Valid @RequestBody EditRequest editRequest) {

        try{

            // Editar nueva entidad ComunicacionEntity

            // Editar nueva entidad AnotacionesEntity
            ComunicacionesEntity comunicaciones = comunicacionesService.findById(editRequest.getId_comunicacion());
            comunicaciones.setFecha(editRequest.getFecha());
            comunicaciones.setDescripcion(editRequest.getDescripcion());
            comunicaciones.setTipo(editRequest.getTipo());

            // Guardar la nueva entidad en la base de datos
            comunicacionesService.save(comunicaciones);



            return ResponseEntity.ok(new MessageResponse("Se ha editado comunicacion con exito!"));


        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado editar comunicacion!"));

        }
    }

    @DeleteMapping("/Delete")
    public ResponseEntity<?> deleteComunicacion(@Valid @RequestBody EditRequest editRequest) {

        try{

            // Crear nueva entidad AnotacionesEntity

            ComunicacionesEntity comunicaciones = comunicacionesService.findById(editRequest.getId_comunicacion());

            if(comunicaciones != null){
                return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado eliminar comunicacion!"));
            }


            comunicacionesService.delete(comunicaciones);
            return ResponseEntity.ok(new MessageResponse("Se ha eliminado comunicacion con exito!"));


        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado eliminar comunicacion!"));

        }
    }
}
