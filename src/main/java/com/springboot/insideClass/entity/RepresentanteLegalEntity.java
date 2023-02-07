package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_REP_LEGAL", uniqueConstraints = {@UniqueConstraint(columnNames =  "rep_legal_id")})
public class RepresentanteLegalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long rep_legal_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "rep_legal_persona_run", nullable = false)
    PersonaEntity personaEntity;

    public RepresentanteLegalEntity() {
    }

    public RepresentanteLegalEntity(PersonaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public Long getRep_legal_id() {
        return rep_legal_id;
    }

    public void setRep_legal_id(Long rep_legal_id) {
        this.rep_legal_id = rep_legal_id;
    }

    public void setPersonaEntity(PersonaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }
}
