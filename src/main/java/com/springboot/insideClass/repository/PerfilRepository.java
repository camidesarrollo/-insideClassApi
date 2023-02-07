package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {
    @Query(value = "select t_perfil.* from t_usuario inner join t_perfil on t_usuario.usuario_perfil_id = t_perfil.perfil_id where t_usuario.usuario_nick_name = ?", nativeQuery = true)
    PerfilEntity findByUsuarioName(@Param("usuario_nick_name") String usuario_nick_name);

    @Query(value = "select t_perfil.* from t_perfil  where t_perfil.perfil_nombre = ?", nativeQuery = true)
    PerfilEntity findByName(@Param("perfil_nombre") String perfil_nombre);
}
