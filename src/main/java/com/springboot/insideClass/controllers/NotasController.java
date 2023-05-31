package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Correo;
import com.springboot.insideClass.entity.*;
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
    private AsigNotaEstablCursoService asigNotaEstablCursoService;

    @Autowired
    private Correo correo;
    @PostMapping("/Get")
    public ResponseEntity<?> obtenerNota(@Valid @RequestBody GetNotas notaRequest) {

        System.out.println(notaRequest.getDocente_run());
        System.out.println(notaRequest.getRun());
        System.out.println(notaRequest.getId_asignatura());
        System.out.println(notaRequest.getId_establecimiento());

        if(asignaturaNotaService.IsValid(notaRequest)){

            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(asignaturaNotaService.obtenerInfoNotas(notaRequest.getRun(), notaRequest.getDocente_run(),
                            notaRequest.getId_asignatura(),  notaRequest.getId_establecimiento(), notaRequest.getFecha(), notaRequest.getCurso()));
        }
        return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar nota!"));

      /*  try{

        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar nota!"));

        }*/
    }

    @PostMapping("/Create")
    public ResponseEntity<?> ingresarNota(@Valid @RequestBody CreateNotas notaRequest) {
       /*try {

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar la nota!" + e.getMessage()));
        }*/
        if(notaRequest.IsValid()){
            LocalDate localDate = notaRequest.getFecha().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int year = localDate.getYear();

            MatriculaEntity matricula = matriculaService.findMatriculaByRunAndCurso(notaRequest.getRun(), year, notaRequest.getEstablecimiento());
            if (matricula == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado encontrar matricula!"));
            }


            CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(-1, notaRequest.getEstablecimiento(),
                    matricula.getMatricula_id().intValue(),
                    year, year);
            if (cursoEstablecimiento == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado encontrar matricula !"));
            }

          AsignaturaDocenteEntity asignaturaDocente = asignaturaDocenteService.findDocenteCursoByRunAndAsignaturaAndEstablecimiento(
                  year,
                  year,
                  notaRequest.getDocente_run(),
                  notaRequest.getEstablecimiento(),
                  notaRequest.getAsignatura());
            if (asignaturaDocente == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar nota!"));
            }

            // Crear nueva entidad AsignaturaNotaEntity
            AsignaturaNotaEntity nota = new AsignaturaNotaEntity();
            nota.setAsignatura_nota_nota(notaRequest.getNota());
            nota.setPosicion_nota_nota(notaRequest.getPosicion_nota());
            // Guardar la nueva entidad en la base de datos
            asignaturaNotaService.save(nota);

            //Falta indicar la relacion t_asignatura_docente
            AsigNotaEstablCursoEntity asignaturaDocente1 = new AsigNotaEstablCursoEntity(cursoEstablecimiento,asignaturaDocente, nota);
            asigNotaEstablCursoService.save(asignaturaDocente1);
       //     correo.enviarCorreoNota(matricula.getAlumnoEntity().getPersonaEntity().getPersona_nombre(), asignaturaDocente.getAsignaturaEntity().getAsignatura_nombre(), notaRequest.getNota(), "test", new Date().toString());

            return ResponseEntity.ok(new MessageResponse("Se ha registrado la nota con éxito!"));
        }

        return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar la nota!" ));


    }
    @PutMapping("/Update")
    public ResponseEntity<?> editarNota(@Valid @RequestBody EditNotas notaRequest) {

        try{
            if(notaRequest.IsValid()){
                // Editar  entidad AnotacionesEntity
                AsignaturaNotaEntity nota = asignaturaNotaService.findById(notaRequest.getAsignatura_nota_id());
                nota.setAsignatura_nota_nota(notaRequest.getNota());

                // Guardar la nueva entidad en la base de datos
                asignaturaNotaService.save(nota);

                return ResponseEntity.ok(new MessageResponse("Se ha editado nota con exito!"));
            }

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado editar nota!"));

        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado editar nota!"));

        }
    }
    @DeleteMapping("/Delete")
    public ResponseEntity<?> deleteNota(@Valid @RequestBody EditNotas notaRequest) {

        try{
            if(notaRequest.IsValid()){
                // Eliminar nueva entidad AnotacionesEntity
                AsignaturaNotaEntity nota = asignaturaNotaService.findById(notaRequest.getAsignatura_nota_id());
                // Guardar la nueva entidad en la base de datos
                asignaturaNotaService.delete(nota);

                return ResponseEntity.ok(new MessageResponse("Se ha eliminado nota con exito!"));
            }

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado eliminar nota!"));

        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado eliminar nota!"));

        }
    }

}
