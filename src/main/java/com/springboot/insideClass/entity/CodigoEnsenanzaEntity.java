package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_CODIGO_ENSENANZA", uniqueConstraints = {@UniqueConstraint(columnNames =  "codigo_ensenanza_id")})
public class CodigoEnsenanzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long codigo_ensenanza_id;

    @NotBlank
    @Size(max = 400)
    String codigo_ensenanza_nombre;

    public CodigoEnsenanzaEntity() {
    }

    public Long getCodigo_ensenanza_id() {
        return codigo_ensenanza_id;
    }

    public void setCodigo_ensenanza_id(Long codigo_ensenanza_id) {
        this.codigo_ensenanza_id = codigo_ensenanza_id;
    }

    public String getCodigo_ensenanza_nombre() {
        return codigo_ensenanza_nombre;
    }

    public void setCodigo_ensenanza_nombre(String codigo_ensenanza_nombre) {
        this.codigo_ensenanza_nombre = codigo_ensenanza_nombre;
    }
}
