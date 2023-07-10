package com.springboot.insideClass.payload.request.DepartamentoProvinciales;

public class BuscarDepartamentoProvincialesRequest {

    Long departamentos_provinciales_id;

    String departamentos_provinciales_responsable;

    String departamentos_provinciales_correo;

    String departamentos_provinciales_direccion;

    public Long getDepartamentos_provinciales_id() {
        return departamentos_provinciales_id;
    }

    public void setDepartamentos_provinciales_id(Long departamentos_provinciales_id) {
        this.departamentos_provinciales_id = departamentos_provinciales_id;
    }

    public String getDepartamentos_provinciales_responsable() {
        return departamentos_provinciales_responsable;
    }

    public void setDepartamentos_provinciales_responsable(String departamentos_provinciales_responsable) {
        this.departamentos_provinciales_responsable = departamentos_provinciales_responsable;
    }

    public String getDepartamentos_provinciales_correo() {
        return departamentos_provinciales_correo;
    }

    public void setDepartamentos_provinciales_correo(String departamentos_provinciales_correo) {
        this.departamentos_provinciales_correo = departamentos_provinciales_correo;
    }

    public String getDepartamentos_provinciales_direccion() {
        return departamentos_provinciales_direccion;
    }

    public void setDepartamentos_provinciales_direccion(String departamentos_provinciales_direccion) {
        this.departamentos_provinciales_direccion = departamentos_provinciales_direccion;
    }
}
