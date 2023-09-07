package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.RecoveryCodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RecoveryCodeRepository extends JpaRepository<RecoveryCodeEntity, Long> {

    @Query(value = "SELECT *\n" +
            "  FROM [insideClass].[dbo].[t_codigo_recuperacion] \n" +
            "  where \n" +
            "  ([id] = :id or :id = -1) and \n" +
            "  ((ISDATE(:expiration_date_time) = 1 and  TRY_CONVERT(DATE,[expiration_date_time] ) = TRY_CONVERT(DATE, :expiration_date_time) OR :expiration_date_time = '-1')) AND \n" +
            "  ([recovery_code] = :recovery_code or :recovery_code = '-1') and \n" +
            "  ([usuario_id] = :usuario_id or :usuario_id = -1) order by [id] desc ", nativeQuery = true)
    RecoveryCodeEntity findByFilters(@Param("id") Long id,@Param("expiration_date_time") String expiration_date_time, @Param("recovery_code") String recovery_code,@Param("usuario_id") Long usuario_id );


}
