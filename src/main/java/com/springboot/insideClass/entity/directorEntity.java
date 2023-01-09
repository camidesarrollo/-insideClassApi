package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_DIRECTOR", uniqueConstraints = {@UniqueConstraint(columnNames =  "director_id")})
public class directorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer director_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "director_persona_id", nullable = false)
    personaEntity personaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "director_establ_id", nullable = false)
    establecimientoEntity establecimientoEntity;

    public directorEntity() {
    }

    public directorEntity(com.springboot.insideClass.entity.personaEntity personaEntity, com.springboot.insideClass.entity.establecimientoEntity establecimientoEntity) {
        this.personaEntity = personaEntity;
        this.establecimientoEntity = establecimientoEntity;
    }

    public Integer getDirector_id() {
        return director_id;
    }

    public void setDirector_id(Integer director_id) {
        this.director_id = director_id;
    }


    public void setPersonaEntity(com.springboot.insideClass.entity.personaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public void setEstablecimientoEntity(com.springboot.insideClass.entity.establecimientoEntity establecimientoEntity) {
        this.establecimientoEntity = establecimientoEntity;
    }
}
