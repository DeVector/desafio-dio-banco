package com.banco.digital.repository;

import com.banco.digital.model.Cliente;
import com.banco.digital.model.Conta;
import com.banco.digital.model.ContaCorrente;
import com.banco.digital.model.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    private List<Cliente> clientes = new ArrayList<>();

    public void save(int opcao,Cliente cliente){

        List<Conta> contas = new ArrayList<>();

        clientes.add(cliente);

        switch (opcao){
            case '1':
                Conta cc = new ContaCorrente(cliente);
                contas.add(cc);
                break;
            case '2':
                Conta cp = new ContaPoupanca(cliente);
                contas.add(cp);
                break;
            default:
                System.out.println("Selecione uma opção valida: 1 ou 2.");
                break;
        }
    }

    //Pesquisar por id do cliente
    public Cliente findById(long id){
        for (Cliente cliente: clientes) {
            if (cliente.getId() == id){
                System.out.println("Id: " + cliente.getId() + "\nNome: " + cliente.getName());
                return cliente;
            }
            if (clientes.isEmpty()) System.out.println("Cliente não encontrado!!!");
        }
        return null;
    }

    //Pesquisar por cpf do cliente
    public Cliente findByCPF(String cpf){
        for (Cliente cliente: clientes){
            if (cliente.getCpf() == cpf) {
                System.out.println("CPF: " + cliente.getCpf() + "\nNome: " + cliente.getName());
                return cliente;
            }
            if (clientes.isEmpty()) System.out.println("Cliente não encontrado!!!");
        }
        return null;
    }

    public Cliente findAll(){
        System.out.println("----- Clientes cadastrados -----");
        if (!(clientes.isEmpty())){
            for (Cliente cliente: clientes){
                System.out.println("Nome: " + cliente.getName() + "\nEmail: " + cliente.getEmail());
            }
        }
        if (clientes.isEmpty()) System.out.println("Não existe clientes cadastrados ainda!!!!!");
        return null;
    }

    public void excluir(long id){
        for (Cliente cliente:clientes){
            if (cliente.getId() == id){
                clientes.remove(id);
                break;
            }
        }
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
