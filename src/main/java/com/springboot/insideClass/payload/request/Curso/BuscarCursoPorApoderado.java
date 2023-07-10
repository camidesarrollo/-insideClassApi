package com.springboot.insideClass.payload.request.Curso;

public class BuscarCursoPorApoderado {

    boolean vigencia;
    Long curso_establecimiento_curso_id;
    Long curso_establecimiento_establecimiento_id;
    boolean vigenciaMatricula;

    Long matricula_apoderado_id;

    Long matricula_alumno_id;
    Long curso_agno;

    public boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public Long getCurso_establecimiento_curso_id() {
        return curso_establecimiento_curso_id;
    }

    public void setCurso_establecimiento_curso_id(Long curso_establecimiento_curso_id) {
        this.curso_establecimiento_curso_id = curso_establecimiento_curso_id;
    }

    public Long getCurso_establecimiento_establecimiento_id() {
        return curso_establecimiento_establecimiento_id;
    }

    public void setCurso_establecimiento_establecimiento_id(Long curso_establecimiento_establecimiento_id) {
        this.curso_establecimiento_establecimiento_id = curso_establecimiento_establecimiento_id;
    }

    public boolean getVigenciaMatricula() {
        return vigenciaMatricula;
    }

    public void setVigenciaMatricula(boolean vigenciaMatricula) {
        this.vigenciaMatricula = vigenciaMatricula;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public boolean isVigenciaMatricula() {
        return vigenciaMatricula;
    }

    public Long getCurso_agno() {
        return curso_agno;
    }

    public void setCurso_agno(Long curso_agno) {
        this.curso_agno = curso_agno;
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
}
