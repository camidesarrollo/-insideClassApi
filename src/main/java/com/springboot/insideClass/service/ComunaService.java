package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.ComunaEntity;
import com.springboot.insideClass.repository.ComunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComunaService {

    @Autowired
    ComunaRepository comunaRepository;

    public List<ComunaEntity> obtenerTodosLasComunas() {
        return comunaRepository.findAll();
    }

    public Optional<ComunaEntity> obtenerComunaPorId(Long id) {
        return comunaRepository.findById(id);
    }

    public List<ComunaEntity> obtenerComunaPorFiltro(Long comuna_id, String comuna_nombre, Long comuna_provincia_id, Long comuna_deprov_id){
        return comunaRepository.findByFilters(comuna_id, comuna_nombre, comuna_provincia_id, comuna_deprov_id);
    }

    public ComunaEntity guardarComuna(ComunaEntity apoderado) {
        return comunaRepository.save(apoderado);
    }

    public void eliminarComuna(Long id) {
        comunaRepository.deleteById(id);
    }
}
