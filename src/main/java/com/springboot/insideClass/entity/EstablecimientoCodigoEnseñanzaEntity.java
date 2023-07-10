package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_ESTABLECIMIENTO_CODIGO_ENSENANZA", uniqueConstraints = {@UniqueConstraint(columnNames =  "establecimiento_codigo_ensenanza_id")})
public class EstablecimientoCodigoEnseñanzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long establecimiento_codigo_ensenanza_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = " establecimiento_codigo_ensenanza_establecimiento_id", nullable = false)
    EstablecimientoEntity establecimientoEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = " establecimiento_codigo_ensenanza_codigo_ensenanza_id", nullable = false)
    CodigoEnsenanzaEntity codigoEnsenanzaEntity;

    public EstablecimientoCodigoEnseñanzaEntity() {

    }

    public Long getEstablecimiento_codigo_ensenanza_id() {
        return establecimiento_codigo_ensenanza_id;
    }

    public void setEstablecimiento_codigo_ensenanza_id(Long establecimiento_codigo_ensenanza_id) {
        this.establecimiento_codigo_ensenanza_id = establecimiento_codigo_ensenanza_id;
    }

    public EstablecimientoEntity getEstablecimientoEntity() {
        return establecimientoEntity;
    }

    public void setEstablecimientoEntity(EstablecimientoEntity establecimientoEntity) {
        this.establecimientoEntity = establecimientoEntity;
    }

    public CodigoEnsenanzaEntity getCodigoEnsenanzaEntity() {
        return codigoEnsenanzaEntity;
    }

    public void setCodigoEnsenanzaEntity(CodigoEnsenanzaEntity codigoEnsenanzaEntity) {
        this.codigoEnsenanzaEntity = codigoEnsenanzaEntity;
    }
}
