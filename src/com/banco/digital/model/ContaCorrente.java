package com.banco.digital.model;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.format.DateTimeFormatter;

public class ContaCorrente extends Conta{

    private static final double MENSALIDADE_CONTA = 14.72;
    private static final double VALOR_TRANSFERENCIA = 7.90;
    private static int totalTransferencia = 0;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferir(Conta conta, double valor) {

        if ((sacar(valor)) && totalTransferencia < 5){
            System.out.println("Tranferencia efetuada com sucesso!!");
            conta.setSaldo(valor);
            totalTransferencia++;
        }
        System.out.println("Saldo insuficiente para efetuar a transferencia!!");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("------ Extrato conta corrente -----");
        System.out.println("Titular: " + getCliente().getName());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conta: " + getConta());
        System.out.println("Saldo: R$" + getSaldo());
        System.out.println("Sua conta foi criada " + getDtCriacao());
    }

    public static double getMensalidadeConta() {
        return MENSALIDADE_CONTA;
    }

    public static double getValorTransferencia() {
        return VALOR_TRANSFERENCIA;
    }
}
