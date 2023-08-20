package com.springboot.insideClass.controllers;

import com.springboot.insideClass.payload.request.Mensajeria.BuscarUltimoMensajeGrupoRequest;
import com.springboot.insideClass.payload.response.Mensaje.ObtenerUltimoMensajeGrupoResponse;
import com.springboot.insideClass.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/mensaje")
public class MensajeController {

    @Autowired
    private MensajeService mensajeService;

    @PostMapping("/obtenerUltimoMensajeGrupo")
    public ResponseEntity<?> obtenerUltimoMensajeGrupo(@Valid @RequestBody BuscarUltimoMensajeGrupoRequest buscarUltimoMensajeGrupoRequest) {

        List<ObtenerUltimoMensajeGrupoResponse> datos = mensajeService.obtenerUltimoMensajeGrupo(buscarUltimoMensajeGrupoRequest.getRun());

        return ResponseEntity.ok(datos);
    }

}
