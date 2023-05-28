package com.springboot.insideClass.payload.response;

public class CursoResponse {

    private String  curso;

    private String id_curso;

    private boolean docente_jefe;


    public CursoResponse(String curso, String id_curso, boolean docente_jefe) {
        this.curso = curso;
        this.id_curso = id_curso;
        this.docente_jefe = docente_jefe;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getId_curso() {
        return id_curso;
    }

    public void setId_curso(String id_curso) {
        this.id_curso = id_curso;
    }

    public boolean isDocente_jefe() {
        return docente_jefe;
    }

    public void setDocente_jefe(boolean docente_jefe) {
        this.docente_jefe = docente_jefe;
    }
}
