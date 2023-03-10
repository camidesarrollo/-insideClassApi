package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.EstablecimientoEntity;
import com.springboot.insideClass.entity.MatriculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MatriculaRepository extends JpaRepository<MatriculaEntity, Long> {
    @Query(nativeQuery = true, value = "select * from t_matricula where " +
            "t_matricula.matricula_curso_establ_id = ? and t_matricula.matricula_alumno_id = ? " +
            "and t_matricula.curso_agno = ?")
    MatriculaEntity findEstablecimientoByAll(@Param("matricula_curso_establ_id") long matricula_curso_establ_id,
                                            @Param("matricula_alumno_id") long matricula_alumno_id,
                                            @Param("curso_agno") String curso_agno);

}


