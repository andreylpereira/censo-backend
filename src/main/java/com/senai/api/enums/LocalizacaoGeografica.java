package com.senai.api.enums;

public enum LocalizacaoGeografica {
    URBANA("Urbana"),
    RURAL("Rural"),
    OUTRA("Outra");

    private final String descricao;

    LocalizacaoGeografica(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}