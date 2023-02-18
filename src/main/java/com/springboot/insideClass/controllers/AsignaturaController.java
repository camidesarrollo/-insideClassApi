package com.springboot.insideClass.controllers;

import com.springboot.insideClass.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/asignatura")
public class AsignaturaController {

    @Autowired
    AsignaturaService asignaturaService;
    @PostMapping("/Get")
    public ResponseEntity<?> obtenerAsignaturas() throws ParseException {
        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                .body(asignaturaService.findAll());

    }
}
