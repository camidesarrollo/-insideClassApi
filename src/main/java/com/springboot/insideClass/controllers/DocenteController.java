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

    @Autowired DocenteECAService docenteECAService;


    @PostMapping("Create")
    public ResponseEntity<MessageResponse> agregarDocente(@Valid @RequestBody D_CreateRequest addDocenteRequest) {


        Date fechaInicio = addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaInicio);
        int year = calendar.get(Calendar.YEAR);

        Date fechaFin =addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin();
        calendar.setTime(fechaFin);
        int yearFin = calendar.get(Calendar.YEAR);

        // Validar datos de persona
        PersonaRequest personaRequest = addDocenteRequest.getPersona();
        if (!PersonaService.validarPersonaRequest(personaRequest)) {
            return ResponseEntity.ok(new MessageResponse("Error: Datos de persona incompletos."));
        }

        // Validar datos de curso
        DocenteCursoRequest docenteCursoRequest = addDocenteRequest.getDocenteCurso();
        if (!CursoEstablecimientoService.validarCursoEstablecimiento(docenteCursoRequest)) {
            return ResponseEntity.ok(new MessageResponse("Error: Datos de curso incompletos."));
        }

        // Obtener y guardar entidad Persona si no existe
        PersonaEntity personaEntity = obtenerPersonaEntity(personaRequest);
        if (personaEntity == null) {
            return ResponseEntity.ok(new MessageResponse("Error: No se pudo guardar la persona."));
        }

        // Obtener y guardar entidad CursoEstablecimiento si no existe
        obtenerCursoEstablecimientoEntity(addDocenteRequest);


        // Guardar entidad Docente
        DocenteEntity docente = guardarDocente(personaEntity);
        if (docente == null) {
            return ResponseEntity.ok(new MessageResponse("Error: No se pudo guardar el docente."));
        }

        CursoEstablecimientoEntity cursoEstablecimientoEntity = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(addDocenteRequest.getCurso(), addDocenteRequest.getEstablecimiento(),year, yearFin);
        if(cursoEstablecimientoEntity == null){
            return ResponseEntity.ok(new MessageResponse("Error: No se pudo obtener el curso establecimiento."));
        }

        DocenteEntity docenteEntity =  docenteService.findDocenteByRun(addDocenteRequest.getPersona().getPersona_run());
        if(docenteEntity == null){
            return ResponseEntity.ok(new MessageResponse("Error: No se pudo obtener el docente."));
        }

        AsignaturaEntity asignaturaEntity = asignaturaService.findAsignaturaById(addDocenteRequest.getAsignatura());
        if(asignaturaEntity == null){
            return ResponseEntity.ok(new MessageResponse("Error: No se pudo obtener la asignatura."));
        }
        AsignaturaDocenteEntity asignaturaDocente = asignaturaDocenteService.findDocenteCursoByRunAndAsignaturaAndEstablecimiento(
                year,
                yearFin,
                addDocenteRequest.getPersona().getPersona_run(),
                asignaturaEntity.getAsignatura_id()
        );

        AsignaturaDocenteEntity asignaturaDocente1 = null;
        System.out.println(asignaturaDocente == null);

        if(asignaturaDocente == null){

            AsignaturaEntity asignatura = asignaturaService.findAsignaturaById(addDocenteRequest.getAsignatura());
            DocenteEntity docente1 = docenteService.findDocenteByRun(addDocenteRequest.getPersona().getPersona_run());
            asignaturaDocente1 = new AsignaturaDocenteEntity(asignatura, docente1, addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio(),
                    addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin());
            System.out.println("-----------------INSERTAMOS LA ASIGNATURA DEL DOCENTE-----------------------------");
            asignaturaDocenteService.save(asignaturaDocente1);
        }


        System.out.println(addDocenteRequest.getPersona().getPersona_run());
        PerfilEntity perfil = perfilService.findByName("Docente");
        List<UsuarioEntity> usuario = usuarioService.findByRunAndPerfil(addDocenteRequest.getPersona().getPersona_run(), perfil.getPerfil_id());

       List<AsignaturaDocenteEntity> asignaturaDocente2 = asignaturaDocenteService.findAllFilter(
               asignaturaEntity.getAsignatura_id(),
               docenteEntity.getDocente_id(),
               addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio(),
               addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin()
        );

      if(asignaturaDocente2 == null || asignaturaDocente2.size() == 0){
            return ResponseEntity.ok(new MessageResponse("Error: No se pudo encontrar la asignatura del docente."));
        }
        asignaturaDocente = asignaturaDocente2.get(0);


        CursoEstablecimientoEntity cursoEstablecimientoEntities =  cursoService.getCursoByEstablecimiento(addDocenteRequest.getEstablecimiento(),
                addDocenteRequest.getCurso(),
                addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio(),
                addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin());

        System.out.println("findAllFilter");
        System.out.println(asignaturaDocente.getAsignatura_doc_id());
        System.out.println(addDocenteRequest.getEstablecimiento());
        System.out.println(addDocenteRequest.getCurso());
        System.out.println(addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio());
        System.out.println( addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin());

        if(docenteECAService.findAllFilter(asignaturaDocente.getAsignatura_doc_id(),
                cursoService.getCursoByEstablecimiento(addDocenteRequest.getEstablecimiento(), addDocenteRequest.getCurso(),
                        addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio(),
                        addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin()).getCurso_establ_id()) == null){

            docenteECAService.save(new DocenteECAEntity(
                    cursoEstablecimientoEntities,
                    asignaturaDocente,
                    addDocenteRequest.getDocenteCurso().isProfesorJefe()
            ));
        }
        System.out.println("Cantidad registrado del usuario");
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

         System.out.println(docenteAsignaturaRequest.getFecha_inicio());
         System.out.println(docenteAsignaturaRequest.getFecha_fin());
         System.out.println(docenteAsignaturaRequest.getCurso_establ_hora_inicio());
         System.out.println(docenteAsignaturaRequest.getCurso_establ_hora_fin());
         System.out.println(docenteAsignaturaRequest.getDia());
         System.out.println(docenteAsignaturaRequest.getDocente_jefe());
         System.out.println(docenteAsignaturaRequest.getEstablecimiento_id());
         System.out.println(docenteAsignaturaRequest.getCurso_id());

         DocenteCursoRequest docenteCursoRequest = new DocenteCursoRequest(
                 docenteAsignaturaRequest.getFecha_inicio(),
                 docenteAsignaturaRequest.getFecha_fin(),
                 docenteAsignaturaRequest.getCurso_establ_hora_inicio(),
                 docenteAsignaturaRequest.getCurso_establ_hora_fin(),
                 docenteAsignaturaRequest.getDia(),
                 docenteAsignaturaRequest.getDocente_jefe()
         );
         PersonaEntity persona = personaService.findByRun(docenteAsignaturaRequest.getDocente_run());

         PersonaRequest personaRequest = new PersonaRequest(
                 persona.getPersona_run(),
                 persona.getPersona_nombre(),
                 persona.getPersona_apellido_paterno(),
                 persona.getPersona_apellido_materno(),
                 persona.getPersona_fecha_nacimiento(),
                 persona.getPersona_sexo(),
                 persona.getPersona_numero_telefonico(),
                 persona.getPersona_numero_celular(),
                 ""
         );

         D_CreateRequest addDocenteRequest = new D_CreateRequest(personaRequest, docenteCursoRequest, "Docente", docenteAsignaturaRequest.getEstablecimiento_id(),
                 docenteAsignaturaRequest.getCurso_id(), docenteAsignaturaRequest.getDocente_asignatura());
         addDocenteRequest.setDocenteCurso(docenteCursoRequest);


         Date fechaInicio = addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio();
         Calendar calendar = Calendar.getInstance();
         calendar.setTime(fechaInicio);
         int year = calendar.get(Calendar.YEAR);

         Date fechaFin =addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin();
         calendar.setTime(fechaFin);
         int yearFin = calendar.get(Calendar.YEAR);


         // Obtener y guardar entidad CursoEstablecimiento si no existe
         obtenerCursoEstablecimientoEntity(addDocenteRequest);


         CursoEstablecimientoEntity cursoEstablecimientoEntity = cursoEstablecimientoService.findCursoEstablecimientoByCursoAndEstablecimiento(addDocenteRequest.getCurso(), addDocenteRequest.getEstablecimiento(),year, yearFin);
         if(cursoEstablecimientoEntity == null){
             return ResponseEntity.ok(new MessageResponse("Error: No se pudo obtener el curso establecimiento."));
         }

         DocenteEntity docenteEntity =  docenteService.findDocenteByRun(addDocenteRequest.getPersona().getPersona_run());
         if(docenteEntity == null){
             return ResponseEntity.ok(new MessageResponse("Error: No se pudo obtener el docente."));
         }

         AsignaturaEntity asignaturaEntity = asignaturaService.findAsignaturaById(addDocenteRequest.getAsignatura());
         if(asignaturaEntity == null){
             return ResponseEntity.ok(new MessageResponse("Error: No se pudo obtener la asignatura."));
         }
         AsignaturaDocenteEntity asignaturaDocente = asignaturaDocenteService.findDocenteCursoByRunAndAsignaturaAndEstablecimiento(
                 year,
                 yearFin,
                 addDocenteRequest.getPersona().getPersona_run(),
                 asignaturaEntity.getAsignatura_id()
         );

         AsignaturaDocenteEntity asignaturaDocente1 = null;
         System.out.println(asignaturaDocente == null);

         if(asignaturaDocente == null){

             AsignaturaEntity asignatura = asignaturaService.findAsignaturaById(addDocenteRequest.getAsignatura());
             DocenteEntity docente1 = docenteService.findDocenteByRun(addDocenteRequest.getPersona().getPersona_run());
             asignaturaDocente1 = new AsignaturaDocenteEntity(asignatura, docente1, addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio(),
                     addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin());
             System.out.println("-----------------INSERTAMOS LA ASIGNATURA DEL DOCENTE-----------------------------");
             asignaturaDocenteService.save(asignaturaDocente1);
         }


         System.out.println(addDocenteRequest.getPersona().getPersona_run());
         PerfilEntity perfil = perfilService.findByName("Docente");
         List<UsuarioEntity> usuario = usuarioService.findByRunAndPerfil(addDocenteRequest.getPersona().getPersona_run(), perfil.getPerfil_id());

         List<AsignaturaDocenteEntity> asignaturaDocente2 = asignaturaDocenteService.findAllFilter(
                 asignaturaEntity.getAsignatura_id(),
                 docenteEntity.getDocente_id(),
                 addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio(),
                 addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin()
         );

         if(asignaturaDocente2 == null || asignaturaDocente2.size() == 0){
             return ResponseEntity.ok(new MessageResponse("Error: No se pudo encontrar la asignatura del docente."));
         }
         asignaturaDocente = asignaturaDocente2.get(0);


         CursoEstablecimientoEntity cursoEstablecimientoEntities =  cursoService.getCursoByEstablecimiento(addDocenteRequest.getEstablecimiento(),
                 addDocenteRequest.getCurso(),
                 addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio(),
                 addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin());

         System.out.println("findAllFilter");
         System.out.println(asignaturaDocente.getAsignatura_doc_id());
         System.out.println(addDocenteRequest.getEstablecimiento());
         System.out.println(addDocenteRequest.getCurso());
         System.out.println(addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio());
         System.out.println( addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin());

         if(docenteECAService.findAllFilter(asignaturaDocente.getAsignatura_doc_id(),
                 cursoService.getCursoByEstablecimiento(addDocenteRequest.getEstablecimiento(), addDocenteRequest.getCurso(),
                         addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio(),
                         addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin()).getCurso_establ_id()) == null){

             docenteECAService.save(new DocenteECAEntity(
                     cursoEstablecimientoEntities,
                     asignaturaDocente,
                     addDocenteRequest.getDocenteCurso().isProfesorJefe()
             ));
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

    private PersonaEntity obtenerPersonaEntity(PersonaRequest personaRequest) {
        PersonaEntity personaEntity = personaSer.findByRun(personaRequest.getPersona_run());
        if (personaEntity == null) {
            personaEntity = new PersonaEntity(personaRequest.getPersona_run(), personaRequest.getPersona_nombre(),
                    personaRequest.getPersona_apellido_paterno(), personaRequest.getPersona_apellido_materno(),
                    personaRequest.getPersona_fecha_nacimiento(), personaRequest.getPersona_sexo(),
                    personaRequest.getPersona_numero_telefonico(), personaRequest.getPersona_numero_celular());
            personaSer.save(personaEntity);
            System.out.println("Se guardó la persona");
        } else {
            System.out.println("No se guardó a la persona");
        }
        return personaEntity;
    }

    private void obtenerCursoEstablecimientoEntity(D_CreateRequest addDocenteRequest) {
        List<CursoEstablecimientoEntity> cursoEstablecimiento = cursoEstablecimientoService.findAllFilter(-1,
                addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin(),
                addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio(),
                addDocenteRequest.getDocenteCurso().getDia(),
                addDocenteRequest.getDocenteCurso().getCurso_establ_hora_fin(),
                addDocenteRequest.getDocenteCurso().getCurso_establ_hora_inicio(),
                true,
                cursoService.findById(addDocenteRequest.getCurso()).getCurso_id(),
                establecimientoService.findEstablecimientoById(addDocenteRequest.getEstablecimiento()).getEstabl_id()
        );

        if (cursoEstablecimiento == null || cursoEstablecimiento.size() < 1) {
            cursoEstablecimientoService.save(new CursoEstablecimientoEntity(
                    cursoService.findById(addDocenteRequest.getCurso()),
                    establecimientoService.findEstablecimientoById(addDocenteRequest.getEstablecimiento()),
                    addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_inicio(),
                    addDocenteRequest.getDocenteCurso().getDocente_curso_fecha_fin(),
                    addDocenteRequest.getDocenteCurso().getCurso_establ_hora_inicio(),
                    addDocenteRequest.getDocenteCurso().getCurso_establ_hora_fin(),
                    addDocenteRequest.getDocenteCurso().getDia(), true
            ));
        }
    }

    private DocenteEntity guardarDocente(PersonaEntity personaEntity) {
        DocenteEntity docente = docenteService.findDocenteByRun(personaEntity.getPersona_run());
        if (docente == null) {
            docente = new DocenteEntity();
            docente.setPersonaEntity(personaEntity);
            docenteRepo.save(docente);
            System.out.println("Se guardó el docente");
        } else {
            System.out.println("No se guardó el docente");
        }
        return docente;
    }



}
