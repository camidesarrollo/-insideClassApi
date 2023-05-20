package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.MatriculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<MatriculaEntity, Long> {
    @Query(nativeQuery = true, value = "\tselect  * from t_matricula \n" +
            "\t\t\twhere t_matricula.matricula_curso_establ_id = ?\n" +
            "\t\t\tand t_matricula.matricula_alumno_id = ? \n" +
            "\t\t\tand t_matricula.matricula_vigencia = 1 \n" +
            "\t\t\tand t_matricula.curso_agno = ?")
    MatriculaEntity findEstablecimientoByAll(@Param("matricula_curso_establ_id") long matricula_curso_establ_id,
                                            @Param("matricula_alumno_id") long matricula_alumno_id,
                                            @Param("curso_agno") Integer curso_agno);

    @Query(nativeQuery = true, value = "SELECT * FROM fn_InfoAlumno(:establecimiento,:persona_run, :curso_id, :vigencia, :apoderado_run )")
    List<Object> fn_InfoMatricula(@Param("establecimiento") Long establecimiento, @Param("persona_run") String persona_run,
                                  @Param("curso_id") Integer curso_id, @Param("vigencia") Integer vigencia, @Param("apoderado_run") String apoderado_run);



    @Query(nativeQuery = true, value = "select m.* from t_matricula m \n" +
            "inner join t_curso_establ ce on m.matricula_curso_establ_id = ce.curso_establ_id\n" +
            "inner join t_alumno a on a.alumno_id = m.matricula_id\n" +
            "where a.alumno_persona_run = ? and curso_agno = ? and ce.curso_establ_establ_id = ?")
    MatriculaEntity findMatriculaByRunAndCurso(@Param("alumno_persona_run") String alumno_persona_run,
                                             @Param("curso_agno") Integer curso_agno,
                                             @Param("curso_establ_establ_id") Long curso_establ_establ_id);

}


