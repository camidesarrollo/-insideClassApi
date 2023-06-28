package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.AsignaturaDocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsignaturaDocenteRepository extends JpaRepository<AsignaturaDocenteEntity, Long> {
    @Query(nativeQuery = true, value = "select * from t_asignatura_docente \n" +
            "where \n" +
            "asignatura_doc_asignatura_id = ?\n" +
            "and asignatura_doc_docente_id = ?\n" +
            "and year(asignatura_doc_inicio) = ? \n" +
            "and year(asignatura_doc_fin) = ?")
    AsignaturaDocenteEntity findAsignaturaDocenteByAsignaturaAndDocente(@Param("asignatura_doc_asignatura_id") long asignatura_doc_asignatura_id, @Param("asignatura_doc_docente_id") long asignatura_doc_docente_id,@Param("asignatura_doc_inicio") Integer asignatura_doc_inicio,
                                                                        @Param("asignatura_doc_fin")  Integer asignatura_doc_fin);

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


    @Query(nativeQuery = true, value = "SELECT ae.* FROM t_asignatura_docente ae \n" +
            "INNER JOIN t_docente d ON d.docente_id = ae.asignatura_doc_docente_id" +
            " \n" +
            "WHERE YEAR(ae.asignatura_doc_inicio) = :asignatura_doc_inicio AND YEAR(ae.asignatura_doc_fin) = :asignatura_doc_fin AND d.docente_persona_run = :docente_persona_run \n" +
            "AND ae.asignatura_doc_asignatura_id = :asignatura_doc_asignatura_id")
    AsignaturaDocenteEntity findDocenteCursoByRunAndAsignaturaAndEstablecimiento(
            @Param("asignatura_doc_inicio") long asignatura_doc_inicio,
            @Param("asignatura_doc_fin") Integer asignatura_doc_fin,
            @Param("docente_persona_run") String docente_persona_run,
            @Param("asignatura_doc_asignatura_id") long asignatura_doc_asignatura_id
    );

    @Query(nativeQuery = true, value = "SELECT *\n" +
            "FROM t_asignatura_docente\n" +
            "WHERE (t_asignatura_docente.asignatura_doc_asignatura_id = :asignatura_doc_asignatura_id OR :asignatura_doc_asignatura_id = -1)\n" +
            "  AND (t_asignatura_docente.asignatura_doc_docente_id = :asignatura_doc_docente_id OR :asignatura_doc_docente_id = -1)")
    List<AsignaturaDocenteEntity> findAllFilter(@Param("asignatura_doc_asignatura_id") long asignatura_doc_asignatura_id, @Param("asignatura_doc_docente_id") long asignatura_doc_docente_id);
}
