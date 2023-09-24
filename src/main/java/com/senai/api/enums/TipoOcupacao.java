package com.senai.api.enums;

public enum TipoOcupacao {
    EMPREGADO_CLT("Empregado CLT"),
    EMPREGADO_PJ("Empregado PJ"),
    AUTONOMO("Autônomo"),
    EMPRESARIO("Empresário"),
    ESTUDANTE("Estudante"),
    APOSENTADO("Aposentado"),
    DESEMPREGADO("Desempregado"),
    OUTRO("Outro");

    private final String descricao;

    TipoOcupacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}