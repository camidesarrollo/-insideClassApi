package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.ApoderadoEntity;
import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.repository.ApoderadoRepository;
import com.springboot.insideClass.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApoderadoService {
    @Autowired
    ApoderadoRepository apoderadoRepository;

    @Autowired
    PersonaRepository personaRepository;

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

    public List<PersonaEntity> obtenerApoderadosByEstablecimientoCurso(String apoderado_persona_run, Boolean matricula_vigencia, Long establ_id, Long curso_id) {
        return personaRepository.findApoderadosByEstablecimientoCurso(apoderado_persona_run,
                matricula_vigencia,establ_id, curso_id);
    }
}
