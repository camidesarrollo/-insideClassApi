package com.springboot.insideClass.payload.request.TipoArea;

public class BuscarTipoAreaRequest {

    Long tipo_area_id;


    String tipo_area_nombre;

    public Long getTipo_area_id() {
        return tipo_area_id;
    }

    public void setTipo_area_id(Long tipo_area_id) {
        this.tipo_area_id = tipo_area_id;
    }

    public String getTipo_area_nombre() {
        return tipo_area_nombre;
    }

    public void setTipo_area_nombre(String tipo_area_nombre) {
        this.tipo_area_nombre = tipo_area_nombre;
    }
}
