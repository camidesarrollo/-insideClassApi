package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.AlumnoEntity;
import com.springboot.insideClass.entity.EstablecimientoEntity;
import com.springboot.insideClass.entity.MatriculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MatriculaRepository extends JpaRepository<MatriculaEntity, Long> {
    @Query(nativeQuery = true, value = "\tselect  * from t_matricula \n" +
            "\t\t\twhere t_matricula.matricula_curso_establ_id = ?\n" +
            "\t\t\tand t_matricula.matricula_alumno_id = ? \n" +
            "\t\t\tand t_matricula.matricula_vigencia = 1 \n" +
            "\t\t\tand t_matricula.curso_agno = ?")
    MatriculaEntity findEstablecimientoByAll(@Param("matricula_curso_establ_id") long matricula_curso_establ_id,
                                            @Param("matricula_alumno_id") long matricula_alumno_id
                                             ,
                                            @Param("curso_agno") String curso_agno);
}


