package com.springboot.insideClass.payload.response;

public class NotasInfoRequest {
    private String establId;
    private String establCodArea;
    private String establNombre;
    private String establNumeroTelefonico;
    private String establDependId;
    private String establDireccionId;
    private String establSostId;
    private String asignaturaNotaId;
    private String asignaturaNotaNota;
    private String asignaturaNotaAsignaturaDocId;
    private String asignaturaNotaMatriculaId;

    private String asignaturaNotaPosicion;
    private String asignaturaId;
    private String asignaturaNombre;
    private String alumnoId;
    private String personaRun;
    private String personaNombre;
    private String personaApellidoPaterno;
    private String personaApellidoMaterno;
    private String docenteId;
    private String docenteRun;
    private String docenteNombre;
    private String docenteApellidoPaterno;
    private String docenteApellidoMaterno;

    // Constructor vacío


    // Getters y setters
    // ...

    public String getEstablId() {
        return establId;
    }

    public void setEstablId(String establId) {
        this.establId = establId;
    }

    public String getEstablCodArea() {
        return establCodArea;
    }

    public void setEstablCodArea(String establCodArea) {
        this.establCodArea = establCodArea;
    }

    public String getEstablNombre() {
        return establNombre;
    }

    public void setEstablNombre(String establNombre) {
        this.establNombre = establNombre;
    }

    public String getEstablNumeroTelefonico() {
        return establNumeroTelefonico;
    }

    public void setEstablNumeroTelefonico(String establNumeroTelefonico) {
        this.establNumeroTelefonico = establNumeroTelefonico;
    }

    public String getEstablDependId() {
        return establDependId;
    }

    public void setEstablDependId(String establDependId) {
        this.establDependId = establDependId;
    }

    public String getEstablDireccionId() {
        return establDireccionId;
    }

    public void setEstablDireccionId(String establDireccionId) {
        this.establDireccionId = establDireccionId;
    }

    public String getEstablSostId() {
        return establSostId;
    }

    public void setEstablSostId(String establSostId) {
        this.establSostId = establSostId;
    }

    public String getAsignaturaNotaId() {
        return asignaturaNotaId;
    }

    public void setAsignaturaNotaId(String asignaturaNotaId) {
        this.asignaturaNotaId = asignaturaNotaId;
    }

    public String getAsignaturaNotaNota() {
        return asignaturaNotaNota;
    }

    public void setAsignaturaNotaNota(String asignaturaNotaNota) {
        this.asignaturaNotaNota = asignaturaNotaNota;
    }

    public String getAsignaturaNotaAsignaturaDocId() {
        return asignaturaNotaAsignaturaDocId;
    }

    public void setAsignaturaNotaAsignaturaDocId(String asignaturaNotaAsignaturaDocId) {
        this.asignaturaNotaAsignaturaDocId = asignaturaNotaAsignaturaDocId;
    }

    public String getAsignaturaNotaMatriculaId() {
        return asignaturaNotaMatriculaId;
    }

    public void setAsignaturaNotaMatriculaId(String asignaturaNotaMatriculaId) {
        this.asignaturaNotaMatriculaId = asignaturaNotaMatriculaId;
    }

    public String getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(String asignaturaId) {
        this.asignaturaId = asignaturaId;
    }

    public String getAsignaturaNombre() {
        return asignaturaNombre;
    }

    public void setAsignaturaNombre(String asignaturaNombre) {
        this.asignaturaNombre = asignaturaNombre;
    }

    public String getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(String alumnoId) {
        this.alumnoId = alumnoId;
    }

    public String getPersonaRun() {
        return personaRun;
    }

    public void setPersonaRun(String personaRun) {
        this.personaRun = personaRun;
    }

    public String getPersonaNombre() {
        return personaNombre;
    }

    public void setPersonaNombre(String personaNombre) {
        this.personaNombre = personaNombre;
    }

    public String getPersonaApellidoPaterno() {
        return personaApellidoPaterno;
    }

    public void setPersonaApellidoPaterno(String personaApellidoPaterno) {
        this.personaApellidoPaterno = personaApellidoPaterno;
    }

    public String getPersonaApellidoMaterno() {
        return personaApellidoMaterno;
    }

    public void setPersonaApellidoMaterno(String personaApellidoMaterno) {
        this.personaApellidoMaterno = personaApellidoMaterno;
    }

    public String getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(String docenteId) {
        this.docenteId = docenteId;
    }

    public String getDocenteRun() {
        return docenteRun;
    }

    public void setDocenteRun(String docenteRun) {
        this.docenteRun = docenteRun;
    }

    public String getDocenteNombre() {
        return docenteNombre;
    }

    public void setDocenteNombre(String docenteNombre) {
        this.docenteNombre = docenteNombre;
    }

    public String getDocenteApellidoPaterno() {
        return docenteApellidoPaterno;
    }

    public void setDocenteApellidoPaterno(String docenteApellidoPaterno) {
        this.docenteApellidoPaterno = docenteApellidoPaterno;
    }

    public String getDocenteApellidoMaterno() {
        return docenteApellidoMaterno;
    }

    public void setDocenteApellidoMaterno(String docenteApellidoMaterno) {
        this.docenteApellidoMaterno = docenteApellidoMaterno;
    }

    public String getAsignaturaNotaPosicion() {
        return asignaturaNotaPosicion;
    }

    public void setAsignaturaNotaPosicion(String asignaturaNotaPosicion) {
        this.asignaturaNotaPosicion = asignaturaNotaPosicion;
    }

    // Override del método toString()
    @Override
    public String toString() {
        return "EstablecimientoAsignaturaNota [establId=" + establId + ", establCodArea=" + establCodArea + ", establNombre="
                + establNombre + ", establNumeroTelefonico=" + establNumeroTelefonico + ", establDependId=" + establDependId
                + ", establDireccionId=" + establDireccionId + ", establSostId=" + establSostId + ", asignaturaNotaId="
                + asignaturaNotaId + ", asignaturaNotaNota=" + asignaturaNotaNota + ", asignaturaNotaAsignaturaDocId="
                + asignaturaNotaAsignaturaDocId + ", asignaturaNotaMatriculaId=" + asignaturaNotaMatriculaId
                + ", asignaturaId=" + asignaturaId + ", asignaturaNombre=" + asignaturaNombre + ", alumnoId=" + alumnoId
                + ", personaRun=" + personaRun + ", personaNombre=" + personaNombre + ", personaApellidoPaterno="
                + personaApellidoPaterno + ", personaApellidoMaterno=" + personaApellidoMaterno + ", docenteId=" + docenteId
                + ", docenteRun=" + docenteRun + ", docenteNombre=" + docenteNombre + ", docenteApellidoPaterno="
                + docenteApellidoPaterno + ", docenteApellidoMaterno=" + docenteApellidoMaterno + "]";
    }

}
