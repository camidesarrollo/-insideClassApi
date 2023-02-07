package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "T_PLANIFICACION_ASIGNATURA", uniqueConstraints = {@UniqueConstraint(columnNames =  "planificacion_id")})
public class PlanificacionAsignaturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long planificacion_id;

    Date planificacion_fecha_inicio;

    Date planificacion_fecha_fin;

    @ManyToOne(optional = false)
    @JoinColumn(name = "planificacion_asignatura_doc_id", nullable = false)
    AsignaturaDocenteEntity asignaturaDocenteEntity;

    public PlanificacionAsignaturaEntity() {
    }

    public PlanificacionAsignaturaEntity(Date planificacion_fecha_inicio, Date planificacion_fecha_fin, AsignaturaDocenteEntity asignaturaDocenteEntity) {
        this.planificacion_fecha_inicio = planificacion_fecha_inicio;
        this.planificacion_fecha_fin = planificacion_fecha_fin;
        this.asignaturaDocenteEntity = asignaturaDocenteEntity;
    }

    public Long getPlanificacion_id() {
        return planificacion_id;
    }

    public void setPlanificacion_id(Long planificacion_id) {
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

    public void setAsignaturaDocenteEntity(AsignaturaDocenteEntity asignaturaDocenteEntity) {
        this.asignaturaDocenteEntity = asignaturaDocenteEntity;
    }
}
