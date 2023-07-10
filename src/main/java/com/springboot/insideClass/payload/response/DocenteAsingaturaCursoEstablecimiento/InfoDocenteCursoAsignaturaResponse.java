package com.springboot.insideClass.payload.response.DocenteAsingaturaCursoEstablecimiento;

import java.util.List;

public class InfoDocenteCursoAsignaturaResponse {
    Long docente_id;
    String persona_run;

    List<IcursoAsignaturaEstablecimiento> icursoAsignaturaEstablecimientos;

    public InfoDocenteCursoAsignaturaResponse(Long docente_id, String persona_run, List<IcursoAsignaturaEstablecimiento> icursoAsignaturaEstablecimientos) {
        this.docente_id = docente_id;
        this.persona_run = persona_run;
        this.icursoAsignaturaEstablecimientos = icursoAsignaturaEstablecimientos;
    }

    public Long getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(Long docente_id) {
        this.docente_id = docente_id;
    }

    public String getPersona_run() {
        return persona_run;
    }

    public void setPersona_run(String persona_run) {
        this.persona_run = persona_run;
    }

    public List<IcursoAsignaturaEstablecimiento> getIcursoAsignaturaEstablecimientos() {
        return icursoAsignaturaEstablecimientos;
    }

    public void setIcursoAsignaturaEstablecimientos(List<IcursoAsignaturaEstablecimiento> icursoAsignaturaEstablecimientos) {
        this.icursoAsignaturaEstablecimientos = icursoAsignaturaEstablecimientos;
    }
}
