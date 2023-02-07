package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    @Query(value = "select * from t_usuario where username = ?", nativeQuery = true)
    UsuarioEntity findByUsername(@Param("username") String username);

    @Query(value = "select * from t_usuario where email = ?", nativeQuery = true)
    UsuarioEntity findByCorreo(@Param("email") String correo);

    @Query(value = "select count(*) from t_usuario where username = ?", nativeQuery = true)
    Long existsByUsername(@Param("username") String username);

    @Query(value = "select count(*) from t_usuario where email = ?", nativeQuery = true)
    Long existsByEmail(@Param("email") String correo);
    @Query(value = "select * from t_usuario where username = ?", nativeQuery = true)
    Optional<UsuarioEntity> OpfindByUsername(String username);

    @Query(value = "  select * from t_usuario where t_usuario.usuario_persona_run = ? and t_usuario.usuario_perfil_id = ?", nativeQuery = true)
    UsuarioEntity findByRunAndPerfil(@Param("usuario_persona_run") String usuario_persona_run, @Param("usuario_perfil_id") long usuario_perfil_id);



}
