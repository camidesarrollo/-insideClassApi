package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "T_DOCENTE_CURSO", uniqueConstraints = {@UniqueConstraint(columnNames =  "docente_curso_id")})
public class docenteCursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer docente_curso_id;

    Date docente_curso_fecha_inicio;

    Date docente_cuso_fecha_fin;

    @ManyToOne(optional = false)
    @JoinColumn(name = " docente_curso_docente_id", nullable = false)
    docenteEntity docenteEntity;
    @ManyToOne(optional = false)
    @JoinColumn(name = " docente_curso_establ_id", nullable = false)
    cursoEstablecimientoEntity cursoEstablecimientoEntity;

    public docenteCursoEntity() {
    }

    public docenteCursoEntity(Date docente_curso_fecha_inicio, Date docente_cuso_fecha_fin, com.springboot.insideClass.entity.docenteEntity docenteEntity, com.springboot.insideClass.entity.cursoEstablecimientoEntity cursoEstablecimientoEntity) {
        this.docente_curso_fecha_inicio = docente_curso_fecha_inicio;
        this.docente_cuso_fecha_fin = docente_cuso_fecha_fin;
        this.docenteEntity = docenteEntity;
        this.cursoEstablecimientoEntity = cursoEstablecimientoEntity;
    }

    public Integer getDocente_curso_id() {
        return docente_curso_id;
    }

    public void setDocente_curso_id(Integer docente_curso_id) {
        this.docente_curso_id = docente_curso_id;
    }

    public Date getDocente_curso_fecha_inicio() {
        return docente_curso_fecha_inicio;
    }

    public void setDocente_curso_fecha_inicio(Date docente_curso_fecha_inicio) {
        this.docente_curso_fecha_inicio = docente_curso_fecha_inicio;
    }

    public Date getDocente_cuso_fecha_fin() {
        return docente_cuso_fecha_fin;
    }

    public void setDocente_cuso_fecha_fin(Date docente_cuso_fecha_fin) {
        this.docente_cuso_fecha_fin = docente_cuso_fecha_fin;
    }

    public void setDocenteEntity(com.springboot.insideClass.entity.docenteEntity docenteEntity) {
        this.docenteEntity = docenteEntity;
    }



    public void setCursoEstablecimientoEntity(com.springboot.insideClass.entity.cursoEstablecimientoEntity cursoEstablecimientoEntity) {
        this.cursoEstablecimientoEntity = cursoEstablecimientoEntity;
    }
}
