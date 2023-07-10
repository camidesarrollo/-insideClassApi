package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.TipoAreaEntity;
import com.springboot.insideClass.repository.TipoAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoAreaService {

    @Autowired
    private TipoAreaRepository tipoAreaRepository;

    public List<TipoAreaEntity> obtenerTodosLosTiposArea() {
        return tipoAreaRepository.findAll();
    }

    public Optional<TipoAreaEntity> obtenerTipoAreaPorId(Long id) {
        return tipoAreaRepository.findById(id);
    }

    public List<TipoAreaEntity> buscarTiposAreaPorFiltro(Long tipoAreaId, String tipoAreaNombre) {
        return tipoAreaRepository.findByFilters(tipoAreaId, tipoAreaNombre);
    }

    public TipoAreaEntity guardarTipoArea(TipoAreaEntity tipoArea) {
        return tipoAreaRepository.save(tipoArea);
    }

    public void eliminarTipoArea(Long id) {
        tipoAreaRepository.deleteById(id);
    }
}
