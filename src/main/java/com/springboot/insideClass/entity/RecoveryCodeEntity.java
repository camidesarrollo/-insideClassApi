package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_CodigoRecuperacion", uniqueConstraints = {@UniqueConstraint(columnNames =  "id")})
public class RecoveryCodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String recoveryCode;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    @Temporal(TemporalType.TIMESTAMP)
    private Date expirationDateTime;

    public RecoveryCodeEntity() {
    }

    public RecoveryCodeEntity(String recoveryCode, UsuarioEntity usuario, Date expirationDateTime) {
        this.recoveryCode = recoveryCode;
        this.usuario = usuario;
        this.expirationDateTime = expirationDateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecoveryCode() {
        return recoveryCode;
    }

    public void setRecoveryCode(String recoveryCode) {
        this.recoveryCode = recoveryCode;
    }

    public Date getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(Date expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }
}
