package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.VigenciaEntity;
import com.springboot.insideClass.repository.VigenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VigenciaService {

    @Autowired
    VigenciaRepository vigenciaRepo;

    public VigenciaEntity findByUsername(String usuario_nick_name){

        try{
            return vigenciaRepo.findByUsername(usuario_nick_name);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public VigenciaEntity findByName(String vigencia) {

        try{
            return vigenciaRepo.findByName(vigencia);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
