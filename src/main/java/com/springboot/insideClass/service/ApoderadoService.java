package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.ApoderadoEntity;
import com.springboot.insideClass.payload.response.Persona.PersonaMensaje;
import com.springboot.insideClass.repository.ApoderadoRepository;
import com.springboot.insideClass.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<PersonaMensaje> obtenerApoderadosByEstablecimientoCurso(String apoderado_persona_run, Boolean matricula_vigencia, Long establ_id, Long curso_id) {

        List<PersonaMensaje> lista = new ArrayList<>();

        List<Object> listaObjetosNativos = personaRepository.findApoderadosByEstablecimientoCursoMensaje(apoderado_persona_run,
                matricula_vigencia,establ_id, curso_id);

        for (Object item : listaObjetosNativos) {
            Object[] fila = (Object[]) item;

            PersonaMensaje info = new PersonaMensaje(
                    fila[0] != null ? (String) fila[0] : "",
                    fila[1] != null ? (String) fila[1] : "",
                    fila[2] != null ? (String) fila[2] : "",
                    fila[3] != null ? (String) fila[3] : "",
                    fila[4] != null ? (Integer) fila[4] : 0
            );

            lista.add(info);
        }

        return lista;

    }
}
