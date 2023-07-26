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
    EstablecimientoEntity establecimiento;

    @ManyToOne(optional = false)
    @JoinColumn(name = " establecimiento_codigo_ensenanza_codigo_ensenanza_id", nullable = false)
    CodigoEnsenanzaEntity codigoEnsenanza;

    public EstablecimientoCodigoEnseñanzaEntity() {

    }

    public EstablecimientoCodigoEnseñanzaEntity(EstablecimientoEntity establecimiento, CodigoEnsenanzaEntity codigoEnsenanza) {
        this.establecimiento = establecimiento;
        this.codigoEnsenanza = codigoEnsenanza;
    }

    public Long getEstablecimiento_codigo_ensenanza_id() {
        return establecimiento_codigo_ensenanza_id;
    }

    public void setEstablecimiento_codigo_ensenanza_id(Long establecimiento_codigo_ensenanza_id) {
        this.establecimiento_codigo_ensenanza_id = establecimiento_codigo_ensenanza_id;
    }

    public EstablecimientoEntity getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(EstablecimientoEntity establecimiento) {
        this.establecimiento = establecimiento;
    }

    public CodigoEnsenanzaEntity getCodigoEnsenanza() {
        return codigoEnsenanza;
    }

    public void setCodigoEnsenanza(CodigoEnsenanzaEntity codigoEnsenanza) {
        this.codigoEnsenanza = codigoEnsenanza;
    }
}
