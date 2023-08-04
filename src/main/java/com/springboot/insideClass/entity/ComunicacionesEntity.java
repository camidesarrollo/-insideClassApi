package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "T_COMUNICACIONES", uniqueConstraints = {@UniqueConstraint(columnNames =  "comunicaciones_id")})
public class ComunicacionesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long comunicaciones_id;

    String comunicaciones_titulo;

    Date comunicaciones_fecha;
    String comunicaciones_tipo;
    String comunicaciones_descripcion;

    Integer comunicaciones_correlativo;

    @ManyToOne
    @JoinColumn(name = "comunicaciones_dace_id")
    Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimiento;

    @ManyToOne
    @JoinColumn(name = "comunicaciones_matricula_id")
    MatriculaEntity matricula;


    public ComunicacionesEntity() {
    }

    public ComunicacionesEntity(String comunicaciones_titulo, Date comunicaciones_fecha, String comunicaciones_tipo, String comunicaciones_descripcion, Integer comunicaciones_correlativo, Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimiento, MatriculaEntity matricula) {
        this.comunicaciones_titulo = comunicaciones_titulo;
        this.comunicaciones_fecha = comunicaciones_fecha;
        this.comunicaciones_tipo = comunicaciones_tipo;
        this.comunicaciones_descripcion = comunicaciones_descripcion;
        this.comunicaciones_correlativo = comunicaciones_correlativo;
        this.docente_asignatura_curso_establecimiento = docente_asignatura_curso_establecimiento;
        this.matricula = matricula;
    }

    public Long getComunicaciones_id() {
        return comunicaciones_id;
    }

    public void setComunicaciones_id(Long comunicaciones_id) {
        this.comunicaciones_id = comunicaciones_id;
    }

    public Date getComunicaciones_fecha() {
        return comunicaciones_fecha;
    }

    public void setComunicaciones_fecha(Date comunicaciones_fecha) {
        this.comunicaciones_fecha = comunicaciones_fecha;
    }

    public String getComunicaciones_tipo() {
        return comunicaciones_tipo;
    }

    public void setComunicaciones_tipo(String comunicaciones_tipo) {
        this.comunicaciones_tipo = comunicaciones_tipo;
    }

    public String getComunicaciones_descripcion() {
        return comunicaciones_descripcion;
    }

    public void setComunicaciones_descripcion(String comunicaciones_descripcion) {
        this.comunicaciones_descripcion = comunicaciones_descripcion;
    }

    public Docente_Asignatura_Curso_EstablecimientoEntity getDocente_asignatura_curso_establecimiento() {
        return docente_asignatura_curso_establecimiento;
    }

    public void setDocente_asignatura_curso_establecimiento(Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimiento) {
        this.docente_asignatura_curso_establecimiento = docente_asignatura_curso_establecimiento;
    }

    public MatriculaEntity getMatricula() {
        return matricula;
    }

    public void setMatricula(MatriculaEntity matricula) {
        this.matricula = matricula;
    }

    public String getComunicaciones_titulo() {
        return comunicaciones_titulo;
    }

    public void setComunicaciones_titulo(String comunicaciones_titulo) {
        this.comunicaciones_titulo = comunicaciones_titulo;
    }

    public Integer getComunicaciones_correlativo() {
        return comunicaciones_correlativo;
    }

    public void setComunicaciones_correlativo(Integer comunicaciones_correlativo) {
        this.comunicaciones_correlativo = comunicaciones_correlativo;
    }
}
