package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, String> {
    @Query(value = "select * from t_persona  inner join t_usuario on t_usuario.usuario_persona_run = t_perfil.persona_run  where usuario_nick_name = ?", nativeQuery = true)
    PersonaEntity findByUsuarioName(@Param("usuario_nick_name") String usuario_nick_name);
    @Query(value = "select * from t_persona where t_persona.persona_run =  ?", nativeQuery = true)
    PersonaEntity findByRun(@Param("apoderado_run") String usuario_nick_name);

    @Query(value = "select per.* from t_apoderado apo \n" +
            "inner join t_matricula m on apo.apoderado_id = m.matricula_apoderado_id\n" +
            "inner join t_alumno a on  m.matricula_alumno_id = a.alumno_id \n" +
            "inner join t_persona per on a.alumno_persona_run = per.persona_run\n" +
            "where  m.curso_agno = YEAR(CURRENT_TIMESTAMP) and apo.apoderado_persona_run = ? and m.matricula_vigencia  = ? and e.establ_id = ?", nativeQuery = true)
    List<PersonaEntity> findAlumnosByApoderado(@Param("apoderado_persona_run") String apoderado_persona_run, @Param("matricula_vigencia") String matricula_vigencia,
                                               @Param("establ_id") String establ_id);
}
