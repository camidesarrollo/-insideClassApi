package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.EstablecimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstablecimientoRepository extends JpaRepository<EstablecimientoEntity, Long> {

    @Query(value = "SELECT e.* FROM t_establecimiento e WHERE " +
            "(:establecimiento_id = -1 OR e.establecimiento_id = :establecimiento_id) " +
            "AND (:establecimiento_codigo_area = -1 OR e.establecimiento_codigo_area = :establecimiento_codigo_area) " +
            "AND (:establecimiento_nombre = '-1' OR e.establecimiento_nombre = :establecimiento_nombre) " +
            "AND (:establecimiento_telefono = -1 OR e.establecimiento_telefono = :establecimiento_telefono) " +
            "AND (:establecimiento_dependencia_id = -1 OR e.establecimiento_dependencia_id = :establecimiento_dependencia_id) " +
            "AND (:establecimiento_direccion_id = -1 OR e.establecimiento_direccion_id = :establecimiento_direccion_id) " +
            "AND (:establecimiento_sostenedor_id = -1 OR e.establecimiento_sostenedor_id = :establecimiento_sostenedor_id)", nativeQuery = true)
    List<EstablecimientoEntity> findByFilters(@Param("establecimiento_id") Long establecimiento_id,
                                              @Param("establecimiento_codigo_area") Long establecimiento_codigo_area,
                                              @Param("establecimiento_nombre") String establecimiento_nombre,
                                              @Param("establecimiento_telefono") Long establecimiento_telefono,
                                              @Param("establecimiento_dependencia_id") Long establecimiento_dependencia_id,
                                              @Param("establecimiento_direccion_id") Long establecimiento_direccion_id,
                                              @Param("establecimiento_sostenedor_id") Long establecimiento_sostenedor_id);

    @Query(value = "Select distinct e.* from t_docente d\n" +
            "        inner join t_docente_asignatura da on d.docente_id = da.docente_asignatura_docente_id\n" +
            "        inner join t_asignatura a on da.docente_asignatura_id_asignatura_id = a.asignatura_id\n" +
            "        inner join t_docente_asignatura_curso_establecimiento dace on da.docente_asignatura_id = dace.dace_docente_asignatura_id\n" +
            "        inner join t_curso_establecimiento ce on dace.dace_curso_establecimiento_id = ce.curso_establecimiento_id\n" +
            "        inner join t_curso c on ce.curso_establecimiento_curso_id = c.curso_id\n" +
            "        inner join t_establecimiento e on ce.curso_establecimiento_establecimiento_id = e.establecimiento_id\n" +
            "        where dace.fecha_fin > GETDATE() and (d.docente_persona_run = :docente_persona_run or :docente_persona_run = '-1')", nativeQuery = true)
    List<EstablecimientoEntity> findByDocente(@Param("docente_persona_run") String docente_persona_run);

    @Query(value = "Select distinct e.* from t_matricula m \n" +
            "inner join t_apoderado a on m.matricula_apoderado_id = a.apoderado_id\n" +
            "inner join t_curso_establecimiento ce on m.matricula_curso_establecimiento_id = ce.curso_establecimiento_id\n" +
            "inner join t_establecimiento e on ce.curso_establecimiento_establecimiento_id = e.establecimiento_id\n" +
            "where m.curso_agno = Year(GETDATE()) \n" +
            "and (m.matricula_vigencia = :matricula_vigencia  or :matricula_vigencia = -1 ) \n" +
            "and (a.apoderado_persona_run = :apoderado_persona_run or :apoderado_persona_run = '-1')", nativeQuery = true)
    List<EstablecimientoEntity> findByApoderado(@Param("apoderado_persona_run") String apoderado_persona_run, @Param("matricula_vigencia") Boolean matricula_vigencia);

    @Query(value = "Select distinct e.* from t_establecimiento e inner join t_director d on d.director_establecimiento_id = e.establecimiento_id\n" +
            "where (d.director_establecimiento_id = :director_establecimiento_id or :director_establecimiento_id = -1) and (d.director_persona_run = :director_persona_run or :director_persona_run = '-1')\n", nativeQuery = true)
    List<EstablecimientoEntity> findByDirector(@Param("director_establecimiento_id") Long director_establecimiento_id, @Param("director_persona_run") String director_persona_run);

}
