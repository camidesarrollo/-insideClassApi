package com.springboot.insideClass.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Table(name = "T_PERSONA", uniqueConstraints = {@UniqueConstraint(columnNames =  "persona_rut")})
public class personaEntity {

    @Id
    String persona_rut;

    @NotBlank
    @Size(max = 20)
    String persona_nombre;

    @NotBlank
    @Size(max = 20)
    String persona_apellido_paterno;

    @NotBlank
    @Size(max = 20)
    String persona_apellido_materno;

    Date persona_fecha_nacimiento;

    Character persona_sexo;
    @NotBlank
    @Size(max = 200)
    String persona_numero_telefonico;
    @NotBlank
    @Size(max = 200)
    String persona_numero_celular;


    public personaEntity() {
    }

    public personaEntity(String persona_nombre, String persona_apellido_paterno, String persona_apellido_materno, Date persona_fecha_nacimiento, Character persona_sexo, String persona_numero_telefonico, String persona_numero_celular) {
        this.persona_nombre = persona_nombre;
        this.persona_apellido_paterno = persona_apellido_paterno;
        this.persona_apellido_materno = persona_apellido_materno;
        this.persona_fecha_nacimiento = persona_fecha_nacimiento;
        this.persona_sexo = persona_sexo;
        this.persona_numero_telefonico = persona_numero_telefonico;
        this.persona_numero_celular = persona_numero_celular;
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

    public String getPersona_rut() {
        return persona_rut;
    }

    public void setPersona_rut(String persona_rut) {
        this.persona_rut = persona_rut;
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
}
