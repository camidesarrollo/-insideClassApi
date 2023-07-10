package com.springboot.insideClass.payload.request.CursoEstablecimiento;

public class BuscarCursoEstablecimientoRequest {

    Long curso_establecimiento_id;

    Long curso_establecimiento_curso_id;

    Long curso_establecimiento_establecimiento_id;

    Boolean vigencia;

    String fecha_ingreso;

    String fecha_modificacion;

    public Long getCurso_establecimiento_id() {
        return curso_establecimiento_id;
    }

    public void setCurso_establecimiento_id(Long curso_establecimiento_id) {
        this.curso_establecimiento_id = curso_establecimiento_id;
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

    public Boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(Boolean vigencia) {
        this.vigencia = vigencia;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(String fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }
}
