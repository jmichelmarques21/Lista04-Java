package br.edu.up.controle;

import br.edu.up.modelos.ClientePessoa;
import br.edu.up.modelos.ClienteEmpresa;

public class ClienteControle {
    private ClientePessoa[] clientesPessoa;
    private ClienteEmpresa[] clientesEmpresa;
    private int qtdClientesPessoa;
    private int qtdClientesEmpresa;

    public ClienteControle() {
        this.clientesPessoa = new ClientePessoa[100];
        this.clientesEmpresa = new ClienteEmpresa[100];
        this.qtdClientesPessoa = 0;
        this.qtdClientesEmpresa = 0;
    }

    public void adicionarClientePessoa(ClientePessoa cliente) {
        if (qtdClientesPessoa < clientesPessoa.length) {
            clientesPessoa[qtdClientesPessoa++] = cliente;
        } else {
            System.out.println("\nLimite de clientes pessoa atingido.");
        }
    }

    public void adicionarClienteEmpresa(ClienteEmpresa cliente) {
        if (qtdClientesEmpresa < clientesEmpresa.length) {
            clientesEmpresa[qtdClientesEmpresa++] = cliente;
        } else {
            System.out.println("\nLimite de clientes empresa atingido.");
        }
    }

    public ClientePessoa buscarClientePessoa(String nome) {
        for (int i = 0; i < qtdClientesPessoa; i++) {
            if (clientesPessoa[i].getNome().equals(nome)) {
                return clientesPessoa[i];
            }
        }
        return null;
    }

    public ClienteEmpresa buscarClienteEmpresa(String nome) {
        for (int i = 0; i < qtdClientesEmpresa; i++) {
            if (clientesEmpresa[i].getNome().equals(nome)) {
                return clientesEmpresa[i];
            }
        }
        return null;
    }

    public ClientePessoa[] getClientesPessoa() {
        if (qtdClientesPessoa == 0) {
            return new ClientePessoa[0];
        }
        return clientesPessoa;
    }
    
    public ClienteEmpresa[] getClientesEmpresa() {
        if (qtdClientesEmpresa == 0) {
            return new ClienteEmpresa[0];
        }
        return clientesEmpresa;
    }
}
