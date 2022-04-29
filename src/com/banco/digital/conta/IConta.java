package com.banco.digital.conta;

public interface IConta {

    public void sacar(double valor);

    void depositar(double valor);

    void transferir(Conta contaDestino, double valor);

    void imprimirExtrato();
}
