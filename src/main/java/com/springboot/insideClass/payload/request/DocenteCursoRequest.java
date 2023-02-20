package com.springboot.insideClass.payload.request;

import java.sql.Time;
import java.util.Date;

public class DocenteCursoRequest {

    Date docente_curso_fecha_inicio;

    Date docente_cuso_fecha_fin;

    String curso_establ_hora_inicio;

    String curso_establ_hora_fin;

    String dia;

    public Date getDocente_curso_fecha_inicio() {
        return docente_curso_fecha_inicio;
    }

    public void setDocente_curso_fecha_inicio(Date docente_curso_fecha_inicio) {
        this.docente_curso_fecha_inicio = docente_curso_fecha_inicio;
    }

    public Date getDocente_cuso_fecha_fin() {
        return docente_cuso_fecha_fin;
    }

    public void setDocente_cuso_fecha_fin(Date docente_cuso_fecha_fin) {
        this.docente_cuso_fecha_fin = docente_cuso_fecha_fin;
    }

    public String getCurso_establ_hora_inicio() {
        return curso_establ_hora_inicio;
    }

    public void setCurso_establ_hora_inicio(String curso_establ_hora_inicio) {
        this.curso_establ_hora_inicio = curso_establ_hora_inicio;
    }

    public String getCurso_establ_hora_fin() {
        return curso_establ_hora_fin;
    }

    public void setCurso_establ_hora_fin(String curso_establ_hora_fin) {
        this.curso_establ_hora_fin = curso_establ_hora_fin;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
