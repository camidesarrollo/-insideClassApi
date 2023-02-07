package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.DocenteEntity;
import com.springboot.insideClass.entity.EstablecimientoEntity;
import com.springboot.insideClass.repository.EstablecimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstablecimientoService {

    @Autowired
    EstablecimientoRepository establecimientoRepository;

    public EstablecimientoEntity findEstablecimientoById(Long id){

        try{
            return establecimientoRepository.findEstablecimientoById(id);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
