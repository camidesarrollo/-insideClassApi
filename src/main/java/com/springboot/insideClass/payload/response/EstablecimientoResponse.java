package com.springboot.insideClass.payload.response;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EstablecimientoResponse {

    public String establ_id;

    public String establ_nombre;

    public String establ_numero_telefonico;

    public String getEstabl_id() {
        return establ_id;
    }

    public void setEstabl_id(String establ_id) {
        this.establ_id = establ_id;
    }

    public String getEstabl_nombre() {
        return establ_nombre;
    }

    public void setEstabl_nombre(String establ_nombre) {
        this.establ_nombre = establ_nombre;
    }

    public String getEstabl_numero_telefonico() {
        return establ_numero_telefonico;
    }

    public void setEstabl_numero_telefonico(String establ_numero_telefonico) {
        this.establ_numero_telefonico = establ_numero_telefonico;
    }

    public EstablecimientoResponse(String establ_id, String establ_nombre, String establ_numero_telefonico) {
        this.establ_id = establ_id;
        this.establ_nombre = establ_nombre;
        this.establ_numero_telefonico = establ_numero_telefonico;
    }
}
