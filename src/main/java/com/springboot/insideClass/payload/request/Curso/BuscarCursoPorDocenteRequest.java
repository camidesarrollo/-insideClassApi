package com.springboot.insideClass.payload.request.Curso;

import java.util.Date;

public class BuscarCursoPorDocenteRequest {

    private Long docente_asignatura_id_asignatura_id;
    private Long docente_asignatura_docente_id;
    private Date fecha_fin;
    private boolean vigencia;
    private Long curso_establecimiento_curso_id;
    private Long curso_establecimiento_establecimiento_id;

    public Long getDocente_asignatura_id_asignatura_id() {
        return docente_asignatura_id_asignatura_id;
    }

    public void setDocente_asignatura_id_asignatura_id(Long docente_asignatura_id_asignatura_id) {
        this.docente_asignatura_id_asignatura_id = docente_asignatura_id_asignatura_id;
    }

    public Long getDocente_asignatura_docente_id() {
        return docente_asignatura_docente_id;
    }

    public void setDocente_asignatura_docente_id(Long docente_asignatura_docente_id) {
        this.docente_asignatura_docente_id = docente_asignatura_docente_id;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public boolean isVigencia() {
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
}
