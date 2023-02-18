package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.DirectorEntity;
import com.springboot.insideClass.entity.DocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DirectorRepository extends JpaRepository<DirectorEntity, Long> {

    @Query(nativeQuery = true, value = "SELECT t_persona.*, t_establ.establ_id, t_establ.[establ_nombre]\n" +
            "      ,t_establ.[establ_numero_telefonico], t_comunas.comunas_nombre, t_tipo_area.tipo_area_nombre,\n" +
            "\t  t_direccion.direccion_calle\n" +
            "\t \n" +
            "FROM     t_director INNER JOIN\n" +
            "                  t_establ ON t_director.director_establ_id = t_establ.establ_id INNER JOIN\n" +
            "                  t_direccion ON t_establ.establ_direccion_id = t_direccion.direccion_id INNER JOIN\n" +
            "                  t_comunas ON t_direccion.direccion_comuna_id = t_comunas.comunas_id  INNER JOIN\n" +
            "                  t_persona ON t_director.director_persona_id = t_persona.persona_run INNER JOIN\n" +
            "                  t_usuario ON t_persona.persona_run = t_usuario.usuario_persona_run INNER JOIN\n" +
            "                  t_tipo_area ON t_direccion.direccion_tipo_area = t_tipo_area.tipo_area_id \n" +
            "\t\t\t\t  where t_usuario.id = ?")
    List<Object> findDirectorEstablecimientoByUsuario(@Param("id") Long id);
}

