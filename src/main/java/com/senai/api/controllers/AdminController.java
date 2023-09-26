package com.senai.api.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.api.dto.BairroDto;
import com.senai.api.dto.PcdDto;
import com.senai.api.dto.UsuarioDto;
import com.senai.api.models.Usuario;
import com.senai.api.repository.BairroRepository;
import com.senai.api.repository.PcdRepository;
import com.senai.api.service.AdminService;
import com.senai.api.service.CensoService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

	private AdminService adminService;
	private PcdRepository pcdRepository;
	private BairroRepository bairroRepository;
	private CensoService censoService;

	public AdminController(AdminService adminService, PcdRepository pcdRepository, BairroRepository bairroRepository,
			CensoService censoService) {
		this.adminService = adminService;
		this.pcdRepository = pcdRepository;
		this.bairroRepository = bairroRepository;
		this.censoService = censoService;
	}

	@GetMapping("/users")
	public List<Usuario> listUsuarios() {
		return adminService.listarUsuarios();
	}

	@PostMapping("/bairros/insert")
	public ResponseEntity<?> insertBairro(@RequestBody BairroDto bairroDto) {
		return adminService.adicionar(bairroDto);
	}

	@PutMapping("/bairros/{bairro_id}/update")
	public ResponseEntity<?> updateBairro(@PathVariable int bairro_id, @RequestBody BairroDto bairroDto) {
		return adminService.editar(bairro_id, bairroDto);
	}

	@PostMapping("/users/insert")
	public ResponseEntity<?> insertUsuario(@RequestBody UsuarioDto usuarioDto) {
		return adminService.cadastrar(usuarioDto);
	}

	@PutMapping("/users/{usuario_id}/update")
	public ResponseEntity<?> updateUsuario(@PathVariable int usuario_id, @RequestBody UsuarioDto usuarioDto) {
		return adminService.gerenciarPerfil(usuario_id, usuarioDto);
	}

	@PostMapping("/users/{usuario_id}/censo/bairro/{bairro_id}/insert")
	public ResponseEntity<?> insertPcd(@PathVariable int usuario_id, @PathVariable int bairro_id,
			@RequestBody PcdDto pcdDto) {
		return censoService.cadastrar(usuario_id, bairro_id, pcdDto);
	}

	@PutMapping("/users/{usuario_id}/censo/bairro/{bairro_id}/update/{pcd_id}")
	public ResponseEntity<?> updatePcd(@PathVariable int usuario_id, @PathVariable int bairro_id,
			@PathVariable int pcd_id, @RequestBody PcdDto pcdDto) {
		return censoService.atualizar(usuario_id, bairro_id, pcd_id, pcdDto);
	}

}
