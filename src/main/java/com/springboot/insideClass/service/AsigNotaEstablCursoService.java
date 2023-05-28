package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AsigNotaEstablCursoEntity;
import com.springboot.insideClass.repository.AsigNotaEstablCursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsigNotaEstablCursoService {
@Autowired
    AsigNotaEstablCursoRepository asigNotaEstablCursoRepository;
    public void save(AsigNotaEstablCursoEntity asigNotaEstablCursoEntity){
        try{

            asigNotaEstablCursoRepository.save(asigNotaEstablCursoEntity);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
