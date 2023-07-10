package com.springboot.insideClass.payload.request.Persona;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CrearPersonaRequestValidator {
    public static boolean isValid(CrearPersonaRequest request) {
        return isRunValid(request.getPersona_run())
                && isNombreValid(request.getPersona_nombre())
                && isApellidoPaternoValid(request.getPersona_apellido_paterno())
                && isFechaNacimientoValid(request.getPersona_fecha_nacimiento())
                && isSexoValid(request.getPersona_sexo())
                && isNumeroTelefonicoValid(request.getPersona_numero_telefonico())
                && isNumeroCelularValid(request.getPersona_numero_celular());
    }

    private static boolean isRunValid(String run) {
        return StringUtils.isNotEmpty(run);
    }

    private static boolean isNombreValid(String nombre) {
        return StringUtils.isNotEmpty(nombre);
    }

    private static boolean isApellidoPaternoValid(String apellidoPaterno) {
        return StringUtils.isNotEmpty(apellidoPaterno);
    }

    private static boolean isFechaNacimientoValid(Date fechaNacimiento) {
        // Realiza la validación de formato de fecha según tus requerimientos
        // Puedes utilizar bibliotecas como java.time.LocalDate o SimpleDateFormat para validar el formato y la validez de la fecha
        // Devuelve true si es válido, false si no lo es
        return true;
    }

    private static boolean isSexoValid(Character sexo) {
        // Realiza la validación del sexo según tus requerimientos
        // Puedes verificar si el valor es 'M' o 'F', por ejemplo
        // Devuelve true si es válido, false si no lo es
        return true;
    }

    private static boolean isNumeroTelefonicoValid(String numeroTelefonico) {
        // Realiza la validación del número telefónico según tus requerimientos
        // Puedes verificar el formato o la longitud del número, por ejemplo
        // Devuelve true si es válido, false si no lo es
        return true;
    }

    private static boolean isNumeroCelularValid(String numeroCelular) {
        // Realiza la validación del número celular según tus requerimientos
        // Puedes verificar el formato o la longitud del número, por ejemplo
        // Devuelve true si es válido, false si no lo es
        return true;
    }
}
