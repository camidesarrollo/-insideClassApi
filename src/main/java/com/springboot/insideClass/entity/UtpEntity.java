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
    PersonaEntity persona;

    @ManyToOne(optional = false)
    @JoinColumn(name = "utp_establecimiento_id", nullable = false)
    EstablecimientoEntity establecimiento;

    public UtpEntity() {
    }

    public UtpEntity(PersonaEntity persona, EstablecimientoEntity establecimiento) {
        this.persona = persona;
        this.establecimiento = establecimiento;
    }

    public Long getUtp_id() {
        return utp_id;
    }

    public void setUtp_id(Long utp_id) {
        this.utp_id = utp_id;
    }

    public PersonaEntity getPersona() {
        return persona;
    }

    public void setPersona(PersonaEntity persona) {
        this.persona = persona;
    }

    public EstablecimientoEntity getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(EstablecimientoEntity establecimiento) {
        this.establecimiento = establecimiento;
    }
}
