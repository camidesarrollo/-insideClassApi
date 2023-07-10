package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.DireccionEntity;
import com.springboot.insideClass.repository.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    public List<DireccionEntity> obtenerTodasLasDirecciones() {
        return direccionRepository.findAll();
    }

    public Optional<DireccionEntity> obtenerDireccionPorId(Long id) {
        return direccionRepository.findById(id);
    }

    public List<DireccionEntity> obtenerDireccionesPorFiltro(Long direccion_id, String direccion_calle, String direccion_info_adicional,
                                                             String direccion_geo_x, String direccion_geo_y, Long direccion_comuna_id, Long direccion_tipo_area) {
        return direccionRepository.findByFilters(direccion_id, direccion_calle, direccion_info_adicional, direccion_geo_x, direccion_geo_y, direccion_comuna_id, direccion_tipo_area);
    }

    public DireccionEntity guardarDireccion(DireccionEntity direccion) {
        return direccionRepository.save(direccion);
    }

    public void eliminarDireccion(Long id) {
        direccionRepository.deleteById(id);
    }
}
