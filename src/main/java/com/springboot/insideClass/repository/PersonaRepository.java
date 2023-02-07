package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, String> {
    @Query(value = "select * from t_persona  inner join t_usuario on t_usuario.usuario_persona_run = t_perfil.persona_run  where usuario_nick_name = ?", nativeQuery = true)
    PersonaEntity findByUsuarioName(@Param("usuario_nick_name") String usuario_nick_name);
    @Query(value = "select * from t_persona where t_persona.persona_run =  ?", nativeQuery = true)
    PersonaEntity findByRun(String persona_run);
}
