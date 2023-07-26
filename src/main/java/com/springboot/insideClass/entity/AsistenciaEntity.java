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
    MatriculaEntity matricula;

    Date fecha;

    public AsistenciaEntity() {
    }

    public AsistenciaEntity(MatriculaEntity matricula, Date fecha) {
        this.matricula = matricula;
        this.fecha = fecha;
    }

    public Long getAsistencia_id() {
        return asistencia_id;
    }

    public void setAsistencia_id(Long asistencia_id) {
        this.asistencia_id = asistencia_id;
    }

    public MatriculaEntity getMatricula() {
        return matricula;
    }

    public void setMatricula(MatriculaEntity matricula) {
        this.matricula = matricula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
