package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Correo;
import com.springboot.insideClass.componet.Metodos;
import com.springboot.insideClass.entity.ComunicacionesEntity;
import com.springboot.insideClass.entity.Docente_Asignatura_Curso_EstablecimientoEntity;
import com.springboot.insideClass.payload.request.Comunicaciones.BuscarComunicacionesRequest;
import com.springboot.insideClass.payload.request.Comunicaciones.CrearComunicacionesRequest;
import com.springboot.insideClass.payload.request.Comunicaciones.EditarComunicacionesRequest;
import com.springboot.insideClass.payload.response.Matricula.DatosMatriculaResponse;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/comunicaciones")
public class ComunicacionesController {

    @Autowired
    ComunicacionesService comunicacionesService;
    @Autowired
    private EstablecimientoService establecimientoService;

    @Autowired
    private CursoEstablecimientoService cursoEstablecimientoService;

    @Autowired
    private Correo correo;

    @Autowired
    private Docente_Asignatura_Curso_EstablecimientoService docente_asignatura_curso_establecimientoService;

    @Autowired
    private DocenteAsignaturaService docenteAsignaturaService;

    @Autowired
    private Metodos metodos;

    @Autowired
    private MatriculaService matriculaService;

    @PostMapping("/obtenerTodosLosComunicaciones")
    public List<ComunicacionesEntity> obtenerTodasLasComunicaciones() {
        return comunicacionesService.obtenerTodasLasComunicaciones();
    }

    @PostMapping("/obtenerApoderadoPorId")
    public ComunicacionesEntity obtenerComunicacionPorId(@Valid @RequestBody Long id) {
        return comunicacionesService.obtenerComunicacionPorId(id);
    }

    @PostMapping("/guardarComunicaciones")
    public ComunicacionesEntity guardarComunicacion(@RequestBody ComunicacionesEntity comunicacion) {
        return comunicacionesService.guardarComunicacion(comunicacion);
    }

    @DeleteMapping("/eliminarComunicaciones")
    public void eliminarComunicacion(@Valid @RequestBody Long id){
        comunicacionesService.eliminarComunicacion(id);
    }

    @PostMapping("/Get")
    public ResponseEntity<?> obtenerComunicacionesPorFiltro(@Valid @RequestBody BuscarComunicacionesRequest buscarComunicacionesRequest) {
        return ResponseEntity.ok(comunicacionesService.obtenerDatosAlumnoComunicaciones(
                buscarComunicacionesRequest.isMatricula_vigencia(),
                buscarComunicacionesRequest.getEstablecimiento_id(),
                buscarComunicacionesRequest.getApoderado_id(),
                buscarComunicacionesRequest.getAlumno_run(),
                buscarComunicacionesRequest.getComunicaciones_matricula_id(),
                buscarComunicacionesRequest.getDocente_run(),
                buscarComunicacionesRequest.getAsignatura_id(),
                buscarComunicacionesRequest.getCurso_id())
        );
    }

    @PostMapping("/Create")
    public ResponseEntity<?> ingresarComunicacion(@Valid @RequestBody CrearComunicacionesRequest comunicacionRequest) {
        try {
            // Validar campos obligatorios
            if (comunicacionRequest.getEstablecimiento() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'establecimiento' es obligatorio."));
            }
            if (comunicacionRequest.getCurso() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'curso' es obligatorio."));
            }
            if (comunicacionRequest.getRun_docente() == null || comunicacionRequest.getRun_docente().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'run_docente' es obligatorio."));
            }
            if (comunicacionRequest.getFecha() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'fecha' es obligatorio."));
            }
            if (comunicacionRequest.getDescripcion() == null || comunicacionRequest.getDescripcion().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'descripcion' es obligatorio."));
            }
            if (comunicacionRequest.getTipo() == null || comunicacionRequest.getTipo().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'tipo' es obligatorio."));
            }

            List<Docente_Asignatura_Curso_EstablecimientoEntity> docente_asignatura_curso_establecimientoEntity =
                    docente_asignatura_curso_establecimientoService.obtenerDocenteAsignaturaCursoEstablecimientoPorFiltro(-1L,
                            cursoEstablecimientoService.obtenerCursosEstablecimientoPorFiltro(
                                    -1L, comunicacionRequest.getCurso(), comunicacionRequest.getEstablecimiento(), true
                            ).get(0).getEstablecimiento().getEstablecimiento_id(),
                            docenteAsignaturaService.obtenerDocenteAsignaturaPorFiltro(comunicacionRequest.getAsignatura(), "-1", -1L, comunicacionRequest.getRun_docente()).get(0).getDocente_asignatura_id(), "-1", "-1",
                            metodos.convertirFechaACalendar(comunicacionRequest.getFecha()).get(Calendar.YEAR), metodos.convertirFechaACalendar(comunicacionRequest.getFecha()).get(Calendar.YEAR));

            if (docente_asignatura_curso_establecimientoEntity.size() == 0) {
                return ResponseEntity.badRequest().body(new MessageResponse("No se ha encontrado docente en el establecimiento, ni curso"));
            }


            List<DatosMatriculaResponse> matricula = matriculaService.obtenerDatosMatricula(true, metodos.convertirFechaACalendar(comunicacionRequest.getFecha()).get(Calendar.YEAR), -1L, "-1", -1L, "-1", comunicacionRequest.getEstablecimiento(), comunicacionRequest.getCurso());
            List<ComunicacionesEntity> comuni = comunicacionesService.ObtenerUltimaComunicacion();

            Integer correlativo = 1;

            if(comuni.size() > 0){
                correlativo = comuni.get(0).getComunicaciones_correlativo() +1;
            }


            for (DatosMatriculaResponse ma:
                    matricula) {

                ComunicacionesEntity
                        comunicaciones = new ComunicacionesEntity(  comunicacionRequest.getTitulo(),
                        comunicacionRequest.getFecha(),
                        comunicacionRequest.getTipo(),
                        comunicacionRequest.getDescripcion(),
                        correlativo,
                        docente_asignatura_curso_establecimientoEntity.get(0),
                        matriculaService.obtenerMatriculaPorId(ma.getMatricula_id().longValue()).get()
                );


                comunicacionesService.guardarComunicacion(comunicaciones);

                LocalDate localDate = comunicaciones.getComunicaciones_fecha().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE MMMM yyyy", new Locale("es", "ES"));
                String fecha = localDate.format(formatter);
                System.out.println(fecha);

                //correo.enviarCorreoComunicacion(fecha, comunicacionRequest.getTipo(), comunicaciones.getComunicaciones_descripcion());
            }


            return ResponseEntity.ok(new MessageResponse("Se ha registrado comunicación con éxito!"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar comunicación_2!"));
        }


    }

    @PutMapping("/Update")
    public ResponseEntity<?> editarComunicacion(@Valid @RequestBody EditarComunicacionesRequest editRequest) {
        try {
            // Validar campos obligatorios
            if (editRequest.getId_comunicacion() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'id_comunicacion' es obligatorio."));
            }
            if (editRequest.getFecha() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'fecha' es obligatorio."));
            }
            if (editRequest.getDescripcion() == null || editRequest.getDescripcion().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'descripcion' es obligatorio."));
            }
            if (editRequest.getTipo() == null || editRequest.getTipo().isEmpty()) {
                return ResponseEntity.badRequest().body(new MessageResponse("El campo 'tipo' es obligatorio."));
            }

            // Editar entidad ComunicacionesEntity
            ComunicacionesEntity comunicaciones = comunicacionesService.obtenerComunicacionPorId(editRequest.getId_comunicacion());
            if (comunicaciones == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("No se encontró la comunicación a editar."));
            }
            comunicaciones.setComunicaciones_tipo(editRequest.getTipo());
            comunicaciones.setComunicaciones_fecha(editRequest.getFecha());
            comunicaciones.setComunicaciones_descripcion(editRequest.getDescripcion());

            // Guardar la entidad editada en la base de datos
            comunicacionesService.guardarComunicacion(comunicaciones);

            return ResponseEntity.ok(new MessageResponse("Se ha editado comunicación con éxito!"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado editar comunicación!"));
        }
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<?> deleteComunicacion(@PathVariable("id") Long id) {

        try{

            // Validar campos obligatorios

            // Eliminar entidad ComunicacionesEntity
            ComunicacionesEntity comunicaciones = comunicacionesService.obtenerComunicacionPorId(id);
            if (comunicaciones == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("No se encontró la comunicación a editar."));
            }

            comunicacionesService.eliminarComunicacion(comunicaciones.getComunicaciones_id());
            return ResponseEntity.ok(new MessageResponse("Se ha eliminado comunicacion con exito!"));


        }catch (Exception e){

            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado eliminar comunicacion!"));

        }
    }

}
