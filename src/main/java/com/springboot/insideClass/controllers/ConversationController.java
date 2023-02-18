package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.ConversationEntity;
import com.springboot.insideClass.entity.UsuarioEntity;
import com.springboot.insideClass.service.ConversationService;
import com.springboot.insideClass.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/conversations")
public class ConversationController {

    private final ConversationService conversationService;
    private final UsuarioService userService;

    public ConversationController(ConversationService conversationService, UsuarioService userService) {
        this.conversationService = conversationService;
        this.userService = userService;
    }

    @PostMapping("/{conversationId}/users")
    public ResponseEntity<?> addUserToConversation(@PathVariable Long conversationId, @RequestParam String email) {
        Optional<UsuarioEntity> userOptional = userService.getUserByEmail(email);
        if (userOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        UsuarioEntity user = userOptional.get();
        Optional<ConversationEntity> conversationOptional = conversationService.getConversationById(conversationId);
        if (conversationOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        ConversationEntity conversation = conversationOptional.get();
        conversationService.addUserToConversation(user, conversation);
        return ResponseEntity.ok().build();
    }

}