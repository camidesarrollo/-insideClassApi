package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.perfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface perfilRepository extends JpaRepository<perfilEntity, Integer> {
    @Query(value = "select t_perfil.* from t_usuario inner join t_perfil on t_usuario.usuario_perfil_id = t_perfil.perfil_id where t_usuario.usuario_nick_name = ?", nativeQuery = true)
    perfilEntity findByUsuarioName(@Param("usuario_nick_name") String usuario_nick_name);

}
