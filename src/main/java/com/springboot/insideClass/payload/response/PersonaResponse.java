package com.springboot.insideClass.payload.response;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Date;

public class PersonaResponse {

    public String persona_nombre;

    public String persona_apellido_paterno;

    public String persona_apellido_materno;

    public Date persona_fecha_nacimiento;

    public Character persona_sexo;

    public String persona_numero_telefonico;

    public String persona_numero_celular;

    public String persona_run;

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

    public String getPersona_run() {
        return persona_run;
    }

    public void setPersona_run(String persona_run) {
        this.persona_run = persona_run;
    }

    public PersonaResponse(String persona_nombre, String persona_apellido_paterno, String persona_apellido_materno, Date persona_fecha_nacimiento, Character persona_sexo, String persona_numero_telefonico, String persona_numero_celular, String persona_run) {
        this.persona_nombre = persona_nombre;
        this.persona_apellido_paterno = persona_apellido_paterno;
        this.persona_apellido_materno = persona_apellido_materno;
        this.persona_fecha_nacimiento = persona_fecha_nacimiento;
        this.persona_sexo = persona_sexo;
        this.persona_numero_telefonico = persona_numero_telefonico;
        this.persona_numero_celular = persona_numero_celular;
        this.persona_run = persona_run;
    }
}
