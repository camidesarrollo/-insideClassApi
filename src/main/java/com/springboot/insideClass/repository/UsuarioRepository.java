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

    @Query(value = "SELECT * FROM t_usuario WHERE " +
            "(:id = -1 OR id = :id) " +
            "AND (:email = '-1' OR email = :email) " +
            "AND (:password = '-1' OR password = :password) " +
            "AND (:username = '-1' OR username = :username) " +
            "AND (:usuario_perfil_id = -1 OR usuario_perfil_id = :usuario_perfil_id) " +
            "AND (:usuario_persona_run = '-1' OR usuario_persona_run = :usuario_persona_run) " +
            "AND (:usuario_vigencia_id = -1 OR usuario_vigencia_id = :usuario_vigencia_id)", nativeQuery = true)
    List<UsuarioEntity> findByFilters(@Param("id") Long id,
                                      @Param("email") String email,
                                      @Param("password") String password,
                                      @Param("username") String username,
                                      @Param("usuario_perfil_id") Long usuario_perfil_id,
                                      @Param("usuario_persona_run") String usuario_persona_run,
                                      @Param("usuario_vigencia_id") Long usuario_vigencia_id);

    @Query(value = "select * from t_usuario where username like ?", nativeQuery = true)
    Optional<UsuarioEntity> OpfindByUsername(String username);
}
