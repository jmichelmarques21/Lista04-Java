import br.edu.up.Modelos.*;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ano ano = new Ano(2024, false);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Compromisso");
            System.out.println("2. Excluir Compromisso");
            System.out.println("3. Listar Compromissos de um Mês");
            System.out.println("4. Listar Todos os Compromissos");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("\nAdicionar Compromisso:");
                System.out.print("Pessoa: ");
                String pessoa = scanner.nextLine();
                System.out.print("Local: ");
                String local = scanner.nextLine();
                System.out.print("Assunto: ");
                String assunto = scanner.nextLine();
                System.out.print("Hora (0-23): ");
                int hora = scanner.nextInt();
                System.out.print("Dia (1-31): ");
                int dia = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Mês (Jan, Fev, Mar, ...): ");
                String mes = scanner.nextLine();

                Compromisso compromisso = new Compromisso(pessoa, local, assunto, hora);
                for (Mes m : ano.meses) {
                    if (m.getNome().equalsIgnoreCase(mes)) {
                        m.adicionarCompromisso(compromisso, dia);
                        System.out.println("\nCompromisso adicionado com sucesso!");
                        break;
                    }
                }
            } else if (opcao == 2) {
                System.out.println("\nExcluir Compromisso:");
                System.out.print("Hora (0-23): ");
                int hora = scanner.nextInt();
                System.out.print("Dia (1-31): ");
                int dia = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Mês (Janeiro, Fevereiro, ...): ");
                String mes = scanner.nextLine();

                ano.excluirCompromisso(mes, dia, hora);
                System.out.println("\nCompromisso excluído com sucesso!");
            } else if (opcao == 3) {
                System.out.print("Mês (Jan, Fev, Mar, ...): ");
                String mes = scanner.nextLine();
                System.out.println("\n");
                System.out.println(ano.listarCompromissos(mes));
            } else if (opcao == 4) {
                System.out.println(ano.listarCompromissos());
            } else if (opcao == 5) {
                System.out.println("\nSaindo...");
                break;
            } else {
                System.out.println("\nOpção inválida!");
            }
        }

        scanner.close();
    }
}
