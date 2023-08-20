package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.MensajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MensajeriaRepository extends JpaRepository<MensajeEntity, Long> {

    @Query(value = "select distinct g.nombre_grupo,  (SELECT TOP 1 m.contenido\n" +
            "     FROM t_mensajeria m\n" +
            "     WHERE m.grupo_id is not null\n" +
            "     ORDER BY m.fecha_envio DESC ) AS ultimo_mensaje,\n" +
            "\t  (SELECT TOP 1 m.fecha_envio\n" +
            "     FROM t_mensajeria m\n" +
            "     WHERE m.grupo_id is not null\n" +
            "     ORDER BY m.fecha_envio DESC ) AS fecha_envio\n" +
            "\t from t_grupos g \n" +
            "inner join  t_miembro_grupo mg on g.grupo_id = mg.grupo_id where mg.persona_run = :persona_run", nativeQuery = true)
    List<Object> findUltimoMensajeGrupoMensaje(@Param("persona_run") String persona_run);

}
