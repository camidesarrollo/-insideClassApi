package com.springboot.insideClass.payload.request;

import java.util.Date;

public class DocenteCursoRequest {

    private long docente_curso_docente_id;

    private long docente_curso_establ_id;

    Date docente_curso_fecha_inicio;

    Date docente_cuso_fecha_fin;

    private boolean docente_cuso_docente_jefe;

    public long getDocente_curso_docente_id() {
        return docente_curso_docente_id;
    }

    public void setDocente_curso_docente_id(long docente_curso_docente_id) {
        this.docente_curso_docente_id = docente_curso_docente_id;
    }

    public long getDocente_curso_establ_id() {
        return docente_curso_establ_id;
    }

    public void setDocente_curso_establ_id(long docente_curso_establ_id) {
        this.docente_curso_establ_id = docente_curso_establ_id;
    }

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

    public boolean isDocente_jefe() {
        return docente_cuso_docente_jefe;
    }

    public void setDocente_jefe(boolean docente_jefe) {
        this.docente_cuso_docente_jefe = docente_jefe;
    }
}
