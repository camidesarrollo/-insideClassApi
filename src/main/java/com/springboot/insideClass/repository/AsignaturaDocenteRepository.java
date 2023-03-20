package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.AsignaturaDocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsignaturaDocenteRepository extends JpaRepository<AsignaturaDocenteEntity, Long> {
    @Query(nativeQuery = true, value = "select * from t_asignatura_docente where asignatura_doc_asignatura_id = ? and asignatura_doc_docente_establ_id = ?")
    AsignaturaDocenteEntity findAsignaturaDocenteByAsignaturaAndDocente(@Param("asignatura_doc_asignatura_id") long asignatura_doc_asignatura_id, @Param("asignatura_doc_docente_establ_id") long asignatura_doc_docente_establ_id);

    @Query(nativeQuery = true, value = "select ad.* from t_docente d\n" +
            "inner join t_docente_curso dc on d.docente_id = dc.docente_curso_docente_id \n" +
            "inner join t_curso_establ ce on dc.docente_curso_establ_id = ce.curso_establ_id\n" +
            "inner join t_asignatura_docente ad on dc.docente_curso_id = ad.asignatura_doc_docente_establ_id \n" +
            "where curso_establ_establ_id = ? and d.docente_persona_run = ?")
    List<AsignaturaDocenteEntity> findDocenteCursoByRunAndEstablecimiento(@Param("curso_establ_establ_id") long establecimiento_id, @Param("docuente_run") String docente_persona_run);

}
