package com.banco.digital.conta;

public class ContaCorrente extends Conta{

    private static final double MENSALIDADE_CONTA = 14.73d;
    private short totalTransferencia = 0;

    private double saldoAntigo = getSaldo();

    public ContaCorrente(){
        super();
        setTipoConta(TipoConta.CORRENTE);
    }

    public void manutencaoConta(){
        saldoAntigo -= MENSALIDADE_CONTA;
        setSaldo(saldoAntigo);
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        System.out.println("----- Realizando Transferencia -----");
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n------ Extrato Conta Corrente ------");
        super.imprimirInfosComuns();
    }


}
