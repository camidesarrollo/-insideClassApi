package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.DependenciaEntity;
import com.springboot.insideClass.repository.DependenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DependenciaService {

    @Autowired
    private DependenciaRepository dependenciaRepository;

    public List<DependenciaEntity> obtenerTodosLasDependencias() {
        return dependenciaRepository.findAll();
    }

    public Optional<DependenciaEntity> obtenerDependenciaPorId(Long id) {
        return dependenciaRepository.findById(id);
    }

    public List<DependenciaEntity> obtenerDependenciasPorFiltro(Long dependenciaId, String dependenciaNombre) {
        return dependenciaRepository.findByFilters(dependenciaId, dependenciaNombre);
    }

    public DependenciaEntity guardarDependencia(DependenciaEntity dependencia) {
        return dependenciaRepository.save(dependencia);
    }

    public void eliminarDependencia(Long id) {
        dependenciaRepository.deleteById(id);
    }
}
