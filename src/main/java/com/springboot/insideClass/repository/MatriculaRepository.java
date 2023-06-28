package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.MatriculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<MatriculaEntity, Long> {
    @Query(nativeQuery = true, value = "select  * from t_matricula m left join t_curso_matricula cm on m.matricula_id = cm.curso_establ_matricula_id " +
            " inner join t_curso_establ ce on cm.curso_establ_id = ce.curso_establ_id  inner join t_curso c on c.curso_id = ce.curso_establ_curso_id   " +
            "inner join t_establ e on ce.curso_establ_id = e.establ_id  " +
            "where m.matricula_alumno_id = ? \n" +
            "\t\t   and m.matricula_vigencia = ?\n" +
            "\t\t   and m.curso_agno = ? \n" +
            "\t\t   and c.curso_id = ?\n" +
            "\t\t   and e.establ_id = ?")
    MatriculaEntity findEstablecimientoByAll(@Param("matricula_alumno_id") long matricula_alumno_id,
                                             @Param("matricula_vigencia") long matricula_vigencia,
                                             @Param("curso_agno") Integer curso_agno,
                                             @Param("curso_id") long curso_id,
                                             @Param("establ_id") long establ_id);

    @Query(nativeQuery = true, value = "SELECT * FROM fn_InfoMatricula(:establecimiento,:persona_run, :curso_id, :vigencia, :apoderado_run )")
    List<Object> fn_InfoMatricula(@Param("establecimiento") Long establecimiento, @Param("persona_run") String persona_run,
                                  @Param("curso_id") long curso_id, @Param("vigencia") Integer vigencia, @Param("apoderado_run") String apoderado_run);



    @Query(nativeQuery = true, value = "select m.* from t_matricula m \n" +
            "inner join t_curso_establ ce on m.matricula_id = ce.curso_establ_matricula_id\n" +
            "inner join t_alumno a on a.alumno_id = m.matricula_id\n" +
            "where a.alumno_persona_run = ? and curso_agno = ? and ce.curso_establ_establ_id = ?")
    MatriculaEntity findMatriculaByRunAndCurso(@Param("alumno_persona_run") String alumno_persona_run,
                                             @Param("curso_agno") Integer curso_agno,
                                             @Param("curso_establ_establ_id") Long curso_establ_establ_id);

    @Query(nativeQuery = true, value = "select * from t_matricula m \n" +
            "where m.matricula_alumno_id = ?\n" +
            "and m.matricula_apoderado_id = ?\n" +
            "and m.matricula_vigencia =?\n" +
            "and m.curso_agno = ?")
    MatriculaEntity  findAllFilter(@Param("alumno_id") long alumno_id, @Param("apoderado_id") long apoderado_id, @Param("vigencia") boolean vigencia,
                                   @Param("curso_agno")long curso_agno);

}


