package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.MatriculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MatriculaRepository extends JpaRepository<MatriculaEntity, Long> {
    @Query(value =
            "Select p.*, e.*, c.*, m.* from t_matricula m inner join t_apoderado a on m.matricula_apoderado_id = a.apoderado_id\n" +
            "inner join t_curso_establecimiento ce on m.matricula_curso_establecimiento_id =  ce.curso_establecimiento_id\n" +
            "inner join t_establecimiento e on ce.curso_establecimiento_establecimiento_id = e.establecimiento_id\n" +
            "inner join t_curso c on ce.curso_establecimiento_curso_id = c.curso_id\n" +
            "inner join t_alumno al on m.matricula_alumno_id = al.alumno_id\n" +
            "inner join t_persona p on al.alumno_persona_run = p.persona_run\n" +
            "inner join t_apoderado apo on apo.apoderado_id = m.matricula_apoderado_id \n" +
            "inner join (select p.* from t_persona p inner join t_apoderado apo on apo.apoderado_persona_run = p.persona_run) apoderado on apo.apoderado_persona_run = apoderado.persona_run" +
            "  where (m.matricula_vigencia = :matricula_vigencia or :matricula_vigencia  = -1) and (e.establecimiento_id = :establecimiento_id or :establecimiento_id = -1 )" +
            "and (m.curso_agno = :curso_agno or :curso_agno = -1) and (a.apoderado_persona_run = :apoderado_persona_run or :apoderado_persona_run  = '-1')\n" +
            "and (a.apoderado_id = :apoderado_id or :apoderado_id = -1) and (al.alumno_id = :alumno_id or :alumno_id = -1) " +
            " and (al.alumno_persona_run = :alumno_persona_run or :alumno_persona_run  = '-1') and (c.curso_id = :curso_id or :curso_id = '-1')", nativeQuery = true)
    List<Object> findByMatricula(@Param("matricula_vigencia") boolean matricula_vigencia,@Param("curso_agno") int  curso_agno, @Param("apoderado_id") Long  apoderado_id,
                                 @Param("apoderado_persona_run") String  apoderado_persona_run
            , @Param("alumno_id") Long  alumno_id, @Param("alumno_persona_run") String  alumno_persona_run, @Param("establecimiento_id") Long  establecimiento_id, @Param("curso_id") Long  curso_id);
}
