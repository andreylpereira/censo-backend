package com.senai.api.enums;

public enum RendaMedia {
    RENDA_MEDIA_1("Menos de R$ 1000"),
    RENDA_MEDIA_2("De R$ 1000 a R$ 2000"),
    RENDA_MEDIA_3("De R$ 2000 a R$ 3000"),
    RENDA_MEDIA_4("De R$ 3000 a R$ 4000"),
    RENDA_MEDIA_5("De R$ 4000 a R$ 5000"),
    RENDA_MEDIA_6("Mais de R$ 5000"),
    NAO_INFORMADA("Não Informada");

    private final String descricao;

    RendaMedia(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}