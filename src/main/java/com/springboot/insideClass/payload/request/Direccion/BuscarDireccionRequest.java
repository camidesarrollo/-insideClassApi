package com.springboot.insideClass.payload.request.Direccion;

public class BuscarDireccionRequest {

    Long direccion_id;

    String direccion_calle;

    String direccion_info_adicional;

    Long direccion_comuna_id;

    String direccion_geo_x;

    String direccion_geo_y;

    Long direccion_tipo_area;

    public Long getDireccion_id() {
        return direccion_id;
    }

    public void setDireccion_id(Long direccion_id) {
        this.direccion_id = direccion_id;
    }

    public String getDireccion_calle() {
        return direccion_calle;
    }

    public void setDireccion_calle(String direccion_calle) {
        this.direccion_calle = direccion_calle;
    }

    public String getDireccion_info_adicional() {
        return direccion_info_adicional;
    }

    public void setDireccion_info_adicional(String direccion_info_adicional) {
        this.direccion_info_adicional = direccion_info_adicional;
    }

    public Long getDireccion_comuna_id() {
        return direccion_comuna_id;
    }

    public void setDireccion_comuna_id(Long direccion_comuna_id) {
        this.direccion_comuna_id = direccion_comuna_id;
    }

    public String getDireccion_geo_x() {
        return direccion_geo_x;
    }

    public void setDireccion_geo_x(String direccion_geo_x) {
        this.direccion_geo_x = direccion_geo_x;
    }

    public String getDireccion_geo_y() {
        return direccion_geo_y;
    }

    public void setDireccion_geo_y(String direccion_geo_y) {
        this.direccion_geo_y = direccion_geo_y;
    }

    public Long getDireccion_tipo_area() {
        return direccion_tipo_area;
    }

    public void setDireccion_tipo_area(Long direccion_tipo_area) {
        this.direccion_tipo_area = direccion_tipo_area;
    }
}
