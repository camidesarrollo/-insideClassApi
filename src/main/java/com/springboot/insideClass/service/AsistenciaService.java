package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AsistenciaEntity;
import com.springboot.insideClass.payload.response.Asistencia.DatosAlumnoAsistenciaResponse;
import com.springboot.insideClass.repository.AsistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AsistenciaService {

    private AsistenciaRepository asistenciaRepository;

    @Autowired
    public AsistenciaService(AsistenciaRepository asistenciaRepository) {
        this.asistenciaRepository = asistenciaRepository;
    }

    public List<AsistenciaEntity> obtenerTodosLasAsistencias() {
        return asistenciaRepository.findAll();
    }

    public AsistenciaEntity obtenerAsistenciaPorId(Long id) {
        return asistenciaRepository.findById(id).orElse(null);
    }

    public AsistenciaEntity guardarAsistencia(AsistenciaEntity asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    public void eliminarAsistencia(Long id) {
        asistenciaRepository.deleteById(id);
    }

    public List<DatosAlumnoAsistenciaResponse> obtenerAsistenciasPorFiltros(int curso_agno, boolean matricula_vigencia,
                                                                            String alumno_persona_run, String fecha,
                                                                            int anio, Long establecimiento_id,
                                                                            Long curso_id) {

        List<DatosAlumnoAsistenciaResponse> listaAlumnoAsistencia = new ArrayList<>();

        List<Object> listaObjetosNativos = asistenciaRepository.findByFilters(curso_agno, matricula_vigencia,
                alumno_persona_run, fecha, anio, establecimiento_id, curso_id);

        System.out.println("Se ha obtenido Asistencia");
        System.out.println(listaObjetosNativos.size());

        for (Object item : listaObjetosNativos) {
            Object[] fila = (Object[]) item;

            DatosAlumnoAsistenciaResponse infoAsistencia = new DatosAlumnoAsistenciaResponse();
            infoAsistencia.setMatricula_id(fila[0] != null ? ((BigInteger) fila[0]).longValue() : 0);
            infoAsistencia.setCurso_agno(fila[1] != null ? ((Integer) fila[1]) : 0);
            infoAsistencia.setMatricula_vigencia(fila[2] != null ? ((Boolean) fila[2]) : false);
            infoAsistencia.setMatricula_alumno_id(fila[3] != null ? ((BigInteger) fila[3]).longValue() : 0);
            infoAsistencia.setMatricula_apoderado_id(fila[4] != null ? ((BigInteger) fila[4]).longValue() : 0);
            infoAsistencia.setMatricula_curso_establecimiento_id(fila[5] != null ? ((BigInteger) fila[5]).longValue() : 0);

            infoAsistencia.setPersona_run(fila[6] != null ? ((String) fila[6]) : "");
            infoAsistencia.setPersona_apellido_paterno(fila[7] != null ? ((String) fila[7]) : "");
            infoAsistencia.setPersona_apellido_materno(fila[8] != null ? ((String) fila[8]) : "");
            infoAsistencia.setPersona_fecha_nacimiento(fila[9] != null ? ((Date) fila[9]) : new Date());
            infoAsistencia.setPersona_nombre(fila[10] != null ? ((String) fila[10]) : "");
            infoAsistencia.setPersona_numero_celular(fila[11] != null ? ((String) fila[11]) : "");
            infoAsistencia.setPersona_numero_telefonico(fila[12] != null ? ((String) fila[12]) : "");
            infoAsistencia.setPersona_sexo(fila[13] != null ? ((Character) fila[13]) : 'S');

            infoAsistencia.setAsistencia_id(fila[14] != null ? ((BigInteger) fila[14]).longValue() : 0);
            infoAsistencia.setFecha(fila[15] != null ? ((Date) fila[15]).toString(): "");
            infoAsistencia.setAsistencia_matricula_id(fila[16] != null ? ((BigInteger) fila[16]).longValue() : 0);

            infoAsistencia.setEstablecimiento_id(fila[17] != null ? ((BigInteger) fila[17]).longValue() : 0);
            infoAsistencia.setEstablecimiento_codigo_area(fila[18] != null ? ((BigInteger) fila[18]).longValue() : 0);
            infoAsistencia.setEstablecimiento_nombre(fila[19] != null ? ((String) fila[19]) : "");
            infoAsistencia.setEstablecimiento_telefono(fila[20] != null ? ((BigInteger) fila[20]).longValue() : 0);
            infoAsistencia.setEstablecimiento_dependencia_id(fila[21] != null ? ((BigInteger) fila[21]).longValue() : 0);
            infoAsistencia.setEstablecimiento_direccion_id(fila[22] != null ? ((BigInteger) fila[22]).longValue() : 0);
            infoAsistencia.setEstablecimiento_sostenedor_id(fila[23] != null ? ((BigInteger) fila[23]).longValue() : 0);

            infoAsistencia.setCurso_id(fila[24] != null ? ((BigInteger) fila[24]).longValue() : 0);
            infoAsistencia.setCurso_nivel(fila[25] != null ? ((String) fila[25]) : "");
            infoAsistencia.setCurso_nombre(fila[26] != null ? ((String) fila[26]) : "");

            listaAlumnoAsistencia.add(infoAsistencia);
        }

        return listaAlumnoAsistencia;
    }
    public List<AsistenciaEntity> obtenerAsistenciaPorMatricula(Long id, String fecha) {
        System.out.println(id);
        System.out.println("SELECT a.* FROM t_matricula  inner JOIN  t_asistencia a ON a.asistencia_matricula_id = m.matricula_id and (ISDATE("+fecha+") = 1 and TRY_CONVERT(DATE,a.fecha) = TRY_CONVERT(DATE,"+fecha+") OR "+fecha+" = '-1') where (m.matricula_id = "+id+"or "+id+" = -1)");
        return asistenciaRepository.findByMatricuala(id, fecha);
    }

    // Agrega aquí otros servicios que necesites

}
