package com.springboot.insideClass.entity;


import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


@Entity
@Table(name = "T_DOCENTE_CURSO", uniqueConstraints = {@UniqueConstraint(columnNames =  "docente_curso_id")})
public class DocenteCursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long docente_curso_id;

    Date docente_curso_fecha_inicio;

    Date docente_cuso_fecha_fin;
    Boolean docente_jefe;

    @ManyToOne(optional = false)
    @JoinColumn(name = " docente_curso_docente_id", nullable = false)
    DocenteEntity docenteEntity;
    @ManyToOne(optional = false)
    @JoinColumn(name = " docente_curso_establ_id", nullable = false)
    CursoEstablecimientoEntity cursoEstablecimientoEntity;

    public DocenteCursoEntity() {
    }

    public DocenteCursoEntity(Date docente_curso_fecha_inicio, Date docente_cuso_fecha_fin,  Boolean docente_jefe, DocenteEntity docenteEntity, CursoEstablecimientoEntity cursoEstablecimientoEntity) {
        this.docente_curso_fecha_inicio = docente_curso_fecha_inicio;
        this.docente_cuso_fecha_fin = docente_cuso_fecha_fin;
        this.docente_jefe = docente_jefe;
        this.docenteEntity = docenteEntity;
        this.cursoEstablecimientoEntity = cursoEstablecimientoEntity;
    }

    public Long getDocente_curso_id() {
        return docente_curso_id;
    }

    public void setDocente_curso_id(Long docente_curso_id) {
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

    public DocenteEntity getDocenteEntity() {
        return docenteEntity;
    }

    public void setDocenteEntity(DocenteEntity docenteEntity) {
        this.docenteEntity = docenteEntity;
    }

    public CursoEstablecimientoEntity getCursoEstablecimientoEntity() {
        return cursoEstablecimientoEntity;
    }

    public void setCursoEstablecimientoEntity(CursoEstablecimientoEntity cursoEstablecimientoEntity) {
        this.cursoEstablecimientoEntity = cursoEstablecimientoEntity;
    }
    public Boolean getDocente_jefe() {
        return docente_jefe;
    }

    public void setDocente_jefe(Boolean docente_jefe) {
        this.docente_jefe = docente_jefe;
    }

}
