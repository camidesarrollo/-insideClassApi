package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AnotacionesEntity;
import com.springboot.insideClass.payload.response.Anotaciones.DatosAlumnoAnotacionResponse;
import com.springboot.insideClass.repository.AnotacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AnotacionesService {

    @Autowired
    private AnotacionesRepository anotacionesRepository;


    public List<AnotacionesEntity> obtenerTodosLasAnotaciones() {
        return anotacionesRepository.findAll();
    }

    public Optional<AnotacionesEntity> obtenerAnotacionPorId(Long id) {
        return anotacionesRepository.findById(id);
    }

    /*public List<AnotacionesEntity> obtenerAnotacionPorFiltro(Long comuna_id, String comuna_nombre, Long comuna_provincia_id, Long comuna_deprov_id){
        return anotacionesRepository.findByFilters(comuna_id, comuna_nombre, comuna_provincia_id, comuna_deprov_id);
    }*/

    public AnotacionesEntity guardarAnotacion(AnotacionesEntity anotaciones) {
        return anotacionesRepository.save(anotaciones);
    }

    public void eliminarAnotacion(Long id) {
        anotacionesRepository.deleteById(id);
    }

    public List<DatosAlumnoAnotacionResponse> obtenerDatosAlumnoAnotacion(boolean matricula_vigencia,
                                                                           Long establecimiento_id,
                                                                           Long apoderado_id,
                                                                           String alumno_run,
                                                                           Long anotaciones_matricula_id,
                                                                           String docente_run,
                                                                           Long asignatura_id,
                                                                           Long curso_id, Long anotaciones_id) {

        List<DatosAlumnoAnotacionResponse> listaAlumnoAnotacion = new ArrayList<>();

        List<Object> listaObjetosNativos = anotacionesRepository.findByFilters( matricula_vigencia,
         establecimiento_id,
         apoderado_id,
         alumno_run,
         anotaciones_matricula_id,
         docente_run,
         asignatura_id,
         curso_id, anotaciones_id);

        for (Object item : listaObjetosNativos) {
            Object[] fila = (Object[]) item;

            DatosAlumnoAnotacionResponse infoAnotaciones = new DatosAlumnoAnotacionResponse();
            infoAnotaciones.setAlumno_run(fila[0] != null ? (String) fila[0] : "");
            /*terminame el set de cada una de las filas**/
            infoAnotaciones.setAlumno_run(fila[0] != null ? (String) fila[0] : "");
            infoAnotaciones.setAlumno_apellido_materno(fila[1] != null ? (String) fila[1] : "");
            infoAnotaciones.setAlumno_apellido_paterno(fila[2] != null ? (String) fila[2] : "");
            infoAnotaciones.setAlumno_fecha_nacimiento(fila[3] != null ? (Date) fila[3] : null);
            infoAnotaciones.setAlumno_nombre(fila[4] != null ? (String) fila[4] : "");
            infoAnotaciones.setAlumno_numero_celular(fila[5] != null ? (String) fila[5] : "");
            infoAnotaciones.setAlumno_numero_telefonico(fila[6] != null ? (String) fila[6] : "");
            infoAnotaciones.setAlumno_numero_sexo(fila[7] != null ? ((Character) fila[7]).toString() : "");
            infoAnotaciones.setAnotaciones_id(fila[8] != null ? ((BigInteger) fila[8]).longValue() : null);
            infoAnotaciones.setDescripcion(fila[9] != null ? (String) fila[9] : "");
            infoAnotaciones.setFecha(fila[10] != null ? (Date) fila[10] : null);
            infoAnotaciones.setGravedad(fila[11] != null ? (String) fila[11] : "");
            infoAnotaciones.setAnotaciones_dace_id(fila[12] != null ?  ((BigInteger) fila[12]).longValue()  : null);
            infoAnotaciones.setAnotaciones_matricula_id(fila[13] != null ? ((BigInteger) fila[13]).longValue() : null);
            infoAnotaciones.setDocente_run(fila[14] != null ? (String) fila[14] : "");
            infoAnotaciones.setDocente_apellido_materno(fila[15] != null ? (String) fila[15] : "");
            infoAnotaciones.setDocente_apellido_paterno(fila[16] != null ? (String) fila[16] : "");
            infoAnotaciones.setDocente_fecha_nacimiento(fila[17] != null ? (Date) fila[17] : null);
            infoAnotaciones.setDocente_nombre(fila[18] != null ? (String) fila[18] : "");
            infoAnotaciones.setDocente_numero_celular(fila[19] != null ? (String) fila[19] : "");
            infoAnotaciones.setDocente_numero_telefonico(fila[20] != null ? (String) fila[20] : "");
            infoAnotaciones.setDocente_numero_sexo(fila[21] != null ? ((Character) fila[21]).toString() : "");
            infoAnotaciones.setAsignatura_id(fila[22] != null ? ((BigInteger) fila[22]).longValue()  : null);
            infoAnotaciones.setAsignatura_nombre(fila[23] != null ? (String) fila[23] : "");
            infoAnotaciones.setCurso_id(fila[24] != null ? ((BigInteger) fila[24]).longValue() : null);
            infoAnotaciones.setCurso_nivel(fila[25] != null ? (String) fila[25] : "");
            infoAnotaciones.setCurso_nombre(fila[26] != null ? (String) fila[26] : "");

            listaAlumnoAnotacion.add(infoAnotaciones);
        }

        return listaAlumnoAnotacion;
    }
}
