package com.springboot.insideClass;


import com.springboot.insideClass.service.PerfilService;
import com.springboot.insideClass.service.PersonaService;
import com.springboot.insideClass.service.UsuarioService;
import com.springboot.insideClass.service.VigenciaService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "InsideClass API", version = "2.0", description = "InsideClass Information"))
@SecurityScheme(name = "insideClassapi", scheme = "basic", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)


public class InsideClassApplication {

	@Autowired
	private DataSource dataSource;

	@Autowired private UsuarioService usuarioService;

	@Autowired private PerfilService perfilService;

	@Autowired private VigenciaService vigenciaService;

	@Autowired private PersonaService personaService;


	public static void main(String[] args) {
		SpringApplication.run(InsideClassApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void loadData() {
	ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
		resourceDatabasePopulator.addScript(new ClassPathResource("data.sql"));
		resourceDatabasePopulator.execute(dataSource);
	usuarioService.createUsuario(
			perfilService.obtenerPerfilPorId(3L).get(),
				vigenciaService.obtenerVigenciaPorId(1L).get(),
				personaService.obtenerPersonasPorFiltro("14218894-5", "-1", "-1","-1", "-1", "F", "-1", "-1").get(0),
				"prueba@gmail.com");
		/*usuarioService.createUsuario(perfilService.findByName("Director"), vigenciaService.findByName("Vigente"), personaService.findByRun("14218894-5"), "pruebaDir@gmail.com");*/
	}

}
