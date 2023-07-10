package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.ComunicacionesEntity;
import com.springboot.insideClass.payload.response.Comunicaciones.DatosAlumnoComunicacionesResponse;
import com.springboot.insideClass.repository.ComunicacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ComunicacionesService {
    @Autowired
    private ComunicacionesRepository comunicacionesRepository;

    public List<ComunicacionesEntity> obtenerTodasLasComunicaciones() {
        return comunicacionesRepository.findAll();
    }

    public ComunicacionesEntity obtenerComunicacionPorId(Long id) {
        return comunicacionesRepository.findById(id).orElse(null);
    }

    public ComunicacionesEntity guardarComunicacion(ComunicacionesEntity comunicacion) {
        return comunicacionesRepository.save(comunicacion);
    }

    public void eliminarComunicacion(Long id) {
        comunicacionesRepository.deleteById(id);
    }

    // Agrega aquí otros servicios que necesites

    public List<DatosAlumnoComunicacionesResponse> obtenerDatosAlumnoComunicaciones(boolean matricula_vigencia,
                                                                                    Long establecimiento_id,
                                                                                    Long apoderado_id,
                                                                                    String alumno_run,
                                                                                    Long anotaciones_matricula_id,
                                                                                    String docente_run,
                                                                                    Long asignatura_id,
                                                                                    Long curso_id) {

        List<DatosAlumnoComunicacionesResponse> listaAlumnoComunicaciones = new ArrayList<>();

        List<Object> listaObjetosNativos = comunicacionesRepository.findByFilters( matricula_vigencia,
                establecimiento_id,
                apoderado_id,
                alumno_run,
                anotaciones_matricula_id,
                docente_run,
                asignatura_id,
                curso_id);

        for (Object item : listaObjetosNativos) {
            Object[] fila = (Object[]) item;

            DatosAlumnoComunicacionesResponse infoComunicaciones = new DatosAlumnoComunicacionesResponse();
            infoComunicaciones.setAlumnoRun(fila[0] != null ? (String) fila[0] : "");
            infoComunicaciones.setAlumnoApellidoMaterno(fila[1] != null ? (String) fila[1] : "");
            infoComunicaciones.setAlumnoApellidoPaterno(fila[2] != null ? (String) fila[2] : "");
            infoComunicaciones.setAlumnoFechaNacimiento(fila[3] != null ? (Date) fila[3] : null);
            infoComunicaciones.setAlumnoNombre(fila[4] != null ? (String) fila[4] : "");
            infoComunicaciones.setAlumnoNumeroCelular(fila[5] != null ? (String) fila[5] : "");
            infoComunicaciones.setAlumnoNumeroTelefonico(fila[6] != null ? (String) fila[6] : "");
            infoComunicaciones.setAlumnoNumeroSexo(fila[7] != null ? (String) fila[7] : "");
            infoComunicaciones.setComunicacionesId(fila[8] != null ? (Long) fila[8] : 0);
            infoComunicaciones.setComunicacionesDescripcion(fila[9] != null ? (String) fila[9] : "");
            infoComunicaciones.setComunicacionesFecha(fila[10] != null ? (Date) fila[10] : null);
            infoComunicaciones.setComunicacionesTipo(fila[11] != null ? (String) fila[11] : "");
            infoComunicaciones.setComunicacionesDaceId(fila[12] != null ? (Long) fila[12] : 0);
            infoComunicaciones.setComunicacionesMatriculaId(fila[13] != null ? (Long) fila[13] : 0);
            infoComunicaciones.setDocenteRun(fila[14] != null ? (String) fila[14] : "");
            infoComunicaciones.setDocenteApellidoMaterno(fila[15] != null ? (String) fila[15] : "");
            infoComunicaciones.setDocenteApellidoPaterno(fila[16] != null ? (String) fila[16] : "");
            infoComunicaciones.setDocenteFechaNacimiento(fila[17] != null ? (Date) fila[17] : null);
            infoComunicaciones.setDocenteNombre(fila[18] != null ? (String) fila[18] : "");
            infoComunicaciones.setDocenteNumeroCelular(fila[19] != null ? (String) fila[19] : "");
            infoComunicaciones.setDocenteNumeroTelefonico(fila[20] != null ? (String) fila[20] : "");
            infoComunicaciones.setDocenteNumeroSexo(fila[21] != null ? (String) fila[21] : "");
            infoComunicaciones.setAsignaturaId(fila[22] != null ? (Long) fila[22] : 0);
            infoComunicaciones.setAsignaturaNombre(fila[23] != null ? (String) fila[23] : "");
            infoComunicaciones.setCursoId(fila[24] != null ? (Long) fila[24] : 0);
            infoComunicaciones.setCursoNivel(fila[25] != null ? (int) fila[25] : 0);
            infoComunicaciones.setCursoNombre(fila[26] != null ? (String) fila[26] : "");


            listaAlumnoComunicaciones.add(infoComunicaciones);
        }

        return listaAlumnoComunicaciones;
    }

}
