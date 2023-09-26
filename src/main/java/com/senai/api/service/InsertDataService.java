package com.senai.api.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.senai.api.models.Usuario;

public interface InsertDataService {

	List<Usuario> findAllUsuarios();
	
	ResponseEntity<?> addAdmin();
	
	ResponseEntity<?> addBairros();
}
