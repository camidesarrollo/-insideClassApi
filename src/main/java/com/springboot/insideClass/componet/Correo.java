package com.springboot.insideClass.componet;

import com.springboot.insideClass.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Correo {
    private final EmailSenderService emailSenderService;

    @Autowired
    public Correo(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    public void enviarCorreoNota(String nombreAlumno, String asignatura, String nota, String nombreProfesor, String fecha) {
        String recipientEmail = "correo_destino@example.com";
        String subject = "Nueva Nota en " + asignatura;

        // Variables para reemplazar en la plantilla
        Map<String, Object> templateVariables = new HashMap<>();
        templateVariables.put("nombreAlumno", nombreAlumno);
        templateVariables.put("asignatura", asignatura);
        templateVariables.put("nota", nota);
        templateVariables.put("nombreProfesor", nombreProfesor);
        templateVariables.put("Fecha", fecha);

        emailSenderService.sendEmailWithTemplate(recipientEmail, subject, templateVariables, 1);
    }

    public void enviarCorreoAnotacion(String fecha, String asignaturaNombre, String nombre,String nombreProfesor,  String descripcion, String graved){

            String recipientEmail = "correo_destino@example.com";
            String subject = "Nueva anotacion";

            // Variables para reemplazar en la plantilla
            Map<String, Object> templateVariables = new HashMap<>();
            templateVariables.put("fecha",fecha);
            templateVariables.put("asignatura", asignaturaNombre);
            templateVariables.put("nombreAlumno", nombre);
            templateVariables.put("nombreProfesor", nombreProfesor);
            templateVariables.put("descripcion", descripcion);
            templateVariables.put("gravedad", graved);

        emailSenderService.sendEmailWithTemplate(recipientEmail, subject, templateVariables, 2);
    }

    public void enviarCorreoComunicacion(String fecha, String tipo, String descripcion) {
        String recipientEmail = "correo_destino@example.com";
        String subject = "Nueva comunicación";

        // Variables para reemplazar en la plantilla
        Map<String, Object> templateVariables = new HashMap<>();
        templateVariables.put("fecha", fecha);
        templateVariables.put("tipo", tipo);
        templateVariables.put("descripcion", descripcion);

        emailSenderService.sendEmailWithTemplate(recipientEmail, subject, templateVariables, 3);
    }


    public void enviarCorreoConPlantilla() {
        String recipientEmail = "correo_destino@example.com";
        String subject = "Asunto del correo";

        // Variables para reemplazar en la plantilla
        Map<String, Object> templateVariables = new HashMap<>();
        templateVariables.put("nombre", "John Doe");
        templateVariables.put("mensaje", "Hola, este es el contenido del correo.");

        emailSenderService.sendEmailWithTemplate(recipientEmail, subject, templateVariables, 1);
    }
}
