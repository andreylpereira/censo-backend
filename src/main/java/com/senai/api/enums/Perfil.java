package com.senai.api.enums;

public enum Perfil {
	ADMINISTRADOR("ADMINISTRADOR"), MEMBRO("MEMBRO");

	private final String descricao;

	Perfil(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
