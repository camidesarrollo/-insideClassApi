package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_ASIGNATURA_NOTA", uniqueConstraints = {@UniqueConstraint(columnNames =  "asignatura_nota_id")})
public class AsignaturaNotaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long asignatura_nota_id;

    @NotBlank
    @Size(max = 200)
    String asignatura_nota_nota;

    @NotBlank
    @Size(max = 200)
    String posicion_nota_nota;

    public AsignaturaNotaEntity(String asignatura_nota_nota, String posicion_nota_nota) {
        this.asignatura_nota_nota = asignatura_nota_nota;
        this.posicion_nota_nota = posicion_nota_nota;
    }

    public AsignaturaNotaEntity() {
    }

    public Long getAsignatura_nota_id() {
        return asignatura_nota_id;
    }

    public void setAsignatura_nota_id(Long asignatura_nota_id) {
        this.asignatura_nota_id = asignatura_nota_id;
    }


    public String getAsignatura_nota_nota() {
        return asignatura_nota_nota;
    }

    public void setAsignatura_nota_nota(String asignatura_nota_nota) {
        this.asignatura_nota_nota = asignatura_nota_nota;
    }

    public String getPosicion_nota_nota() {
        return posicion_nota_nota;
    }

    public void setPosicion_nota_nota(String posicion_nota_nota) {
        this.posicion_nota_nota = posicion_nota_nota;
    }
}
