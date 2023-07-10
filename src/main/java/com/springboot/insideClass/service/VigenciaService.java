package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.VigenciaEntity;
import com.springboot.insideClass.repository.VigenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VigenciaService {

    @Autowired
    private VigenciaRepository vigenciaRepository;

    public List<VigenciaEntity> obtenerTodasLasVigencias() {
        return vigenciaRepository.findAll();
    }

    public Optional<VigenciaEntity> obtenerVigenciaPorId(Long id) {
        return vigenciaRepository.findById(id);
    }

    public List<VigenciaEntity> buscarVigenciasPorFiltro(Long vigenciaId, String vigenciaNombre) {
        return vigenciaRepository.findByFilters(vigenciaId, vigenciaNombre);
    }

    public VigenciaEntity guardarVigencia(VigenciaEntity vigencia) {
        return vigenciaRepository.save(vigencia);
    }

    public void eliminarVigencia(Long id) {
        vigenciaRepository.deleteById(id);
    }
}
