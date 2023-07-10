package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.DepartamentosProvincialesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentoProvincialesRepository extends JpaRepository<DepartamentosProvincialesEntity, Long> {
    @Query(value = "SELECT *\n" +
            "        FROM t_departamentos_provinciales\n" +
            "        where t_departamentos_provinciales.departamentos_provinciales_id = :departamentos_provinciales_id or :departamentos_provinciales_id = -1\n" +
            "        and t_departamentos_provinciales.departamentos_provinciales_correo =  :departamentos_provinciales_correo or :departamentos_provinciales_correo = '-1'\n" +
            "        and t_departamentos_provinciales.departamentos_provinciales_direccion  = :departamentos_provinciales_direccion or :departamentos_provinciales_direccion = '-1'\n" +
            "        and t_departamentos_provinciales.departamentos_provinciales_responsable  = :departamentos_provinciales_responsable or :departamentos_provinciales_responsable = '-1'", nativeQuery = true)
    List<DepartamentosProvincialesEntity> findByFilters(@Param("departamentos_provinciales_id") Long departamentos_provinciales_id, @Param("departamentos_provinciales_correo") String departamentos_provinciales_correo,
                                    @Param("departamentos_provinciales_direccion") String departamentos_provinciales_direccion,
                                    @Param("departamentos_provinciales_responsable") String departamentos_provinciales_responsable);
}
