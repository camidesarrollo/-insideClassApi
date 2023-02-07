package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.ApoderadoEntity;
import com.springboot.insideClass.repository.ApoderadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApoderadoService {

    @Autowired
    private ApoderadoRepository apoderadoRepository;

    public ApoderadoEntity findApoderadoByRun (String run){
        try{
            return apoderadoRepository.findApoderadoByRun(run);
        }catch (Exception e){
            System.out.println(e);
        }

        return  null;
    }

    public void save(ApoderadoEntity apoderado){
        try{
            apoderadoRepository.save(apoderado);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
