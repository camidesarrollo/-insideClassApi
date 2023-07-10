package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AsistenciaEntity;
import com.springboot.insideClass.payload.response.Asistencia.DatosAlumnoAsistenciaResponse;
import com.springboot.insideClass.repository.AsistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        for (Object item : listaObjetosNativos) {
            Object[] fila = (Object[]) item;

            DatosAlumnoAsistenciaResponse infoAsistencia = new DatosAlumnoAsistenciaResponse();
            infoAsistencia.setMatriculaId(fila[0] != null ? (Long) fila[0] : 0);
            infoAsistencia.setCursoAgno(fila[1] != null ? (int) fila[1] : 0);
            infoAsistencia.setMatriculaVigencia(fila[2] != null ? (boolean) fila[2] : false);
            infoAsistencia.setMatriculaAlumnoId(fila[3] != null ? (Long) fila[3] : 0);
            infoAsistencia.setMatriculaApoderadoId(fila[4] != null ? (Long) fila[4] : 0);
            infoAsistencia.setMatriculaCursoEstablecimientoId(fila[5] != null ? (Long) fila[5] : 0);
            infoAsistencia.setAlumnoId(fila[6] != null ? (Long) fila[6] : 0);
            infoAsistencia.setAlumnoPersonaRun(fila[7] != null ? (int) fila[7] : 0);
            infoAsistencia.setAsistenciaId(fila[8] != null ? (Long) fila[8] : 0);
            infoAsistencia.setFecha(fila[9] != null ? (Date) fila[9] : null);
            infoAsistencia.setAsistenciaMatriculaId(fila[10] != null ? (Long) fila[10] : 0);
            infoAsistencia.setEstablecimientoId(fila[11] != null ? (Long) fila[11] : 0);
            infoAsistencia.setEstablecimientoCodigoArea(fila[12] != null ? (String) fila[12] : "");
            infoAsistencia.setEstablecimientoNombre(fila[13] != null ? (String) fila[13] : "");
            infoAsistencia.setEstablecimientoTelefono(fila[14] != null ? (String) fila[14] : "");
            infoAsistencia.setEstablecimientoDependenciaId(fila[15] != null ? (Long) fila[15] : 0);
            infoAsistencia.setEstablecimientoDireccionId(fila[16] != null ? (Long) fila[16] : 0);
            infoAsistencia.setEstablecimientoSostenedorId(fila[17] != null ? (Long) fila[17] : 0);
            infoAsistencia.setCursoId(fila[18] != null ? (Long) fila[18] : 0);
            infoAsistencia.setCursoNivel(fila[19] != null ? (int) fila[19] : 0);
            infoAsistencia.setCursoNombre(fila[20] != null ? (String) fila[20] : "");

            listaAlumnoAsistencia.add(infoAsistencia);
        }

        return listaAlumnoAsistencia;
    }


    // Agrega aquí otros servicios que necesites

}
