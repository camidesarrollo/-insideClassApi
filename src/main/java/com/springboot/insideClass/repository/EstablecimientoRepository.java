package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.DocenteEntity;
import com.springboot.insideClass.entity.EstablecimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EstablecimientoRepository extends JpaRepository<EstablecimientoEntity, Long> {

    @Query(nativeQuery = true, value = " select * from t_establ where establ_id = ? ")
    EstablecimientoEntity findEstablecimientoById(@Param("establ_id") Long establ_id);

}
