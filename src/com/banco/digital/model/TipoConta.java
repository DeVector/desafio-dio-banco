package com.banco.digital.model;

public enum TipoConta {

    CORRENTE(0, "CORRENTE"), POUPANCA(1, "POUPANCA");

    private int codigo;

    private String name;

    private TipoConta(int codigo, String name){
        this.codigo = codigo;
        this.name = name;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getName() {
        return name;
    }
}
