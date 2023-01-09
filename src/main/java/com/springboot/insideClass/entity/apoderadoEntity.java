package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_APODERADO", uniqueConstraints = {@UniqueConstraint(columnNames =  "apoderado_id")})
public class apoderadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer apoderado_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "alumno_persona_rut", nullable = false)
    personaEntity personaEntity;


    public apoderadoEntity() {
    }

    public apoderadoEntity(com.springboot.insideClass.entity.personaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public Integer getApoderado_id() {
        return apoderado_id;
    }

    public void setApoderado_id(Integer apoderado_id) {
        this.apoderado_id = apoderado_id;
    }

    public void setPersonaEntity(com.springboot.insideClass.entity.personaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }
}
