package com.springboot.insideClass.payload.response.Asistencia;

import java.util.Date;

public class DatosAlumnoAsistenciaResponse {

    public Long matricula_id;
    public Long matricula_apoderado_id;
    public Long matricula_alumno_id;
    public Long matricula_curso_establecimiento_id;
    public Integer curso_agno;
    public boolean matricula_vigencia;

    public String persona_run;
    public String persona_nombre;
    public String persona_apellido_paterno;
    public String persona_apellido_materno;
    public Date persona_fecha_nacimiento;
    public Character persona_sexo;
    public String persona_numero_telefonico;
    public String persona_numero_celular;

    public Long asistencia_id;
    public Long asistencia_matricula_id;
    public String fecha;

    public Long establecimiento_id;
    public Long establecimiento_codigo_area;
    public String establecimiento_nombre;
    public Long establecimiento_telefono;
    public Long establecimiento_dependencia_id;
    public Long establecimiento_direccion_id;
    public Long establecimiento_sostenedor_id;

    public Long curso_id;
    public String curso_nombre;
    public String curso_nivel;

    public Long getMatricula_id() {
        return matricula_id;
    }

    public void setMatricula_id(Long matricula_id) {
        this.matricula_id = matricula_id;
    }

    public Long getMatricula_apoderado_id() {
        return matricula_apoderado_id;
    }

    public void setMatricula_apoderado_id(Long matricula_apoderado_id) {
        this.matricula_apoderado_id = matricula_apoderado_id;
    }

    public Long getMatricula_alumno_id() {
        return matricula_alumno_id;
    }

    public void setMatricula_alumno_id(Long matricula_alumno_id) {
        this.matricula_alumno_id = matricula_alumno_id;
    }

    public Long getMatricula_curso_establecimiento_id() {
        return matricula_curso_establecimiento_id;
    }

    public void setMatricula_curso_establecimiento_id(Long matricula_curso_establecimiento_id) {
        this.matricula_curso_establecimiento_id = matricula_curso_establecimiento_id;
    }

    public Integer getCurso_agno() {
        return curso_agno;
    }

    public void setCurso_agno(Integer curso_agno) {
        this.curso_agno = curso_agno;
    }

    public boolean isMatricula_vigencia() {
        return matricula_vigencia;
    }

    public void setMatricula_vigencia(boolean matricula_vigencia) {
        this.matricula_vigencia = matricula_vigencia;
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

    public Long getAsistencia_id() {
        return asistencia_id;
    }

    public void setAsistencia_id(Long asistencia_id) {
        this.asistencia_id = asistencia_id;
    }

    public Long getAsistencia_matricula_id() {
        return asistencia_matricula_id;
    }

    public void setAsistencia_matricula_id(Long asistencia_matricula_id) {
        this.asistencia_matricula_id = asistencia_matricula_id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public Long getEstablecimiento_codigo_area() {
        return establecimiento_codigo_area;
    }

    public void setEstablecimiento_codigo_area(Long establecimiento_codigo_area) {
        this.establecimiento_codigo_area = establecimiento_codigo_area;
    }

    public String getEstablecimiento_nombre() {
        return establecimiento_nombre;
    }

    public void setEstablecimiento_nombre(String establecimiento_nombre) {
        this.establecimiento_nombre = establecimiento_nombre;
    }

    public Long getEstablecimiento_telefono() {
        return establecimiento_telefono;
    }

    public void setEstablecimiento_telefono(Long establecimiento_telefono) {
        this.establecimiento_telefono = establecimiento_telefono;
    }

    public Long getEstablecimiento_dependencia_id() {
        return establecimiento_dependencia_id;
    }

    public void setEstablecimiento_dependencia_id(Long establecimiento_dependencia_id) {
        this.establecimiento_dependencia_id = establecimiento_dependencia_id;
    }

    public Long getEstablecimiento_direccion_id() {
        return establecimiento_direccion_id;
    }

    public void setEstablecimiento_direccion_id(Long establecimiento_direccion_id) {
        this.establecimiento_direccion_id = establecimiento_direccion_id;
    }

    public Long getEstablecimiento_sostenedor_id() {
        return establecimiento_sostenedor_id;
    }

    public void setEstablecimiento_sostenedor_id(Long establecimiento_sostenedor_id) {
        this.establecimiento_sostenedor_id = establecimiento_sostenedor_id;
    }

    public Long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Long curso_id) {
        this.curso_id = curso_id;
    }

    public String getCurso_nombre() {
        return curso_nombre;
    }

    public void setCurso_nombre(String curso_nombre) {
        this.curso_nombre = curso_nombre;
    }

    public String getCurso_nivel() {
        return curso_nivel;
    }

    public void setCurso_nivel(String curso_nivel) {
        this.curso_nivel = curso_nivel;
    }
}
