package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_ALUMNO", uniqueConstraints = {@UniqueConstraint(columnNames =  "alumno_id")})
public class alumnoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer alumno_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "alumno_persona_rut", nullable = false)
    personaEntity personaEntity;

    public alumnoEntity() {
    }

    public alumnoEntity(com.springboot.insideClass.entity.personaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public Integer getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(Integer alumno_id) {
        this.alumno_id = alumno_id;
    }

    public void setPersonaEntity(com.springboot.insideClass.entity.personaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }
}
