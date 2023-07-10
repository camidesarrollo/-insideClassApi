package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.AlumnoEntity;
import com.springboot.insideClass.payload.request.Alumno.BuscarAlumnoRequest;
import com.springboot.insideClass.payload.request.Alumno.BuscarAlumnosPorApoderadoRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.AlumnoService;
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
    private PersonaService personaService;

    @PostMapping("/Get")
    public ResponseEntity<?> obtenerTodosLosAlumnos() {
        return ResponseEntity.ok(alumnoService.obtenerTodosLosAlumnos());
    }
    @PostMapping("/GetById")
    public ResponseEntity<?> obtenerAlumnoPorId(@Valid @RequestBody Long id) {
        return ResponseEntity.ok(alumnoService.obtenerAlumnoPorId(id));
    }
    @PostMapping("/GetByFilter")
    public ResponseEntity<?>  obtenerAlumnoPorFiltro(@Valid @RequestBody BuscarAlumnoRequest buscarAlumnoRequest) {
        return ResponseEntity.ok(alumnoService.obtenerAlumnoPorFiltro(buscarAlumnoRequest.getId(), buscarAlumnoRequest.getAlumno_persona_run()));
    }
    @PostMapping("/Save")
    public ResponseEntity<?> guardarAlumno(@Valid @RequestBody AlumnoEntity alumno) {
        return ResponseEntity.ok(alumnoService.guardarAlumno(alumno));
    }
    @DeleteMapping("/Delete")
    public ResponseEntity<?> eliminarAlumno(@Valid @RequestBody Long id) {
        alumnoService.eliminarAlumno(id);
        return ResponseEntity.ok(new MessageResponse("Alumno eliminado con exito!"));
    }
    @PostMapping("/GetByApoderado")
    public ResponseEntity<?> obtenerDatosAlmunosByApoderado(@Valid @RequestBody BuscarAlumnosPorApoderadoRequest request) {
        try{
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(personaService.buscarAlumnosPorApoderado(request.getApoderado_run(), request.getMatricula_vigencia(), request.getEstabl_id())); //
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
