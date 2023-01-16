package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.perfilEntity;
import com.springboot.insideClass.entity.personaEntity;
import com.springboot.insideClass.repository.personaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaService {

    @Autowired
    personaRepository personaRepo;

    public personaEntity findByUsuarioName(String usuario_id){

        try{
            return personaRepo.findByUsuarioName(usuario_id);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
