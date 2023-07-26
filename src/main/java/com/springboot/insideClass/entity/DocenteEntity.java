package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_DOCENTE", uniqueConstraints = {@UniqueConstraint(columnNames =  "docente_id")})
public class DocenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long docente_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "docente_persona_run", nullable = false, unique = true)
    PersonaEntity persona;

    public DocenteEntity() {
    }

    public DocenteEntity(PersonaEntity persona) {
        this.persona = persona;
    }

    public Long getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(Long docente_id) {
        this.docente_id = docente_id;
    }

    public PersonaEntity getPersona() {
        return persona;
    }

    public void setPersona(PersonaEntity persona) {
        this.persona = persona;
    }
}
