package com.springboot.insideClass.payload.response.Comunicaciones;

import java.util.Date;

public class ComunicacionesResponse {
    Integer comunicaciones_correlativo;
    Date comunicaciones_fecha;
    String comunicaciones_titulo;
    String comunicaciones_tipo;
    String comunicaciones_descripcion;

    public Integer getComunicaciones_correlativo() {
        return comunicaciones_correlativo;
    }

    public void setComunicaciones_correlativo(Integer comunicaciones_correlativo) {
        this.comunicaciones_correlativo = comunicaciones_correlativo;
    }

    public Date getComunicaciones_fecha() {
        return comunicaciones_fecha;
    }

    public void setComunicaciones_fecha(Date comunicaciones_fecha) {
        this.comunicaciones_fecha = comunicaciones_fecha;
    }

    public String getComunicaciones_titulo() {
        return comunicaciones_titulo;
    }

    public void setComunicaciones_titulo(String comunicaciones_titulo) {
        this.comunicaciones_titulo = comunicaciones_titulo;
    }

    public String getComunicaciones_tipo() {
        return comunicaciones_tipo;
    }

    public void setComunicaciones_tipo(String comunicaciones_tipo) {
        this.comunicaciones_tipo = comunicaciones_tipo;
    }

    public String getComunicaciones_descripcion() {
        return comunicaciones_descripcion;
    }

    public void setComunicaciones_descripcion(String comunicaciones_descripcion) {
        this.comunicaciones_descripcion = comunicaciones_descripcion;
    }
}
