package com.senai.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.api.models.Bairro;
import com.senai.api.models.Pcd;
import com.senai.api.service.ListService;

@RestController
@RequestMapping("/api/lists")
public class ListController {

	@Autowired
	private ListService listService;

	@GetMapping("/bairros")
	public List<Bairro> listBairros() {
		return listService.listarBairros();
	}

	@GetMapping("/pcds")
	public List<Pcd> listPcds() {
		return listService.listarCenso();
	}
}
