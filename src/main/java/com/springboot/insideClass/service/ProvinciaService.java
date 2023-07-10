package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.ProvinciaEntity;
import com.springboot.insideClass.repository.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinciaService {

    @Autowired
    ProvinciaRepository provinciaRepository;

    public List<ProvinciaEntity> obtenerTodasLasProvincias() {
        return provinciaRepository.findAll();
    }

    public List<ProvinciaEntity> obtenerProvinciasPorFiltro(Long provinciaId, String provinciaNombre, Long provinciaRegionId) {
        return provinciaRepository.findByFilters(provinciaId, provinciaNombre, provinciaRegionId);
    }


    public Optional<ProvinciaEntity> obtenerProvinciaPorId(Long id) {
        return provinciaRepository.findById(id);
    }

    public ProvinciaEntity guardarProvincia(ProvinciaEntity provincia) {
        return provinciaRepository.save(provincia);
    }

    public void eliminarProvincia(Long id) {
        provinciaRepository.deleteById(id);
    }
}
