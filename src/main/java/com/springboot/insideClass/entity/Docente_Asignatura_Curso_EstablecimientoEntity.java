package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_DOCENTE_ASIGNATURA_CURSO_ESTABLECIMIENTO", uniqueConstraints = {@UniqueConstraint(columnNames =  "dace_id")})

public class Docente_Asignatura_Curso_EstablecimientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long dace_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "dace_docente_asignatura_id", nullable = false)
     DocenteAsignaturaEntity docenteAsignaturaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "dace_curso_establecimiento_id", nullable = false)
    CursoEstablecimientoEntity cursoEstablecimientoEntity;

    Date fecha_inicio;

    Date fecha_fin;

    Boolean profesorJefe;

    public Docente_Asignatura_Curso_EstablecimientoEntity() {
    }

    public Docente_Asignatura_Curso_EstablecimientoEntity(DocenteAsignaturaEntity docenteAsignaturaEntity, CursoEstablecimientoEntity cursoEstablecimientoEntity, Date fecha_inicio, Date fecha_fin, Boolean profesorJefe) {
        this.docenteAsignaturaEntity = docenteAsignaturaEntity;
        this.cursoEstablecimientoEntity = cursoEstablecimientoEntity;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.profesorJefe = profesorJefe;
    }

    public Long getDace_id() {
        return dace_id;
    }

    public void setDace_id(Long dace_id) {
        this.dace_id = dace_id;
    }

    public DocenteAsignaturaEntity getDocenteAsignaturaEntity() {
        return docenteAsignaturaEntity;
    }

    public void setDocenteAsignaturaEntity(DocenteAsignaturaEntity docenteAsignaturaEntity) {
        this.docenteAsignaturaEntity = docenteAsignaturaEntity;
    }

    public CursoEstablecimientoEntity getCursoEstablecimientoEntity() {
        return cursoEstablecimientoEntity;
    }

    public void setCursoEstablecimientoEntity(CursoEstablecimientoEntity cursoEstablecimientoEntity) {
        this.cursoEstablecimientoEntity = cursoEstablecimientoEntity;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Boolean getProfesorJefe() {
        return profesorJefe;
    }

    public void setProfesorJefe(Boolean profesorJefe) {
        this.profesorJefe = profesorJefe;
    }
}
