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

    Boolean vigencia;

    public DocenteEntity() {
    }

    public DocenteEntity(PersonaEntity persona, Boolean vigencia) {
        this.persona = persona;
        this.vigencia = vigencia;
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

    public Boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(Boolean vigencia) {
        this.vigencia = vigencia;
    }
}
