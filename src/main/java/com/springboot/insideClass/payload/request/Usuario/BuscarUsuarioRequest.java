package com.springboot.insideClass.payload.request.Usuario;

public class BuscarUsuarioRequest {

    Long id;


    String username;


    String email;


    String password;

    Long usuario_perfil_id;

    Long usuario_vigencia_id;

    String usuario_persona_run;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getUsuario_perfil_id() {
        return usuario_perfil_id;
    }

    public void setUsuario_perfil_id(Long usuario_perfil_id) {
        this.usuario_perfil_id = usuario_perfil_id;
    }

    public Long getUsuario_vigencia_id() {
        return usuario_vigencia_id;
    }

    public void setUsuario_vigencia_id(Long usuario_vigencia_id) {
        this.usuario_vigencia_id = usuario_vigencia_id;
    }

    public String getUsuario_persona_run() {
        return usuario_persona_run;
    }

    public void setUsuario_persona_run(String usuario_persona_run) {
        this.usuario_persona_run = usuario_persona_run;
    }
}
