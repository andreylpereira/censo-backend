package com.senai.api.service;

import org.springframework.http.ResponseEntity;

import com.senai.api.dto.PcdDto;

public interface CensoService {

	ResponseEntity<?> cadastrar(int usuario_id, int bairro_id, PcdDto pcdDto);

	ResponseEntity<?> atualizar(int usuario_id, int bairro_id, int pcd_id, PcdDto pcdDto);

}
