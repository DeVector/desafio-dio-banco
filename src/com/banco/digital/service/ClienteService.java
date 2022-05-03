package com.banco.digital.service;

import com.banco.digital.model.Cliente;
import com.banco.digital.repository.ClienteRepository;

public class ClienteService {

    private ClienteRepository repository;

    private int opcao = 0;

    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public void save(int opcao, Cliente cliente){
        repository.save(opcao, cliente);
        System.out.println("Conta criada com sucesso!");
    }

    public Cliente findByCPF(String cpf){
        Cliente cliente = repository.findByCPF(cpf);
        return cliente;
    }

    public Cliente findAll(){
        return repository.findAll();
    }

    public void delete(Long id){
        repository.excluir(id);
    }

}
