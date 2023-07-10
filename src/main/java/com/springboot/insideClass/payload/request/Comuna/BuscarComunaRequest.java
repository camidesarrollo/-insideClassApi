package com.springboot.insideClass.payload.request.Comuna;

public class BuscarComunaRequest {

    Long comuna_id;
    String comuna_nombre;
    Long comuna_provincia_id;
    Long comuna_deprov_id;

    public Long getComuna_id() {
        return comuna_id;
    }

    public void setComuna_id(Long comuna_id) {
        this.comuna_id = comuna_id;
    }

    public String getComuna_nombre() {
        return comuna_nombre;
    }

    public void setComuna_nombre(String comuna_nombre) {
        this.comuna_nombre = comuna_nombre;
    }

    public Long getComuna_provincia_id() {
        return comuna_provincia_id;
    }

    public void setComuna_provincia_id(Long comuna_provincia_id) {
        this.comuna_provincia_id = comuna_provincia_id;
    }

    public Long getComuna_deprov_id() {
        return comuna_deprov_id;
    }

    public void setComuna_deprov_id(Long comuna_deprov_id) {
        this.comuna_deprov_id = comuna_deprov_id;
    }
}
