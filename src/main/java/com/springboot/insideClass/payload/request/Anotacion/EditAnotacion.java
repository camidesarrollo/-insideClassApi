package com.springboot.insideClass.payload.request.Anotacion;

import java.util.Date;

public class EditAnotacion {
    private Long id_anotacion;
    private Date fecha;

    private String descripcion;

    private String gravedad;

    public Long getId_anotacion() {
        return id_anotacion;
    }

    public void setId_anotacion(Long id_anotacion) {
        this.id_anotacion = id_anotacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }
}
