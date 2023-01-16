package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.usuarioEntity;
import com.springboot.insideClass.implement.userDetailsImpl;
import com.springboot.insideClass.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class userDetailsServiceImpl implements UserDetailsService {

    @Autowired
    usuarioRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        usuarioEntity user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return userDetailsImpl.build(user);
    }
}
