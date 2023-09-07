package com.springboot.insideClass.payload.request.Mensajeria;

import java.time.LocalDateTime;

public class MensajeRequest {
    Long mensajeId;

    String contenido;

    LocalDateTime fechaEnvio;

    String r_persona_run;

    Long  grupo;

    String d_persona_run;

    Long groupMensaje;

    public MensajeRequest(Long mensajeId, String contenido, LocalDateTime fechaEnvio, String r_persona_run, Long grupo, String d_persona_run, Long groupMensaje) {
        this.mensajeId = mensajeId;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
        this.r_persona_run = r_persona_run;
        this.grupo = grupo;
        this.d_persona_run = d_persona_run;
        this.groupMensaje = groupMensaje;
    }

    public Long getGroupMensaje() {
        return groupMensaje;
    }

    public void setGroupMensaje(Long groupMensaje) {
        this.groupMensaje = groupMensaje;
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

    public String getR_persona_run() {
        return r_persona_run;
    }

    public void setR_persona_run(String r_persona_run) {
        this.r_persona_run = r_persona_run;
    }

    public Long getGrupo() {
        return grupo;
    }

    public void setGrupo(Long grupo) {
        this.grupo = grupo;
    }

    public String getD_persona_run() {
        return d_persona_run;
    }

    public void setD_persona_run(String d_persona_run) {
        this.d_persona_run = d_persona_run;
    }
}
