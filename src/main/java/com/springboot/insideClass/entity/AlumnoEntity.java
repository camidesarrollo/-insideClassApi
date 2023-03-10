package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_ALUMNO", uniqueConstraints = {@UniqueConstraint(columnNames =  "alumno_id")})
public class AlumnoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long alumno_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "alumno_persona_run", nullable = false)
    PersonaEntity personaEntity;

    public AlumnoEntity() {
    }

    public AlumnoEntity(PersonaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public Long getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(Long alumno_id) {
        this.alumno_id = alumno_id;
    }

    public void setPersonaEntity(PersonaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public PersonaEntity getPersonaEntity() {
        return personaEntity;
    }
}
