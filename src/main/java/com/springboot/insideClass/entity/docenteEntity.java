package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_DOCENTE", uniqueConstraints = {@UniqueConstraint(columnNames =  "docente_id")})
public class docenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer docente_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "docente_persona_rut", nullable = false)
    personaEntity personaEntity;

    public docenteEntity() {
    }

    public docenteEntity(com.springboot.insideClass.entity.personaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public Integer getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(Integer docente_id) {
        this.docente_id = docente_id;
    }

    public void setPersonaEntity(com.springboot.insideClass.entity.personaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }
}
