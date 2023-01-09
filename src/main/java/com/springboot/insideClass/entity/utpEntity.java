package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_UTP", uniqueConstraints = {@UniqueConstraint(columnNames =  "utp_id")})
public class utpEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer utp_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "utp_persona_id", nullable = false)
    personaEntity personaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "utp_establ_id", nullable = false)
    establecimientoEntity establecimientoEntity;

    public utpEntity() {
    }

    public utpEntity(com.springboot.insideClass.entity.personaEntity personaEntity, com.springboot.insideClass.entity.establecimientoEntity establecimientoEntity) {
        this.personaEntity = personaEntity;
        this.establecimientoEntity = establecimientoEntity;
    }

    public Integer getUtp_id() {
        return utp_id;
    }

    public void setUtp_id(Integer utp_id) {
        this.utp_id = utp_id;
    }

    public void setPersonaEntity(com.springboot.insideClass.entity.personaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public void setEstablecimientoEntity(com.springboot.insideClass.entity.establecimientoEntity establecimientoEntity) {
        this.establecimientoEntity = establecimientoEntity;
    }
}
