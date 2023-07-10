package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "T_COMUNICACIONES", uniqueConstraints = {@UniqueConstraint(columnNames =  "comunicaciones_id")})
public class ComunicacionesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long comunicaciones_id;
    Date comunicaciones_fecha;
    String comunicaciones_tipo;
    String comunicaciones_descripcion;

    @ManyToOne
    @JoinColumn(name = "comunicaciones_dace_id")
    Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimientoEntity;

    @ManyToOne
    @JoinColumn(name = "comunicaciones_matricula_id")
    MatriculaEntity matricula;

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

    public Docente_Asignatura_Curso_EstablecimientoEntity getDocente_asignatura_curso_establecimientoEntity() {
        return docente_asignatura_curso_establecimientoEntity;
    }

    public void setDocente_asignatura_curso_establecimientoEntity(Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimientoEntity) {
        this.docente_asignatura_curso_establecimientoEntity = docente_asignatura_curso_establecimientoEntity;
    }

    public MatriculaEntity getMatricula() {
        return matricula;
    }

    public void setMatricula(MatriculaEntity matricula) {
        this.matricula = matricula;
    }
}
