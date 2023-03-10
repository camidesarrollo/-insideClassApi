package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
