package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_DOCENTE_ASIGNATURA", uniqueConstraints = {@UniqueConstraint(columnNames =  "docente_asignatura_id")})
public class DocenteAsignaturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long docente_asignatura_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "docente_asignatura_id_asignatura_id", nullable = false)
    AsignaturaEntity asignaturaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "docente_asignatura_docente_id", nullable = false)
    DocenteEntity docenteEntity;


    public DocenteAsignaturaEntity(AsignaturaEntity asignaturaEntity, DocenteEntity docenteEntity) {
        this.asignaturaEntity = asignaturaEntity;
        this.docenteEntity = docenteEntity;
    }

    public DocenteAsignaturaEntity() {
    }

    public Long getDocente_asignatura_id() {
        return docente_asignatura_id;
    }

    public void setDocente_asignatura_id(Long docente_asignatura_id) {
        this.docente_asignatura_id = docente_asignatura_id;
    }

    public AsignaturaEntity getAsignaturaEntity() {
        return asignaturaEntity;
    }

    public void setAsignaturaEntity(AsignaturaEntity asignaturaEntity) {
        this.asignaturaEntity = asignaturaEntity;
    }

    public DocenteEntity getDocenteEntity() {
        return docenteEntity;
    }

    public void setDocenteEntity(DocenteEntity docenteEntity) {
        this.docenteEntity = docenteEntity;
    }
}
