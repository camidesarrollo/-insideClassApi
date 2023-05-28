package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.EstablecimientoEntity;
import com.springboot.insideClass.payload.request.Establecimiento.GetEstablecimiento;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.EstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/establecimiento")
public class EstablecimientoController {
    @Autowired
    private EstablecimientoService establecimientoService;

    @GetMapping("/{id}")
    public EstablecimientoEntity findEstablecimientoById(@PathVariable Long id) {
        return establecimientoService.findEstablecimientoById(id);
    }


    @PostMapping("/GetByPerfil")
    public ResponseEntity<?> obtenerEstablecimientoXPerfil(@Valid @RequestBody GetEstablecimiento establecimientoRequest) {

        try {
            System.out.println(establecimientoRequest.getEstablemiento());
            System.out.println(establecimientoRequest.getCurso());
            System.out.println(establecimientoRequest.getPerfil());
            System.out.println(establecimientoRequest.getRun());
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(establecimientoService.findEstablecimientoByUsuarioPerfil(establecimientoRequest.getEstablemiento(), establecimientoRequest.getRun(), establecimientoRequest.getCurso(),establecimientoRequest.getPerfil()));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }

    }

}
