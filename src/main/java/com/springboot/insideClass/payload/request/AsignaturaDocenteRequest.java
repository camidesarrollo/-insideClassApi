package com.springboot.insideClass.payload.request;

import java.util.Date;

public class AsignaturaDocenteRequest {

    private Date asignatura_doc_inicio;

    private Date asignatura_doc_fin;

    public Date getAsignatura_doc_inicio() {
        return asignatura_doc_inicio;
    }

    public void setAsignatura_doc_inicio(Date asignatura_doc_inicio) {
        this.asignatura_doc_inicio = asignatura_doc_inicio;
    }

    public Date getAsignatura_doc_fin() {
        return asignatura_doc_fin;
    }

    public void setAsignatura_doc_fin(Date asignatura_doc_fin) {
        this.asignatura_doc_fin = asignatura_doc_fin;
    }
}
