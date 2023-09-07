package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "T_Mensajeria", uniqueConstraints = {@UniqueConstraint(columnNames =  "mensaje_id")})
public class MensajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mensaje_id")
    private Long mensajeId;

    @Column(name = "groupMensaje_id")
    private Long groupMensaje;

    @Column(name = "contenido", columnDefinition = "nvarchar(max)", nullable = false)
    private String contenido;

    @Column(name = "fecha_envio", nullable = false)
    private LocalDateTime fechaEnvio;

    @ManyToOne
    @JoinColumn(name = "persona_run", referencedColumnName = "persona_run")
    private PersonaEntity persona_run;

    @ManyToOne
    @JoinColumn(name = "grupo_id", referencedColumnName = "grupo_id")
    private GrupoEntity grupo;

    public MensajeEntity(Long groupMensaje, String contenido, LocalDateTime fechaEnvio, PersonaEntity persona_run, GrupoEntity grupo) {
        this.groupMensaje = groupMensaje;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
        this.persona_run = persona_run;
        this.grupo = grupo;
    }

    public Long getMensajeId() {
        return mensajeId;
    }

    public void setMensajeId(Long mensajeId) {
        this.mensajeId = mensajeId;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public PersonaEntity getPersona_run() {
        return persona_run;
    }

    public void setPersona_run(PersonaEntity persona_run) {
        this.persona_run = persona_run;
    }

    public GrupoEntity getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoEntity grupo) {
        this.grupo = grupo;
    }

    public Long getGroupMensaje() {
        return groupMensaje;
    }

    public void setGroupMensaje(Long groupMensaje) {
        this.groupMensaje = groupMensaje;
    }
}
