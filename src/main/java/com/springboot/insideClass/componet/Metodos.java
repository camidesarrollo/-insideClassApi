package com.springboot.insideClass.componet;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
@Component
public class Metodos {


    public String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public Date parseDate(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false); // Hace que el formateo sea estricto

        return sdf.parse(dateStr);
    }

    public Calendar convertirFechaACalendar(Date fecha) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        return calendar;
    }
    public String generateRandomUsername(String firstName, String lastName, String middleName, String run) {
        // Remover cualquier espacio en blanco y convertir el RUN a una cadena
        String runString = run.replaceAll("\\s+", "");

        // Generar una abreviación del nombre y apellido
        String abbreviatedFirstName = abbreviateString(firstName);
        String abbreviatedLastName = abbreviateString(lastName);

        // Generar una abreviación del nombre medio si está disponible
        String abbreviatedMiddleName = "";
        if (middleName != null && !middleName.isEmpty()) {
            abbreviatedMiddleName = abbreviateString(middleName);
        }

        // Concatenar las abreviaciones y el RUN
        StringBuilder username = new StringBuilder();
        username.append(abbreviatedFirstName);
        username.append(abbreviatedLastName);
        username.append(abbreviatedMiddleName);
        username.append(runString);

        // Recortar el nombre de usuario si supera los 10 caracteres
        if (username.length() > 10) {
            username.setLength(10);
        }

        return username.toString().replaceAll("\\s+", "");
    }

    public static String abbreviateString(String str) {
        // Obtener la primera letra de la cadena
        String abbreviation = String.valueOf(str.charAt(2));

        // Verificar si la cadena tiene más de una palabra
        if (str.contains(" ")) {
            // Obtener la primera letra de cada palabra adicional
            String[] words = str.split(" ");
            for (int i = 1; i < words.length; i++) {
                abbreviation += words[i].charAt(2);
            }
        }

        return abbreviation;
    }
}
