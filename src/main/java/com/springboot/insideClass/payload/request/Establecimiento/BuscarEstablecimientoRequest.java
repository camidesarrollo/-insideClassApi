package com.springboot.insideClass.payload.request.Establecimiento;

public class BuscarEstablecimientoRequest {

    Long establecimiento_id;

    String establecimiento_nombre;

    Long establecimiento_codigo_area;

    Long establecimiento_telefono;


    Long establecimiento_direccion_id;


    Long establecimiento_sostenedor_id;

    Long establecimiento_dependencia_id;

    public Long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public String getEstablecimiento_nombre() {
        return establecimiento_nombre;
    }

    public void setEstablecimiento_nombre(String establecimiento_nombre) {
        this.establecimiento_nombre = establecimiento_nombre;
    }

    public Long getEstablecimiento_codigo_area() {
        return establecimiento_codigo_area;
    }

    public void setEstablecimiento_codigo_area(Long establecimiento_codigo_area) {
        this.establecimiento_codigo_area = establecimiento_codigo_area;
    }

    public Long getEstablecimiento_telefono() {
        return establecimiento_telefono;
    }

    public void setEstablecimiento_telefono(Long establecimiento_telefono) {
        this.establecimiento_telefono = establecimiento_telefono;
    }

    public Long getEstablecimiento_direccion_id() {
        return establecimiento_direccion_id;
    }

    public void setEstablecimiento_direccion_id(Long establecimiento_direccion_id) {
        this.establecimiento_direccion_id = establecimiento_direccion_id;
    }

    public Long getEstablecimiento_sostenedor_id() {
        return establecimiento_sostenedor_id;
    }

    public void setEstablecimiento_sostenedor_id(Long establecimiento_sostenedor_id) {
        this.establecimiento_sostenedor_id = establecimiento_sostenedor_id;
    }

    public Long getEstablecimiento_dependencia_id() {
        return establecimiento_dependencia_id;
    }

    public void setEstablecimiento_dependencia_id(Long establecimiento_dependencia_id) {
        this.establecimiento_dependencia_id = establecimiento_dependencia_id;
    }
}
