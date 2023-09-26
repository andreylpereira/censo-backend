package com.senai.api.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SetorOcupacao {
    SAUDE("Saúde"),
    EDUCACAO("Educação"),
    TECNOLOGIA_INFORMACAO("Tecnologia da Informação"),
    CONSTRUCAO("Construção"),
    AGRICULTURA("Agricultura"),
    COMERCIO("Comércio"),
    SERVICOS("Serviços"),
    INDUSTRIA("Indústria"),
    FINANCEIRO("Financeiro"),
    GOVERNO("Governo"),
    OUTROS("Outros");

    private final String descricao;

    SetorOcupacao(String descricao) {
        this.descricao = descricao;
    }

    @JsonValue
    public String getDescricao() {
        return descricao;
    }

    @JsonCreator
    public static SetorOcupacao fromValue(String value) {
        for (SetorOcupacao setor : SetorOcupacao.values()) {
            if (setor.getDescricao().equalsIgnoreCase(value)) {
                return setor;
            }
        }
        throw new IllegalArgumentException("Setor de Ocupação inválido: " + value);
    }
}