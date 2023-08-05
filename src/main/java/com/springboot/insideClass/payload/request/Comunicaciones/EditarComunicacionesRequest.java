package com.springboot.insideClass.payload.request.Comunicaciones;

import java.util.Date;

public class EditarComunicacionesRequest {

    private Long id_comunicacion;
    private Date fecha;

    private String descripcion;

    private String tipo;

    private String titulo;

    public Long getId_comunicacion() {
        return id_comunicacion;
    }

    public void setId_comunicacion(Long id_comunicacion) {
        this.id_comunicacion = id_comunicacion;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
