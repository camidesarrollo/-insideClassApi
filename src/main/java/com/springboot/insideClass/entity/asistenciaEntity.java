package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "T_ASISTENCIA", uniqueConstraints = {@UniqueConstraint(columnNames =  "asistencia_id")})
public class asistenciaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer asistencia_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "asistencia_matricula_id", nullable = false)
    matriculaEntity matriculaEntity;

    Date  fecha;

    public asistenciaEntity() {
    }

    public asistenciaEntity(com.springboot.insideClass.entity.matriculaEntity matriculaEntity, Date fecha) {
        this.matriculaEntity = matriculaEntity;
        this.fecha = fecha;
    }

    public Integer getAsistencia_id() {
        return asistencia_id;
    }

    public void setAsistencia_id(Integer asistencia_id) {
        this.asistencia_id = asistencia_id;
    }

    public void setMatriculaEntity(com.springboot.insideClass.entity.matriculaEntity matriculaEntity) {
        this.matriculaEntity = matriculaEntity;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
