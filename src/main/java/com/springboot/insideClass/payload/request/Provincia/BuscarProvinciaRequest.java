package com.springboot.insideClass.payload.request.Provincia;

public class BuscarProvinciaRequest {

    Long provincia_id;


    String provincia_nombre;

    Long provincia_region_id;

    public Long getProvincia_id() {
        return provincia_id;
    }

    public void setProvincia_id(Long provincia_id) {
        this.provincia_id = provincia_id;
    }

    public String getProvincia_nombre() {
        return provincia_nombre;
    }

    public void setProvincia_nombre(String provincia_nombre) {
        this.provincia_nombre = provincia_nombre;
    }

    public Long getProvincia_region_id() {
        return provincia_region_id;
    }

    public void setProvincia_region_id(Long provincia_region_id) {
        this.provincia_region_id = provincia_region_id;
    }
}
