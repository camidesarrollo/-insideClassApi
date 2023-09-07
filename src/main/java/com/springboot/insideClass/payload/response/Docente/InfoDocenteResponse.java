package com.springboot.insideClass.payload.response.Docente;

import java.math.BigInteger;
import java.util.Date;

public class InfoDocenteResponse {
    private BigInteger docente_id;

    private Boolean vigencia;
    private String docente_persona_run;
    private BigInteger establecimiento_id;
    private BigInteger establecimiento_codigo_area;
    private String establecimiento_nombre;
    private BigInteger establecimiento_telefono;
    private BigInteger establecimiento_dependencia_id;
    private BigInteger establecimiento_direccion_id;
    private BigInteger establecimiento_sostenedor_id;
    private BigInteger curso_id;
    private String curso_nivel;
    private String curso_nombre;
    private String persona_run;

    private String persona_nombre;
    private String persona_apellido_paterno;
    private String persona_apellido_materno;
    private Date persona_fecha_nacimiento;

    private String persona_numero_telefonico;
    private String persona_numero_celular;
    private Character persona_sexo;


    // Constructor


    public InfoDocenteResponse(BigInteger docente_id, Boolean vigencia, String docente_persona_run, BigInteger establecimiento_id, BigInteger establecimiento_codigo_area, String establecimiento_nombre, BigInteger establecimiento_telefono, BigInteger establecimiento_dependencia_id, BigInteger establecimiento_direccion_id, BigInteger establecimiento_sostenedor_id, BigInteger curso_id, String curso_nivel, String curso_nombre, String persona_run, String persona_nombre, String persona_apellido_paterno, String persona_apellido_materno, Date persona_fecha_nacimiento, String persona_numero_telefonico, String persona_numero_celular, Character persona_sexo) {
        this.docente_id = docente_id;
        this.vigencia = vigencia;
        this.docente_persona_run = docente_persona_run;
        this.establecimiento_id = establecimiento_id;
        this.establecimiento_codigo_area = establecimiento_codigo_area;
        this.establecimiento_nombre = establecimiento_nombre;
        this.establecimiento_telefono = establecimiento_telefono;
        this.establecimiento_dependencia_id = establecimiento_dependencia_id;
        this.establecimiento_direccion_id = establecimiento_direccion_id;
        this.establecimiento_sostenedor_id = establecimiento_sostenedor_id;
        this.curso_id = curso_id;
        this.curso_nivel = curso_nivel;
        this.curso_nombre = curso_nombre;
        this.persona_run = persona_run;
        this.persona_nombre = persona_nombre;
        this.persona_apellido_paterno = persona_apellido_paterno;
        this.persona_apellido_materno = persona_apellido_materno;
        this.persona_fecha_nacimiento = persona_fecha_nacimiento;
        this.persona_numero_telefonico = persona_numero_telefonico;
        this.persona_numero_celular = persona_numero_celular;
        this.persona_sexo = persona_sexo;
    }

    public BigInteger getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(BigInteger docente_id) {
        this.docente_id = docente_id;
    }

    public String getDocente_persona_run() {
        return docente_persona_run;
    }

    public void setDocente_persona_run(String docente_persona_run) {
        this.docente_persona_run = docente_persona_run;
    }

    public BigInteger getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(BigInteger establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public BigInteger getEstablecimiento_codigo_area() {
        return establecimiento_codigo_area;
    }

    public void setEstablecimiento_codigo_area(BigInteger establecimiento_codigo_area) {
        this.establecimiento_codigo_area = establecimiento_codigo_area;
    }

    public String getEstablecimiento_nombre() {
        return establecimiento_nombre;
    }

    public void setEstablecimiento_nombre(String establecimiento_nombre) {
        this.establecimiento_nombre = establecimiento_nombre;
    }

    public BigInteger getEstablecimiento_telefono() {
        return establecimiento_telefono;
    }

    public void setEstablecimiento_telefono(BigInteger establecimiento_telefono) {
        this.establecimiento_telefono = establecimiento_telefono;
    }

    public BigInteger getEstablecimiento_dependencia_id() {
        return establecimiento_dependencia_id;
    }

    public void setEstablecimiento_dependencia_id(BigInteger establecimiento_dependencia_id) {
        this.establecimiento_dependencia_id = establecimiento_dependencia_id;
    }

    public BigInteger getEstablecimiento_direccion_id() {
        return establecimiento_direccion_id;
    }

    public void setEstablecimiento_direccion_id(BigInteger establecimiento_direccion_id) {
        this.establecimiento_direccion_id = establecimiento_direccion_id;
    }

    public BigInteger getEstablecimiento_sostenedor_id() {
        return establecimiento_sostenedor_id;
    }

    public void setEstablecimiento_sostenedor_id(BigInteger establecimiento_sostenedor_id) {
        this.establecimiento_sostenedor_id = establecimiento_sostenedor_id;
    }

    public BigInteger getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(BigInteger curso_id) {
        this.curso_id = curso_id;
    }

    public String getCurso_nivel() {
        return curso_nivel;
    }

    public void setCurso_nivel(String curso_nivel) {
        this.curso_nivel = curso_nivel;
    }

    public String getCurso_nombre() {
        return curso_nombre;
    }

    public void setCurso_nombre(String curso_nombre) {
        this.curso_nombre = curso_nombre;
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

    // toString() method (Optional, for debugging purposes)
    @Override
    public String toString() {
        return "InfoDocenteResponse{" +
                "docente_id=" + docente_id +
                ", docente_persona_run='" + docente_persona_run + '\'' +
                ", establecimiento_id=" + establecimiento_id +
                ", establecimiento_codigo_area='" + establecimiento_codigo_area + '\'' +
                ", establecimiento_nombre='" + establecimiento_nombre + '\'' +
                ", establecimiento_telefono='" + establecimiento_telefono + '\'' +
                ", establecimiento_dependencia_id=" + establecimiento_dependencia_id +
                ", establecimiento_direccion_id=" + establecimiento_direccion_id +
                ", establecimiento_sostenedor_id=" + establecimiento_sostenedor_id +
                ", curso_id=" + curso_id +
                ", curso_nivel='" + curso_nivel + '\'' +
                ", curso_nombre='" + curso_nombre + '\'' +
                '}';
    }
}
