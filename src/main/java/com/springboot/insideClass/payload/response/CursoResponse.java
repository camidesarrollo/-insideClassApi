package com.springboot.insideClass.payload.response;

public class CursoResponse {

    private String  curso;

    private long id_curso;

    private boolean docente_jefe;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public long getId_curso() {
        return id_curso;
    }

    public void setId_curso(long id_curso) {
        this.id_curso = id_curso;
    }

    public boolean isDocente_jefe() {
        return docente_jefe;
    }

    public void setDocente_jefe(boolean docente_jefe) {
        this.docente_jefe = docente_jefe;
    }
}
