package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.DocenteEntity;
import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.payload.response.Docente.InfoDocenteResponse;
import com.springboot.insideClass.repository.DocenteRepository;
import com.springboot.insideClass.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    @Autowired
    private PersonaRepository personaRepository;

    public List<DocenteEntity> obtenerTodosLosDocentes() {
        return docenteRepository.findAll();
    }

    public Optional<DocenteEntity> obtenerDocentePorId(Long id) {
        return docenteRepository.findById(id);
    }

    public List<DocenteEntity> obtenerDocentesPorFiltro(Long docente_id, String docente_persona_run) {
        return docenteRepository.findByFilters(docente_id, docente_persona_run);
    }

    public DocenteEntity guardarDocente(DocenteEntity docente) {
        return docenteRepository.save(docente);
    }

    public void eliminarDocente(Long id) {
        docenteRepository.deleteById(id);
    }

    public List<InfoDocenteResponse> infoDocente(long establecimiento_id, String run, long curso) {
        List<InfoDocenteResponse> listaDocente = new ArrayList<>();

        List<Object> listaObjetosNativos = docenteRepository.infoDocente(run, curso, establecimiento_id);

        for (Object item : listaObjetosNativos) {
            Object[] fila = (Object[]) item;

            InfoDocenteResponse infoDocenteResponse = new InfoDocenteResponse(
                    fila[0] != null ? new BigInteger(fila[0].toString()) : BigInteger.ZERO, // docente_id
                    fila[1] != null ? (String) fila[1] : "", // docente_persona_run
                    fila[2] != null ? new BigInteger(fila[2].toString()) : BigInteger.ZERO, // establecimiento_id
                    fila[3] != null ? new BigInteger(fila[3].toString()) : BigInteger.ZERO, // establecimiento_codigo_area
                    fila[4] != null ? (String) fila[4] : "", // establecimiento_nombre
                    fila[5] != null ? new BigInteger(fila[5].toString()) : BigInteger.ZERO, // establecimiento_telefono
                    fila[6] != null ? new BigInteger(fila[6].toString()) : BigInteger.ZERO, // establecimiento_dependencia_id
                    fila[7] != null ? new BigInteger(fila[7].toString()) : BigInteger.ZERO, // establecimiento_direccion_id
                    fila[8] != null ? new BigInteger(fila[8].toString()) : BigInteger.ZERO, // establecimiento_sostenedor_id
                    fila[9] != null ? new BigInteger(fila[9].toString()) : BigInteger.ZERO, // curso_id
                    fila[10] != null ? (String) fila[10] : "", // curso_nivel
                    fila[11] != null ? (String) fila[11] : "", // curso_nombre
                    fila[12] != null ? (String) fila[12] : "", // persona_run
                    fila[16] != null ? (String) fila[16] : "", // persona_nombre
                    fila[13] != null ? (String) fila[14] : "", // persona_apellido_paterno
                    fila[14] != null ? (String) fila[13] : "", // persona_apellido_materno
                     fila[15] != null ? (Date) fila[15] : new Date(), // persona_fecha_nacimiento
                    fila[19] != null ? (Character) fila[19] : 'I', // persona_sexo,
                    fila[17] != null ? (String) fila[17] : "", // persona_numero_telefonico
                    fila[18] != null ? (String) fila[18] : "" // persona_numero_celular

            );

            listaDocente.add(infoDocenteResponse);
        }

        return listaDocente;
    }

    public List<PersonaEntity> obtenerDocenteByEstablecimientoCurso(String persona_run,
                                                                    Long establecimiento_id,
                                                                    Long curso_id, Long docente_id) {
        return personaRepository.findDocenteByEstablecimientoCurso(
                persona_run,
                 establecimiento_id,
                 curso_id,  docente_id);
    }

}
