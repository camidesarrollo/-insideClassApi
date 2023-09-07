package com.springboot.insideClass.payload.response.Mensaje;

import java.util.Date;

public class ObtenerMensajeByRemitenteDestinatarioResponse {

    Long mensaje_id;

    Long groupMensaje;
    String contenido;
    Date fecha_envio;
    Long grupo_id;
    String r_persona_run;
    Long destinatario_id;
    Date fecha_visto;
    boolean visto;
    String d_persona_run;

    public ObtenerMensajeByRemitenteDestinatarioResponse(Long mensaje_id, Long groupMensaje, String contenido, Date fecha_envio, Long grupo_id, String r_persona_run, Long destinatario_id, Date fecha_visto, boolean visto, String d_persona_run) {
        this.mensaje_id = mensaje_id;
        this.groupMensaje = groupMensaje;
        this.contenido = contenido;
        this.fecha_envio = fecha_envio;
        this.grupo_id = grupo_id;
        this.r_persona_run = r_persona_run;
        this.destinatario_id = destinatario_id;
        this.fecha_visto = fecha_visto;
        this.visto = visto;
        this.d_persona_run = d_persona_run;
    }

    public Long getGroupMensaje() {
        return groupMensaje;
    }

    public void setGroupMensaje(Long groupMensaje) {
        this.groupMensaje = groupMensaje;
    }

    public Long getMensaje_id() {
        return mensaje_id;
    }

    public void setMensaje_id(Long mensaje_id) {
        this.mensaje_id = mensaje_id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(Date fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public Long getGrupo_id() {
        return grupo_id;
    }

    public void setGrupo_id(Long grupo_id) {
        this.grupo_id = grupo_id;
    }

    public String getR_persona_run() {
        return r_persona_run;
    }

    public void setR_persona_run(String r_persona_run) {
        this.r_persona_run = r_persona_run;
    }

    public Long getDestinatario_id() {
        return destinatario_id;
    }

    public void setDestinatario_id(Long destinatario_id) {
        this.destinatario_id = destinatario_id;
    }

    public Date getFecha_visto() {
        return fecha_visto;
    }

    public void setFecha_visto(Date fecha_visto) {
        this.fecha_visto = fecha_visto;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public String getD_persona_run() {
        return d_persona_run;
    }

    public void setD_persona_run(String d_persona_run) {
        this.d_persona_run = d_persona_run;
    }
}
