package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_REPRESENTANTE_LEGAL", uniqueConstraints = {@UniqueConstraint(columnNames =  "representante_legal_id")})
public class RepresentanteLegalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long representante_legal_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "representante_legal_persona_run", nullable = false)
    PersonaEntity persona;

    public RepresentanteLegalEntity() {
    }

    public RepresentanteLegalEntity(PersonaEntity persona) {
        this.persona = persona;
    }

    public Long getRepresentante_legal_id() {
        return representante_legal_id;
    }

    public void setRepresentante_legal_id(Long representante_legal_id) {
        this.representante_legal_id = representante_legal_id;
    }

    public PersonaEntity getPersona() {
        return persona;
    }

    public void setPersona(PersonaEntity persona) {
        this.persona = persona;
    }
}
