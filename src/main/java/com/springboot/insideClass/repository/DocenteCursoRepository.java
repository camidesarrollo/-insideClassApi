package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.DocenteCursoEntity;
import com.springboot.insideClass.entity.DocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DocenteCursoRepository extends JpaRepository<DocenteCursoEntity, Long> {
    @Query(nativeQuery = true, value = "select * from t_docente_curso where t_docente_curso.docente_curso_docente_id =  ? and t_docente_curso.docente_curso_establ_id = ? and t_docente_curso.docente_curso_fecha_inicio = ? and t_docente_curso.docente_cuso_fecha_fin = ?")
    DocenteCursoEntity findDocenteCursoByRunAndEstablecimientoByFecha(@Param("docente_curso_docente_id") long docente_curso_docente_id, @Param("docente_curso_establ_id") long docente_curso_establ_id, @Param("docente_curso_fecha_inicio") Date docente_curso_fecha_inicio, @Param("docente_cuso_fecha_fin") Date docente_curso_fecha_fin);
}
