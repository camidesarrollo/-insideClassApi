package com.springboot.insideClass.payload.request.Perfil;

public class BuscarPerfilRequest {

    Long perfil_id;

    String perfil_nombre;

    public Long getPerfil_id() {
        return perfil_id;
    }

    public void setPerfil_id(Long perfil_id) {
        this.perfil_id = perfil_id;
    }

    public String getPerfil_nombre() {
        return perfil_nombre;
    }

    public void setPerfil_nombre(String perfil_nombre) {
        this.perfil_nombre = perfil_nombre;
    }
}
