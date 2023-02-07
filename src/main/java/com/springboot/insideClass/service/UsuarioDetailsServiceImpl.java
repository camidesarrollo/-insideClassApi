package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.UsuarioEntity;
import com.springboot.insideClass.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioDetailsServiceImpl implements UserDetailsService {
  @Autowired
  UsuarioRepository userRepository;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    UsuarioEntity user = userRepository.OpfindByUsername(username)
        .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

    return UsuarioDetailsImpl.build(user);
  }

}
