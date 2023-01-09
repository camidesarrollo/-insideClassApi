package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_COD_ENSE", uniqueConstraints = {@UniqueConstraint(columnNames =  "cod_ense_id")})
public class codigoEnsenanzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer cod_ense_id;

    @NotBlank
    @Size(max = 400)
    String cod_ense_nombre;

    public codigoEnsenanzaEntity() {
    }

    public codigoEnsenanzaEntity(String cod_ense_nombre) {
        this.cod_ense_nombre = cod_ense_nombre;
    }

    public Integer getCod_ense_id() {
        return cod_ense_id;
    }

    public void setCod_ense_id(Integer cod_ense_id) {
        this.cod_ense_id = cod_ense_id;
    }

    public String getCod_ense_nombre() {
        return cod_ense_nombre;
    }

    public void setCod_ense_nombre(String cod_ense_nombre) {
        this.cod_ense_nombre = cod_ense_nombre;
    }
}
