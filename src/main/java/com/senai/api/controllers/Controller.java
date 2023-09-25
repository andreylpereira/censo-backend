package com.senai.api.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.api.models.Usuario;

@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping("/admin")
	public String login1() {
		return "ADMIN";
	}
	@GetMapping("/membro")
	public String login2(@RequestBody @Valid Usuario usuario) {
		return "SOU MEMBRO";
	}
}
