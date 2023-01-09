package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table(name = "T_PLANIFICACION_ASIGNATURA", uniqueConstraints = {@UniqueConstraint(columnNames =  "planificacion_id")})
public class planificacionAsignaturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer planificacion_id;

    Date planificacion_fecha_inicio;

    Date planificacion_fecha_fin;

    @ManyToOne(optional = false)
    @JoinColumn(name = "planificacion_asignatura_doc_id", nullable = false)
    asignaturaDocenteEntity asignaturaDocenteEntity;

    public planificacionAsignaturaEntity() {
    }

    public planificacionAsignaturaEntity(Date planificacion_fecha_inicio, Date planificacion_fecha_fin, com.springboot.insideClass.entity.asignaturaDocenteEntity asignaturaDocenteEntity) {
        this.planificacion_fecha_inicio = planificacion_fecha_inicio;
        this.planificacion_fecha_fin = planificacion_fecha_fin;
        this.asignaturaDocenteEntity = asignaturaDocenteEntity;
    }

    public Integer getPlanificacion_id() {
        return planificacion_id;
    }

    public void setPlanificacion_id(Integer planificacion_id) {
        this.planificacion_id = planificacion_id;
    }

    public Date getPlanificacion_fecha_inicio() {
        return planificacion_fecha_inicio;
    }

    public void setPlanificacion_fecha_inicio(Date planificacion_fecha_inicio) {
        this.planificacion_fecha_inicio = planificacion_fecha_inicio;
    }

    public Date getPlanificacion_fecha_fin() {
        return planificacion_fecha_fin;
    }

    public void setPlanificacion_fecha_fin(Date planificacion_fecha_fin) {
        this.planificacion_fecha_fin = planificacion_fecha_fin;
    }

    public void setAsignaturaDocenteEntity(com.springboot.insideClass.entity.asignaturaDocenteEntity asignaturaDocenteEntity) {
        this.asignaturaDocenteEntity = asignaturaDocenteEntity;
    }
}
