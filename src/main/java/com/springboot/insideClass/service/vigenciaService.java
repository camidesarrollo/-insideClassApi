package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.personaEntity;
import com.springboot.insideClass.entity.vigenciaEntity;
import com.springboot.insideClass.repository.vigenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class vigenciaService {

    @Autowired
    vigenciaRepository vigenciaRepo;

    public vigenciaEntity findByUsername(String usuario_nick_name){

        try{
            return vigenciaRepo.findByUsername(usuario_nick_name);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

}
