package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_SOST", uniqueConstraints = {@UniqueConstraint(columnNames =  "sost_id")})
public class sostenedorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer sost_id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "sost_rep_legal_id", nullable = false)
    representanteLegalEntity representanteLegalEntity;

    @NotBlank
    @Size(max = 200)
    String sost_nombre;

    public sostenedorEntity() {
    }

    public sostenedorEntity(com.springboot.insideClass.entity.representanteLegalEntity representanteLegalEntity, String sost_nombre) {
        this.representanteLegalEntity = representanteLegalEntity;
        this.sost_nombre = sost_nombre;
    }

    public Integer getSost_id() {
        return sost_id;
    }

    public void setSost_id(Integer sost_id) {
        this.sost_id = sost_id;
    }

    public void setRepresentanteLegalEntity(com.springboot.insideClass.entity.representanteLegalEntity representanteLegalEntity) {
        this.representanteLegalEntity = representanteLegalEntity;
    }

    public String getSost_nombre() {
        return sost_nombre;
    }

    public void setSost_nombre(String sost_nombre) {
        this.sost_nombre = sost_nombre;
    }
}
