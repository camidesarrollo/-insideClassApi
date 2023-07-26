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
    PersonaEntity persona;

    @ManyToOne(optional = false)
    @JoinColumn(name = "director_establecimiento_id", nullable = false)
    EstablecimientoEntity establecimiento;

    public DirectorEntity() {
    }

    public DirectorEntity(PersonaEntity persona, EstablecimientoEntity establecimiento) {
        this.persona = persona;
        this.establecimiento = establecimiento;
    }

    public Long getDirector_id() {
        return director_id;
    }

    public void setDirector_id(Long director_id) {
        this.director_id = director_id;
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
