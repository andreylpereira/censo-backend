package com.senai.api.security;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.senai.api.enums.Perfil;
import com.senai.api.models.Usuario;
import com.senai.api.repository.UsuarioRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	private UsuarioRepository usuarioRepository;

	@Autowired
	public CustomUserDetailsService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuario = usuarioRepository.findByCpf(username)
				.orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));
		return new User(usuario.getCpf(), usuario.getSenha(), mapRolesToAuthorities(usuario.getPerfil()));
	}

	private Collection<GrantedAuthority> mapRolesToAuthorities(Perfil perfil) {
		return List.of(new SimpleGrantedAuthority(perfil.name()));
	}

}
