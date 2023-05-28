package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.PerfilEntity;
import com.springboot.insideClass.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {
    @Autowired
    PerfilRepository perfilRepository;

    public PerfilEntity findByUsuarioName(String usuario_nick_name){

        try{
            return perfilRepository.findByUsuarioName(usuario_nick_name);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public List<PerfilEntity> findByUsuarioRun(String usuario_nick_name){

        try{
            return perfilRepository.findByUsuarioRun(usuario_nick_name);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }



    public PerfilEntity findByName(String findByName) {
        try{
            return perfilRepository.findByName(findByName);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public List<PerfilEntity> getAll() {
        try{
            return perfilRepository.findAll();
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
