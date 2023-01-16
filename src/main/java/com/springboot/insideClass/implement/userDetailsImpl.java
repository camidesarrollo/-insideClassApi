package com.springboot.insideClass.implement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springboot.insideClass.entity.perfilEntity;
import com.springboot.insideClass.entity.usuarioEntity;
import com.springboot.insideClass.service.perfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Objects;

public class userDetailsImpl implements UserDetails {
    private static final long serialVersionUID = 1L;

    Integer usuario_id;

    String usuario_nickName;

    @JsonIgnore
    String usuario_password;

    @Autowired
    static
    perfilService perfilSer;

    private GrantedAuthority authorities;

    public userDetailsImpl(Integer usuario_id, String usuario_nickName, String usuario_password, GrantedAuthority authorities) {
        this.usuario_id = usuario_id;
        this.usuario_nickName = usuario_nickName;
        this.usuario_password = usuario_password;
        this.authorities = authorities;
    }

    public static userDetailsImpl build(usuarioEntity user) {

        perfilEntity perfil = perfilSer.findByUsuarioId(user.getUsuario_nickName());

        GrantedAuthority authorities = new SimpleGrantedAuthority(perfil.getPerfil_nombre());

        return new userDetailsImpl(
                user.getUsuario_id(),
                user.getUsuario_nickName(),
                user.getUsuario_password(),
                authorities);
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public static perfilService getPerfilSer() {
        return perfilSer;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return (Collection<? extends GrantedAuthority>) authorities;
    }

    @Override
    public String getPassword() {
        return usuario_password;
    }

    @Override
    public String getUsername() {
        return usuario_nickName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        userDetailsImpl user = (userDetailsImpl) o;
        return Objects.equals(usuario_id, user.usuario_id);
    }
}
