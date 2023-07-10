package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_SOSTENEDOR", uniqueConstraints = {@UniqueConstraint(columnNames =  "sostenedor_id")})
public class SostenedorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long sostenedor_id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "sostenedor_representante_legal_id", nullable = false)
    RepresentanteLegalEntity representanteLegalEntity;

    @NotBlank
    @Size(max = 200)
    String sostenedor_nombre;

    public SostenedorEntity() {
    }

    public SostenedorEntity(RepresentanteLegalEntity representanteLegalEntity, String sostenedor_nombre) {
        this.representanteLegalEntity = representanteLegalEntity;
        this.sostenedor_nombre = sostenedor_nombre;
    }

    public Long getSost_id() {
        return sostenedor_id;
    }

    public void setSost_id(Long sost_id) {
        this.sostenedor_id = sost_id;
    }

    public void setRepresentanteLegalEntity(RepresentanteLegalEntity representanteLegalEntity) {
        this.representanteLegalEntity = representanteLegalEntity;
    }

    public String getSost_nombre() {
        return sostenedor_nombre;
    }

    public void setSost_nombre(String sost_nombre) {
        this.sostenedor_nombre = sost_nombre;
    }
}
