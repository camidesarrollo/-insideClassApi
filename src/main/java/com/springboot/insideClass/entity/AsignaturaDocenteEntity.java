package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_ASIGNATURA_DOCENTE", uniqueConstraints = {@UniqueConstraint(columnNames =  "asignatura_doc_id")})
public class AsignaturaDocenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long asignatura_doc_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "asignatura_doc_asignatura_id", nullable = false)
    AsignaturaEntity asignaturaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = " asignatura_doc_docente_establ_id", nullable = false)
    DocenteCursoEntity docenteCursoEntity;


    Date asignatura_doc_inicio;

    Date asignatura_doc_fin;


    public AsignaturaDocenteEntity() {
    }

    public AsignaturaDocenteEntity(Date asignatura_doc_inicio, Date asignatura_doc_fin, AsignaturaEntity asignaturaEntity, DocenteCursoEntity docenteCursoEntity) {
        this.asignatura_doc_inicio = asignatura_doc_inicio;
        this.asignatura_doc_fin = asignatura_doc_fin;
        this.asignaturaEntity = asignaturaEntity;
        this.docenteCursoEntity = docenteCursoEntity;
    }

    public Long getAsignatura_doc_id() {
        return asignatura_doc_id;
    }

    public void setAsignatura_doc_id(Long asignatura_doc_id) {
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

    public AsignaturaEntity getAsignaturaEntity() {
        return asignaturaEntity;
    }

    public void setAsignaturaEntity(AsignaturaEntity asignaturaEntity) {
        this.asignaturaEntity = asignaturaEntity;
    }

    public void setDocenteCursoEntity(DocenteCursoEntity docenteCursoEntity) {
        this.docenteCursoEntity = docenteCursoEntity;
    }

    public DocenteCursoEntity getDocenteCursoEntity() {
        return docenteCursoEntity;
    }
}
