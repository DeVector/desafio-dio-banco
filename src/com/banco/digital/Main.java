package com.banco.digital;

import com.banco.digital.conta.Conta;
import com.banco.digital.conta.ContaCorrente;
import com.banco.digital.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------- Bem vindo ao banco Digital VDBR ---------------------");

        Conta cc1 = new ContaCorrente();
        Conta cp1 = new ContaPoupanca();

        cc1.depositar(100);

        cc1.transferir(cp1, 101);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();
    }

}
