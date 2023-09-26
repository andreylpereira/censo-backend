package com.senai.api.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.senai.api.enums.Perfil;
import com.senai.api.models.Bairro;
import com.senai.api.models.Usuario;
import com.senai.api.repository.BairroRepository;
import com.senai.api.repository.UsuarioRepository;
import com.senai.api.service.InsertDataService;

@Service
public class InsertDataServiceImpl implements InsertDataService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private BairroRepository bairroRepository;

	@Override
	public List<Usuario> findAllUsuarios() {

		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios;

	}

	@Override
	public ResponseEntity<?> addAdmin() {
		try {
			Usuario usuario = new Usuario(1, "07433440909", "123456", "Andrey Luiz Pereira", "andreylpereira@gmail.com",
					"Administração", Perfil.ADMINISTRADOR, true);

			Optional<Usuario> existeUsuario = usuarioRepository.findByCpf(usuario.getCpf());
			if (!existeUsuario.isEmpty()) {
				return ResponseEntity.badRequest().build();
			}

			String encryptedPassword = new BCryptPasswordEncoder().encode(usuario.getSenha());
			usuario.setSenha(encryptedPassword);
			usuarioRepository.save(usuario);

			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}

	@Override
	public ResponseEntity<?> addBairros() {
		List<Bairro> bairros = new ArrayList<>();

		bairros.add(new Bairro(1, "Centro", "Central"));
		bairros.add(new Bairro(2, "Enseada", "Litoral"));
		bairros.add(new Bairro(3, "Paulas", "Litoral"));
		bairros.add(new Bairro(4, "Itaguaçu", "Litoral"));
		bairros.add(new Bairro(5, "Acaraí", "Sul"));
		bairros.add(new Bairro(6, "Rocio", "Sul"));
		bairros.add(new Bairro(7, "Ubatuba", "Litoral"));
		bairros.add(new Bairro(8, "Iperoba", "Norte"));
		bairros.add(new Bairro(9, "Ervino", "Norte"));
		bairros.add(new Bairro(10, "Capri", "Norte"));

		for (Bairro bairro : bairros) {
			Boolean existeBairros = bairroRepository.existsById(bairro.getId());
			if (existeBairros != true) {
				bairroRepository.save(bairro);
			} else {
				return ResponseEntity.badRequest().build();
			}
		}
		return ResponseEntity.ok().build();
	}
	
}
