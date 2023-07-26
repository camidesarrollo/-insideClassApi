package com.springboot.insideClass.payload.request.Alumno;

public class BuscarAlumnoPorCursoEstablecimientoRequest {

    Boolean matricula_vigencia; Long curso_establecimiento_establecimiento_id;
    Long curso_establecimiento_curso_id;

    public Boolean getMatricula_vigencia() {
        return matricula_vigencia;
    }

    public void setMatricula_vigencia(Boolean matricula_vigencia) {
        this.matricula_vigencia = matricula_vigencia;
    }

    public Long getCurso_establecimiento_establecimiento_id() {
        return curso_establecimiento_establecimiento_id;
    }

    public void setCurso_establecimiento_establecimiento_id(Long curso_establecimiento_establecimiento_id) {
        this.curso_establecimiento_establecimiento_id = curso_establecimiento_establecimiento_id;
    }

    public Long getCurso_establecimiento_curso_id() {
        return curso_establecimiento_curso_id;
    }

    public void setCurso_establecimiento_curso_id(Long curso_establecimiento_curso_id) {
        this.curso_establecimiento_curso_id = curso_establecimiento_curso_id;
    }
}
