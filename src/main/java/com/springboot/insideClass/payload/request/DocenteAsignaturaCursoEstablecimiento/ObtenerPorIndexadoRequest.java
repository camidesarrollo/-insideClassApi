package com.springboot.insideClass.payload.request.DocenteAsignaturaCursoEstablecimiento;

public class ObtenerPorIndexadoRequest {

    private Long docente_id;
    private String docente_persona_run;
    private Long asignatura_id;
    private String asignatura_nombre;
    private Long curso_id;
    private String curso_nivel;
    private String curso_nombre;

    private Long establecimiento_id;

    private String establecimiento_nombre;
    private String fecha_inicio;
    private String fecha_fin;
    private int anio_incio;
    private int anio_fin;

    public Long getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(Long docente_id) {
        this.docente_id = docente_id;
    }

    public String getDocente_persona_run() {
        return docente_persona_run;
    }

    public void setDocente_persona_run(String docente_persona_run) {
        this.docente_persona_run = docente_persona_run;
    }

    public Long getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(Long asignatura_id) {
        this.asignatura_id = asignatura_id;
    }

    public String getAsignatura_nombre() {
        return asignatura_nombre;
    }

    public void setAsignatura_nombre(String asignatura_nombre) {
        this.asignatura_nombre = asignatura_nombre;
    }

    public Long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Long curso_id) {
        this.curso_id = curso_id;
    }

    public String getCurso_nivel() {
        return curso_nivel;
    }

    public void setCurso_nivel(String curso_nivel) {
        this.curso_nivel = curso_nivel;
    }

    public String getCurso_nombre() {
        return curso_nombre;
    }

    public void setCurso_nombre(String curso_nombre) {
        this.curso_nombre = curso_nombre;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getAnio_incio() {
        return anio_incio;
    }

    public void setAnio_incio(int anio_incio) {
        this.anio_incio = anio_incio;
    }

    public int getAnio_fin() {
        return anio_fin;
    }

    public void setAnio_fin(int anio_fin) {
        this.anio_fin = anio_fin;
    }

    public Long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public String getEstablecimiento_nombre() {
        return establecimiento_nombre;
    }

    public void setEstablecimiento_nombre(String establecimiento_nombre) {
        this.establecimiento_nombre = establecimiento_nombre;
    }
}
