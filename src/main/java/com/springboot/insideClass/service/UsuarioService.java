package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.PerfilEntity;
import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.entity.UsuarioEntity;
import com.springboot.insideClass.entity.VigenciaEntity;
import com.springboot.insideClass.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
   @Autowired
   UsuarioRepository usurepo;

    @Autowired
    PasswordEncoder encoder;

    public UsuarioEntity findById(Long usuario_id){
        try {
            return usurepo.findById(usuario_id).get();
        }catch (Exception e){

        }
        return null;
    }

    public UsuarioEntity findByUsername(String usuario_nick_name){

        try{
            return usurepo.findByUsername(usuario_nick_name);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public List<UsuarioEntity> findByRunAndPerfil(String run, Long perfil) {

        try{
            return usurepo.findByRunAndPerfil(run, perfil);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }




    public Optional<UsuarioEntity> OpfindByUsername(String usuario_nick_name){

        try{
            return usurepo.OpfindByUsername(usuario_nick_name);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public void createUsuario(PerfilEntity perfil, VigenciaEntity vigencia, PersonaEntity persona, String correo ){
        // Create new user's account
        String pass = persona.getPersona_nombre() + "_"  + persona.getPersona_run();
        UsuarioEntity user = new UsuarioEntity(pass,
                correo,
                encoder.encode(pass));

        user.setPerfilEntity(perfil);
        user.setVigenciaEntity(vigencia);
        user.setPersonaEntity(persona);

        usurepo.save(user);

    }

    public UsuarioEntity findByCorreo(String correo){

        try{
            return usurepo.findByCorreo(correo);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }


    public void save(UsuarioEntity usuario){
        try{
            usurepo.save(usuario);
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public Optional<UsuarioEntity> getUserByEmail(String email) {
        return usurepo.findByEmail(email);
    }

    public List<UsuarioEntity> findByRunPerfil(String run, long perfil){
        return usurepo.findByRunAndPerfil(run, perfil);
    }
}
