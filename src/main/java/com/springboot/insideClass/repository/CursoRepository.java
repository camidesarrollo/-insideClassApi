package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<CursoEntity, Long> {
    @Query(nativeQuery = true, value = "select * from t_curso c where c.curso_nombre = ? ")
    CursoEntity findCursoByName(@Param("nombre_curso") String nombre_curso);

    @Query(nativeQuery = true, value = "select c.* from \n" +
            "t_docente d\n" +
            "inner join t_asignatura_docente ad on d.docente_id = ad.asignatura_doc_docente_id \n" +
            "inner join t_asignatura a on ad.asignatura_doc_asignatura_id = a.asignatura_id \n" +
            "inner join t_asig_nota_establcurso ane on ane.asig_nota_establecurso_docente_asignatura_id = ad.asignatura_doc_id \n" +
            "inner join t_curso_establ ce on ane.asig_nota_establecurso_curso_id = ce.curso_establ_id \n" +
            "inner join t_curso c on ce.curso_establ_curso_id = c.curso_id \n" +
            "inner join t_establ e on ce.curso_establ_establ_id = e.establ_id \n" +
            "inner join t_persona p on d.docente_persona_run = p.persona_run \n" +
            "where ad.asignatura_doc_fin > GETDATE() \n" +
            "and (e.establ_id = :establecimiento or :establecimiento = -1) \n" +
            "and (p.persona_run = :run or :run = '-1') \n" +
            "and ( c.curso_id = :curso or :curso = -1) \n ")
    List<CursoEntity> findCursoByDocenteXEstablecimiento(@Param("establecimiento") long establecimiento,
                                                         @Param("run") String run,
                                                         @Param("curso") long curso);
}


