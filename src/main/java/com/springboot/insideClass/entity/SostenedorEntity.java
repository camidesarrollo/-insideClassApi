package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_SOST", uniqueConstraints = {@UniqueConstraint(columnNames =  "sost_id")})
public class SostenedorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long sost_id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "sost_rep_legal_id", nullable = false)
    RepresentanteLegalEntity representanteLegalEntity;

    @NotBlank
    @Size(max = 200)
    String sost_nombre;

    public SostenedorEntity() {
    }

    public SostenedorEntity(RepresentanteLegalEntity representanteLegalEntity, String sost_nombre) {
        this.representanteLegalEntity = representanteLegalEntity;
        this.sost_nombre = sost_nombre;
    }

    public Long getSost_id() {
        return sost_id;
    }

    public void setSost_id(Long sost_id) {
        this.sost_id = sost_id;
    }

    public void setRepresentanteLegalEntity(RepresentanteLegalEntity representanteLegalEntity) {
        this.representanteLegalEntity = representanteLegalEntity;
    }

    public String getSost_nombre() {
        return sost_nombre;
    }

    public void setSost_nombre(String sost_nombre) {
        this.sost_nombre = sost_nombre;
    }
}
