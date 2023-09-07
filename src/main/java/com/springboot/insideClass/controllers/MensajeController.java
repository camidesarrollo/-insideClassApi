package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.WebSocketHandler;
import com.springboot.insideClass.entity.DestinatarioEntity;
import com.springboot.insideClass.entity.MensajeEntity;
import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.payload.request.Mensajeria.BuscarUltimoMensajeGrupoRequest;
import com.springboot.insideClass.payload.request.Mensajeria.MensajeRequest;
import com.springboot.insideClass.payload.request.Mensajeria.ObtenerMensajeriaDestinatarioRemitenteRequest;
import com.springboot.insideClass.payload.request.Mensajeria.obtenerDocenteByEstablecimientoCursoMensajeRequest;
import com.springboot.insideClass.payload.response.Mensaje.ObtenerMensajeByRemitenteDestinatarioResponse;
import com.springboot.insideClass.payload.response.Mensaje.ObtenerUltimoMensajeGrupoResponse;
import com.springboot.insideClass.payload.response.Persona.PersonaMensaje;
import com.springboot.insideClass.service.DestinatarioService;
import com.springboot.insideClass.service.MensajeService;
import com.springboot.insideClass.service.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/mensaje")
public class MensajeController {

    @Autowired
    private MensajeService mensajeService;

    @Autowired
    private PersonaService personaService;

    @Autowired
    private DestinatarioService destinatarioService;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;
    @Autowired
    private WebSocketHandler webSocketHandler;
    private final Logger logger = LoggerFactory.getLogger(MensajeController.class);

    @PostMapping("/obtenerUltimoMensajeGrupo")
    public ResponseEntity<?> obtenerUltimoMensajeGrupo(@Valid @RequestBody BuscarUltimoMensajeGrupoRequest buscarUltimoMensajeGrupoRequest) {

        List<ObtenerUltimoMensajeGrupoResponse> datos = mensajeService.obtenerUltimoMensajeGrupo(buscarUltimoMensajeGrupoRequest.getRun());

        return ResponseEntity.ok(datos);
    }

    @PostMapping("/obtenerDocenteByEstablecimientoCursoMensaje")
    public ResponseEntity<?> obtenerDocenteByEstablecimientoCursoMensaje(@Valid @RequestBody obtenerDocenteByEstablecimientoCursoMensajeRequest obtenerDocenteByEstablecimientoCursoMensajeRequest) {

        List<PersonaMensaje> datos = mensajeService.obtenerDocenteByEstablecimientoCursoMensaje(obtenerDocenteByEstablecimientoCursoMensajeRequest.getPersona_run(), obtenerDocenteByEstablecimientoCursoMensajeRequest.getEstablecimiento_id(),
                obtenerDocenteByEstablecimientoCursoMensajeRequest.getCurso_id(), obtenerDocenteByEstablecimientoCursoMensajeRequest.getDocente_id());

        return ResponseEntity.ok(datos);
    }

    @PostMapping("/obtenerMensajeByRemitenteDestinatario")
    public ResponseEntity<?> ObtenerMensajeByRemitenteDestinatario(@Valid @RequestBody ObtenerMensajeriaDestinatarioRemitenteRequest obtenerMensajeriaDestinatarioRemitenteRequest) {

        List<ObtenerMensajeByRemitenteDestinatarioResponse> datos = mensajeService.ObtenerMensajeByRemitenteDestinatario(obtenerMensajeriaDestinatarioRemitenteRequest.getR_persona_run(), obtenerMensajeriaDestinatarioRemitenteRequest.getD_persona_run());

        return ResponseEntity.ok(datos);
    }

    @PostMapping("/enviar")
    public ResponseEntity<String> enviarMensaje(@RequestBody MensajeRequest mensajeR) {
        logger.info("Entamos al metodo de envio");
        PersonaEntity p = personaService.obtenerPersonasPorFiltro(mensajeR.getR_persona_run(), "-1", "-1", "-1","-1","-1","-1","-1").get(0);

        if(mensajeR.getGrupo() != null){

            /*MensajeEntity mensaje = new MensajeEntity(
                    mensajeR.getContenido(),
                    LocalDateTime.now(),
                    p,

            );*/
        }else{
            logger.info("Guardando la info");
            MensajeEntity mensaje = new MensajeEntity(
                    mensajeR.getGroupMensaje(),
                    mensajeR.getContenido(),
                    LocalDateTime.now(),
                    p,
                    null
            );

            MensajeEntity mensajeEnviado = mensajeService.saveMensaje(mensaje);
            PersonaEntity pD = personaService.obtenerPersonasPorFiltro(mensajeR.getD_persona_run(), "-1", "-1", "-1","-1","-1","-1","-1").get(0);


            DestinatarioEntity destinatarioEntity = new DestinatarioEntity(
                    mensajeEnviado,
                    pD
            );
            destinatarioService.saveDestinatario(destinatarioEntity);

            // Enviar el mensaje a través del WebSocket
            logger.info("intentioned que funcione");
            webSocketHandler.enviarMensaje(mensajeR.getD_persona_run(), mensaje.getContenido());

        }


        return ResponseEntity.ok("Mensaje enviado exitosamente");
    }

    @PutMapping("/editar/{mensajeId}")
    public ResponseEntity<String> editarMensaje(
            @PathVariable Long mensajeId,
            @RequestBody MensajeEntity mensajeActualizado) {
        Optional<MensajeEntity> mensajeOptional = Optional.ofNullable(mensajeService.findById(mensajeId));
        if (mensajeOptional.isPresent()) {
            MensajeEntity mensajeExistente = mensajeOptional.get();
            mensajeExistente.setContenido(mensajeActualizado.getContenido());
            mensajeService.findById(mensajeExistente.getMensajeId());
            return ResponseEntity.ok("Mensaje editado exitosamente");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar/{mensajeId}")
    public ResponseEntity<String> eliminarMensaje(@PathVariable Long mensajeId) {
        Optional<MensajeEntity> mensajeOptional = Optional.ofNullable(mensajeService.findById(mensajeId));
        if (mensajeOptional.isPresent()) {
            mensajeService.deleteMensaje(mensajeOptional.get().getMensajeId());
            return ResponseEntity.ok("Mensaje eliminado exitosamente");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
