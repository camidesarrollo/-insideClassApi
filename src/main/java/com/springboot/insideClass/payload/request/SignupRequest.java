package com.springboot.insideClass.payload.request;

import java.util.Set;

import javax.validation.constraints.*;

public class SignupRequest {
    @NotBlank
    @Size(max = 20)
    String usuario_nickName;

    @NotBlank
    @Size(max = 20)
    String usuario_password;

    public String getUsuario_nickName() {
        return usuario_nickName;
    }

    public void setUsuario_nickName(String usuario_nickName) {
        this.usuario_nickName = usuario_nickName;
    }

    public String getUsuario_password() {
        return usuario_password;
    }

    public void setUsuario_password(String usuario_password) {
        this.usuario_password = usuario_password;
    }
}