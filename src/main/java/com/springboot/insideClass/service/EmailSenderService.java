package com.springboot.insideClass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Map;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;

    private final TemplateEngine templateEngine;

    @Autowired
    public EmailSenderService(JavaMailSender mailSender, TemplateEngine templateEngine) {
        this.mailSender = mailSender;
        this.templateEngine = templateEngine;
    }


    public void sendSimpleEmail(String toEmail,
                                String body,
                                String subject) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("spring.email.from@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);
        mailSender.send(message);
        System.out.println("Mail Send...");
    }



    public void sendEmailWithAttachment(String toEmail,
                                        String body,
                                        String subject,
                                        String attachment) throws MessagingException {

        MimeMessage mimeMessage = mailSender.createMimeMessage();

        MimeMessageHelper mimeMessageHelper
                = new MimeMessageHelper(mimeMessage, true);

        mimeMessageHelper.setFrom("spring.email.from@gmail.com");
        mimeMessageHelper.setTo(toEmail);
        mimeMessageHelper.setText(body);
        mimeMessageHelper.setSubject(subject);

        FileSystemResource fileSystem
                = new FileSystemResource(new File(attachment));

        mimeMessageHelper.addAttachment(fileSystem.getFilename(),
                fileSystem);

        mailSender.send(mimeMessage);
        System.out.println("Mail Send...");

    }

    public void sendEmailWithTemplate(String recipientEmail, String subject, Map<String, Object> templateVariables, int tipoCorreo) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            // Configura el destinatario, asunto y contenido del correo electrónico
            helper.setTo(recipientEmail);
            helper.setSubject(subject);

            // Carga la plantilla Thymeleaf
            Context context = new Context();
            context.setVariables(templateVariables);
            String content =" ";
            if(tipoCorreo == 1){
                 content = templateEngine.process("Notas.html", context);
            }else if(tipoCorreo == 2){
                 content = templateEngine.process("Anotacion.html", context);
            }else if(tipoCorreo == 3){
                content = templateEngine.process("Comunicaciones.html", context);
            }else if(tipoCorreo == 4){
                content = templateEngine.process("Asistencia.html", context);
            }




            // Adjunta el contenido de la plantilla al correo electrónico
            helper.setText(content, true);

            // Envía el correo electrónico
            mailSender.send(message);
        } catch (Exception e) {
            // Maneja las excepciones si ocurre algún error durante el envío del correo
            e.printStackTrace();
        }
    }
}
