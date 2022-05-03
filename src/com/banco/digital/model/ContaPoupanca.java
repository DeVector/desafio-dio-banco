package com.banco.digital.model;

public class ContaPoupanca extends Conta{

    private static final double TAXA_TRANSFERENCIA = 7.90;

    private double valorTransferencia = 0;

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void transferir(Conta conta, double valor) {

        valorTransferencia += valor;

        if ((sacar(valor)) && valorTransferencia < getSaldo()){
            System.out.println("Transferencia feita com sucesso!!");
            sacar(TAXA_TRANSFERENCIA);
            conta.setSaldo(valor);
        }
        System.out.println("Saldo insulficiente para a transferencia!!");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("----- Extrato conta poupança -----");
        System.out.println("Titular: " + getCliente().getName());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conta: " + getConta());
        System.out.println("Saldo: R$" + getSaldo());
        System.out.println("Sua conta foi criada " + getDtCriacao());
    }
}
