package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.perfilEntity;
import com.springboot.insideClass.repository.perfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class perfilService {
    @Autowired
    com.springboot.insideClass.repository.perfilRepository perfilRepository;

    public perfilEntity findByUsuarioId(String usuario_nick_name){

        try{
            return perfilRepository.findByUsuarioName(usuario_nick_name);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
