package com.senai.api.enums;

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

    public String getDescricao() {
        return descricao;
    }
}