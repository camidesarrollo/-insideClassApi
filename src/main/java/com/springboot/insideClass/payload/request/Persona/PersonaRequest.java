package com.springboot.insideClass.payload.request.Persona;

import java.sql.Date;

public class PersonaRequest {


    private String persona_run;

    private String persona_nombre;

    private String persona_apellido_paterno;


    private String persona_apellido_materno;

    private Date persona_fecha_nacimiento;

    private Character persona_sexo;

    private String persona_numero_telefonico;

    private String persona_numero_celular;

    private String correo;
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

    public Date getPersona_fecha_nacimiento() {
        return persona_fecha_nacimiento;
    }

    public void setPersona_fecha_nacimiento(Date persona_fecha_nacimiento) {
        this.persona_fecha_nacimiento = persona_fecha_nacimiento;
    }

    public Character getPersona_sexo() {
        return persona_sexo;
    }

    public void setPersona_sexo(Character persona_sexo) {
        this.persona_sexo = persona_sexo;
    }

    public String getPersona_numero_telefonico() {
        return persona_numero_telefonico;
    }

    public void setPersona_numero_telefonico(String persona_numero_telefonico) {
        this.persona_numero_telefonico = persona_numero_telefonico;
    }

    public String getPersona_numero_celular() {
        return persona_numero_celular;
    }

    public void setPersona_numero_celular(String persona_numero_celular) {
        this.persona_numero_celular = persona_numero_celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean IsValid() {
        if (persona_run == null || persona_run.isEmpty()) {
            return false;
        }

        if (persona_nombre == null || persona_nombre.isEmpty()) {
            return false;
        }

        if (persona_apellido_paterno == null || persona_apellido_paterno.isEmpty()) {
            return false;
        }

        if (persona_fecha_nacimiento == null) {
            return false;
        }

        if (persona_sexo == null) {
            return false;
        }

        if (correo == null || correo.isEmpty()) {
            return false;
        }

        return true;
    }
}
