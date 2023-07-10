package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Metodos;
import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.payload.request.Persona.BuscarPersonaRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @Autowired
    Metodos metodos;
    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<PersonaEntity>> obtenerPersonasPorFiltro(@Valid @RequestBody BuscarPersonaRequest buscarPersonaRequest) {
        List<PersonaEntity> personas = personaService.obtenerPersonasPorFiltro(
                buscarPersonaRequest.getPersona_run(),
                buscarPersonaRequest.getPersona_nombre(),
                buscarPersonaRequest.getPersona_apellido_paterno(),
                buscarPersonaRequest.getPersona_apellido_materno(),
                buscarPersonaRequest.getPersona_fecha_nacimiento(),
                buscarPersonaRequest.getPersona_sexo().toString(),
                buscarPersonaRequest.getPersona_numero_telefonico(),
                buscarPersonaRequest.getPersona_numero_celular());

        if (personas.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(personas);
        }
    }



    @PostMapping("/guardar")
    public ResponseEntity<PersonaEntity> guardarPersona(@Valid @RequestBody PersonaEntity persona) {
        PersonaEntity nuevaPersona = personaService.guardarPersona(persona);
        return ResponseEntity.ok(nuevaPersona);
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<PersonaEntity> obtenerPersonaPorId(@Valid @RequestBody String id) {
        Optional<PersonaEntity> persona = personaService.obtenerPersonaPorId(id);
        if (persona.isPresent()) {
            return ResponseEntity.ok(persona.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/obtenerTodos")
    public List<PersonaEntity> obtenerTodasLasPersonas() {
        return personaService.obtenerTodasLasPersonas();
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<MessageResponse> eliminarPersona(@Valid @RequestBody String id) {
        personaService.eliminarPersona(id);
        return ResponseEntity.ok(new MessageResponse("Persona eliminada con éxito!"));
    }


    @PostMapping("/Get")
    public ResponseEntity<Object> obtenerDatosPersona(@RequestParam("run") String run) {
        try {
            if(run.trim() != "" && run != null){
                List<PersonaEntity> persona = personaService.obtenerPersonasPorFiltro(run, "-1","-1", "-1", "-1", "-1", "-1","-1" );

                return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                        .body(persona);
            }
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }
    }
}
