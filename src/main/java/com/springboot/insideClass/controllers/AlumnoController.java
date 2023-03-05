package com.springboot.insideClass.controllers;

import com.springboot.insideClass.logisticRegression.CalificarAlumno;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/alumno")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;


    @PostMapping("/Get")
    public ResponseEntity<Object> tablaAlumno(@RequestParam("id_establecimient") String id_establecimient) {

        try {
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(alumnoService.getInfoAlumno(id_establecimient));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }
    }

    @GetMapping("/predict-repetition")
    public ResponseEntity<Double> predictRepetition(
            @RequestParam("age") double age,
            @RequestParam("math_grade") double mathGrade,
            @RequestParam("science_grade") double scienceGrade,
            @RequestParam("literature_grade") double literatureGrade
    ) {
        try {
            CalificarAlumno classifier = new CalificarAlumno();
            classifier.train();
            double probability = classifier.predict(age, mathGrade, scienceGrade, literatureGrade);
            return ResponseEntity.ok(probability);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
