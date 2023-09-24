package com.senai.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.senai.api.enums.Perfil;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cpf;
	private String email;
	private String orgaoEntidade;
	private Perfil perfil;
	private Boolean ativo;
	
	public Usuario() {
	}
	
	public Usuario(int id, String cpf, String email, String orgaoEntidade, Perfil perfil, Boolean ativo) {
		this.id = id;
		this.cpf = cpf;
		this.email = email;
		this.orgaoEntidade = orgaoEntidade;
		this.perfil = perfil;
		this.ativo = ativo;
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
