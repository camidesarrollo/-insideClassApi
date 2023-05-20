package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_ANOTACIONES", uniqueConstraints = {@UniqueConstraint(columnNames =  "ANOTACIONES_ID")})
public class AnotacionesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long anotaciones_id;

    @ManyToOne
    @JoinColumn(name = "matricula_id")
    MatriculaEntity matriculaEntity;

    @ManyToOne
    @JoinColumn(name = "asignatura_docente_id")
    AsignaturaDocenteEntity asignaturaDocenteEntity;

    Date fecha;

    String descripcion;

    String gravedad;

    public AnotacionesEntity() {

    }

    public MatriculaEntity getMatriculaEntity() {
        return matriculaEntity;
    }

    public void setMatriculaEntity(MatriculaEntity matriculaEntity) {
        this.matriculaEntity = matriculaEntity;
    }

    public AsignaturaDocenteEntity getAsignaturaDocenteEntity() {
        return asignaturaDocenteEntity;
    }

    public void setAsignaturaDocenteEntity(AsignaturaDocenteEntity asignaturaDocenteEntity) {
        this.asignaturaDocenteEntity = asignaturaDocenteEntity;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getAnotaciones_id() {
        return anotaciones_id;
    }

    public void setAnotaciones_id(Long anotaciones_id) {
        this.anotaciones_id = anotaciones_id;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }
}
