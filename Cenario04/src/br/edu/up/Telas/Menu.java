package br.edu.up.Telas;

import br.edu.up.Modelos.*;
import br.edu.up.Controles.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento(10);
        EstacionamentoControle controle = new EstacionamentoControle(estacionamento);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n1. Registrar Entrada de Veículo");
            System.out.println("2. Registrar Saída de Veículo");
            System.out.println("3. Emitir Relatório");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Entre com o modelo do carro: ");
                    String modelo = scanner.next();
                    System.out.print("Entre com a placa do carro: ");
                    String placa = scanner.next();
                    System.out.print("Entre com a cor do carro: ");
                    String cor = scanner.next();

                    Carro carro = new Carro();
                    carro.setModelo(modelo);
                    carro.setPlaca(placa);
                    carro.setCor(cor);

                    controle.registrarEntrada(carro);
                    break;

                case 2:
                    System.out.print("Entre com a placa do carro para saída: ");
                    placa = scanner.next();
                    controle.registrarSaida(placa);
                    break;

                case 3:
                    controle.emitirRelatorio();
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        scanner.close();
    }
}
