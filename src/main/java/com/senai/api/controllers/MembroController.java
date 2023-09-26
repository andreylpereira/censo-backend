package com.senai.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.api.dto.PcdDto;
import com.senai.api.repository.BairroRepository;
import com.senai.api.repository.PcdRepository;
import com.senai.api.service.CensoService;

@RestController
@RequestMapping("/api/membro")
public class MembroController {

	private PcdRepository pcdRepository;
	private BairroRepository bairroRepository;
	private CensoService censoService;

	public MembroController(PcdRepository pcdRepository, BairroRepository bairroRepository, CensoService censoService) {
		this.pcdRepository = pcdRepository;
		this.bairroRepository = bairroRepository;
		this.censoService = censoService;
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
