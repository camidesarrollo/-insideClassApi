package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_UTP", uniqueConstraints = {@UniqueConstraint(columnNames =  "utp_id")})
public class UtpEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long utp_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "utp_persona_id", nullable = false)
    PersonaEntity personaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "utp_establecimiento_id", nullable = false)
    EstablecimientoEntity establecimientoEntity;

    public UtpEntity() {
    }

    public UtpEntity(PersonaEntity personaEntity, EstablecimientoEntity establecimientoEntity) {
        this.personaEntity = personaEntity;
        this.establecimientoEntity = establecimientoEntity;
    }

    public Long getUtp_id() {
        return utp_id;
    }

    public void setUtp_id(Long utp_id) {
        this.utp_id = utp_id;
    }

    public void setPersonaEntity(PersonaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public void setEstablecimientoEntity(EstablecimientoEntity establecimientoEntity) {
        this.establecimientoEntity = establecimientoEntity;
    }
}
