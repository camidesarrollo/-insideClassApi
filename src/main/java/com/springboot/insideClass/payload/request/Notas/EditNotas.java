package com.springboot.insideClass.payload.request.Notas;

public class EditNotas {
    private Long asignatura_nota_id;
    private String nota;

    public Long getAsignatura_nota_id() {
        return asignatura_nota_id;
    }

    public void setAsignatura_nota_id(Long asignatura_nota_id) {
        this.asignatura_nota_id = asignatura_nota_id;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
