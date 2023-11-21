package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Metodos;
import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.entity.UsuarioEntity;
import com.springboot.insideClass.payload.request.Persona.BuscarPersonaRequest;
import com.springboot.insideClass.payload.request.Persona.CrearPersonaRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.PerfilService;
import com.springboot.insideClass.service.PersonaService;
import com.springboot.insideClass.service.UsuarioService;
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
    private UsuarioService usuarioService;
    @Autowired
    private PerfilService perfilService;


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

    @PutMapping("/Update")
    public ResponseEntity<?> editarPersona(@Valid @RequestBody CrearPersonaRequest persona) {
        /*try {

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logró editar la información requerida!"));
        } */



        //Que otro usuario diferente tenga el rut ingresado, si es el mismo no deberia mandar el mensaje
        if(usuarioService.buscarUsuariosPorFiltro(-1L, persona.getPersona_correo(), "-1", "-1", -1L, persona.getPersona_run(), 1L).size() == 0 && usuarioService.buscarUsuariosPorFiltro(-1L, persona.getPersona_correo(), "-1", "-1", -1L, "-1", 1L).size() > 0){
            return ResponseEntity.badRequest().body(new MessageResponse("Ya existe el correo ingresado para un usuario, por favor ingrese otro"));
        }

        PersonaEntity personaEntity = new PersonaEntity();

        // Verificar y asignar valores solo si no están vacíos
        String nombre = persona.getPersona_nombre();
        if (nombre != null && !nombre.isEmpty()) {
            personaEntity.setPersona_nombre(nombre);
        }

        String apellidoPaterno = persona.getPersona_apellido_paterno();
        if (apellidoPaterno != null && !apellidoPaterno.isEmpty()) {
            personaEntity.setPersona_apellido_paterno(apellidoPaterno);
        }


        if (persona.getPersona_fecha_nacimiento() != null) {
            personaEntity.setPersona_fecha_nacimiento(persona.getPersona_fecha_nacimiento());
        }

        String apellidoMaterno = persona.getPersona_apellido_materno();
        if (apellidoMaterno != null && !apellidoMaterno.isEmpty()) {
            personaEntity.setPersona_apellido_materno(apellidoMaterno);
        }
        System.out.println(persona.getPersona_correo());
        personaEntity.setPersona_run(persona.getPersona_run());
        personaEntity.setPersona_sexo(persona.getPersona_sexo());
        personaEntity.setPersona_numero_telefonico(persona.getPersona_numero_telefonico());
        personaEntity.setPersona_numero_celular(persona.getPersona_numero_celular());

        if(persona.getTipoUsuario() == 1){
            List<UsuarioEntity> usuario2 = usuarioService.buscarUsuariosPorFiltro(-1L, persona.getPersona_correo(), "-1", "-1", -1L, "-1", 1L);

            if(usuario2.size() == 0){
                UsuarioEntity usuario3 = usuarioService.buscarUsuariosPorFiltro(-1L, "-1", "-1", "-1", 2L,persona.getPersona_run() , 1L).get(0);
                usuario3.setEmail(persona.getPersona_correo());
                usuarioService.guardarUsuario(usuario3);
            }
        }

        personaService.guardarPersona(personaEntity);
        return ResponseEntity.ok().body(new MessageResponse("Se ha modificado la persona con éxito"));

    }

}
