package com.senai.api.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LocalizacaoGeografica {
    URBANA("Urbana"),
    RURAL("Rural"),
    OUTRA("Outra");

    private final String descricao;

    LocalizacaoGeografica(String descricao) {
        this.descricao = descricao;
    }

    @JsonValue
    public String getDescricao() {
        return descricao;
    }

    @JsonCreator
    public static LocalizacaoGeografica fromValue(String value) {
        for (LocalizacaoGeografica localizacao : LocalizacaoGeografica.values()) {
            if (localizacao.getDescricao().equalsIgnoreCase(value)) {
                return localizacao;
            }
        }
        throw new IllegalArgumentException("Localização geográfica inválida: " + value);
    }
}