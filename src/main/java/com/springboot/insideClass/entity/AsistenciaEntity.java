package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_ASISTENCIA", uniqueConstraints = {@UniqueConstraint(columnNames =  "asistencia_id")})
public class AsistenciaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long asistencia_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "asistencia_matricula_id", nullable = false)
    MatriculaEntity matriculaEntity;

    Date fecha;

    public AsistenciaEntity() {
    }

    public AsistenciaEntity(MatriculaEntity matriculaEntity, Date fecha) {
        this.matriculaEntity = matriculaEntity;
        this.fecha = fecha;
    }

    public Long getAsistencia_id() {
        return asistencia_id;
    }

    public void setAsistencia_id(Long asistencia_id) {
        this.asistencia_id = asistencia_id;
    }

    public MatriculaEntity getMatriculaEntity() {
        return matriculaEntity;
    }

    public void setMatriculaEntity(MatriculaEntity matriculaEntity) {
        this.matriculaEntity = matriculaEntity;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
