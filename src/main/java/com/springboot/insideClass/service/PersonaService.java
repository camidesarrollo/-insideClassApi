package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.payload.request.Persona.PersonaRequest;
import com.springboot.insideClass.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepo;

    public PersonaEntity findByUsuarioName(String usuario_id){

        try{
            return personaRepo.findByUsuarioName(usuario_id);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public PersonaEntity findByRun(String persona_run){

        try{
            System.out.println(persona_run);
            return personaRepo.findByRun(persona_run);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public void save(PersonaEntity persona){
        try{
            personaRepo.save(persona);
        }catch (Exception e){
            System.out.println(e);
        }
    }

   public List<PersonaEntity> findAlumnosByApoderado(String apoderado_run, String matricula_vigencia, String establ_id){

        try{
            System.out.println(apoderado_run);
            return personaRepo.findAlumnosByApoderado(apoderado_run, matricula_vigencia, establ_id);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public static boolean validarPersonaRequest(PersonaRequest personaRequest) {
        return personaRequest != null &&
                !personaRequest.getPersona_run().isEmpty() &&
                !personaRequest.getPersona_nombre().isEmpty() &&
                !personaRequest.getPersona_apellido_paterno().isEmpty() &&
                !personaRequest.getPersona_apellido_materno().isEmpty() &&
                personaRequest.getPersona_fecha_nacimiento() != null &&
                personaRequest.getPersona_sexo() != null &&
                !personaRequest.getPersona_numero_telefonico().isEmpty() &&
                !personaRequest.getPersona_numero_celular().isEmpty() &&
                !personaRequest.getCorreo().isEmpty();
    }

}
