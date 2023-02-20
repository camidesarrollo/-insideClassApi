package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @PostMapping("/Get")
    public ResponseEntity<Object> obtenerDatosPersona(@RequestParam("run") String run) {
        try {
            PersonaEntity persona = personaService.findByRun(run);

            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(persona);

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }
    }
}
