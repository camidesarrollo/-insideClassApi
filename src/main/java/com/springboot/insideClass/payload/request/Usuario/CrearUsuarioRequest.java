package com.springboot.insideClass.payload.request.Usuario;

import com.springboot.insideClass.payload.request.Persona.CrearPersonaRequest;

public class CrearUsuarioRequest {

    private String username;

    private String email;

    private String password;

    private Long  perfil_id;

    private Long vigencia_id;

    private CrearPersonaRequest crearPersonaRequest;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getPerfil_id() {
        return perfil_id;
    }

    public void setPerfil_id(Long perfil_id) {
        this.perfil_id = perfil_id;
    }

    public Long getVigencia_id() {
        return vigencia_id;
    }

    public void setVigencia_id(Long vigencia_id) {
        this.vigencia_id = vigencia_id;
    }

    public CrearPersonaRequest getCrearPersonaRequest() {
        return crearPersonaRequest;
    }

    public void setCrearPersonaRequest(CrearPersonaRequest crearPersonaRequest) {
        this.crearPersonaRequest = crearPersonaRequest;
    }
}
