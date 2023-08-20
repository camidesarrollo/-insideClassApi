package com.springboot.insideClass.payload.response.Persona;

public class PersonaMensaje {
    String persona_run;
    String persona_nombre;
    String ultimo_mensaje;

    String destinatario;

    Integer cantidad_mensajes_vistos;

    public PersonaMensaje(String persona_run, String persona_nombre, String ultimo_mensaje, String destinatario, Integer cantidad_mensajes_vistos) {
        this.persona_run = persona_run;
        this.persona_nombre = persona_nombre;
        this.ultimo_mensaje = ultimo_mensaje;
        this.destinatario = destinatario;
        this.cantidad_mensajes_vistos = cantidad_mensajes_vistos;
    }

    public String getPersona_run() {
        return persona_run;
    }

    public void setPersona_run(String persona_run) {
        this.persona_run = persona_run;
    }

    public String getPersona_nombre() {
        return persona_nombre;
    }

    public void setPersona_nombre(String persona_nombre) {
        this.persona_nombre = persona_nombre;
    }

    public String getUltimo_mensaje() {
        return ultimo_mensaje;
    }

    public void setUltimo_mensaje(String ultimo_mensaje) {
        this.ultimo_mensaje = ultimo_mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Integer getCantidad_mensajes_vistos() {
        return cantidad_mensajes_vistos;
    }

    public void setCantidad_mensajes_vistos(Integer cantidad_mensajes_vistos) {
        this.cantidad_mensajes_vistos = cantidad_mensajes_vistos;
    }
}
