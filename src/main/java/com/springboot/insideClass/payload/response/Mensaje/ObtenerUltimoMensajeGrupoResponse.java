package com.springboot.insideClass.payload.response.Mensaje;

import java.sql.Timestamp;

public class ObtenerUltimoMensajeGrupoResponse {
    String nombre_grupo;
    String ultimo_mensaje;
    Timestamp fecha_envio;

    public String getNombre_grupo() {
        return nombre_grupo;
    }

    public void setNombre_grupo(String nombre_grupo) {
        this.nombre_grupo = nombre_grupo;
    }

    public String getUltimo_mensaje() {
        return ultimo_mensaje;
    }

    public void setUltimo_mensaje(String ultimo_mensaje) {
        this.ultimo_mensaje = ultimo_mensaje;
    }

    public Timestamp getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(Timestamp fecha_envio) {
        this.fecha_envio = fecha_envio;
    }
}
