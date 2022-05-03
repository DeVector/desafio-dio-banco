package com.banco.digital.controller;

import com.banco.digital.model.Cliente;
import com.banco.digital.model.ContaCorrente;
import com.banco.digital.repository.ClienteRepository;
import com.banco.digital.service.ClienteService;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ClienteController {

    public ClienteController() {

    }

    public static void main(String[] args) throws InterruptedException {

        int opcao = -1;
        int opcaoConta = 0;

        Cliente cliente = new Cliente("Victor", "12345678911", "vito@mail.com", "123456", 26);

        System.out.println(cliente.getName());

        ClienteRepository repository = new ClienteRepository();
        repository.save(1, cliente);
        repository.findAll();

        Scanner op = new Scanner(System.in);
        Scanner opConta = new Scanner(System.in);
        Scanner opDelete = new Scanner(System.in);
        Scanner nameCon = new Scanner(System.in);
        Scanner idadeCon = new Scanner(System.in);
        Scanner cpfCon = new Scanner(System.in);
        Scanner emailCon = new Scanner(System.in);
        Scanner senhaCon = new Scanner(System.in);


        System.out.println("----- BEM VINDO AO BANCO DIGITAL -----");
        System.out.println("----- AGUARDE ENTRANDO NO SISTEMA -----");
        TimeUnit.SECONDS.sleep(10);
        System.out.println("----- ESCOLHA UMA OPÇÃO ABAIXO -----");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Listar contas");
        System.out.println("3 - Deletar conta");
        System.out.println("4 - Encontrar conta pelo CPF");
        System.out.println("0 - Para sair do sistema!!");

        TimeUnit.SECONDS.toSeconds(30);

        do{
            opcao = op.nextInt();
            switch (opcao){
                case 0:
                    System.out.println("----- Ate mais amigo!!!!! -----");
                    break;
                case 1:
                    System.out.println("1 - Para conta corrente.");
                    System.out.println("Beneficios da conta corrente: São de ter ate 5 transferencias gratuitas, porem se utrapassar será pago um valor de R$" +
                            ContaCorrente.getValorTransferencia() + " e tera uma mensalidade de R$" + ContaCorrente.getMensalidadeConta() + ".");
                    System.out.println("2 - Para conta poupança.");
                    System.out.println("Beneficios da conta poupança: É de que você não sera cobrado nenhuma mensalidade para deixar seu dinheiro guardado, " +
                            "porem você pagar por suas transferencias o valor de R$"+ ContaCorrente.getValorTransferencia());
                    opcaoConta = opConta.nextInt();

                    TimeUnit.SECONDS.toSeconds(30);

                    System.out.printf("Nome: ");
                    String name = nameCon.next();

                    System.out.printf("Idade: ");
                    int idade = idadeCon.nextInt();

                    System.out.printf("CPF: ");
                    String cpf = cpfCon.next();

                    System.out.printf("Email: ");
                    String email = emailCon.next();

                    System.out.printf("Senha: ");
                    String senha = senhaCon.next();

                    Cliente cliente1 = new Cliente(name, cpf, email, senha, idade);

                    repository.save(opcaoConta, cliente1);

                    break;
                case 2:
                    repository.findAll();
                    break;
                case 3:
                    System.out.printf("Entre com o codigo da conta para deletar: ");
                    repository.delete(opDelete.nextLong());
                    break;
                case 4:
                    System.out.printf("Entre com o CPF: ");
                    repository.findByCPF(cpfCon.next());
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!!!! INSIRA UM VALOR ENTRE 0 E 4");
                    break;
                }
            }while (opcao != 0);

        }
}
