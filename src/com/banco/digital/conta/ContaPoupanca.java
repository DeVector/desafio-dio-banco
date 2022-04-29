package com.banco.digital.conta;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(){
        super();
        setTipoConta(TipoConta.POUPANCA);
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        System.out.println("----- Realizando Transferencia -----");
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n\n\n------ Extrato Conta Poupanca ------");
        super.imprimirInfosComuns();
    }

}
