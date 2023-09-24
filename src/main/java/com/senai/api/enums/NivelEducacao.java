package com.senai.api.enums;

public enum NivelEducacao {
    ENSINO_FUNDAMENTAL_INCOMPLETO("Ensino Fundamental Incompleto"),
    ENSINO_FUNDAMENTAL_COMPLETO("Ensino Fundamental Completo"),
    ENSINO_MEDIO_INCOMPLETO("Ensino Médio Incompleto"),
    ENSINO_MEDIO_COMPLETO("Ensino Médio Completo"),
    ENSINO_SUPERIOR_INCOMPLETO("Ensino Superior Incompleto"),
    ENSINO_SUPERIOR_COMPLETO("Ensino Superior Completo"),
    POS_GRADUACAO_INCOMPLETA("Pós-graduação Incompleta"),
    POS_GRADUACAO_COMPLETA("Pós-graduação Completa"),
    OUTRO("Outro");

    private final String descricao;

    NivelEducacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}