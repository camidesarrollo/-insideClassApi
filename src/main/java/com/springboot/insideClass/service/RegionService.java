package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.RegionEntity;
import com.springboot.insideClass.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public List<RegionEntity> obtenerTodasLasRegiones() {
        return regionRepository.findAll();
    }

    public Optional<RegionEntity> obtenerRegionPorId(Long id) {
        return regionRepository.findById(id);
    }

    public List<RegionEntity> buscarRegionesPorFiltro(Long regionId, String regionAbreviatura, String regionCapital, String regionNombre) {
        return regionRepository.findByFilters(regionId, regionAbreviatura, regionCapital, regionNombre);
    }

    public RegionEntity guardarRegion(RegionEntity region) {
        return regionRepository.save(region);
    }

    public void eliminarRegion(Long id) {
        regionRepository.deleteById(id);
    }
}
