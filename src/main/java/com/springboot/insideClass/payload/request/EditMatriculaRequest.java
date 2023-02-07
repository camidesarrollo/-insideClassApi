package com.springboot.insideClass.payload.request;

public class EditMatriculaRequest {

    private long matricula_id;

    private long curso_id;

    private long establecimiento_id;

    private String apoderado_run;

    private String alumno_run;

    public long getMatricula_id() {
        return matricula_id;
    }

    public void setMatricula_id(long matricula_id) {
        this.matricula_id = matricula_id;
    }

    public long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(long curso_id) {
        this.curso_id = curso_id;
    }

    public long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public String getApoderado_run() {
        return apoderado_run;
    }

    public void setApoderado_run(String apoderado_run) {
        this.apoderado_run = apoderado_run;
    }

    public String getAlumno_run() {
        return alumno_run;
    }

    public void setAlumno_run(String alumno_run) {
        this.alumno_run = alumno_run;
    }
}
