package com.springboot.insideClass.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_CURSO_ESTABLECIMIENTO", uniqueConstraints = {@UniqueConstraint(columnNames =  "curso_establecimiento_id")})
public class CursoEstablecimientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long curso_establecimiento_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "curso_establecimiento_curso_id", nullable = false)
    CursoEntity curso;

    @ManyToOne(optional = false)
    @JoinColumn(name = "curso_establecimiento_establecimiento_id", nullable = false)
    EstablecimientoEntity establecimiento;

    Boolean vigencia;

    Date fecha_ingreso;

    Date fecha_modificacion;
    public CursoEstablecimientoEntity() {
        // Constructor por defecto sin argumentos
    }


    public Long getCurso_establecimiento_id() {
        return curso_establecimiento_id;
    }

    public void setCurso_establecimiento_id(Long curso_establecimiento_id) {
        this.curso_establecimiento_id = curso_establecimiento_id;
    }

    public CursoEstablecimientoEntity(CursoEntity curso, EstablecimientoEntity establecimiento, Boolean vigencia, Date fecha_ingreso, Date fecha_modificacion) {
        this.curso = curso;
        this.establecimiento = establecimiento;
        this.vigencia = vigencia;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_modificacion = fecha_modificacion;
    }

    public CursoEntity getCurso() {
        return curso;
    }

    public void setCurso(CursoEntity curso) {
        this.curso = curso;
    }

    public EstablecimientoEntity getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(EstablecimientoEntity establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(Boolean vigencia) {
        this.vigencia = vigencia;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }
}
