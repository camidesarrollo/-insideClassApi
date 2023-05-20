package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.*;
import com.springboot.insideClass.componet.Correo;
import com.springboot.insideClass.payload.request.Notas.CreateNotas;
import com.springboot.insideClass.payload.request.Notas.EditNotas;
import com.springboot.insideClass.payload.request.Notas.GetNotas;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/notas")
public class NotasController {

    @Autowired
    private MatriculaService matriculaService;

    @Autowired
    private CursoEstablecimientoService cursoEstablecimientoService;

    @Autowired
    private AsignaturaDocenteService asignaturaDocenteService;

    @Autowired
    private AsignaturaNotaService asignaturaNotaService;

    @Autowired
    private AlumnoService alumnoService;

    @Autowired
    private Correo correo;
    @PostMapping("/Get")
    public ResponseEntity<?> obtenerNota(@Valid @RequestBody GetNotas notaRequest) {

        try{
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(asignaturaNotaService.obtenerInfoNotas(notaRequest.getRun(), notaRequest.getDocente_run(), notaRequest.getId_establecimiento(),notaRequest.getId_asignatura(), notaRequest.getFecha()));
        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar nota!"));

        }
    }

    @PostMapping("/Create")
    public ResponseEntity<?> ingresarNota(@Valid @RequestBody CreateNotas notaRequest) {
      /*  try {
            LocalDate localDate = notaRequest.getFecha().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int year = localDate.getYear();

            MatriculaEntity matricula = matriculaService.findMatriculaByRunAndCurso(notaRequest.getRun(), year, notaRequest.getEstablecimiento());
            if (matricula == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado encontrar matricula!"));
            }

            CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findById(matricula.getCursoEstablecimientoEntity().getCurso_establ_id());
            if (cursoEstablecimiento == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado encontrar matricula !"));
            }

            AsignaturaDocenteEntity asignaturaDocente = asignaturaDocenteService.findDocenteCursoByRunAndAsignaturaAndEstablecimiento(notaRequest.getDocente_run(), notaRequest.getAsignatura(), cursoEstablecimiento.getCursoEntity().getCurso_id(), year);
            if (asignaturaDocente == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar nota!"));
            }

            // Crear nueva entidad AsignaturaNotaEntity
            AsignaturaNotaEntity nota = new AsignaturaNotaEntity();
            nota.setMatriculaEntity(matricula);
            nota.setAsignaturaDocenteEntity(asignaturaDocente);
            nota.setAsignatura_nota_nota(notaRequest.getNota());

            // Guardar la nueva entidad en la base de datos
            asignaturaNotaService.save(nota);


            correo.enviarCorreoNota(matricula.getAlumnoEntity().getPersonaEntity().getPersona_nombre(), asignaturaDocente.getAsignaturaEntity().getAsignatura_nombre(), notaRequest.getNota(), asignaturaDocente.getDocenteCursoEntity().getDocenteEntity().getPersonaEntity().getPersona_nombre());

            return ResponseEntity.ok(new MessageResponse("Se ha registrado la nota con éxito!"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar la nota!" + e.getMessage()));
        }*/

        LocalDate localDate = notaRequest.getFecha().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year = localDate.getYear();

        MatriculaEntity matricula = matriculaService.findMatriculaByRunAndCurso(notaRequest.getRun(), year, notaRequest.getEstablecimiento());
        if (matricula == null) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado encontrar matricula!"));
        }

        CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findById(matricula.getCursoEstablecimientoEntity().getCurso_establ_id());
        if (cursoEstablecimiento == null) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado encontrar matricula !"));
        }

        AsignaturaDocenteEntity asignaturaDocente = asignaturaDocenteService.findDocenteCursoByRunAndAsignaturaAndEstablecimiento(notaRequest.getDocente_run(), notaRequest.getAsignatura(), cursoEstablecimiento.getCursoEntity().getCurso_id(), year);
        if (asignaturaDocente == null) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar nota!"));
        }

        // Crear nueva entidad AsignaturaNotaEntity
        AsignaturaNotaEntity nota = new AsignaturaNotaEntity();
        nota.setMatriculaEntity(matricula);
        nota.setAsignaturaDocenteEntity(asignaturaDocente);
        nota.setAsignatura_nota_nota(notaRequest.getNota());

        // Guardar la nueva entidad en la base de datos
        asignaturaNotaService.save(nota);

        correo.enviarCorreoNota(matricula.getAlumnoEntity().getPersonaEntity().getPersona_nombre(), asignaturaDocente.getAsignaturaEntity().getAsignatura_nombre(), notaRequest.getNota(), asignaturaDocente.getDocenteCursoEntity().getDocenteEntity().getPersonaEntity().getPersona_nombre(), new Date().toString());

        return ResponseEntity.ok(new MessageResponse("Se ha registrado la nota con éxito!"));
    }


    @PutMapping("/Edit")
    public ResponseEntity<?> editarNota(@Valid @RequestBody EditNotas notaRequest) {

        try{
            // Editar  entidad AnotacionesEntity
            AsignaturaNotaEntity nota = asignaturaNotaService.findById(notaRequest.getAsignatura_nota_id());
            nota.setAsignatura_nota_nota(notaRequest.getNota());

            // Guardar la nueva entidad en la base de datos
            asignaturaNotaService.save(nota);

            return ResponseEntity.ok(new MessageResponse("Se ha editado nota con exito!"));


        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado editar nota!"));

        }
    }
    @DeleteMapping("/Delete")
    public ResponseEntity<?> deleteNota(@Valid @RequestBody EditNotas notaRequest) {

        try{

            // Eliminar nueva entidad AnotacionesEntity
            AsignaturaNotaEntity nota = asignaturaNotaService.findById(notaRequest.getAsignatura_nota_id());
            // Guardar la nueva entidad en la base de datos
            asignaturaNotaService.delete(nota);

            return ResponseEntity.ok(new MessageResponse("Se ha eliminado nota con exito!"));


        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado eliminar nota!"));

        }
    }
}
