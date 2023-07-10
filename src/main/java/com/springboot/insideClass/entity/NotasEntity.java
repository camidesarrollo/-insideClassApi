package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_DACE_NOTAS", uniqueConstraints = {@UniqueConstraint(columnNames =  "dace_notas_id")})
public class NotasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long dace_notas_id;

    @ManyToOne
    @JoinColumn(name = "notas_matricula_id")
    MatriculaEntity matriculaEntity;

    @ManyToOne
    @JoinColumn(name = "notas_dace_id")
    Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimientoEntity;

    Date notas_fecha;

    int notas_posicion;

    int nota;

    int promedio;

    public Long getDace_notas_id() {
        return dace_notas_id;
    }

    public void setDace_notas_id(Long dace_notas_id) {
        this.dace_notas_id = dace_notas_id;
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

    public Date getNotas_fecha() {
        return notas_fecha;
    }

    public void setNotas_fecha(Date notas_fecha) {
        this.notas_fecha = notas_fecha;
    }

    public int getNotas_posicion() {
        return notas_posicion;
    }

    public void setNotas_posicion(int notas_posicion) {
        this.notas_posicion = notas_posicion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
}
