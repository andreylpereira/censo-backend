package com.senai.api.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

    @JsonValue
    public String getDescricao() {
        return descricao;
    }

    @JsonCreator
    public static TipoOcupacao fromValue(String value) {
        for (TipoOcupacao tipo : TipoOcupacao.values()) {
            if (tipo.getDescricao().equalsIgnoreCase(value)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo de Ocupação inválido: " + value);
    }
}