package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.UsuarioEntity;
import com.springboot.insideClass.entity.VigenciaEntity;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.UsuarioService;
import com.springboot.insideClass.service.VigenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    VigenciaService vigenciaService;


    @PostMapping("/cambioVigencia")
    public ResponseEntity<MessageResponse> cambioVigencia(@RequestParam("id_usuario") Long id_usuario, @RequestParam("nombre_vigencia") String nombre_vigencia){

        try{

            UsuarioEntity usuario = new UsuarioEntity();
            usuario = usuarioService.findById(id_usuario);
            if(usuario != null){
                VigenciaEntity vigencia = vigenciaService.findByName(nombre_vigencia);
                usuario.setVigenciaEntity(vigencia);
                usuarioService.save(usuario);
            }
            return ResponseEntity.ok(new MessageResponse("Se ha cambiado la vigencia correctamente"));

        }catch (Exception e){
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Al momento de cambiar vigencia del usuario!"));
        }

    }
}
