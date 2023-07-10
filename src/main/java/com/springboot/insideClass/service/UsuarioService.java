package com.springboot.insideClass.service;

import com.springboot.insideClass.componet.Metodos;
import com.springboot.insideClass.entity.PerfilEntity;
import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.entity.UsuarioEntity;
import com.springboot.insideClass.entity.VigenciaEntity;
import com.springboot.insideClass.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired private Metodos metodos;

    @Autowired
    PasswordEncoder encoder;


    public List<UsuarioEntity> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioEntity> obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public List<UsuarioEntity> buscarUsuariosPorFiltro(Long id, String email, String password, String username, Long usuarioPerfilId, String usuarioPersonaRun, Long usuarioVigenciaId) {
        return usuarioRepository.findByFilters(id, email, password, username, usuarioPerfilId, usuarioPersonaRun, usuarioVigenciaId);
    }

    public UsuarioEntity guardarUsuario(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    public void createUsuario(PerfilEntity perfil, VigenciaEntity vigencia, PersonaEntity persona, String correo ){


        // Create new user's account
        String pass = perfil.getPerfil_nombre() + "_"  + persona.getPersona_run();

        String userName = metodos.generateRandomUsername(perfil.getPerfil_nombre(), persona.getPersona_nombre(), persona.getPersona_apellido_paterno(),persona.getPersona_run());
        System.out.println(userName);
        System.out.println(pass);

        UsuarioEntity user = new UsuarioEntity(userName,
                correo,
                encoder.encode("1234"),
                perfil,
                vigencia,
                persona
               );

        System.out.println(pass);

        usuarioRepository.save(user);

        //correoClass.enviarCorreoGeneracionCuenta(userName, pass, perfil.getPerfil_nombre(), correo, persona.getPersona_nombre() + " "  + persona.getPersona_apellido_paterno() + " " + persona.getPersona_apellido_materno());

    }

    public static Calendar convertirFechaACalendar(Date fecha) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        return calendar;
    }
}
