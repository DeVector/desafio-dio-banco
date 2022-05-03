package com.banco.digital.model;

import java.util.List;

public class Banco {

    private String name;

    private List<Conta> contas;

    public Banco(){}

    public Banco(String name, List<Conta> contas){
        this.name = name;
        this.contas = contas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void exibirContas(){
        if (contas.isEmpty()){
            System.out.println("Cadastre alguma conta!!");
        }
        System.out.println("----- " + this.name + " -----");
        /*for (:) {

        }*/
    }
}
