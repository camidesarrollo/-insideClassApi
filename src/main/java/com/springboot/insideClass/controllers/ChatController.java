package com.springboot.insideClass.controllers;

import com.springboot.insideClass.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/chat")
public class ChatController {
    private final ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/chat/{chatId}/mensaje")
    public ResponseEntity<String> enviarMensaje(@PathVariable Long chatId, @RequestBody String mensaje) {
        try {

            chatService.enviarMensaje(chatId, mensaje); // Agrega el tercer argumento: senderId
            return ResponseEntity.ok("Mensaje enviado con éxito");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al enviar el mensaje");
        }
    }

    @MessageMapping("/chat/{chatId}/mensaje")
    public ResponseEntity<String> enviarMensajeWebSocket(@DestinationVariable Long chatId, @Payload String mensaje) {
        try {
            chatService.enviarMensaje(chatId, mensaje); // Agrega el tercer argumento: senderId
            return ResponseEntity.ok("Mensaje enviado con éxito");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al enviar el mensaje");
        }
    }
}
