package com.banco.digital.conta;

import com.banco.digital.cliente.Cliente;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente cliente){
        super(cliente);
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
