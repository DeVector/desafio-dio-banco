package com.banco.digital.conta;

public enum TipoConta {

    CORRENTE(0, "ROLE_CORRENTE"), POUPANCA(1, "ROLE_POLPANCA");

    private int codigo;
    private String nome;

    TipoConta(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

}
