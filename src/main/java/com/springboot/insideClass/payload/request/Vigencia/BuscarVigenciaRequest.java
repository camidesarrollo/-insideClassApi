package com.springboot.insideClass.payload.request.Vigencia;

public class BuscarVigenciaRequest {

    Long vigencia_id;

    String vigencia_nombre;

    public Long getVigencia_id() {
        return vigencia_id;
    }

    public void setVigencia_id(Long vigencia_id) {
        this.vigencia_id = vigencia_id;
    }

    public String getVigencia_nombre() {
        return vigencia_nombre;
    }

    public void setVigencia_nombre(String vigencia_nombre) {
        this.vigencia_nombre = vigencia_nombre;
    }
}
