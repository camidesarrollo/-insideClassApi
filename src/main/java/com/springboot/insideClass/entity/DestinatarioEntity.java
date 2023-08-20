package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_destinatario", uniqueConstraints = {@UniqueConstraint(columnNames =  "destinatario_id")})
public class DestinatarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "destinatario_id")
    private Long destinatarioId;

    @ManyToOne
    @JoinColumn(name = "mensaje_id", referencedColumnName = "mensaje_id")
    private MensajeEntity mensaje;

    @ManyToOne
    @JoinColumn(name = "persona_run", referencedColumnName = "persona_run")
    private PersonaEntity persona_run;

    public DestinatarioEntity(MensajeEntity mensaje, PersonaEntity persona_run) {
        this.mensaje = mensaje;
        this.persona_run = persona_run;
    }

    public Long getDestinatarioId() {
        return destinatarioId;
    }

    public void setDestinatarioId(Long destinatarioId) {
        this.destinatarioId = destinatarioId;
    }

    public MensajeEntity getMensaje() {
        return mensaje;
    }

    public void setMensaje(MensajeEntity mensaje) {
        this.mensaje = mensaje;
    }

    public PersonaEntity getPersona_run() {
        return persona_run;
    }

    public void setPersona_run(PersonaEntity persona_run) {
        this.persona_run = persona_run;
    }
}
