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
    @JoinColumn(name = "anotaciones_matricula_id")
    MatriculaEntity matriculaEntity;

    @ManyToOne
    @JoinColumn(name = "anotaciones_dace_id")
    Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimientoEntity;

    Date fecha;

    String descripcion;

    String gravedad;

    public AnotacionesEntity() {

    }

    public Long getAnotaciones_id() {
        return anotaciones_id;
    }

    public void setAnotaciones_id(Long anotaciones_id) {
        this.anotaciones_id = anotaciones_id;
    }

    public MatriculaEntity getMatriculaEntity() {
        return matriculaEntity;
    }

    public void setMatriculaEntity(MatriculaEntity matriculaEntity) {
        this.matriculaEntity = matriculaEntity;
    }

    public Docente_Asignatura_Curso_EstablecimientoEntity getDocente_asignatura_curso_establecimientoEntity() {
        return docente_asignatura_curso_establecimientoEntity;
    }

    public void setDocente_asignatura_curso_establecimientoEntity(Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimientoEntity) {
        this.docente_asignatura_curso_establecimientoEntity = docente_asignatura_curso_establecimientoEntity;
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

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }
}
