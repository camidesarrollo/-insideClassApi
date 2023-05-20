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

    @Query(nativeQuery = true, value = "select ad.* from t_curso c\n" +
            "    inner join t_curso_establ ce on c.curso_id = ce.curso_establ_curso_id\n" +
            "    inner join t_docente_curso dc on ce.curso_establ_id = dc.docente_curso_establ_id\n" +
            "    inner join t_asignatura_docente ad on ad.asignatura_doc_docente_establ_id = dc.docente_curso_id\n" +
            "    where c.curso_id = ? and dc.docente_curso_docente_id = ? and ad.asignatura_doc_asignatura_id = ? and ad.asignatura_doc_id not in  (SELECT asignatura_nota_asignatura_doc_id \n" +
            "  FROM t_asignatura_nota) ")
    AsignaturaDocenteEntity findDocenteCursoByCursoAsignatura(@Param("curso_id") long curso_id, @Param("docente_curso_docente_id") long docente_curso_docente_id, @Param("asignatura_doc_asignatura_id") long asignatura_doc_asignatura_id);


    @Query(nativeQuery = true, value = "select ad.* from \n" +
            "t_docente d inner join t_docente_curso dc on d.docente_id = dc.docente_curso_docente_id \n" +
            "inner join t_curso_establ ce on dc.docente_curso_establ_id = ce.curso_establ_id \n" +
            "inner join t_curso c on ce.curso_establ_curso_id = c.curso_id \n" +
            "inner join t_establ e on ce.curso_establ_establ_id = e.establ_id \n" +
            "inner join t_asignatura_docente ad on dc.docente_curso_id = ad.asignatura_doc_docente_establ_id \n" +
            "inner join t_asignatura a on ad.asignatura_doc_asignatura_id = a.asignatura_id \n" +
            "inner join t_persona p on d.docente_persona_run = p.persona_run \n" +
            "where d.docente_persona_run = ? and a.asignatura_id = ? and c.curso_id = ? and year(dc.docente_cuso_fecha_fin) = ?")
    AsignaturaDocenteEntity findDocenteCursoByRunAndAsignaturaAndEstablecimiento(@Param("docente_persona_run") String docente_persona_run, @Param("asignatura_id") long asignatura_id, @Param("curso_id") long curso_id, @Param("docente_cuso_fecha_fin") Integer docente_cuso_fecha_fin);



}
