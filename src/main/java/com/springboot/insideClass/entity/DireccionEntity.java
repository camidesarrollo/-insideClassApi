package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_DIRECCION", uniqueConstraints = {@UniqueConstraint(columnNames =  "direccion_id")})
public class DireccionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long direccion_id;

    @NotBlank
    @Size(max = 200)
    String direccion_calle;

    @NotBlank
    @Size(max = 200)
    String direccion_info_adicional;

    @ManyToOne(optional = false)
    @JoinColumn(name = "direccion_comuna_id", nullable = false)
    ComunaEntity comunaEntity;

    @NotBlank
    @Size(max = 200)
    String direccion_geo_x;

    @NotBlank
    @Size(max = 200)
    String direccion_geo_y;

    @ManyToOne(optional = false)
    @JoinColumn(name = "direccion_tipo_area", nullable = false)
    TipoAreaEntity tipoAreaEntity;

    public DireccionEntity() {
    }

    public DireccionEntity(String direccion_calle, String direccion_info_adicional, ComunaEntity comunaEntity, String direccion_geo_x, String direccion_geo_y, TipoAreaEntity tipoAreaEntity) {
        this.direccion_calle = direccion_calle;
        this.direccion_info_adicional = direccion_info_adicional;
        this.comunaEntity = comunaEntity;
        this.direccion_geo_x = direccion_geo_x;
        this.direccion_geo_y = direccion_geo_y;
        this.tipoAreaEntity = tipoAreaEntity;
    }

    public Long getDireccion_id() {
        return direccion_id;
    }

    public void setDireccion_id(Long direccion_id) {
        this.direccion_id = direccion_id;
    }

    public String getDireccion_calle() {
        return direccion_calle;
    }

    public void setDireccion_calle(String direccion_calle) {
        this.direccion_calle = direccion_calle;
    }



    public void setComunaEntity(ComunaEntity comunaEntity) {
        this.comunaEntity = comunaEntity;
    }

    public String getDireccion_geo_x() {
        return direccion_geo_x;
    }

    public void setDireccion_geo_x(String direccion_geo_x) {
        this.direccion_geo_x = direccion_geo_x;
    }

    public String getDireccion_geo_y() {
        return direccion_geo_y;
    }

    public void setDireccion_geo_y(String direccion_geo_y) {
        this.direccion_geo_y = direccion_geo_y;
    }

    public String getDireccion_info_adicional() {
        return direccion_info_adicional;
    }

    public void setDireccion_info_adicional(String direccion_info_adicional) {
        this.direccion_info_adicional = direccion_info_adicional;
    }

    public void setTipoAreaEntity(TipoAreaEntity tipoAreaEntity) {
        this.tipoAreaEntity = tipoAreaEntity;
    }
}
