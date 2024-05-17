package br.edu.up.Telas;
import java.util.Scanner;
import br.edu.up.Modelos.EventoModel;
import br.edu.up.Modelos.ReservaModel;


public class Programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        EventoModel evento = new EventoModel();
        ReservaModel reserva = new ReservaModel();

        int eventoOp;
        int reservaOp;
        
        System.out.println("Bem vindo ao Sistema de Reservas: ");
        do {
            System.out.println("--------------------------------");
            System.out.println("1 - Incluir evento");
            System.out.println("2 - Alterar evento");
            System.out.println("3 - Listar eventos");
            System.out.println("4 - Excluir eventos");
            System.out.println("--------------------------------");
            eventoOp = scan.nextInt();

            if (eventoOp == 1){
                System.out.println("--------------------------------");
                System.out.println("Incluir evento");
                evento = new EventoModel();
                System.out.println();
                scan.nextLine();
                System.out.println("Informe o nome do evento: ");
                evento.setNome(scan.nextLine());
                System.out.println("Informe a data: ");
                evento.setData(scan.next());
                System.out.println("Informe o local: ");
                scan.nextLine();
                evento.setLocal(scan.nextLine());
                System.out.println("Informe a lotação máxima: ");
                evento.setLotacaoMaxima(scan.nextInt());
                System.out.println("Informe o número de ingressos vendidos: ");
                evento.setIngressosVendidos(scan.nextInt());
                System.out.println("Informe o valor do ingresso: ");
                evento.setPrecoIngresso(scan.nextDouble());                
            } else if (eventoOp == 2) {
                System.out.println("--------------------------------");
                System.out.println("Alterar evento");
                System.out.println();

                System.out.println("Informe o nome do evento: ");
                scan.next();
                evento.setNome(scan.nextLine());
                System.out.println("Informe a data: ");
                evento.setData(scan.next());
                System.out.println("Informe o local: ");
                evento.setLocal(scan.next());
                System.out.println("Informe a lotação máxima: ");
                evento.setLotacaoMaxima(scan.nextInt());
                System.out.println("Informe o número de ingressos vendidos: ");
                evento.setIngressosVendidos(scan.nextInt());
                System.out.println("Informe o valor do ingresso: ");
                evento.setPrecoIngresso(scan.nextDouble());
            } else if (eventoOp == 3) {
                System.out.println("--------------------------------");
                System.out.println("Listar evento");
                System.out.println();
                System.out.println("Nome: " + evento.getNome());
                System.out.println("Data: " + evento.getData());
                System.out.println("Local: " + evento.getLocal());
                System.out.println("Lotação máxima: " + evento.getLotacaoMaxima());
                System.out.println("Ingressos vendidos: " + evento.getIngressosVendidos());
                System.out.println("Valor do ingresso: " + evento.getPrecoIngresso());

                do {
                System.out.println("--------------------------------");
                System.out.println("1 - Incluir reserva: ");
                System.out.println("2 - Alterar reserva: ");
                System.out.println("3 - Listar reserva");
                System.out.println("4 - Excluir reserva");
                reservaOp = scan.nextInt();

                if (reservaOp == 1 ){
                    System.out.println("--------------------------------");
                    System.out.println("Incluir reserva");
                    reserva = new ReservaModel();
                    System.out.println();
                    scan.nextLine();
                    System.out.println("Informe o nome do responsável pela reserva: ");
                    reserva.setNomeResponsavel(scan.nextLine());
                    System.out.println("Informe a quantidade de pessoas: ");
                    reserva.setQuantPessoas(scan.nextInt());
                    System.out.println("Informe a data: ");
                    reserva.setData(scan.next());
                    System.out.println("Informe o valor da reserva: ");
                    reserva.setValorReserva(scan.nextDouble());
                } else if (reservaOp == 2 ){

                } else if (reservaOp == 3 ) {

                } else if (reservaOp == 4 ) {

                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }

                } while (reservaOp > 0 && reservaOp < 5);
                
            } else if (eventoOp == 4) {
                System.out.println("--------------------------------");
                System.out.println("Excluir evento");
                evento.setNome(null);
                evento.setData(null);
                evento.setLocal(null);
                evento.setLotacaoMaxima(0);
                evento.setIngressosVendidos(0);
                evento.setPrecoIngresso(0);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (eventoOp > 0 && eventoOp < 5);






        scan.close();

    }
}
