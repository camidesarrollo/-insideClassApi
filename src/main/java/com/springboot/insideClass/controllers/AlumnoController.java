package com.springboot.insideClass.controllers;

import com.springboot.insideClass.logisticRegression.CalificarAlumno;
import com.springboot.insideClass.payload.request.Alumno.GetByApoderadoRequest;
import com.springboot.insideClass.payload.request.Persona.GetAlumnosByApoderado;
import com.springboot.insideClass.service.AlumnoService;
import com.springboot.insideClass.service.MatriculaService;
import com.springboot.insideClass.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/alumno")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @Autowired
    private MatriculaService matriculaService;

    @Autowired
    private PersonaService personaService;

    @PostMapping("/predict-repetition")
    public ResponseEntity<Double> predictRepetition(
            @RequestParam("age") double age,
            @RequestParam("math_grade") double mathGrade,
            @RequestParam("science_grade") double scienceGrade,
            @RequestParam("literature_grade") double literatureGrade
    ) {
        try {
            System.out.println("Entramos aca");
            CalificarAlumno classifier = new CalificarAlumno();
            System.out.println("Entramos aca2");
            classifier.train();
            System.out.println("Entramos aca3");
            double probability = classifier.predict(age, mathGrade, scienceGrade, literatureGrade);
            System.out.println("Entramos aca4");
            System.out.println(probability);
            return ResponseEntity.ok(probability);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    public ResponseEntity<?> obtenerAlmunosByApoderado(@Valid @RequestBody GetByApoderadoRequest request) {
        try{
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(matriculaService.getInfoAlumno(request.getEstablecimiento_id(),"-1", -1, 1, request.getApoderado_run()));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @PostMapping("/GetAlumnosByApoderado")
    public ResponseEntity<?> obtenerDatosAlmunosByApoderado(@Valid @RequestBody GetAlumnosByApoderado request) {
        try{
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(personaService.findAlumnosByApoderado(request.getApoderado_run(), request.getMatricula_vigencia(), request.getEstabl_id())); //
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
