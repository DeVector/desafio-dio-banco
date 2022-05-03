package com.banco.digital.model;

public interface IConta {

    void depositar(double valor);

    boolean sacar(double valor);

    void transferir(Conta conta, double valor);

    void imprimirExtrato();

}
