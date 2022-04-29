package com.banco.digital;

import com.banco.digital.cliente.Cliente;
import com.banco.digital.conta.Conta;
import com.banco.digital.conta.ContaCorrente;
import com.banco.digital.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------- Bem vindo ao banco Digital VDBR ---------------------");

        Cliente cl1 = new Cliente("Loren Silva", 27);
        Cliente cl2 = new Cliente("Victor Oliveira", 26);

        Conta cc1 = new ContaCorrente(cl1);
        Conta cp1 = new ContaPoupanca(cl2);

        cc1.depositar(100);

        cc1.transferir(cp1, 101);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();
    }

}
