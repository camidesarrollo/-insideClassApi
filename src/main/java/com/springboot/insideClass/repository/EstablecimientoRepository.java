package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.EstablecimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstablecimientoRepository extends JpaRepository<EstablecimientoEntity, Long> {

    @Query(nativeQuery = true, value = " select * from t_establ where establ_id = ? ")
    EstablecimientoEntity findEstablecimientoById(@Param("establ_id") Long establ_id);

    @Query(nativeQuery = true, value = " select * from t_establ e inner join t_director d on d.director_establ_id = e.establ_id where d.director_persona_run = ? ")
    List<EstablecimientoEntity> findEstablecimientoByDirector(@Param("director_persona_run") String establ_id);
}
