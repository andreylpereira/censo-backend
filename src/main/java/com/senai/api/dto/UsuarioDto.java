package com.senai.api.dto;

import com.senai.api.enums.Perfil;

public class UsuarioDto {

	private int id;
	private String cpf;
	private String senha;
	private String nome;
	private String email;
	private String orgaoEntidade;
	private Perfil perfil;
	private Boolean ativo;

	public UsuarioDto() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOrgaoEntidade() {
		return orgaoEntidade;
	}

	public void setOrgaoEntidade(String orgaoEntidade) {
		this.orgaoEntidade = orgaoEntidade;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}
