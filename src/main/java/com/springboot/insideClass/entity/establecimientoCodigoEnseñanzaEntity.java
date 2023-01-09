package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_ESTABL_COD_ENSE", uniqueConstraints = {@UniqueConstraint(columnNames =  "establ_cod_ense_id")})
public class establecimientoCodigoEnseñanzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer establ_cod_ense_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = " establ_cod_ense_establ_id", nullable = false)
    establecimientoEntity establecimientoEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = " establ_cod_ense_cod_ense_id", nullable = false)
    codigoEnsenanzaEntity codigoEnsenanzaEntity;

    public establecimientoCodigoEnseñanzaEntity() {

    }

    public establecimientoCodigoEnseñanzaEntity(com.springboot.insideClass.entity.establecimientoEntity establecimientoEntity, com.springboot.insideClass.entity.codigoEnsenanzaEntity codigoEnsenanzaEntity) {
        this.establecimientoEntity = establecimientoEntity;
        this.codigoEnsenanzaEntity = codigoEnsenanzaEntity;
    }

    public Integer getEstabl_cod_ense_id() {
        return establ_cod_ense_id;
    }

    public void setEstabl_cod_ense_id(Integer establ_cod_ense_id) {
        this.establ_cod_ense_id = establ_cod_ense_id;
    }

    public void setEstablecimientoEntity(com.springboot.insideClass.entity.establecimientoEntity establecimientoEntity) {
        this.establecimientoEntity = establecimientoEntity;
    }


    public void setCodigoEnsenanzaEntity(com.springboot.insideClass.entity.codigoEnsenanzaEntity codigoEnsenanzaEntity) {
        this.codigoEnsenanzaEntity = codigoEnsenanzaEntity;
    }
}
