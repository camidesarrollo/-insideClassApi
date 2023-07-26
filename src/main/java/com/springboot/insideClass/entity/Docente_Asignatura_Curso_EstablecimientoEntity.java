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
     DocenteAsignaturaEntity docenteAsignatura;

    @ManyToOne(optional = false)
    @JoinColumn(name = "dace_curso_establecimiento_id", nullable = false)
    CursoEstablecimientoEntity cursoEstablecimiento;

    Date fecha_inicio;

    Date fecha_fin;

    Boolean profesorJefe;

    public Docente_Asignatura_Curso_EstablecimientoEntity() {
    }

    public Docente_Asignatura_Curso_EstablecimientoEntity(DocenteAsignaturaEntity docenteAsignatura, CursoEstablecimientoEntity cursoEstablecimiento, Date fecha_inicio, Date fecha_fin, Boolean profesorJefe) {
        this.docenteAsignatura = docenteAsignatura;
        this.cursoEstablecimiento = cursoEstablecimiento;
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

    public DocenteAsignaturaEntity getDocenteAsignatura() {
        return docenteAsignatura;
    }

    public void setDocenteAsignatura(DocenteAsignaturaEntity docenteAsignatura) {
        this.docenteAsignatura = docenteAsignatura;
    }

    public CursoEstablecimientoEntity getCursoEstablecimiento() {
        return cursoEstablecimiento;
    }

    public void setCursoEstablecimiento(CursoEstablecimientoEntity cursoEstablecimiento) {
        this.cursoEstablecimiento = cursoEstablecimiento;
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
