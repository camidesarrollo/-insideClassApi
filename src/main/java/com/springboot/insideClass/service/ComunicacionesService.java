package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.ComunicacionesEntity;
import com.springboot.insideClass.payload.response.Comunicaciones.ComunicacionesResponse;
import com.springboot.insideClass.payload.response.Comunicaciones.DatosAlumnoComunicacionesResponse;
import com.springboot.insideClass.repository.ComunicacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
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

    public void eliminarComunicacionPorCorrelativo(Long id) {
        comunicacionesRepository.EliminarComunicacionPorCorrelativo(id);
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
            infoComunicaciones.setAlumnoApellidoMaterno(fila[2] != null ? (String) fila[2] : "");
            infoComunicaciones.setAlumnoApellidoPaterno(fila[1] != null ? (String) fila[1] : "");
            infoComunicaciones.setAlumnoFechaNacimiento(fila[3] != null ? (Date) fila[3] : null);
            infoComunicaciones.setAlumnoNombre(fila[4] != null ? (String) fila[4] : "");
            infoComunicaciones.setAlumnoNumeroCelular(fila[5] != null ? (String) fila[5] : "");
            infoComunicaciones.setAlumnoNumeroTelefonico(fila[6] != null ? (String) fila[6] : "");
            infoComunicaciones.setAlumnoNumeroSexo(fila[7] != null ? ((Character) fila[7]).toString() : "");

            infoComunicaciones.setCursoId(fila[8] != null ? ((BigInteger ) fila[8]).longValue() : 0);
            infoComunicaciones.setCursoNivel(fila[9] != null ? (String) fila[9] : "");
            infoComunicaciones.setCursoNombre(fila[10] != null ? (String) fila[10] : "");

            infoComunicaciones.setDocenteRun(fila[11] != null ? (String) fila[11] : "");
            infoComunicaciones.setDocenteApellidoMaterno(fila[13] != null ? (String) fila[13] : "");
            infoComunicaciones.setDocenteApellidoPaterno(fila[12] != null ? (String) fila[12] : "");
            infoComunicaciones.setDocenteFechaNacimiento(fila[14] != null ? (Date) fila[14] : null);
            infoComunicaciones.setDocenteNombre(fila[15] != null ? (String) fila[15] : "");
            infoComunicaciones.setDocenteNumeroCelular(fila[16] != null ? (String) fila[16] : "");
            infoComunicaciones.setDocenteNumeroTelefonico(fila[17] != null ? (String) fila[17] : "");
            infoComunicaciones.setDocenteNumeroSexo(fila[18] != null ? ((Character) fila[18]).toString() : "");

            infoComunicaciones.setAsignaturaId(fila[19] != null ? ((BigInteger ) fila[19]).longValue() : 0);
            infoComunicaciones.setAsignaturaNombre(fila[20] != null ? (String) fila[20] : "");


            infoComunicaciones.setComunicacionesId(fila[21] != null ? ((BigInteger) fila[21]).longValue() : 0);
            infoComunicaciones.setComunicacionesCorrelativo(fila[22] != null ? ((Integer) fila[22]) : 0);
            infoComunicaciones.setComunicacionesDescripcion(fila[23] != null ? (String) fila[23] : "");
            infoComunicaciones.setComunicacionesFecha(fila[24] != null ? (Date) fila[24] : null);
            infoComunicaciones.setComunicacionesTipo(fila[25] != null ? (String) fila[25] : "");
            infoComunicaciones.setComunicacionesTitulo(fila[26] != null ? (String) fila[26] : "");
            infoComunicaciones.setComunicacionesDaceId(fila[27] != null ? ((BigInteger ) fila[27]).longValue() : 0);
            infoComunicaciones.setComunicacionesMatriculaId(fila[28] != null ? ((BigInteger ) fila[28]).longValue() : 0);



            listaAlumnoComunicaciones.add(infoComunicaciones);
        }

        return listaAlumnoComunicaciones;
    }


    public List<ComunicacionesEntity> ObtenerUltimaComunicacion() {
        return comunicacionesRepository.ObtenerUltimaComunicacion();
    }

    public ComunicacionesResponse ObtenerComunicacionPorCorrelativo(Long correlativo) {
        Object datosNativos = comunicacionesRepository.ObtenerComunicacionPorCorrelativo(correlativo);

        // Check if the data is not null and an instance of Object[]
        if (datosNativos != null && datosNativos instanceof Object[]) {
            Object[] data = (Object[]) datosNativos;

            ComunicacionesResponse comunicacionesResponse = new ComunicacionesResponse();
            comunicacionesResponse.setComunicaciones_correlativo((Integer) data[0]);
            comunicacionesResponse.setComunicaciones_titulo((String) data[1]);
            comunicacionesResponse.setComunicaciones_tipo((String) data[2]);
            comunicacionesResponse.setComunicaciones_descripcion((String) data[3]);
            comunicacionesResponse.setComunicaciones_fecha((Date) data[4]);

            return comunicacionesResponse;
        }

        return null; // Or throw an exception if needed
    }

    public List<Long>  ObtenerIdComunicacionPorCorrelativo(Long correlativo) {
        return  comunicacionesRepository.findComunicacionesIdsByCorrelativo(1L);
    }

}
