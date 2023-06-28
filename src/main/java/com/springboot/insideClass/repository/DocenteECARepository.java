package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.DocenteECAEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocenteECARepository extends JpaRepository<DocenteECAEntity, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM T_DocenteECA  WHERE T_DocenteECA.docenteeca_asignatura_docente_id = ? AND T_DocenteECA.docenteeca_curso_establ_id = ? ")
    List<DocenteECAEntity> findByAsignaturaDocenteIdAndEstablId(@Param("asignaturaDocenteId") long asignaturaDocenteId, @Param("curso_establ_id") long curso_establ_id);

    @Query(nativeQuery = true, value = "SELECT *" +
            "        FROM t_docenteeca\n" +
            "        WHERE (docenteeca_asignatura_docente_id = :docenteeca_asignatura_docente_id OR :docenteeca_asignatura_docente_id = '-1')\n" +
            "        AND (docenteeca_curso_establ_id = :docenteeca_curso_establ_id OR :docenteeca_curso_establ_id = -1) ")
    DocenteECAEntity findAllFilter(@Param("docenteeca_asignatura_docente_id") long docenteeca_asignatura_docente_id, @Param("docenteeca_curso_establ_id") long docenteeca_curso_establ_id);


}
