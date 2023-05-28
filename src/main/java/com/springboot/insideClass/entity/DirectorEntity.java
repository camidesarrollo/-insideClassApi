package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_DIRECTOR", uniqueConstraints = {@UniqueConstraint(columnNames =  "director_id")})
public class DirectorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long director_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "director_persona_run", nullable = false)
    PersonaEntity personaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "director_establ_id", nullable = false)
    EstablecimientoEntity establecimientoEntity;

    public DirectorEntity() {
    }


    public Long getDirector_id() {
        return director_id;
    }

    public void setDirector_id(Long director_id) {
        this.director_id = director_id;
    }

    public PersonaEntity getPersonaEntity() {
        return personaEntity;
    }

    public void setPersonaEntity(PersonaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public EstablecimientoEntity getEstablecimientoEntity() {
        return establecimientoEntity;
    }

    public void setEstablecimientoEntity(EstablecimientoEntity establecimientoEntity) {
        this.establecimientoEntity = establecimientoEntity;
    }
}
