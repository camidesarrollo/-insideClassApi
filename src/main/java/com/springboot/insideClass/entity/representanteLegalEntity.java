package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_REP_LEGAL", uniqueConstraints = {@UniqueConstraint(columnNames =  "rep_legal_id")})
public class representanteLegalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer rep_legal_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "rep_legal_persona_rut", nullable = false)
    personaEntity personaEntity;

    public representanteLegalEntity() {
    }

    public representanteLegalEntity(com.springboot.insideClass.entity.personaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public Integer getRep_legal_id() {
        return rep_legal_id;
    }

    public void setRep_legal_id(Integer rep_legal_id) {
        this.rep_legal_id = rep_legal_id;
    }

    public void setPersonaEntity(com.springboot.insideClass.entity.personaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }
}
