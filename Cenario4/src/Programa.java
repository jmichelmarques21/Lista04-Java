import br.edu.up.Modelos.*;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento(10);
        int opcao = 0;
        Relatorio relatorio = new Relatorio(estacionamento);

        while (opcao != 4) {
            System.out.println("\n1. Registrar Entrada de Veículo");
            System.out.println("2. Registrar Saída de Veículo");
            System.out.println("3. Emitir Relatório");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    registrarEntrada(scanner, estacionamento);
                    break;
                case 2:
                    registrarSaida(scanner, estacionamento);
                    break;
                case 3:
                    relatorio.emitirRelatorio();                    
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

    private static void registrarEntrada(Scanner scanner, Estacionamento estacionamento) {
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

        estacionamento.estacionarCarro(carro);
    }

    private static void registrarSaida(Scanner scanner, Estacionamento estacionamento) {
        System.out.print("Entre com a placa do carro para saída: ");
        String placa = scanner.next();
        estacionamento.removerCarro(placa);
    }
}
