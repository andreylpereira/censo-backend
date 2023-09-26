package com.senai.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.api.service.InsertDataService;

@RestController
@RequestMapping("/api/insert")
public class InsertDataController {

	@Autowired
	private InsertDataService insertDataService;

	@PostMapping("/admin")
	public ResponseEntity<?> insertAdmin() {
		return insertDataService.addAdmin();
	}

	@PostMapping("/bairros")
	public ResponseEntity<?> insertBairros() {
		return insertDataService.addBairros();
	}

}
