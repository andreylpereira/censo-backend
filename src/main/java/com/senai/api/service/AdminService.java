package com.senai.api.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.senai.api.dto.BairroDto;
import com.senai.api.dto.UsuarioDto;
import com.senai.api.models.Usuario;

public interface AdminService {

	List<Usuario> listarUsuarios();

	ResponseEntity<?> cadastrar(UsuarioDto usuarioDto);

	ResponseEntity<?> gerenciarPerfil(int usuario_id, UsuarioDto usuarioDto);

	ResponseEntity<?> adicionar(BairroDto bairroDto);
	
	ResponseEntity<?> editar(int bairro_id, BairroDto bairroDto);
}
