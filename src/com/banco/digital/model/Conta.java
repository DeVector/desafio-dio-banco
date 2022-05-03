package com.banco.digital.model;

import java.time.LocalDate;

public abstract class Conta implements IConta{

    private static int AGENCIA_PADRA = 0;
    private static int CONTA_PADRAO = 100;

    private int agencia;

    private int conta;

    private double saldo;

    private TipoConta tipoConta;

    private Cliente cliente;

    private LocalDate dtCriacao;

    public Conta() {}

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRA++;
        this.conta = CONTA_PADRAO++;
        this.dtCriacao = LocalDate.now();
        this.cliente = cliente;
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

    public LocalDate getDtCriacao() {
        return dtCriacao;
    }

    public Cliente getCliente(){
        return cliente;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public boolean sacar(double valor) {

        if (saldo <= valor){
            System.out.println("Saldo insuficiente!");
            return false;
        }
        saldo -= valor;
        System.out.println("Deposito realizado com sucesso!!!");
        return true;
    }

}
