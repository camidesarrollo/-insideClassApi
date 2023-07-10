package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.RepresentanteLegalEntity;
import com.springboot.insideClass.repository.RepresentanteLegalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RepresentanteLegalService {

    @Autowired
    private RepresentanteLegalRepository representanteLegalRepository;

    public List<RepresentanteLegalEntity> obtenerTodosLosRepresentantesLegales() {
        return representanteLegalRepository.findAll();
    }

    public Optional<RepresentanteLegalEntity> obtenerRepresentanteLegalPorId(Long id) {
        return representanteLegalRepository.findById(id);
    }

    public List<RepresentanteLegalEntity> buscarRepresentantesLegalesPorFiltro(Long representanteLegalId, String representanteLegalPersonaRun) {
        return representanteLegalRepository.findByFilters(representanteLegalId, representanteLegalPersonaRun);
    }

    public RepresentanteLegalEntity guardarRepresentanteLegal(RepresentanteLegalEntity representanteLegal) {
        return representanteLegalRepository.save(representanteLegal);
    }

    public void eliminarRepresentanteLegal(Long id) {
        representanteLegalRepository.deleteById(id);
    }
}
