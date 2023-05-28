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

    public boolean IsValid() {
        if (asignatura_nota_id == null || asignatura_nota_id <= 0) {
            return false;
        }

        if (nota == null || nota.isEmpty()) {
            return false;
        }

        return true;
    }
}
