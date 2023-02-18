package com.springboot.insideClass.controllers;

import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/curso")
public class CursoController {

    @Autowired
    CursoService cursoService;
    @PostMapping("/Get")
    public ResponseEntity<?> obtenerCurso() throws ParseException {

        try {

            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(cursoService.get());

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado obtener cursos!"));
        }

    }

    @PostMapping("/GetByEstablecimiento")
    public ResponseEntity<?> obtenerCursoByEstablecimiento(@RequestParam("id_establecimient") long id_establecimient) throws ParseException {
        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                .body(cursoService.getCursoByEstablecimiento(id_establecimient));

    }



}
