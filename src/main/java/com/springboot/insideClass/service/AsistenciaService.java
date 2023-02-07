package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AsistenciaEntity;
import com.springboot.insideClass.repository.AsistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsistenciaService {


    @Autowired
    private AsistenciaRepository asistenciaRepository;

    public void save(AsistenciaEntity asistencia){
        try{

            asistenciaRepository.save(asistencia);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public AsistenciaEntity findById(long id){
        try{
            return asistenciaRepository.findById(id).get();
        }catch (Exception e){
            System.out.println(e);
        }

        return null;
    }

    public void delete(AsistenciaEntity asistencia){
        try{
            asistenciaRepository.delete(asistencia);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
