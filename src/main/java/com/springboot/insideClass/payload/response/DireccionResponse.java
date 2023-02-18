package com.springboot.insideClass.payload.response;

import com.springboot.insideClass.entity.ComunaEntity;
import com.springboot.insideClass.entity.TipoAreaEntity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class DireccionResponse {

    public DireccionResponse() {
    }

    public String direccion_calle;
    public String comuna_nombre;
    public String tipo_area_nombre;

    public DireccionResponse(String direccion_calle, String comuna_nombre, String tipo_area_nombre) {
        this.direccion_calle = direccion_calle;
        this.comuna_nombre = comuna_nombre;
        this.tipo_area_nombre = tipo_area_nombre;
    }

    public String getDireccion_calle() {
        return direccion_calle;
    }

    public void setDireccion_calle(String direccion_calle) {
        this.direccion_calle = direccion_calle;
    }

    public String getComuna_nombre() {
        return comuna_nombre;
    }

    public void setComuna_nombre(String comuna_nombre) {
        this.comuna_nombre = comuna_nombre;
    }

    public String getTipo_area_nombre() {
        return tipo_area_nombre;
    }

    public void setTipo_area_nombre(String tipo_area_nombre) {
        this.tipo_area_nombre = tipo_area_nombre;
    }
}
