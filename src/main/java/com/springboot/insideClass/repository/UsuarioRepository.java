package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    @Query(value = "select * from t_usuario where username = ?", nativeQuery = true)
    UsuarioEntity findByUsername(@Param("username") String username);

    @Query(value = "select * from t_usuario where email like ?", nativeQuery = true)
    UsuarioEntity findByCorreo(@Param("email") String correo);

    @Query(value = "select count(*) from t_usuario where username like ?", nativeQuery = true)
    Long existsByUsername(@Param("username") String username);

    @Query(value = "select count(*) from t_usuario where email like ?", nativeQuery = true)
    Long existsByEmail(@Param("email") String correo);
    @Query(value = "select * from t_usuario where username like ?", nativeQuery = true)
    Optional<UsuarioEntity> OpfindByUsername(String username);

    @Query(value = "SELECT * FROM t_usuario WHERE t_usuario.usuario_persona_run = :usuario_persona_run AND (t_usuario.usuario_perfil_id = :usuario_perfil_id OR -1 = :usuario_perfil_id)", nativeQuery = true)
    List<UsuarioEntity> findByRunAndPerfil(@Param("usuario_persona_run") String usuario_persona_run, @Param("usuario_perfil_id") long usuario_perfil_id);
    Optional<UsuarioEntity> findByEmail(String email);

    @Query(value = "select top 1 * from t_usuario where usuario_persona_run = ?", nativeQuery = true)
    UsuarioEntity findByRun(String usuario_persona_run);

}
