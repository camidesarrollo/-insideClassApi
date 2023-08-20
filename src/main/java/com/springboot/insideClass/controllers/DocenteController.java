package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Metodos;
import com.springboot.insideClass.entity.*;
import com.springboot.insideClass.payload.request.Docente.*;
import com.springboot.insideClass.payload.request.Persona.CrearPersonaRequest;
import com.springboot.insideClass.payload.request.Persona.CrearPersonaRequestValidator;
import com.springboot.insideClass.payload.request.Usuario.CrearUsuarioRequest;
import com.springboot.insideClass.payload.request.Usuario.CrearUsuarioRequestValidator;
import com.springboot.insideClass.payload.response.Docente.InfoDocenteResponse;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/docente")
public class DocenteController {

    @Autowired
    private DocenteService docenteService;

    @Autowired
    private PersonaService personaService;

    @Autowired
    private CrearPersonaRequestValidator crearPersonaRequestValidator;

    @Autowired
    private Metodos metodos;
    @Autowired
    private PerfilService perfilService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private VigenciaService vigenciaService;

    @Autowired private CrearUsuarioRequestValidator crearUsuarioRequestValidator;

    @Autowired private CrearDocenteRequestValidator docenteRequestValidator;

    @Autowired private AsignaturaService asignaturaService;

    @Autowired private DocenteAsignaturaService docenteAsignaturaService;

    @Autowired private CursoService cursoService;
    @Autowired private CursoEstablecimientoService cursoEstablecimientoService;

    @Autowired private EstablecimientoService establecimientoService;

    @Autowired private Docente_Asignatura_Curso_EstablecimientoService docente_asignatura_curso_establecimientoService;

    @PostMapping("/obtenerTodos")
    public List<DocenteEntity> obtenerTodosLosDocentes() {
        return docenteService.obtenerTodosLosDocentes();
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<DocenteEntity> obtenerDocentePorId(@PathVariable("id") Long id) {
        Optional<DocenteEntity> docente = docenteService.obtenerDocentePorId(id);
        if (docente.isPresent()) {
            return ResponseEntity.ok(docente.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<DocenteEntity>> obtenerDocentesPorFiltro(@Valid @RequestBody BuscarDocenteRequest buscarDocenteRequest) {
        List<DocenteEntity> docentes = docenteService.obtenerDocentesPorFiltro(
                buscarDocenteRequest.getDocente_id(),
                buscarDocenteRequest.getDocente_persona_run());

        if (docentes.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(docentes);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<DocenteEntity> guardarDocente(@Valid @RequestBody DocenteEntity docente) {
        DocenteEntity nuevoDocente = docenteService.guardarDocente(docente);
        return ResponseEntity.ok(nuevoDocente);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<MessageResponse> eliminarDocente(@PathVariable("id") Long id) {

        docenteService.eliminarDocente(id);
        return ResponseEntity.ok(new MessageResponse("Docente eliminado con éxito!"));
    }

    @PostMapping("/Create")
    public ResponseEntity<MessageResponse> crearDocente(@Valid @RequestBody CrearDocenteRequest docente) throws ParseException {

        CrearPersonaRequest personaRequest = docente.getCrearUsuarioRequest().getCrearPersonaRequest();
        CrearUsuarioRequest usuarioRequest = docente.getCrearUsuarioRequest();

        // Validar datos de persona
        if (!CrearPersonaRequestValidator.isValid(personaRequest)) {
            return ResponseEntity.badRequest().body(new MessageResponse("Datos de persona no válidos"));
        }

        // Verificar si la persona existe
        List<PersonaEntity> personaEntity = personaService.obtenerPersonasPorFiltro(
                personaRequest.getPersona_run(), "-1", "-1", "-1", "-1", "-1", "-1", "-1"
        );

        // Si no existe, insertar en persona
        if (personaEntity == null || personaEntity.size() == 0) {
            PersonaEntity nuevaPersona = new PersonaEntity(
                    personaRequest.getPersona_run(),
                    personaRequest.getPersona_nombre(),
                    personaRequest.getPersona_apellido_paterno(),
                    personaRequest.getPersona_apellido_materno(),
                    personaRequest.getPersona_fecha_nacimiento(),
                    personaRequest.getPersona_sexo(),
                    personaRequest.getPersona_numero_telefonico(),
                    personaRequest.getPersona_numero_celular()
            );
            personaService.guardarPersona(nuevaPersona);
        }

        // Validar datos de perfil
        if (usuarioRequest.getPerfil_id() == 0) {
            return ResponseEntity.badRequest().body(new MessageResponse("Datos de perfil no válidos"));
        }

        // Verificar si el perfil existe
        List<PerfilEntity> perfil = perfilService.obtenerPerfilesPorFiltro(-1L, "Docente");

        if (perfil.isEmpty()) {
            return ResponseEntity.badRequest().body(new MessageResponse("Datos de perfil no encontrados"));
        }

        // Validar datos de usuario
        if (!crearUsuarioRequestValidator.isValid(usuarioRequest)) {
            return ResponseEntity.badRequest().body(new MessageResponse("Datos de usuario no válidos"));
        }

        // Verificar si el usuario existe para ese perfil
        List<UsuarioEntity> usuarios = usuarioService.buscarUsuariosPorFiltro(
                -1L,
                "-1",
                "-1",
               "-1",
                usuarioRequest.getPerfil_id(),
                personaRequest.getPersona_run(),
                usuarioRequest.getVigencia_id()
        );

        // Si no existe, insertar en usuario
        if (usuarios.isEmpty() || usuarios.size() == 0) {
           /* UsuarioEntity nuevoUsuario = new UsuarioEntity(
                    usuarioRequest.getUsername(),
                    usuarioRequest.getEmail(),
                    usuarioRequest.getPassword(),
                    perfil.get(0),
                    vigenciaService.obtenerVigenciaPorId(1L).get(),
                    personaService.obtenerPersonasPorFiltro(
                            personaRequest.getPersona_run(), "-1", "-1", "-1", "-1", "-1", "-1", "-1"
                    ).get(0)
            );*/
            usuarioService.createUsuario(perfil.get(0),vigenciaService.obtenerVigenciaPorId(1L).get(),personaService.obtenerPersonasPorFiltro(
                    personaRequest.getPersona_run(), "-1", "-1", "-1", "-1", "-1", "-1", "-1"
            ).get(0), usuarioRequest.getEmail());
        }

        // Validar datos de docente
        if (!docenteRequestValidator.isValid(docente)) {
            return ResponseEntity.badRequest().body(new MessageResponse("Datos del docente no válidos"));
        }

        // Verificar si el docente existe
        List<DocenteEntity> docenteEntities = docenteService.obtenerDocentesPorFiltro(-1L, personaRequest.getPersona_run());

        // Si no existe, insertar en docente
        if (docenteEntities.isEmpty() || docenteEntities.size() == 0) {
            DocenteEntity nuevoDocente = new DocenteEntity( personaService.obtenerPersonasPorFiltro(
                    personaRequest.getPersona_run(), "-1", "-1", "-1", "-1", "-1", "-1", "-1"
            ).get(0));
            docenteService.guardarDocente(nuevoDocente);
        }

        docenteEntities = docenteService.obtenerDocentesPorFiltro(-1L, personaRequest.getPersona_run());

        // Obtener la asignatura existente
        AsignaturaEntity asignatura = asignaturaService.obtenerAsignaturaPorId(docente.getAsignatura_id()).orElse(null);
        if (asignatura == null) {
            return ResponseEntity.badRequest().body(new MessageResponse("Asignatura no encontrada"));
        }

        // Verificar si ya existe la relación Docente-Asignatura
        List<DocenteAsignaturaEntity> docenteAsignatura = docenteAsignaturaService.obtenerDocenteAsignaturaPorFiltro(
                asignatura.getAsignatura_id(),
                asignatura.getAsignatura_nombre(),
                docenteEntities.get(0).getDocente_id(),
                docenteEntities.get(0).getPersona().getPersona_run()
        );

        // Si no existe, insertar en DocenteAsignatura
        if (docenteAsignatura.isEmpty() || docenteAsignatura.size() == 0) {
            DocenteAsignaturaEntity nuevaDocenteAsignatura = new DocenteAsignaturaEntity(asignatura, docenteEntities.get(0));
            docenteAsignaturaService.guardarDocenteAsignatura(nuevaDocenteAsignatura);
        }

        // Obtener el curso existente
        CursoEntity curso = cursoService.obtenerCursoPorId(docente.getCurso_id()).orElse(null);
        if (curso == null) {
            return ResponseEntity.badRequest().body(new MessageResponse("Curso no encontrado"));
        }

        // Obtener el establecimiento existente
        EstablecimientoEntity establecimiento = establecimientoService.obtenerEstablecimientoPorId(docente.getEstablecimiento_id()).orElse(null);
        if (establecimiento == null) {
            return ResponseEntity.badRequest().body(new MessageResponse("Establecimiento no encontrado"));
        }

        // Verificar si ya existe la relación Curso-Establecimiento
        List<CursoEstablecimientoEntity> cursoEstablecimiento = cursoEstablecimientoService.obtenerCursosEstablecimientoPorFiltro(
                -1L, curso.getCurso_id(), establecimiento.getEstablecimiento_id(), true
        );
        if (cursoEstablecimiento.isEmpty()) {
            CursoEstablecimientoEntity nuevoCursoEstablecimiento = new CursoEstablecimientoEntity(
                    curso, establecimiento, true, new Date(), new Date()
            );
            cursoEstablecimientoService.guardarCursosEstablecimiento(nuevoCursoEstablecimiento);
        }

        // Verificar si ya existe la relación Docente-Asignatura-Curso-Establecimiento
        List<Docente_Asignatura_Curso_EstablecimientoEntity> docenteAsignaturaCursoEstablecimientoEntities =
                docente_asignatura_curso_establecimientoService.obtenerDocenteAsignaturaCursoEstablecimientoPorFiltro(
                        -1L,
                        cursoEstablecimientoService.obtenerCursosEstablecimientoPorFiltro(
                                -1L, curso.getCurso_id(), establecimiento.getEstablecimiento_id(), true
                        ).get(0).getEstablecimiento().getEstablecimiento_id(),
                        docenteAsignaturaService.obtenerDocenteAsignaturaPorFiltro(
                                asignatura.getAsignatura_id(),
                                asignatura.getAsignatura_nombre(),
                                docenteEntities.get(0).getDocente_id(),
                                docenteEntities.get(0).getPersona().getPersona_run()
                        ).get(0).getDocente_asignatura_id(),
                        metodos.formatDate(docente.getFecha_inicio()),
                        metodos.formatDate(docente.getFecha_fin()),
                        metodos.convertirFechaACalendar(docente.getFecha_inicio()).get(Calendar.YEAR),
                        metodos.convertirFechaACalendar(docente.getFecha_fin()).get(Calendar.YEAR)
                );

        // Si no existe, insertar en DocenteAsignaturaCursoEstablecimiento
        if (docenteAsignaturaCursoEstablecimientoEntities.isEmpty() || docenteAsignaturaCursoEstablecimientoEntities.size() == 0) {
            Docente_Asignatura_Curso_EstablecimientoEntity nuevaRelacion = new Docente_Asignatura_Curso_EstablecimientoEntity(
                    docenteAsignaturaService.obtenerDocenteAsignaturaPorFiltro(
                            asignatura.getAsignatura_id(),
                            asignatura.getAsignatura_nombre(),
                            docenteEntities.get(0).getDocente_id(),
                            docenteEntities.get(0).getPersona().getPersona_run()
                    ).get(0), cursoEstablecimientoService.obtenerCursosEstablecimientoPorFiltro(
                    -1L, curso.getCurso_id(), establecimiento.getEstablecimiento_id(), true
            ).get(0), docente.getFecha_inicio(), docente.getFecha_fin(), docente.getProfesorJefe());
            docente_asignatura_curso_establecimientoService.guardarDocenteAsignaturaCursoEstablecimiento(nuevaRelacion);
        }

        return ResponseEntity.ok(new MessageResponse("¡Docente registrado con éxito!"));
    }

    @PostMapping("/Traer")
    public ResponseEntity<List<InfoDocenteResponse>> traer(@Valid @RequestBody TraerDocenteRequest traerDocenteRequest) {
        List<InfoDocenteResponse> docentes = docenteService.infoDocente(traerDocenteRequest.getEstablecimiento(),  traerDocenteRequest.getDocente_run(), traerDocenteRequest.getCurso());
        return ResponseEntity.ok(docentes);
    }


    @PostMapping("/obtenerDocenteByEstablecimientoCurso")
    public ResponseEntity<List<PersonaEntity>> obtenerDocenteByEstablecimientoCurso(@Valid @RequestBody BuscarDocentePorEstablecimientoCursoRequest buscarDocentePorEstablecimientoCursoRequest) {
        List<PersonaEntity> docentes = docenteService.obtenerDocenteByEstablecimientoCurso(buscarDocentePorEstablecimientoCursoRequest.getPersona_run(),
                buscarDocentePorEstablecimientoCursoRequest.getEstablecimiento_id(),
                buscarDocentePorEstablecimientoCursoRequest.getCurso_id(),
                buscarDocentePorEstablecimientoCursoRequest.getDocente_id());
        return ResponseEntity.ok(docentes);
    }


}
