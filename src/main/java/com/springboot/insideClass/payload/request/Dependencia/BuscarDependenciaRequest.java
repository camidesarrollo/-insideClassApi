package com.springboot.insideClass.payload.request.Dependencia;

public class BuscarDependenciaRequest {

    Long dependencia_id;

    String dependencia_nombre;

    public Long getDependencia_id() {
        return dependencia_id;
    }

    public void setDependencia_id(Long dependencia_id) {
        this.dependencia_id = dependencia_id;
    }

    public String getDependencia_nombre() {
        return dependencia_nombre;
    }

    public void setDependencia_nombre(String dependencia_nombre) {
        this.dependencia_nombre = dependencia_nombre;
    }
}
