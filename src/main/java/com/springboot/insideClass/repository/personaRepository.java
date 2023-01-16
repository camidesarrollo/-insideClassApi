package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.personaEntity;
import com.springboot.insideClass.entity.usuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface personaRepository extends JpaRepository<personaEntity, String> {
    @Query(value = "select * from t_persona where inner join t_usuario on t_usuario.usuario_persona_rut = t_perfil.persona_rut  where usuario_nick_name = ?", nativeQuery = true)
    personaEntity findByUsuarioName(@Param("usuario_nick_name") String usuario_nick_name);
}
