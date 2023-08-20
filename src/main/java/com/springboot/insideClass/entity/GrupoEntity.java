package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_grupos", uniqueConstraints = {@UniqueConstraint(columnNames =  "grupo_id")})
public class GrupoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grupo_id")
    private Long grupoId;

    @Column(name = "nombre_grupo", nullable = false)
    private String nombreGrupo;

    public GrupoEntity(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public Long getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(Long grupoId) {
        this.grupoId = grupoId;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }
}
