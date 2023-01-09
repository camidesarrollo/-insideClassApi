package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "T_ASIGNATURA_DOCENTE", uniqueConstraints = {@UniqueConstraint(columnNames =  "asignatura_doc_id")})
public class asignaturaDocenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer asignatura_doc_id;

    Date asignatura_doc_inicio;

    Date asignatura_doc_fin;

    @ManyToOne(optional = false)
    @JoinColumn(name = "asignatura_doc_asignatura_id", nullable = false)
    asignaturaEntity asignaturaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = " asignatura_doc_docente_establ_id", nullable = false)
    docenteCursoEntity docenteCursoEntity;

    public asignaturaDocenteEntity() {
    }

    public asignaturaDocenteEntity(Date asignatura_doc_inicio, Date asignatura_doc_fin, com.springboot.insideClass.entity.asignaturaEntity asignaturaEntity, com.springboot.insideClass.entity.docenteCursoEntity docenteCursoEntity) {
        this.asignatura_doc_inicio = asignatura_doc_inicio;
        this.asignatura_doc_fin = asignatura_doc_fin;
        this.asignaturaEntity = asignaturaEntity;
        this.docenteCursoEntity = docenteCursoEntity;
    }

    public Integer getAsignatura_doc_id() {
        return asignatura_doc_id;
    }

    public void setAsignatura_doc_id(Integer asignatura_doc_id) {
        this.asignatura_doc_id = asignatura_doc_id;
    }

    public Date getAsignatura_doc_inicio() {
        return asignatura_doc_inicio;
    }

    public void setAsignatura_doc_inicio(Date asignatura_doc_inicio) {
        this.asignatura_doc_inicio = asignatura_doc_inicio;
    }

    public Date getAsignatura_doc_fin() {
        return asignatura_doc_fin;
    }

    public void setAsignatura_doc_fin(Date asignatura_doc_fin) {
        this.asignatura_doc_fin = asignatura_doc_fin;
    }

    public com.springboot.insideClass.entity.asignaturaEntity getAsignaturaEntity() {
        return asignaturaEntity;
    }

    public void setAsignaturaEntity(com.springboot.insideClass.entity.asignaturaEntity asignaturaEntity) {
        this.asignaturaEntity = asignaturaEntity;
    }

    public void setDocenteCursoEntity(com.springboot.insideClass.entity.docenteCursoEntity docenteCursoEntity) {
        this.docenteCursoEntity = docenteCursoEntity;
    }
}
