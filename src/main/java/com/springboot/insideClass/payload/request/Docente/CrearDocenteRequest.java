package com.springboot.insideClass.payload.request.Docente;

import com.springboot.insideClass.payload.request.Horario.CrearHorarioRequest;
import com.springboot.insideClass.payload.request.Usuario.CrearUsuarioRequest;

import java.util.Date;

public class CrearDocenteRequest {
    CrearUsuarioRequest crearUsuarioRequest;

    CrearHorarioRequest crearHorarioRequest;
    Long asignatura_id;
    Long curso_id;
    Long establecimiento_id;
    Date fecha_inicio;
    Date fecha_fin;

    Boolean ProfesorJefe;

    public CrearUsuarioRequest getCrearUsuarioRequest() {
        return crearUsuarioRequest;
    }

    public void setCrearUsuarioRequest(CrearUsuarioRequest crearUsuarioRequest) {
        this.crearUsuarioRequest = crearUsuarioRequest;
    }

    public CrearHorarioRequest getCrearHorarioRequest() {
        return crearHorarioRequest;
    }

    public void setCrearHorarioRequest(CrearHorarioRequest crearHorarioRequest) {
        this.crearHorarioRequest = crearHorarioRequest;
    }

    public Long getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(Long asignatura_id) {
        this.asignatura_id = asignatura_id;
    }

    public Long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Long curso_id) {
        this.curso_id = curso_id;
    }

    public Long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Boolean getProfesorJefe() {
        return ProfesorJefe;
    }

    public void setProfesorJefe(Boolean profesorJefe) {
        ProfesorJefe = profesorJefe;
    }
}
