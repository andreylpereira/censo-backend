package com.senai.api.enums;

public enum Genero {
	MASCULINO("Masculino"), FEMININO("Feminino"), NAO_BINARIO("Não Binário"), GENERO_FLUIDO("Gênero Fluido"),
	AGENEROS("Agêneros"), OUTRO("Outro");

	private final String descricao;

	Genero(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}