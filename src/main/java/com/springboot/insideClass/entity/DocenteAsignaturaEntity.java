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
    AsignaturaEntity asignatura;

    @ManyToOne(optional = false)
    @JoinColumn(name = "docente_asignatura_docente_id", nullable = false)
    DocenteEntity docente;

    public DocenteAsignaturaEntity() {
    }

    public DocenteAsignaturaEntity(AsignaturaEntity asignatura, DocenteEntity docente) {
        this.asignatura = asignatura;
        this.docente = docente;
    }

    public Long getDocente_asignatura_id() {
        return docente_asignatura_id;
    }

    public void setDocente_asignatura_id(Long docente_asignatura_id) {
        this.docente_asignatura_id = docente_asignatura_id;
    }

    public AsignaturaEntity getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(AsignaturaEntity asignatura) {
        this.asignatura = asignatura;
    }

    public DocenteEntity getDocente() {
        return docente;
    }

    public void setDocente(DocenteEntity docente) {
        this.docente = docente;
    }
}
