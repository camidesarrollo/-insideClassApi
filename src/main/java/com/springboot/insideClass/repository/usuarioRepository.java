package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.perfilEntity;
import com.springboot.insideClass.entity.usuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface usuarioRepository extends JpaRepository<usuarioEntity, Integer> {
    @Query(value = "select * from t_usuario where usuario_nick_name = ?", nativeQuery = true)
    Optional<usuarioEntity> findByUsername(@Param("usuario_nick_name") String username);

    @Query(value = "select count(*) from t_usuario where usuario_nick_name = ?", nativeQuery = true)
    Integer existsByUsername(@Param("usuario_nick_name") String username);

}
