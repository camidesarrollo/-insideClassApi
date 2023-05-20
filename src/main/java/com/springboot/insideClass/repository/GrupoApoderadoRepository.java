package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.GrupoApoderadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoApoderadoRepository extends JpaRepository<GrupoApoderadoEntity, Long> {
}
