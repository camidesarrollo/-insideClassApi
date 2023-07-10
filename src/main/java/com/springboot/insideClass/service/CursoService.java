package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.CursoEntity;
import com.springboot.insideClass.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    CursoRepository cursoRepository;

    public List<CursoEntity> obtenerTodosLosCursos() {
        return cursoRepository.findAll();
    }

    public Optional<CursoEntity> obtenerCursoPorId(Long id) {
        return cursoRepository.findById(id);
    }

    public List<CursoEntity> obtenerCursoPorFiltro(Long curso_id, String curso_nombre, String curso_nivel){
        return cursoRepository.findByFilters(curso_id, curso_nombre, curso_nivel);
    }

    public CursoEntity guardarCurso(CursoEntity apoderado) {
        return cursoRepository.save(apoderado);
    }

    public void eliminarCurso(Long id) {
        cursoRepository.deleteById(id);
    }

    public List<CursoEntity> obtenerPorDocente(Long docente_asignatura_docente_id,
                                               Long docente_asignatura_id_asignatura_id,
                                                String fecha_fin,
                                               boolean vigencia,
                                                              Long curso_establecimiento_curso_id,
                                                              Long curso_establecimiento_establecimiento_id) {

        System.out.println("Select  c.* from t_curso c inner join t_curso_establecimiento ce on c.curso_id = ce.curso_establecimiento_curso_id" +
                "inner join t_docente_asignatura_curso_establecimiento dace on ce.curso_establecimiento_id = dace.dace_curso_establecimiento_id" +
                "inner join t_docente_asignatura da on dace.dace_docente_asignatura_id = da.docente_asignatura_id" +
                "where (da.docente_asignatura_docente_id = "+docente_asignatura_docente_id+" or "+docente_asignatura_docente_id+" = -1)" +
                "and (da.docente_asignatura_id_asignatura_id = "+docente_asignatura_id_asignatura_id+" or "+docente_asignatura_id_asignatura_id+" = -1)" +
                "AND ((ISDATE("+fecha_fin+") = 1 AND (TRY_CONVERT(date,dace.fecha_fin) >= TRY_CONVERT(date,"+fecha_fin.toString()+")) OR "+fecha_fin.toString()+"= '-1'))" +
                "AND ("+vigencia+" = '-1' OR ce.vigencia = "+vigencia+")" +
                "AND ("+curso_establecimiento_curso_id+" =  -1 OR ce.curso_establecimiento_curso_id = "+curso_establecimiento_curso_id+")" +
                "AND ("+curso_establecimiento_establecimiento_id+" =  -1 OR ce.curso_establecimiento_establecimiento_id = "+curso_establecimiento_establecimiento_id+")");
        return cursoRepository.findByDocente(docente_asignatura_docente_id,docente_asignatura_id_asignatura_id,
                fecha_fin, vigencia, curso_establecimiento_curso_id, curso_establecimiento_establecimiento_id);
    }

    public List<CursoEntity> obtenerPorApoderado(boolean vigencia,
    Long curso_establecimiento_curso_id,
    Long curso_establecimiento_establecimiento_id,
                                                 boolean vigenciaMatricula, Long curso_agno, Long matricula_apoderado_id, Long matricula_alumno_id) {
        return cursoRepository.findByApoderado(vigencia, curso_establecimiento_curso_id, curso_establecimiento_establecimiento_id, vigenciaMatricula, curso_agno, matricula_apoderado_id, matricula_alumno_id);
    }

    public List<CursoEntity> obtenerPorDirector(  boolean vigencia, Long curso_establecimiento_curso_id, Long curso_establecimiento_establecimiento_id, String director_id, String director_persona_run) {
        return cursoRepository.findByDirector(vigencia, curso_establecimiento_curso_id, curso_establecimiento_establecimiento_id, director_id,director_persona_run );
    }
}
