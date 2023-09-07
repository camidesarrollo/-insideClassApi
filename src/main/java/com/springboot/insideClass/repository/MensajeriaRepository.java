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

    @Query(value = "Select distinct p.persona_run,\n" +
            "p.persona_nombre + '' + p.persona_apellido_paterno + '' + p.persona_apellido_materno as persona_nombre,\n" +
            "(SELECT TOP 1 m.contenido\n" +
            "            FROM t_mensajeria m\n" +
            "           WHERE m.persona_run = p.persona_run and m.grupo_id is null\n" +
            "           ORDER BY m.fecha_envio DESC ) AS ultimo_mensaje,\n" +
            "(SELECT TOP 1 d.persona_run\n" +
            "            FROM t_mensajeria m\n" +
            "            inner join t_destinatario d on m.mensaje_id = d.mensaje_id\n" +
            "\t\t\tinner join t_apoderado a on d.persona_run = a.apoderado_persona_run\n" +
            "            WHERE m.persona_run = p.persona_run and m.grupo_id is null\n" +
            "            ORDER BY m.fecha_envio DESC) AS destinatario,\n" +
            "(SELECT COUNT(m.mensaje_id)\n" +
            "            FROM t_mensajeria m\n" +
            "           INNER JOIN t_destinatario d ON m.mensaje_id = d.mensaje_id\n" +
            "            WHERE \n" +
            "            m.persona_run = p.persona_run \n" +
            "            AND m.grupo_id IS NULL\n" +
            "            AND d.visto = 0 ) AS cantidad_mensajes_no_vistos\n" +
            "from t_docente_asignatura_curso_establecimiento dace\n" +
            "            inner join t_docente_asignatura da on dace.dace_docente_asignatura_id = da.docente_asignatura_id\n" +
            "            inner join t_docente d on da.docente_asignatura_docente_id = d.docente_id\n" +
            "            inner join t_curso_establecimiento ce on dace.dace_curso_establecimiento_id = ce.curso_establecimiento_id\n" +
            "            inner join t_curso c on ce.curso_establecimiento_curso_id = c.curso_id\n" +
            "            inner join t_establecimiento e on ce.curso_establecimiento_establecimiento_id = e.establecimiento_id\n" +
            "            inner join t_persona p on d.docente_persona_run = p.persona_run \n" +
            "\t\t\twhere dace.profesor_jefe = 1 and (c.curso_id = :curso_id or :curso_id = -1) \n" +
            "and (e.establecimiento_id = :establecimiento_id or :establecimiento_id = -1) \n" +
            "and (d.docente_id = :docente_id or :docente_id = -1) \n" +
            "and (p.persona_run = :persona_run or :persona_run = '-1')", nativeQuery = true)
    List<Object> findDocenteByEstablecimientoCursoMensaje(@Param("persona_run") String persona_run,
                                                          @Param("establecimiento_id") Long establecimiento_id,
                                                          @Param("curso_id") Long curso_id, @Param("docente_id") Long docente_id);
    @Query(value = "SELECT m.mensaje_id, m.group_mensaje_id, \n" +
            "m.contenido,\n" +
            "m.fecha_envio,\n" +
            "m.grupo_id,\n" +
            "m.persona_run as r_persona_run, \n" +
            "d.destinatario_id,\t\n" +
            "fecha_visto,\n" +
            "visto, \n" +
            "d.persona_run as d_persona_run FROM t_mensajeria m \n" +
            "inner join t_destinatario d on m.mensaje_id = d.mensaje_id\n" +
            "where (m.persona_run = :r_persona_run or m.persona_run = :d_persona_run) and (d.persona_run = :r_persona_run or d.persona_run = :d_persona_run)\n" +
            "order by fecha_envio, r_persona_run asc", nativeQuery = true)
    List<Object> findGetMensajeByRemitenteDestinatario(@Param("r_persona_run") String r_persona_run,
                                                          @Param("d_persona_run")String d_persona_run);
}
