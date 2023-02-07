package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.AsistenciaEntity;
import com.springboot.insideClass.entity.MatriculaEntity;
import com.springboot.insideClass.payload.request.AsistenciaRequest;
import com.springboot.insideClass.payload.request.AsistenciasRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.AsistenciaService;
import com.springboot.insideClass.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/asistencia")
public class AsistenciaController {

    @Autowired
    AsistenciaService asistenciaService;

    @Autowired
    MatriculaService matriculaService;

    @PostMapping("/ingresarAsistencia")
    public ResponseEntity<?> ingresarAsistencia(@Valid @RequestBody AsistenciasRequest asistenciaRequest) {

        System.out.println( asistenciaRequest.getFecha());
        for (Long asistencia : asistenciaRequest.getMatricula()) {

            MatriculaEntity matricula = matriculaService.findMatriculaById(asistencia);
            AsistenciaEntity asistencia1 = new AsistenciaEntity(matricula, asistenciaRequest.getFecha());
            asistenciaService.save(asistencia1);

        }

        return ResponseEntity.ok(new MessageResponse("Se ha registrado asistencia con exito!"));


        /*try{

        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar asistencia!"));

        }*/

    }

    public ResponseEntity<?> editarAsisitencia(AsistenciaRequest asistencia) {
        try{
            AsistenciaEntity asistencia1 = asistenciaService.findById(asistencia.getAsistencia_id());

            if(asistencia1 != null){
                asistenciaService.delete(asistencia1);
            }

            return ResponseEntity.ok(new MessageResponse("Se ha registrado asistencia eliminada con exito!"));
        }catch (Exception e){
            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado eliminar  asistencia!"));

        }
    }

}
