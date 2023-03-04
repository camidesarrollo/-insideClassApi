package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.*;
import com.springboot.insideClass.payload.request.AddDocenteRequest;
import com.springboot.insideClass.payload.request.DocenteAsignaturaRequest;
import com.springboot.insideClass.payload.request.DocenteCursoRequest;
import com.springboot.insideClass.payload.request.DocenteRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.repository.*;
import com.springboot.insideClass.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/docente")
public class DocenteController {


    @Autowired
    DirectorRepository directorRepo;

    @Autowired
    ApoderadoRepository apoderadoRepo;

    @Autowired
    DocenteRepository docenteRepo;


    @Autowired
    PersonaService personaSer;

    @Autowired
    PerfilService perfilsSer;


    @Autowired
    VigenciaService vigenciaSer;

    @Autowired
    DocenteService docenteService;

    @Autowired
    AlumnoService alumnoService;

    @Autowired
    PasswordEncoder encoder;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private DocenteCursoService docenteCursoService;

    @Autowired
    private CursoEstablecimientoService cursoEstablecimientoService;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    EstablecimientoService establecimientoService;

    @Autowired
    AsignaturaDocenteService asignaturaDocenteService;

    @Autowired
    AsignaturaService asignaturaService;
    @Autowired
    private AsignaturaDocenteRepository asignaturaDocenteRepository;
    @Autowired
    private DocenteCursoRepository docenteCursoRepo;
    @Autowired
    private PersonaRepository personaRepository;


    @Autowired
    PerfilService perfilService;

    @Autowired
    VigenciaService vigenciaService;

    @Autowired
    PersonaService personaService;

    @PostMapping("Create/agregarDocente")
    public ResponseEntity<MessageResponse> agregarDocente(@Valid @RequestBody AddDocenteRequest addDocenteRequest) throws ParseException {
        try{
            if (personaSer.findByRun(addDocenteRequest.getPersona().getPersona_run()) == null) {
                PersonaEntity personaEntity = new PersonaEntity(addDocenteRequest.getPersona().getPersona_run(),
                        addDocenteRequest.getPersona().getPersona_nombre(),
                        addDocenteRequest.getPersona().getPersona_apellido_paterno(),
                        addDocenteRequest.getPersona().getPersona_apellido_materno(),
                        addDocenteRequest.getPersona().getPersona_fecha_nacimiento(),
                        addDocenteRequest.getPersona().getPersona_sexo(),
                        addDocenteRequest.getPersona().getPersona_numero_telefonico(),
                        addDocenteRequest.getPersona().getPersona_numero_celular());
                personaSer.save(personaEntity);
            } else {
                System.out.println("No se guardo a la persona");
            }


            if (docenteService.findDocenteByRun(addDocenteRequest.getPersona().getPersona_run()) == null) {
                PersonaEntity persona = personaSer.findByRun(addDocenteRequest.getPersona().getPersona_run());

                DocenteEntity docente = new DocenteEntity();
                docente.setPersonaEntity(persona);

                docenteRepo.save(docente);
            } else {
                System.out.println("No se guardo el docente");
            }

       if (docenteCursoService.findDocenteCursoByRunAndEstablecimientoByFecha(docenteService.findDocenteByRun(
                         addDocenteRequest.getPersona().getPersona_run()).getDocente_id(),
                 addDocenteRequest.getEstablecimiento(),
                 addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio(),
                 addDocenteRequest.getDocenteCurso().getDocente_cuso_fecha_fin()
            ) == null) {

               DocenteCursoEntity docenteCurso = new DocenteCursoEntity();

                if (cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(
                        addDocenteRequest.getCurso(), addDocenteRequest.getEstablecimiento()) != null) {

                    docenteCurso.setDocenteEntity(docenteService.findDocenteByRun(addDocenteRequest.getPersona().getPersona_run()));
                    docenteCurso.setCursoEstablecimientoEntity(cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(addDocenteRequest.getCurso(), addDocenteRequest.getEstablecimiento()));
                    docenteCurso.setDocente_curso_fecha_inicio(addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio());
                    docenteCurso.setDocente_cuso_fecha_fin(addDocenteRequest.getDocenteCurso().getDocente_cuso_fecha_fin());
                    docenteCursoRepo.save(docenteCurso);

                } else {
                    System.out.println("No se pudo insertar Curso Establecimiento");
                }
            }
       
       var docenteCurso = docenteCursoService.findDocenteCursoByRunAndEstablecimientoByFecha(docenteService.findDocenteByRun(
                       addDocenteRequest.getPersona().getPersona_run()).getDocente_id(),
               cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(
                       addDocenteRequest.getCurso(), addDocenteRequest.getEstablecimiento()).getCurso_establ_id(),
               addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio(),
               addDocenteRequest.getDocenteCurso().getDocente_cuso_fecha_fin()
       );

       System.out.println(docenteCurso.getDocente_curso_id());

    AsignaturaDocenteEntity asignaturaDocente =
                    asignaturaDocenteService.findAsignaturaDocenteByAsignaturaAndDocente
                            (addDocenteRequest.getAsignatura(),
                                    docenteCurso.getDocente_curso_id()
                            );

                   if (asignaturaDocente == null) {
                 AsignaturaEntity asignatura = asignaturaService.findAsignaturaById(addDocenteRequest.getAsignatura());

                AsignaturaDocenteEntity asignaturaDocente1 = new AsignaturaDocenteEntity();

                asignaturaDocente1.setAsignaturaEntity(asignatura);
                asignaturaDocente1.setDocenteCursoEntity(docenteCurso);

                asignaturaDocente1.setAsignatura_doc_inicio(addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio());
                asignaturaDocente1.setAsignatura_doc_fin(addDocenteRequest.getDocenteCurso().getDocente_cuso_fecha_fin());
                asignaturaDocenteRepository.save(asignaturaDocente1);
            } else {
                System.out.println("No se pudo insertar Asignatura Docente");
            }

             if (usuarioService.findByRunAndPerfil(addDocenteRequest.getPersona().getPersona_run(), 1L) == null) {

                PerfilEntity perfil = perfilService.findByName("Docente");
                VigenciaEntity vigencia = vigenciaService.findByName("Vigente");
                PersonaEntity persona = personaService.findByRun(addDocenteRequest.getPersona().getPersona_run());


                // Create new user's account
                usuarioService.createUsuario(perfil, vigencia, persona, addDocenteRequest.getPersona().getCorreo());


            } else {
                System.out.println("No se pudo insertar usuario");
            }
            return ResponseEntity.ok(new MessageResponse("Docente registrado con exito!"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar docente!"));
        }

    }

    @PostMapping("/Get")
    public ResponseEntity<Object> tablaDocente(@RequestParam("id_establecimient") long id_establecimient) {
        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                .body(docenteService.getInfoDocente(id_establecimient, "-1", -1));
        /*try {

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }*/
    }

    @PostMapping("/Create/DocenteAsignatura")
    public ResponseEntity<MessageResponse> agregarDocenteAsignatura(@Valid @RequestBody DocenteAsignaturaRequest docenteAsignaturaRequest) throws ParseException {

        try{
            /*DocenteCursoEntity docenteCurso = docenteCursoService.findDocenteCursoByRunAndEstablecimientoByFecha(docenteAsignaturaRequest.getAsignatura_doc_id(), docenteAsignaturaRequest.getEstablecimiento_id(), docenteAsignaturaRequest.getFecha_inicio(), docenteAsignaturaRequest.getFecha_fin());
            AsignaturaEntity   asignatura = asignaturaService.findAsignaturaById(docenteAsignaturaRequest.getAsignatura_doc_id());
            if(docenteCurso != null && asignatura!=  null){
                AsignaturaDocenteEntity asignaturaDocente = new AsignaturaDocenteEntity(docenteAsignaturaRequest.getFecha_inicio(), docenteAsignaturaRequest.getFecha_fin(), asignatura,  docenteCurso);
                asignaturaDocenteService.save(asignaturaDocente);
            }*/

            return ResponseEntity.ok(new MessageResponse("Docente asignado correctamente a la asignatura!"));
        }catch (Exception e){
            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar docente!"));
        }

    }

    @PostMapping("/Create/DocenteCurso")
    public ResponseEntity<MessageResponse> relacion_DocenteCurso(@Valid @RequestBody DocenteCursoRequest docenteCursoRequest) throws ParseException {

        try{

            /*if(docenteService.findDocenteById(docenteCursoRequest.getDocente_curso_docente_id()) == null){
                return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar el docente al curso!"));
            }else{

                CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findById(docenteCursoRequest.getDocente_curso_establ_id());

                if(cursoEstablecimiento != null){
                    DocenteCursoEntity docenteCurso = new DocenteCursoEntity();
                    docenteCurso.setDocenteEntity(docenteService.findDocenteById(docenteCursoRequest.getDocente_curso_docente_id()));
                    docenteCurso.setCursoEstablecimientoEntity(cursoEstablecimiento);
                    docenteCurso.setDocente_curso_fecha_inicio(docenteCursoRequest.getDocente_curso_fecha_inicio());
                    docenteCurso.setDocente_cuso_fecha_fin(docenteCursoRequest.getDocente_cuso_fecha_fin());
                    docenteCurso.setDocente_jefe(docenteCursoRequest.isDocente_jefe());
                    docenteCursoService.save(docenteCurso);

                    return ResponseEntity.ok(new MessageResponse("Docente registrado con exito!"));

                }else{
                    return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar el docente al curso!"));
                }
            }*/
            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar el docente al curso!"));

        }catch (Exception e){
            return  ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar el docente al curso!"));
        }

    }

    @PostMapping("/Traer")
    public ResponseEntity<Object> obtenerDocente(@Valid @RequestBody DocenteRequest docenteRequest) throws ParseException {

        try {
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(docenteService.findDocenteByIdCursoEstablecimiento(docenteRequest.getEstablecimiento(), docenteRequest.getPersona().getPersona_run(), docenteRequest.getCurso()));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }

    }
}
