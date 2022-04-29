package com.banco.digital.conta;

public abstract class Conta implements IConta{

    protected static final byte AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    private double saldo;
    private TipoConta tipoConta;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }
    public Conta(double saldo) {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }


    public int getConta() {
        return conta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public void sacar(double valor){

        System.out.println("\n----- Bem vindo ao saque -----\n");
        if (saldo < valor){
            System.out.println("Impossivel sacar pois seu saldo é menor que o valor pedido.");
        } else {
            saldo -= valor;
            setSaldo(saldo);
            System.out.println("Saque realizado com sucesso seu novo saldo é: " + getSaldo());
        }
        System.out.println("\n-------- Saque finalizado ------\n");

    }

    @Override
    public void depositar(double valor){

        System.out.println("\n----- Bem vindo ao deposito -----\n");
        System.out.println("Valor depositado: " + valor);
        saldo += valor;
        setSaldo(saldo);
        System.out.println("Seu novo saldo: " + getSaldo());
        System.out.println("\n----- Deposito realizado com sucesso. -----\n");

    }

    protected void imprimirInfosComuns() {
        System.out.printf("\nAgencia: %d", this.agencia);
        System.out.printf("\nConta: %d", this.conta);
        System.out.printf("\nSaldo: %.2f", this.saldo);
    }

}
