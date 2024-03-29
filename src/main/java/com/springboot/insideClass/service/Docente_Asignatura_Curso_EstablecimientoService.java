package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.Docente_Asignatura_Curso_EstablecimientoEntity;
import com.springboot.insideClass.repository.Docente_Asignatura_Curso_EstablecimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Docente_Asignatura_Curso_EstablecimientoService {

    @Autowired
    Docente_Asignatura_Curso_EstablecimientoRepository docenteAsignaturaCursoEstablecimientoRepository;

    public List<Docente_Asignatura_Curso_EstablecimientoEntity> obtenerTodosLosDocenteAsignaturaCursoEstablecimiento() {
        return docenteAsignaturaCursoEstablecimientoRepository.findAll();
    }

    public Optional<Docente_Asignatura_Curso_EstablecimientoEntity> obtenerDocenteAsignaturaCursoEstablecimientoPorId(Long id) {
        return docenteAsignaturaCursoEstablecimientoRepository.findById(id);
    }

    public List<Docente_Asignatura_Curso_EstablecimientoEntity> obtenerDocenteAsignaturaCursoEstablecimientoPorFiltro(Long dace_id,
                                                                                                                      Long dace_curso_establecimiento_id,
                                                                                                                      Long dace_docente_asignatura_id, String fecha_inicio, String fecha_fin, int anio_inicio, int anio_fin){
        System.out.println("select * from t_docente_asignatura_curso_establecimiento" +
                "            where (dace_id = " +dace_id+" or  " +dace_id+"  = -1)" +
                "            and (dace_curso_establecimiento_id = " +dace_curso_establecimiento_id+" or " +dace_curso_establecimiento_id+"= -1)" +
                "            and (dace_docente_asignatura_id = " +dace_curso_establecimiento_id+" or " +dace_curso_establecimiento_id+" = -1)" +
                "            AND (ISDATE("+fecha_inicio+" ) = 1 AND (fecha_inicio = TRY_CONVERT(DATETIME2,"+fecha_inicio+") OR "+fecha_inicio+" = '-1'))" +
                "            AND (ISDATE("+fecha_fin+") = 1 AND (fecha_fin = TRY_CONVERT(DATETIME2, "+fecha_fin+") OR "+fecha_fin+" = '-1'))" +
                "            AND (year(fecha_inicio) = "+anio_inicio+" or "+anio_inicio+" = -1 )" +
                "            AND (year(fecha_fin) = "+anio_fin+" or "+anio_fin+" = -1 )");
        return docenteAsignaturaCursoEstablecimientoRepository.findByFilters(dace_id, dace_curso_establecimiento_id, dace_docente_asignatura_id, fecha_inicio, fecha_fin, anio_inicio, anio_fin);
    }



    public List<Docente_Asignatura_Curso_EstablecimientoEntity> obtenerDocenteAsignaturaCursoEstablecimientoPorFiltroIndexado(Long docente_id,
                                                                                                                              String docente_persona_run,
                                                                                                                              Long asignatura_id,
                                                                                                                              String asignatura_nombre,
                                                                                                                              Long curso_id,
                                                                                                                              String curso_nivel,
                                                                                                                              String curso_nombre,
                                                                                                                              Long establecimiento_id,
                                                                                                                              String establecimiento_nombre,
                                                                                                                              String fecha_inicio,
                                                                                                                              String fecha_fin,
                                                                                                                              int anio_incio,
                                                                                                                              int anio_fin){

        return docenteAsignaturaCursoEstablecimientoRepository.findByFiltersIndex(docente_id,
                 docente_persona_run,
                 asignatura_id,
                 asignatura_nombre,
                 curso_id,
                 curso_nivel,
                 curso_nombre,
                 establecimiento_id,
                 establecimiento_nombre,
                 fecha_inicio,
                 fecha_fin,
                 anio_incio,
                 anio_fin);
    }

    public List<Docente_Asignatura_Curso_EstablecimientoEntity> obtenerDocenteAsignaturaCursoEstablecimientoPorFiltroVigente(Long docente_id,
                                                                                                                              String docente_persona_run,
                                                                                                                              Long asignatura_id,
                                                                                                                              String asignatura_nombre,
                                                                                                                              Long curso_id,
                                                                                                                              String curso_nivel,
                                                                                                                              String curso_nombre,
                                                                                                                              Long establecimiento_id,
                                                                                                                              String establecimiento_nombre,
                                                                                                                              String fecha_inicio,
                                                                                                                              String fecha_fin,
                                                                                                                              int anio_incio,
                                                                                                                              int anio_fin){

        return docenteAsignaturaCursoEstablecimientoRepository.findByFiltersVigente(docente_id,
                docente_persona_run,
                asignatura_id,
                asignatura_nombre,
                curso_id,
                curso_nivel,
                curso_nombre,
                establecimiento_id,
                establecimiento_nombre,
                fecha_inicio,
                fecha_fin,
                anio_incio,
                anio_fin);
    }

    public Docente_Asignatura_Curso_EstablecimientoEntity guardarDocenteAsignaturaCursoEstablecimiento(Docente_Asignatura_Curso_EstablecimientoEntity cursoEstablecimiento) {
        System.out.println(cursoEstablecimiento.getCursoEstablecimiento().getCurso_establecimiento_id());
        System.out.println(cursoEstablecimiento.getDocenteAsignatura().getDocente_asignatura_id());
        return docenteAsignaturaCursoEstablecimientoRepository.save(cursoEstablecimiento);
    }

    public void eliminarDocenteAsignaturaCursoEstablecimiento(Long id) {
        docenteAsignaturaCursoEstablecimientoRepository.deleteById(id);
    }
}
