package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_ESTABL_COD_ENSE", uniqueConstraints = {@UniqueConstraint(columnNames =  "establ_cod_ense_id")})
public class EstablecimientoCodigoEnseñanzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long establ_cod_ense_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = " establ_cod_ense_establ_id", nullable = false)
    EstablecimientoEntity establecimientoEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = " establ_cod_ense_cod_ense_id", nullable = false)
    CodigoEnsenanzaEntity codigoEnsenanzaEntity;

    public EstablecimientoCodigoEnseñanzaEntity() {

    }

    public EstablecimientoCodigoEnseñanzaEntity(EstablecimientoEntity establecimientoEntity, CodigoEnsenanzaEntity codigoEnsenanzaEntity) {
        this.establecimientoEntity = establecimientoEntity;
        this.codigoEnsenanzaEntity = codigoEnsenanzaEntity;
    }

    public Long getEstabl_cod_ense_id() {
        return establ_cod_ense_id;
    }

    public void setEstabl_cod_ense_id(Long establ_cod_ense_id) {
        this.establ_cod_ense_id = establ_cod_ense_id;
    }

    public void setEstablecimientoEntity(EstablecimientoEntity establecimientoEntity) {
        this.establecimientoEntity = establecimientoEntity;
    }


    public void setCodigoEnsenanzaEntity(CodigoEnsenanzaEntity codigoEnsenanzaEntity) {
        this.codigoEnsenanzaEntity = codigoEnsenanzaEntity;
    }
}
