package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.usuarioEntity;
import com.springboot.insideClass.entity.vigenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface vigenciaRepository extends JpaRepository<vigenciaEntity, Integer> {

    @Query(value = "select * from t_vigencia inner join t_usuario on t_vigencia.vigencia_id = t_usuario.usuario_vigencia_id where usuario_nick_name = ?", nativeQuery = true)
    vigenciaEntity findByUsername(@Param("usuario_nick_name") String username);

}
