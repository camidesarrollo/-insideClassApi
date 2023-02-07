package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.entity.DocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoEstablecimientoRepository extends JpaRepository<CursoEstablecimientoEntity, Long> {
    @Query(nativeQuery = true, value = "select * from t_curso_establ where t_curso_establ.curso_establ_curso_id = ? and t_curso_establ.curso_establ_establ_id = ?")
    CursoEstablecimientoEntity findCursoEstablecimientoByCursoAndEstablecimiento(@Param("curso_establ_curso_id") long curso_establ_curso_id, @Param("curso_establ_establ_id") long curso_establ_establ_id);

}
