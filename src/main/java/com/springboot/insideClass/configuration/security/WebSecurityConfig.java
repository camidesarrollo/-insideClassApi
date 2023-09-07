package com.springboot.insideClass.configuration.security;

import com.springboot.insideClass.configuration.security.jwt.AuthEntryPointJwt;
import com.springboot.insideClass.configuration.security.jwt.AuthTokenFilter;
import com.springboot.insideClass.service.UsuarioDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;


@Configuration
//@EnableWebSecurity
@EnableGlobalMethodSecurity(
    // securedEnabled = true,
    // jsr250Enabled = true,
    prePostEnabled = true)
public class WebSecurityConfig implements WebSocketMessageBrokerConfigurer { // extends WebSecurityConfigurerAdapter {
  @Autowired
  UsuarioDetailsServiceImpl userDetailsService;

  @Autowired
  private AuthEntryPointJwt unauthorizedHandler;

  @Bean
  public AuthTokenFilter authenticationJwtTokenFilter() {
    return new AuthTokenFilter();
  }

  @Bean
  public DaoAuthenticationProvider authenticationProvider() {
      DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
       
      authProvider.setUserDetailsService(userDetailsService);
      authProvider.setPasswordEncoder(passwordEncoder());
   
      return authProvider;
  }

  @Bean
  public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
    return authConfig.getAuthenticationManager();
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.cors().and().csrf().disable()
        .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
            .authorizeRequests()
            .antMatchers("/v3/api-docs/**", "/swagger-ui/**", "/swagger-ui.html").permitAll()
            .antMatchers("/api/alumno/**").permitAll()
            .antMatchers("/api/apoderado/**").permitAll()
            .antMatchers("/api/comuna/**").permitAll()
            .antMatchers("/api/curso/**").permitAll()
            .antMatchers("/api/auth/**").permitAll()
            .antMatchers("/api/docente/**").permitAll()
            .antMatchers("/api/establecimiento/**").permitAll()
            .antMatchers("/api/usuario/**").permitAll()
            .antMatchers("/api/persona/**").permitAll()
            .antMatchers("/api/asignatura/**").permitAll()
            .antMatchers("/api/matricula/**").permitAll()
            .antMatchers("/api/anotaciones/**").permitAll()
            .antMatchers("/api/comunicaciones/**").permitAll()
            .antMatchers("/api/notas/**").permitAll()
            .antMatchers("/api/asistencia/**").permitAll()
            .antMatchers("/api/docente_asignatura_curso_establecimiento/**").permitAll()
            .antMatchers("/api/mensaje/**").permitAll()
            .antMatchers("/api/ws/**").permitAll()
            .antMatchers("/ws/**").permitAll()
        .anyRequest().authenticated();

    http.authenticationProvider(authenticationProvider());

    http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
    
    return http.build();
  }

  //En el método registerStompEndpoints, se registra un punto final (endpoint) para los clientes WebSocket.
  // En este caso, el punto final se configura en /ws y se permite el acceso desde cualquier origen (setAllowedOriginPatterns("*")).
  // También se utiliza withSockJS() para habilitar la compatibilidad con navegadores que no admiten directamente WebSocket,
  // ya que SockJS proporciona una capa de abstracción para la comunicación WebSocket.
  @Override
  public void registerStompEndpoints(StompEndpointRegistry registry) {
    registry.addEndpoint("/ws").setAllowedOriginPatterns("*").withSockJS();
  }

  @Override
  public void configureMessageBroker(MessageBrokerRegistry registry) {
    registry.setApplicationDestinationPrefixes("/app");
    registry.enableSimpleBroker("/chatroom","/user");
    registry.setUserDestinationPrefix("/user");
  }

}
