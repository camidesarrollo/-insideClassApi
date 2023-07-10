package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.NotasEntity;
import com.springboot.insideClass.payload.response.Notas.DatosNotasResponse;
import com.springboot.insideClass.repository.NotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class NotasService {

    @Autowired
    private NotasRepository notasRepository;


    public List<NotasEntity> obtenerTodasLasNotas() {
        return notasRepository.findAll();
    }

    public NotasEntity obtenerNotaPorId(Long id) {
        return notasRepository.findById(id).orElse(null);
    }

    public NotasEntity guardarNota(NotasEntity nota) {
        return notasRepository.save(nota);
    }

    public void eliminarNota(Long id) {
        notasRepository.deleteById(id);
    }

    public List<DatosNotasResponse> obtenerDatosAlumnoNotas(boolean matricula_vigencia,
                                                                     Long establecimiento_id,
                                                                     Long apoderado_id,
                                                                     String alumno_run,
                                                                     Long anotaciones_matricula_id,
                                                                     String docente_run,
                                                                     Long asignatura_id,
                                                                     Long curso_id) {

        List<DatosNotasResponse> listaAlumnoNotas = new ArrayList<>();

        List<Object> listaObjetosNativos = notasRepository.findByFilters( matricula_vigencia,
                establecimiento_id,
                apoderado_id,
                alumno_run,
                anotaciones_matricula_id,
                docente_run,
                asignatura_id,
                curso_id);

        for (Object item : listaObjetosNativos) {
            Object[] fila = (Object[]) item;

            DatosNotasResponse infoNotas = new DatosNotasResponse();
            infoNotas.setAlumno_run(fila[0] != null ? (String) fila[0] : "");
            infoNotas.setAlumno_apellido_materno(fila[1] != null ? (String) fila[1] : "");
            infoNotas.setAlumno_apellido_paterno(fila[2] != null ? (String) fila[2] : "");
            infoNotas.setAlumno_fecha_nacimiento(fila[3] != null ? (Date) fila[3] : null);
            infoNotas.setAlumno_nombre(fila[4] != null ? (String) fila[4] : "");
            infoNotas.setAlumno_numero_celular(fila[5] != null ? (String) fila[5] : "");
            infoNotas.setAlumno_numero_telefonico(fila[6] != null ? (String) fila[6] : "");
            infoNotas.setAlumno_numero_sexo(fila[7] != null ? (String) fila[7] : "");
            infoNotas.setDace_notas_id(fila[8] != null ? (Long) fila[8] : 0);
            infoNotas.setNota(fila[9] != null ? (Double) fila[9] : 0.0);
            infoNotas.setNotas_fecha(fila[10] != null ? (Date) fila[10] : null);
            infoNotas.setNotas_posicion(fila[11] != null ? (Integer) fila[11] : 0);
            infoNotas.setPromedio(fila[12] != null ? (Double) fila[12] : 0.0);
            infoNotas.setNotas_dace_id(fila[13] != null ? (Long) fila[13] : 0);
            infoNotas.setNotas_matricula_id(fila[14] != null ? (Long) fila[14] : 0);
            infoNotas.setDocente_run(fila[15] != null ? (String) fila[15] : "");
            infoNotas.setDocente_apellido_materno(fila[16] != null ? (String) fila[16] : "");
            infoNotas.setDocente_apellido_paterno(fila[17] != null ? (String) fila[17] : "");
            infoNotas.setDocente_fecha_nacimiento(fila[18] != null ? (Date) fila[18] : null);
            infoNotas.setDocente_nombre(fila[19] != null ? (String) fila[19] : "");
            infoNotas.setDocente_numero_celular(fila[20] != null ? (String) fila[20] : "");
            infoNotas.setDocente_numero_telefonico(fila[21] != null ? (String) fila[21] : "");
            infoNotas.setDocente_numero_sexo(fila[22] != null ? (String) fila[22] : "");
            infoNotas.setAsignatura_id(fila[23] != null ? (Long) fila[23] : 0);
            infoNotas.setAsignatura_nombre(fila[24] != null ? (String) fila[24] : "");
            infoNotas.setCurso_id(fila[25] != null ? (Long) fila[25] : 0);
            infoNotas.setCurso_nivel(fila[26] != null ? (Long) fila[26] : 0);
            infoNotas.setCurso_nombre(fila[27] != null ? (String) fila[27] : "");



            listaAlumnoNotas.add(infoNotas);
        }

        return listaAlumnoNotas;
    }
}
