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
    MatriculaEntity matricula;

    @ManyToOne
    @JoinColumn(name = "anotaciones_dace_id")
    Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimiento;

    Date fecha;

    String descripcion;

    String gravedad;

    public AnotacionesEntity() {

    }

    public AnotacionesEntity(MatriculaEntity matricula, Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimiento, Date fecha, String descripcion, String gravedad) {
        this.matricula = matricula;
        this.docente_asignatura_curso_establecimiento = docente_asignatura_curso_establecimiento;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.gravedad = gravedad;
    }

    public Long getAnotaciones_id() {
        return anotaciones_id;
    }

    public void setAnotaciones_id(Long anotaciones_id) {
        this.anotaciones_id = anotaciones_id;
    }

    public MatriculaEntity getMatricula() {
        return matricula;
    }

    public void setMatricula(MatriculaEntity matricula) {
        this.matricula = matricula;
    }

    public Docente_Asignatura_Curso_EstablecimientoEntity getDocente_asignatura_curso_establecimiento() {
        return docente_asignatura_curso_establecimiento;
    }

    public void setDocente_asignatura_curso_establecimiento(Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimiento) {
        this.docente_asignatura_curso_establecimiento = docente_asignatura_curso_establecimiento;
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
