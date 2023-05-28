package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.*;
import com.springboot.insideClass.payload.request.Docente.D_CreateRequest;
import com.springboot.insideClass.payload.request.Docente.D_TraerRequest;
import com.springboot.insideClass.payload.request.DocenteAsignaturaRequest;
import com.springboot.insideClass.payload.request.DocenteCursoRequest;
import com.springboot.insideClass.payload.request.DocenteEstablecimientoRequest;
import com.springboot.insideClass.payload.request.Persona.PersonaRequest;
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
import java.util.Calendar;
import java.util.Date;
import java.util.List;


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
    private PersonaRepository personaRepository;

    @Autowired
    PerfilService perfilService;

    @Autowired
    VigenciaService vigenciaService;

    @Autowired
    PersonaService personaService;

    @Autowired
    private CursoService cursoService;

    @Autowired
    private AsigNotaEstablCursoService asigNotaEstablCursoService;

    @Autowired
    private AsignaturaNotaService asignaturaNotaSer;

    @PostMapping("Create")
    public ResponseEntity<MessageResponse> agregarDocente(@Valid @RequestBody D_CreateRequest addDocenteRequest) {

        System.out.println("Imprimiendo el run");
        System.out.println(addDocenteRequest.getPersona().getPersona_run());

        PersonaRequest personaRequest = addDocenteRequest.getPersona();
        if (personaRequest == null ||
                personaRequest.getPersona_run() == null ||
                personaRequest.getPersona_run().isEmpty() ||
                personaRequest.getPersona_nombre() == null ||
                personaRequest.getPersona_nombre().isEmpty() ||
                personaRequest.getPersona_apellido_paterno() == null ||
                personaRequest.getPersona_apellido_paterno().isEmpty() ||
                personaRequest.getPersona_apellido_materno() == null ||
                personaRequest.getPersona_apellido_materno().isEmpty() ||
                personaRequest.getPersona_fecha_nacimiento() == null ||
                personaRequest.getPersona_sexo() == null ||
                personaRequest.getPersona_numero_telefonico() == null ||
                personaRequest.getPersona_numero_telefonico().isEmpty() ||
                personaRequest.getPersona_numero_celular() == null ||
                personaRequest.getPersona_numero_celular().isEmpty() ||
                personaRequest.getCorreo() == null ||
                personaRequest.getCorreo().isEmpty()) {
            return ResponseEntity.ok(new MessageResponse("Error:  Datos de persona incompletos!"));
        }

        DocenteCursoRequest docenteCursoRequest = addDocenteRequest.getDocenteCurso();
        if (docenteCursoRequest == null ||
                docenteCursoRequest.getDocente_curso_fecha_inicio() == null ||
                docenteCursoRequest.getDocente_cuso_fecha_fin() == null ||
                docenteCursoRequest.getCurso_establ_hora_inicio() == null ||
                docenteCursoRequest.getCurso_establ_hora_inicio().isEmpty() ||
                docenteCursoRequest.getCurso_establ_hora_fin() == null ||
                docenteCursoRequest.getCurso_establ_hora_fin().isEmpty() ||
                docenteCursoRequest.getDia() == null ||
                docenteCursoRequest.getDia().isEmpty()) {
            return ResponseEntity.ok(new MessageResponse("Error: Datos de curso incompletos!"));
        }




        if(addDocenteRequest.getPersona().getPersona_run() == null){
            return ResponseEntity.ok(new MessageResponse("Error!"));
        }

        if(addDocenteRequest.getCurso() == 0){
            System.out.println("Error");
        }
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
            System.out.println("Se guardo la persona");
        } else {
            System.out.println("No se guardo a la persona");
        }

        DocenteEntity docente = new DocenteEntity();

        if (docenteService.findDocenteByRun(addDocenteRequest.getPersona().getPersona_run()) == null) {
            PersonaEntity persona = personaSer.findByRun(addDocenteRequest.getPersona().getPersona_run());


            docente.setPersonaEntity(persona);
            System.out.println("-----------------INSERTAMOS EL DOCNETE-----------------------------");
            docenteRepo.save(docente);
            System.out.println("Se guardo el docente");
        } else {
            System.out.println("No se guardo el docente");
        }

        Date fechaInicio = addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaInicio);
        int year = calendar.get(Calendar.YEAR);

        Date fechaFin =addDocenteRequest.getDocenteCurso().getDocente_cuso_fecha_fin();
        calendar.setTime(fechaFin);
        int yearFin = calendar.get(Calendar.YEAR);



        CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(
                addDocenteRequest.getCurso(),
                addDocenteRequest.getEstablecimiento(),
                -1,year, yearFin);

        if(cursoEstablecimiento != null){

            //Docente asignatura año en un estableimiento en particulas
            AsignaturaDocenteEntity asignaturaDocente = asignaturaDocenteService.findDocenteCursoByRunAndAsignaturaAndEstablecimiento(
                    year,
                    yearFin,
                    addDocenteRequest.getPersona().getPersona_run(),
                    addDocenteRequest.getCurso(),
                    addDocenteRequest.getAsignatura()
            );

            AsignaturaDocenteEntity asignaturaDocente1 = null;
            if(asignaturaDocente == null){

                AsignaturaEntity asignatura = asignaturaService.findAsignaturaById(addDocenteRequest.getAsignatura());
                DocenteEntity docente1 = docenteService.findDocenteByRun(addDocenteRequest.getPersona().getPersona_run());
                asignaturaDocente1 = new AsignaturaDocenteEntity(asignatura, docente1, addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio(), addDocenteRequest.getDocenteCurso().getDocente_cuso_fecha_fin());
                System.out.println("-----------------INSERTAMOS LA ASIGNATURA DEL DOCENTE-----------------------------");
                asignaturaDocenteService.save(asignaturaDocente1);
            }

            //Docente AsigNotaEstablCursoEntity
            //Obtener todos los alumnos en el establecimiento. curso matricula
            List<CursoEstablecimientoEntity> cursoEstablecimiento1 = cursoEstablecimientoService.findCursoEstablecimientosByCursoAndEstablecimientos(addDocenteRequest.getCurso(),
                    addDocenteRequest.getEstablecimiento(),-1,
                    year, yearFin
            );



            for (CursoEstablecimientoEntity cusE : cursoEstablecimiento1) {
                // Acceder a las propiedades o realizar las operaciones deseadas para cada elemento
                // Ejemplo: Imprimir el ID de cada elemento
                asignaturaNotaSer.save(new AsignaturaNotaEntity("1.0", "1"));

                asigNotaEstablCursoService.save(new AsigNotaEstablCursoEntity(
                        cusE,
                        asignaturaDocente1,
                        asignaturaNotaSer.findLast().get(0)
                ));


            }

        }

        System.out.println(addDocenteRequest.getPersona().getPersona_run());
        PerfilEntity perfil = perfilService.findByName("Docente");
        List<UsuarioEntity> usuario = usuarioService.findByRunAndPerfil(addDocenteRequest.getPersona().getPersona_run(), perfil.getPerfil_id());

        System.out.println(usuario.size());
        if (usuario.size() == 0) {


            VigenciaEntity vigencia = vigenciaService.findByName("Vigente");
            PersonaEntity persona = personaService.findByRun(addDocenteRequest.getPersona().getPersona_run());


            // Create new user's account
            usuarioService.createUsuario(perfil, vigencia, persona, addDocenteRequest.getPersona().getCorreo());
            System.out.println("Se guardo el usuario");

            return ResponseEntity.ok(new MessageResponse("Docente registrado con exito!"));
        }
        return ResponseEntity.ok(new MessageResponse("Docente registrado con exito!"));
     /*   try{

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha logrado registrar docente!"));
        }*/

    }

    @PostMapping("/Get")
    public ResponseEntity<Object> tablaDocente(@RequestParam("id_establecimient") long id_establecimient) {
        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                .body(docenteService.getInfoDocente(id_establecimient, "-1", -1));
       /* try {

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }*/
    }

    @PostMapping("/Create/DocenteAsignatura")
    public ResponseEntity<MessageResponse> agregarDocenteAsignatura(@Valid @RequestBody DocenteAsignaturaRequest docenteAsignaturaRequest){

        try{



            Date fechaInicio = docenteAsignaturaRequest.getFecha_inicio();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaInicio);
            int year = calendar.get(Calendar.YEAR);

            Date fechaFin =docenteAsignaturaRequest.getFecha_fin();
            calendar.setTime(fechaFin);
            int yearFin = calendar.get(Calendar.YEAR);

            CursoEstablecimientoEntity cursoEstablecimiento = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(
                    docenteAsignaturaRequest.getCurso_id(),
                    docenteAsignaturaRequest.getEstablecimiento_id(),
                    -1,year, yearFin);

            if(cursoEstablecimiento != null){

                //Docente asignatura año en un estableimiento en particulas
                AsignaturaDocenteEntity asignaturaDocente = asignaturaDocenteService.findDocenteCursoByRunAndAsignaturaAndEstablecimiento(
                        year,
                        yearFin,
                        docenteAsignaturaRequest.getDocente_run(),
                        docenteAsignaturaRequest.getCurso_id(),
                        docenteAsignaturaRequest.getDocente_asignatura()
                );

                AsignaturaDocenteEntity asignaturaDocente1 = null;
                if(asignaturaDocente == null){

                    AsignaturaEntity asignatura = asignaturaService.findAsignaturaById(docenteAsignaturaRequest.getDocente_asignatura());
                    DocenteEntity docente1 = docenteService.findDocenteByRun( docenteAsignaturaRequest.getDocente_run());
                    asignaturaDocente1 = new AsignaturaDocenteEntity(asignatura, docente1, docenteAsignaturaRequest.getFecha_inicio(), docenteAsignaturaRequest.getFecha_fin());
                    System.out.println("-----------------INSERTAMOS LA ASIGNATURA DEL DOCENTE-----------------------------");
                    asignaturaDocenteService.save(asignaturaDocente1);
                }

                //Docente AsigNotaEstablCursoEntity
                //Obtener todos los alumnos en el establecimiento. curso matricula
                List<CursoEstablecimientoEntity> cursoEstablecimiento1 = cursoEstablecimientoService.findCursoEstablecimientosByCursoAndEstablecimientos(docenteAsignaturaRequest.getCurso_id(),
                        docenteAsignaturaRequest.getEstablecimiento_id(),-1,
                        year, yearFin
                );



                for (CursoEstablecimientoEntity cusE : cursoEstablecimiento1) {
                    // Acceder a las propiedades o realizar las operaciones deseadas para cada elemento
                    // Ejemplo: Imprimir el ID de cada elemento
                    asignaturaNotaSer.save(new AsignaturaNotaEntity("1.0", "1"));

                    asigNotaEstablCursoService.save(new AsigNotaEstablCursoEntity(
                            cusE,
                            asignaturaDocente1,
                            asignaturaNotaSer.findLast().get(0)
                    ));


                }

            }

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
    public ResponseEntity<?> obtenerDocente(@Valid @RequestBody D_TraerRequest docenteRequest) throws ParseException {
        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                .body(docenteService.findDocenteByIdCursoEstablecimiento(docenteRequest.getEstablecimiento(), docenteRequest.getDocente_run(), docenteRequest.getCurso()));
        /*try {

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }*/

    }
    @PostMapping("/Delete")
    public ResponseEntity<?> eliminarDocente(@Valid @RequestBody DocenteEstablecimientoRequest docenteEstablecimientoRequest) {
        try {
            Date fechaInicio = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaInicio);
            int year = calendar.get(Calendar.YEAR);


            if (docenteEstablecimientoRequest.getDocente_run() == null ||
                    docenteEstablecimientoRequest.getEstablecimiento_id() == null) {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: Datos incompletos para eliminar el docente!"));
            }


            Date fechaUtil = new Date();

            // Convertir la fecha a un objeto de la clase java.sql.Date
            java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());

            DocenteEntity docente = docenteService.findDocenteByRun(docenteEstablecimientoRequest.getDocente_run());
            if (docente != null) {
                List<CursoEstablecimientoEntity> docenteCurso = cursoEstablecimientoService.findCursoEstablecimientosByCursoAndEstablecimientos(docente.getDocente_id(), docenteEstablecimientoRequest.getEstablecimiento_id(), -1, year,year);

                for (CursoEstablecimientoEntity docenteCursoEntity : docenteCurso) {

                    docenteCursoEntity.setCurso_establ_fecha_fin(fechaSql);
                    cursoEstablecimientoService.save(docenteCursoEntity);
                }

                List<AsignaturaDocenteEntity> docenteAsignatura =   asignaturaDocenteService.findDocenteCursoByRunAndEstablecimiento(docenteEstablecimientoRequest.getEstablecimiento_id(),docenteEstablecimientoRequest.getDocente_run());

                for (AsignaturaDocenteEntity asignaturaDocenteEntity : docenteAsignatura) {

                    asignaturaDocenteEntity.setAsignatura_doc_fin(fechaSql);
                    asignaturaDocenteService.save(asignaturaDocenteEntity);
                }

                return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                        .body(new MessageResponse("Docente eliminado con exito"));

            } else {
                return ResponseEntity.badRequest().body(new MessageResponse("Error: No se ha encotrado docente en el sistema!"));
            }

        } catch (Exception e) {
            System.out.println("Error:");
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(new MessageResponse("No se encontro matricula vigente!"));

        }
    }
    @PutMapping("/Update")
    public ResponseEntity<?> modificarDocente(@Valid @RequestBody PersonaRequest docente) {
        try {
            List<UsuarioEntity> usuario =  usuarioService.findByRunPerfil(docente.getPersona_run(), 1L);

            if(usuario != null  || usuario.size() > 0){
                usuario.get(0).setEmail(docente.getCorreo());

                usuarioService.save(usuario.get(0));
            }

            PersonaEntity persona = personaService.findByRun(docente.getPersona_run());

            persona.setPersona_nombre(docente.getPersona_nombre());
            persona.setPersona_apellido_paterno(docente.getPersona_apellido_paterno());
            persona.setPersona_apellido_materno(docente.getPersona_apellido_materno());
            persona.setPersona_fecha_nacimiento(docente.getPersona_fecha_nacimiento());
            persona.setPersona_sexo(docente.getPersona_sexo());
            persona.setPersona_numero_telefonico(docente.getPersona_numero_telefonico());
            persona.setPersona_numero_celular(docente.getPersona_numero_celular());
            persona.setPersona_numero_celular(docente.getPersona_numero_celular());

            personaService.save(persona);

            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(new MessageResponse("Docente modificado  con exito"));

        } catch (Exception e) {
            System.out.println("Error:");
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(new MessageResponse("No se encontro matricula vigente!"));

        }
    }


}
