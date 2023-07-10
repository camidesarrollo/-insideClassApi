package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.ApoderadoEntity;
import com.springboot.insideClass.repository.ApoderadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApoderadoService {
    @Autowired
    ApoderadoRepository apoderadoRepository;

    public List<ApoderadoEntity> obtenerTodosLosApoderados() {
        return apoderadoRepository.findAll();
    }

    public Optional<ApoderadoEntity> obtenerApoderadoPorId(Long id) {
        return apoderadoRepository.findById(id);
    }

    public List<ApoderadoEntity> obtenerApoderadoPorFiltro(Long apoderado_id, String apoderado_persona_run){
        return apoderadoRepository.findByFilters(apoderado_id, apoderado_persona_run);
    }

    public ApoderadoEntity guardarApoderado(ApoderadoEntity apoderado) {
        return apoderadoRepository.save(apoderado);
    }

    public void eliminarApoderado(Long id) {
        apoderadoRepository.deleteById(id);
    }
}
