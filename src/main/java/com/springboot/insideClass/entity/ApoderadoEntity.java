package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_APODERADO", uniqueConstraints = {@UniqueConstraint(columnNames =  "apoderado_id")})
public class ApoderadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long apoderado_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "apoderado_persona_run", nullable = false, unique = true)
    PersonaEntity personaEntity;

    public ApoderadoEntity() {
    }

    public ApoderadoEntity(PersonaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public Long getApoderado_id() {
        return apoderado_id;
    }

    public void setApoderado_id(Long apoderado_id) {
        this.apoderado_id = apoderado_id;
    }

    public PersonaEntity getPersonaEntity() {
        return personaEntity;
    }

    public void setPersonaEntity(PersonaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }
}
