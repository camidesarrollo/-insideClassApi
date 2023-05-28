package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.payload.request.Persona.PersonaRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @PostMapping("/Get")
    public ResponseEntity<Object> obtenerDatosPersona(@RequestParam("run") String run) {
        try {
            if(run.trim() != "" && run != null){
                PersonaEntity persona = personaService.findByRun(run);

                return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                        .body(persona);
            }
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }
    }

    @PutMapping("/Put")
    public ResponseEntity<Object> modificarDatosPersona(@Valid @RequestBody PersonaRequest personaRequest) {
        try {
            if(personaRequest.IsValid()){
                PersonaEntity persona = personaService.findByRun(personaRequest.getPersona_run());
                persona.setPersona_nombre(personaRequest.getPersona_nombre());
                persona.setPersona_apellido_paterno(personaRequest.getPersona_apellido_paterno());
                persona.setPersona_apellido_materno(personaRequest.getPersona_apellido_materno());
                persona.setPersona_fecha_nacimiento(personaRequest.getPersona_fecha_nacimiento());
                persona.setPersona_sexo(personaRequest.getPersona_sexo());
                persona.setPersona_numero_telefonico(personaRequest.getPersona_numero_telefonico());
                persona.setPersona_numero_celular(personaRequest.getPersona_numero_celular());
                persona.setPersona_numero_celular(personaRequest.getPersona_numero_celular());

                return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                        .body(persona);
            }
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }
    }
}
