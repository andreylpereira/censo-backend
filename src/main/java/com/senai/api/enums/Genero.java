package com.senai.api.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    NAO_BINARIO("Não Binário"),
    GENERO_FLUIDO("Gênero Fluido"),
    AGENEROS("Agêneros"),
    OUTRO("Outro");

    private final String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    @JsonValue
    public String getDescricao() {
        return descricao;
    }

    @JsonCreator
    public static Genero fromValue(String value) {
        for (Genero genero : Genero.values()) {
            if (genero.getDescricao().equalsIgnoreCase(value)) {
                return genero;
            }
        }
        throw new IllegalArgumentException("Gênero inválido: " + value);
    }
}