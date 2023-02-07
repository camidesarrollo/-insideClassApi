package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.VigenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VigenciaRepository extends JpaRepository<VigenciaEntity, Long> {

    @Query(value = "select * from t_vigencia inner join t_usuario on t_vigencia.vigencia_id = t_usuario.usuario_vigencia_id where usuario_nick_name = ?", nativeQuery = true)
    VigenciaEntity findByUsername(@Param("usuario_nick_name") String username);
    @Query(value = "select * from t_vigencia where t_vigencia.vigencia_nombre = ?", nativeQuery = true)
    VigenciaEntity findByName(String usuario_vigencia);
}
