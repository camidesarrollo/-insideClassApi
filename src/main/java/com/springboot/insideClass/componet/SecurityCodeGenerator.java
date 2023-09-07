package com.springboot.insideClass.componet;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class SecurityCodeGenerator {

    private static final String CARACTERES_PERMITIDOS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom GENERADOR_NUMEROS_ALEATORIOS = new SecureRandom();

    public static String generarCodigoSeguridad(int longitud) {
        StringBuilder codigoSeguridad = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int indice = GENERADOR_NUMEROS_ALEATORIOS.nextInt(CARACTERES_PERMITIDOS.length());
            char caracter = CARACTERES_PERMITIDOS.charAt(indice);
            codigoSeguridad.append(caracter);
        }

        return codigoSeguridad.toString();
    }
}
