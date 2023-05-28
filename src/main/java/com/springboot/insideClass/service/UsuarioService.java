package com.springboot.insideClass.service;

import com.springboot.insideClass.componet.Correo;
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

    @Autowired
    private Correo correoClass;

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
        String pass = perfil.getPerfil_nombre() + "_"  + persona.getPersona_run();

        String userName = generateRandomUsername(persona.getPersona_nombre(), persona.getPersona_apellido_paterno(), persona.getPersona_apellido_materno(),persona.getPersona_run());
        System.out.println(userName);
        System.out.println(pass);

        UsuarioEntity user = new UsuarioEntity(userName,
                correo,
                encoder.encode("1234"));

        user.setPerfilEntity(perfil);
        user.setVigenciaEntity(vigencia);
        user.setPersonaEntity(persona);

        System.out.println(pass);

        usurepo.save(user);

        //correoClass.enviarCorreoGeneracionCuenta(userName, pass, perfil.getPerfil_nombre(), correo, persona.getPersona_nombre() + " "  + persona.getPersona_apellido_paterno() + " " + persona.getPersona_apellido_materno());

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

    public UsuarioEntity VerificaIngresor(String data){
        UsuarioEntity usuario = usurepo.findByUsername(data);
        UsuarioEntity usuario1 = usurepo.findByCorreo(data);
        UsuarioEntity usuario3 = usurepo.findByRun(data);
        if(usuario != null){
            System.out.println("Como usuario buscado por userName da null" + data);
            return usuario;
        }

        if(usuario1 != null){
            System.out.println("Como usuario buscado por correo da null" + data);
            return usuario1;

        }

        if(usuario3 != null){
            System.out.println("Como usuario buscado por correo da run" +data );
            return usuario3;
        }
        System.out.println("No se encontro nadad ");
        return null;
    }

    public static String generateRandomUsername(String firstName, String lastName, String middleName, String run) {
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
        String abbreviation = String.valueOf(str.charAt(0));

        // Verificar si la cadena tiene más de una palabra
        if (str.contains(" ")) {
            // Obtener la primera letra de cada palabra adicional
            String[] words = str.split(" ");
            for (int i = 1; i < words.length; i++) {
                abbreviation += words[i].charAt(0);
            }
        }

        return abbreviation;
    }


}
