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

    public List<InfoDocenteResponse> infoDocente(String run,  long curso, long establecimiento_id,  boolean vigencia ) {
        List<InfoDocenteResponse> listaDocente = new ArrayList<>();

        List<Object> listaObjetosNativos = docenteRepository.infoDocente(run, curso, establecimiento_id, vigencia);

        for (Object item : listaObjetosNativos) {
            Object[] fila = (Object[]) item;

            InfoDocenteResponse infoDocenteResponse = new InfoDocenteResponse(


                    fila[0] != null ? new BigInteger(fila[0].toString()) : BigInteger.ZERO, // docente_id
                    fila[1] != null ? Boolean.parseBoolean(fila[1].toString()) : false,
                    fila[2] != null ? (String) fila[2] : "", // docente_persona_run
                    fila[3] != null ? new BigInteger(fila[3].toString()) : BigInteger.ZERO, // establecimiento_id
                    fila[4] != null ? new BigInteger(fila[4].toString()) : BigInteger.ZERO, // establecimiento_codigo_area
                    fila[5] != null ? (String) fila[5] : "", // establecimiento_nombre
                    fila[6] != null ? new BigInteger(fila[6].toString()) : BigInteger.ZERO, // establecimiento_telefono
                    fila[7] != null ? new BigInteger(fila[7].toString()) : BigInteger.ZERO, // establecimiento_dependencia_id
                    fila[8] != null ? new BigInteger(fila[8].toString()) : BigInteger.ZERO, // establecimiento_direccion_id
                    fila[9] != null ? new BigInteger(fila[9].toString()) : BigInteger.ZERO, // establecimiento_sostenedor_id
                    fila[10] != null ? new BigInteger(fila[10].toString()) : BigInteger.ZERO, // curso_id
                    fila[11] != null ? (String) fila[11] : "", // curso_nivel
                    fila[12] != null ? (String) fila[12] : "", // curso_nombre
                    fila[13] != null ? (String) fila[13] : "", // persona_run
                    fila[17] != null ? (String) fila[17] : "", // persona_nombre
                    fila[14] != null ? (String) fila[14] : "", // persona_apellido_paterno
                    fila[15] != null ? (String) fila[15] : "", // persona_apellido_materno
                    fila[16] != null ? (Date) fila[16] : new Date(), // persona_fecha_nacimiento
                    fila[18] != null ? (String) fila[18] : "", // persona_numero_telefonico
                    fila[19] != null ? (String) fila[19] : "", // persona_numero_celular
                    fila[20] != null ? (Character) fila[20] : 'I' // persona_sexo,
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
