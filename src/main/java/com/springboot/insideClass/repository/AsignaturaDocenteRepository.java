package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.AsignaturaDocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaDocenteRepository extends JpaRepository<AsignaturaDocenteEntity, Long> {
    @Query(nativeQuery = true, value = "select * from t_asignatura_docente where asignatura_doc_asignatura_id = ? and asignatura_doc_docente_establ_id = ?")
    AsignaturaDocenteEntity findAsignaturaDocenteByAsignaturaAndDocente(@Param("asignatura_doc_asignatura_id") long asignatura_doc_asignatura_id, @Param("asignatura_doc_docente_establ_id") long asignatura_doc_docente_establ_id);

}
