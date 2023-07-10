package com.springboot.insideClass.payload.request.Usuario;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class CrearUsuarioRequestValidator {

    public boolean isValid(CrearUsuarioRequest request) {
        return isUsernameValid(request.getUsername())
                && isEmailValid(request.getEmail())
                && isPasswordValid(request.getPassword())
                && isPerfilIdValid(request.getPerfil_id())
                && isVigenciaIdValid(request.getVigencia_id());
    }

    private boolean isUsernameValid(String username) {
        return StringUtils.isNotEmpty(username);
    }

    private boolean isEmailValid(String email) {
        return StringUtils.isNotEmpty(email);
    }

    private boolean isPasswordValid(String password) {
        return StringUtils.isNotEmpty(password);
    }

    private boolean isPerfilIdValid(Long perfilId) {
        // Realiza la validación del ID de perfil según tus requerimientos
        // Puedes verificar si el ID existe en la base de datos, por ejemplo
        // Devuelve true si es válido, false si no lo es
        return true;
    }

    private boolean isVigenciaIdValid(Long vigenciaId) {
        // Realiza la validación del ID de vigencia según tus requerimientos
        // Puedes verificar si el ID existe en la base de datos, por ejemplo
        // Devuelve true si es válido, false si no lo es
        return true;
    }
}
