package com.springboot.insideClass.payload.request.CodigoRecuperacion;

public class RecuperarContrasenaRequest {

    String rut;

    String correo;

    public RecuperarContrasenaRequest() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
