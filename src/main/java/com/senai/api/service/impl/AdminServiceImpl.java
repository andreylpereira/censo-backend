package com.senai.api.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.senai.api.dto.BairroDto;
import com.senai.api.dto.UsuarioDto;
import com.senai.api.models.Bairro;
import com.senai.api.models.Usuario;
import com.senai.api.repository.BairroRepository;
import com.senai.api.repository.UsuarioRepository;
import com.senai.api.service.AdminService;
import com.senai.api.service.LoginService;

@Service
public class AdminServiceImpl implements AdminService {

	private UsuarioRepository usuarioRepository;
	private BairroRepository bairroRepository;
	private LoginService loginService;

	public AdminServiceImpl(UsuarioRepository usuarioRepository, BairroRepository bairroRepository, LoginService loginService) {
		this.usuarioRepository = usuarioRepository;
		this.bairroRepository = bairroRepository;
		this.loginService = loginService;
	}

	@Override
	public List<Usuario> listarUsuarios() {

		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios;
	}

	@Override
	public ResponseEntity<?> adicionar(BairroDto bairroDto) {

		if (bairroDto != null) {
			Bairro bairro = new Bairro();
			BeanUtils.copyProperties(bairroDto, bairro);
			bairroRepository.save(bairro);
			return ResponseEntity.ok("Bairro adicionado com sucesso");
		}
		return ResponseEntity.ok("Não foi possivel adicionar");
	}

	@Override
	public ResponseEntity<?> editar(int bairro_id, BairroDto bairroDto) {
		
		Boolean isAvaible = bairroRepository.findById(bairro_id).isEmpty();
		
		if (!isAvaible) {
			Bairro bairro = new Bairro();
			BeanUtils.copyProperties(bairroDto, bairro);
			bairro.setId(bairro_id);
			bairroRepository.save(bairro);
			return ResponseEntity.ok("Bairro atualizado com sucesso");
		}
		return ResponseEntity.ok("Não foi possivel adicionar");
	}
	
	@Override
	public ResponseEntity<?> cadastrar(UsuarioDto usuarioDto) {
		
		String cpf = loginService.formatLogin(usuarioDto.getCpf());
		Boolean isAvaible = usuarioRepository.findByCpf(cpf).isEmpty();
		String encryptedPassword = new BCryptPasswordEncoder().encode(usuarioDto.getSenha());


		if (isAvaible && usuarioDto != null) {
			Usuario usuario = new Usuario();
			BeanUtils.copyProperties(usuarioDto, usuario);
			
			usuario.setCpf(cpf);
			usuario.setSenha(encryptedPassword);

			usuarioRepository.save(usuario);
			return ResponseEntity.ok("Usuário adicionado com sucesso");

		} else {
			return ResponseEntity.ok("Não foi possivel criar");
		}

	}

	public ResponseEntity<?> gerenciarPerfil(int usuario_id, UsuarioDto usuarioDto) {
		
		String cpf = loginService.formatLogin(usuarioDto.getCpf());
		Boolean isAvaible = usuarioRepository.findByCpf(cpf).isEmpty();
		Boolean isUsuario = usuarioRepository.findByCpf(cpf).get().getCpf() == cpf;
	
		if (!isAvaible && usuarioDto != null && !isUsuario) {
			
			String encryptedPassword = new BCryptPasswordEncoder().encode(usuarioDto.getSenha());
			
			Usuario usuario = new Usuario();
			BeanUtils.copyProperties(usuarioDto, usuario);
			usuario.setCpf(loginService.formatLogin(usuarioDto.getCpf()));
			usuario.setSenha(encryptedPassword);
			usuario.setId(usuario_id);
			usuarioRepository.save(usuario);
			
			return ResponseEntity.ok("Usuário atualizado com sucesso");
		}
			return ResponseEntity.ok("Não foi possivel atualizar o usuario");
	}

}
