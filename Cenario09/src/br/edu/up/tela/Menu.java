package br.edu.up.tela;

import br.edu.up.controle.ClienteControle;
import br.edu.up.modelos.*;
import java.util.Scanner;

public class Menu {
    private ClienteControle controller;
    private Scanner scanner;

    public Menu() {
        this.controller = new ClienteControle();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao = 0;
        while (opcao != 10) {
            System.out.println("\n1. Incluir cliente pessoa");
            System.out.println("2. Incluir cliente empresa");
            System.out.println("3. Mostrar dados cliente pessoa");
            System.out.println("4. Mostrar dados cliente empresa");
            System.out.println("5. Mostrar todos os clientes");
            System.out.println("6. Emprestar para cliente pessoa");
            System.out.println("7. Emprestar para cliente empresa");
            System.out.println("8. Devolução de cliente pessoa");
            System.out.println("9. Devolução de cliente empresa");
            System.out.println("10. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    incluirClientePessoa();
                    break;
                case 2:
                    incluirClienteEmpresa();
                    break;
                case 3:
                    mostrarDadosClientePessoa();
                    break;
                case 4:
                    mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    mostrarTodosClientes();
                    break;
                case 6:
                    emprestarClientePessoa();
                    break;
                case 7:
                    emprestarClienteEmpresa();
                    break;
                case 8:
                    devolverClientePessoa();
                    break;
                case 9:
                    devolverClienteEmpresa();
                    break;
                case 10:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("\n** Opção inválida! **");
                    break;
            }
        }
    }

    private void incluirClientePessoa() {
        System.out.print("\nNome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("UF: ");
        String UF = scanner.nextLine();
        System.out.print("CPF: ");
        String CPF = scanner.nextLine();
        System.out.print("Peso(Kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Altura(M): ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        Endereco endereco = new Endereco(rua, numero, bairro, cep, new Cidade(cidade, UF));
        ClientePessoa cliente = new ClientePessoa(nome, telefone, email, endereco, CPF, peso, altura);
        controller.adicionarClientePessoa(cliente);
    }

    private void incluirClienteEmpresa() {
        System.out.print("\nNome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("UF: ");
        String UF = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.print("Inscrição Estadual: ");
        String inscEstadual = scanner.nextLine();
        System.out.print("Ano de Fundação: ");
        int anoFundacao = scanner.nextInt();
        scanner.nextLine();

        Endereco endereco = new Endereco(rua, numero, bairro, cep, new Cidade(cidade, UF));
        ClienteEmpresa cliente = new ClienteEmpresa(nome, telefone, email, endereco, cnpj, inscEstadual, anoFundacao);
        controller.adicionarClienteEmpresa(cliente);
    }

    private void mostrarTodosClientes() {
        ClientePessoa[] clientesPessoa = controller.getClientesPessoa();
        ClienteEmpresa[] clientesEmpresa = controller.getClientesEmpresa();
    
        System.out.println("\nClientes Pessoa:");
        if (clientesPessoa != null) {
            for (ClientePessoa cliente : clientesPessoa) {
                if (cliente != null) {
                    int i = 1;
                    System.out.printf("\n->Cliente %d:", i);
                    i++;
                    System.out.println(cliente.toString());
                }
            }
        }
        System.out.println("\n----------------------------");
        System.out.println("\nClientes Empresa:");
        if (clientesEmpresa != null) {
            for (ClienteEmpresa cliente : clientesEmpresa) {
                if (cliente != null) {
                    int i = 1;
                    System.out.printf("\n->Empresa %d:", i);
                    i++;
                    System.out.println(cliente.toString());
                }
            }
        }
    } 

    private void mostrarDadosClientePessoa() {
        System.out.print("\nNome: ");
        String nome = scanner.nextLine();
        ClientePessoa cliente = controller.buscarClientePessoa(nome);
        if (cliente != null) {
            System.out.println(cliente.toString());
        } else {
            System.out.println("\nCliente não encontrado.");
        }
    }

    private void mostrarDadosClienteEmpresa() {
        System.out.print("\nNome: ");
        String nome = scanner.nextLine();
        ClienteEmpresa cliente = controller.buscarClienteEmpresa(nome);
        if (cliente != null) {
            System.out.println(cliente.toString());
        } else {
            System.out.println("\nCliente não encontrado.");
        }
    }

    private void emprestarClientePessoa() {
        System.out.print("\nNome: ");
        String nome = scanner.nextLine();
        ClientePessoa cliente = controller.buscarClientePessoa(nome);
        if (cliente != null) {
            System.out.print("Valor a emprestar: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            cliente.emprestar(valor);
        } else {
            System.out.println("\nCliente não encontrado.");
        }
    }

    private void emprestarClienteEmpresa() {
        System.out.print("\nNome: ");
        String nome = scanner.nextLine();
        ClienteEmpresa cliente = controller.buscarClienteEmpresa(nome);
        if (cliente != null) {
            System.out.print("Valor a emprestar: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            cliente.emprestar(valor);
        } else {
            System.out.println("\nCliente não encontrado.");
        }
    }

    private void devolverClientePessoa() {
        System.out.print("\nNome: ");
        String nome = scanner.nextLine();
        ClientePessoa cliente = controller.buscarClientePessoa(nome);
        if (cliente != null) {
            System.out.print("Valor a devolver: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            cliente.devolver(valor);
        } else {
            System.out.println("\nCliente não encontrado.");
        }
    }

    private void devolverClienteEmpresa() {
        System.out.print("\nNome: ");
        String nome = scanner.nextLine();
        ClienteEmpresa cliente = controller.buscarClienteEmpresa(nome);
        if (cliente != null) {
            System.out.print("Valor a devolver: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            cliente.devolver(valor);
        } else {
            System.out.println("\nCliente não encontrado.");
        }
    }
}
