package com.springboot.insideClass.payload.response;

public class DocenteInfoResponse {

    private String  persona_run;
    private String  persona_nombre;
    private String persona_apellido_paterno;
    private String  persona_apellido_materno;
    private String  persona_numero_celular;
    private String persona_numero_telefonico;
    private String asignatura_nombre;
    private String establ_nombre;
    private String curso_nombre;

    public DocenteInfoResponse(String persona_run, String persona_nombre, String persona_apellido_paterno, String persona_apellido_materno, String persona_numero_celular, String persona_numero_telefonico, String asignatura_nombre, String establ_nombre, String curso_nombre) {
        this.persona_run = persona_run;
        this.persona_nombre = persona_nombre;
        this.persona_apellido_paterno = persona_apellido_paterno;
        this.persona_apellido_materno = persona_apellido_materno;
        this.persona_numero_celular = persona_numero_celular;
        this.persona_numero_telefonico = persona_numero_telefonico;
        this.asignatura_nombre = asignatura_nombre;
        this.establ_nombre = establ_nombre;
        this.curso_nombre = curso_nombre;
    }

    public DocenteInfoResponse() {

    }

    public String getPersona_run() {
        return persona_run;
    }

    public void setPersona_run(String persona_run) {
        this.persona_run = persona_run;
    }

    public String getPersona_nombre() {
        return persona_nombre;
    }

    public void setPersona_nombre(String persona_nombre) {
        this.persona_nombre = persona_nombre;
    }

    public String getPersona_apellido_paterno() {
        return persona_apellido_paterno;
    }

    public void setPersona_apellido_paterno(String persona_apellido_paterno) {
        this.persona_apellido_paterno = persona_apellido_paterno;
    }

    public String getPersona_apellido_materno() {
        return persona_apellido_materno;
    }

    public void setPersona_apellido_materno(String persona_apellido_materno) {
        this.persona_apellido_materno = persona_apellido_materno;
    }

    public String getPersona_numero_celular() {
        return persona_numero_celular;
    }

    public void setPersona_numero_celular(String persona_numero_celular) {
        this.persona_numero_celular = persona_numero_celular;
    }

    public String getPersona_numero_telefonico() {
        return persona_numero_telefonico;
    }

    public void setPersona_numero_telefonico(String persona_numero_telefonico) {
        this.persona_numero_telefonico = persona_numero_telefonico;
    }

    public String getAsignatura_nombre() {
        return asignatura_nombre;
    }

    public void setAsignatura_nombre(String asignatura_nombre) {
        this.asignatura_nombre = asignatura_nombre;
    }

    public String getEstabl_nombre() {
        return establ_nombre;
    }

    public void setEstabl_nombre(String establ_nombre) {
        this.establ_nombre = establ_nombre;
    }

    public String getCurso_nombre() {
        return curso_nombre;
    }

    public void setCurso_nombre(String curso_nombre) {
        this.curso_nombre = curso_nombre;
    }
}
