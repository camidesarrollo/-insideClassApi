package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.SostenedorEntity;
import com.springboot.insideClass.repository.SostenedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SostenedorService {

    @Autowired
    private SostenedorRepository sostenedorRepository;

    public List<SostenedorEntity> obtenerTodosLosSostenedores() {
        return sostenedorRepository.findAll();
    }

    public Optional<SostenedorEntity> obtenerSostenedorPorId(Long id) {
        return sostenedorRepository.findById(id);
    }

  /*  public List<SostenedorEntity> buscarSostenedoresPorFiltro(Long sostenedorId, String sostenedorNombre, Long sostenedorRepresentanteLegalId) {
        return sostenedorRepository.findByFilters(sostenedorId, sostenedorNombre, sostenedorRepresentanteLegalId);
    }*/

    public SostenedorEntity guardarSostenedor(SostenedorEntity sostenedor) {
        return sostenedorRepository.save(sostenedor);
    }

    public void eliminarSostenedor(Long id) {
        sostenedorRepository.deleteById(id);
    }
}
