package com.springboot.insideClass.entity;

import javax.persistence.*;
@Entity
@Table(name = "t_miembroGrupo", uniqueConstraints = {@UniqueConstraint(columnNames =  "miembro_id")})
public class MiembroGrupoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "miembro_id")
    private Long miembroId;

    @ManyToOne
    @JoinColumn(name = "grupo_id", referencedColumnName = "grupo_id")
    private GrupoEntity grupo;

    @ManyToOne
    @JoinColumn(name = "persona_run", referencedColumnName = "persona_run")
    private PersonaEntity persona_run;

    public Long getMiembroId() {
        return miembroId;
    }

    public void setMiembroId(Long miembroId) {
        this.miembroId = miembroId;
    }

    public GrupoEntity getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoEntity grupo) {
        this.grupo = grupo;
    }

    public PersonaEntity getPersona_run() {
        return persona_run;
    }

    public void setPersona_run(PersonaEntity persona_run) {
        this.persona_run = persona_run;
    }
}
