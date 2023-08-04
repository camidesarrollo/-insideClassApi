package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.MatriculaEntity;
import com.springboot.insideClass.payload.response.Matricula.DatosMatriculaResponse;
import com.springboot.insideClass.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService {

    public MatriculaEntity ComunicacionesEntity;
    @Autowired
    private MatriculaRepository matriculaRepository;


    public List<MatriculaEntity> obtenerTodosLasMatriculas() {
        return matriculaRepository.findAll();
    }

    public Optional<MatriculaEntity> obtenerMatriculaPorId(Long id) {
        return matriculaRepository.findById(id);
    }
/*
    public List<MatriculaEntity> obtenerMatriculasPorFiltro(Long curso_id, String curso_nombre, String curso_nivel){
        return cursoRepository.findByFilters(curso_id, curso_nombre, curso_nivel);
    }
*/
    public MatriculaEntity guardarMatricula(MatriculaEntity apoderado) {
        return matriculaRepository.save(apoderado);
    }

    public void eliminarMatricula(Long id) {
        matriculaRepository.deleteById(id);
    }


    public List<DatosMatriculaResponse> obtenerDatosMatricula(boolean matricula_vigencia, int curso_agno, Long apoderado_id,
                                                              String apoderado_persona_run, Long alumno_id,
                                                              String alumno_persona_run, long  establecimiento_id, long curso_id) {

        List<DatosMatriculaResponse> listaMatricula = new ArrayList<>();

        List<Object> listaObjetosNativos = matriculaRepository.findByMatricula(matricula_vigencia, curso_agno, apoderado_id,
                apoderado_persona_run, alumno_id, alumno_persona_run, establecimiento_id, curso_id);

        for (Object item : listaObjetosNativos) {
            Object[] fila = (Object[]) item;

            DatosMatriculaResponse infoMatricula = new DatosMatriculaResponse();
            infoMatricula.setPersona_run(fila[0] != null ? (String) fila[0] : "");
            infoMatricula.setPersona_apellido_materno(fila[1] != null ? (String) fila[1] : "");
            infoMatricula.setPersona_apellido_paterno(fila[2] != null ? (String) fila[2] : "");
            infoMatricula.setPersona_fecha_nacimiento(fila[3] != null ? (Date) fila[3] : null);
            infoMatricula.setPersona_nombre(fila[4] != null ? (String) fila[4] : "");
            infoMatricula.setPersona_numero_celular(fila[5] != null ? (String) fila[5] : "");
            infoMatricula.setPersona_numero_telefonico(fila[6] != null ? (String) fila[6] : "");
            infoMatricula.setPersona_sexo(fila[7] != null ? (Character) fila[7] : null);
            infoMatricula.setEstablecimiento_id(fila[8] != null ? (BigInteger) fila[8] : null);
            infoMatricula.setEstablecimiento_codigo_area(fila[9] != null ? (BigInteger) fila[9] : null);
            infoMatricula.setEstablecimiento_nombre(fila[10] != null ? (String) fila[10] : "");
            infoMatricula.setEstablecimiento_telefono(fila[11] != null ? (BigInteger) fila[11] : null);
            infoMatricula.setEstablecimiento_dependencia_id(fila[12] != null ? (BigInteger) fila[12] : null);
            infoMatricula.setEstablecimiento_direccion_id(fila[13] != null ? (BigInteger) fila[13] : null);
            infoMatricula.setEstablecimiento_sostenedor_id(fila[14] != null ? (BigInteger) fila[14] : null);
            infoMatricula.setCurso_id(fila[15] != null ? (BigInteger) fila[15] : null);
            infoMatricula.setCurso_nivel(fila[16] != null ? (String) fila[16] : "");
            infoMatricula.setCurso_nombre(fila[17] != null ? (String) fila[17] : "");
            infoMatricula.setMatricula_id(fila[18] != null ? (BigInteger) fila[18] : null);
            infoMatricula.setCurso_agno(fila[19] != null ? (Integer) fila[19] : null);
            infoMatricula.setMatricula_vigencia(fila[20] != null ? (Boolean) fila[20] : null);
            infoMatricula.setMatricula_alumno_id(fila[21] != null ? (BigInteger) fila[21] : null);
            infoMatricula.setMatricula_apoderado_id(fila[22] != null ? (BigInteger) fila[22] : null);
            infoMatricula.setMatricula_curso_establecimiento_id(fila[23] != null ? (BigInteger) fila[23] : null);

            listaMatricula.add(infoMatricula);
        }

        return listaMatricula;
    }

}
