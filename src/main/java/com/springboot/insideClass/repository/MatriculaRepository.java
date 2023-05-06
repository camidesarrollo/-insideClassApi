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

    @Query(nativeQuery = true, value = "SELECT * FROM fn_InfoAlumno(:establecimiento, :persona_run, :curso_id, :vigencia, :apoderado_run)")
    List<Object> fn_InfoMatricula(@Param("establecimiento") Long establecimiento, @Param("persona_run") String persona_run,
                                  @Param("curso_id") Integer curso_id, @Param("vigencia") Integer vigencia, @Param("apoderado_run") String apoderado_run);
}


