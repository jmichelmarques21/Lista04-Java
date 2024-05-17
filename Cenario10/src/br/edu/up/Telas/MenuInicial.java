package br.edu.up.Telas;

import br.edu.up.Modelos.Segurado;
import br.edu.up.Modelos.Seguro;

import java.util.Scanner;

public class MenuInicial {
  Scanner scan = new Scanner(System.in);

  Segurado segurado = new Segurado("Jean", "123", "456", "Masculino", "789", "Rua A", "080", "Curitiba");

  int op;

  private Seguro seguro;

  public void inicio() {
    int op = 0;
    while (op != 7) {
      System.out.println("-----------------------");
      System.out.println("1 - Incluir seguro: ");
      System.out.println("2 - Localizar seguro: ");
      System.out.println("3 - Excluir seguro: ");
      System.out.println("4 - Excluir todos os seguros: ");
      System.out.println("5 - Listar todos os seguros: ");
      System.out.println("6 - Ver quantidade de seguros: ");
      System.out.println("7 - Sair...");
      System.out.println("-----------------------");
      System.out.println("Selecione uma opção: ");
      op = scan.nextInt();
      switch (op) {
        case 1:
          incluirSeguro();
          break;
        case 2:
          System.out.println("Informe o número da apólice: ");
          String apolice = scan.nextLine();
          localizarSeguro(apolice);
        case 7:
          break;
        default:
          System.out.println("Excluindo o seguro...");
          seguro.setNumeroApolice(null);
          seguro.setSegurado(null);
          seguro.setDataInicio(null);
          seguro.setDataFim(null);
          seguro.getDados();
          break;
      }
    }
  }

  public void incluirSeguro() {
    Seguro seguro = new Seguro("123", segurado, 1250, "01/01/2024", "31/12/2024");
  }

  public void localizarSeguro(String apolice) {
    if (apolice == seguro.getNumeroApolice()) {
      System.out.println("Seguro localizado!");
      System.out.println(seguro.getDados());
    } else {
      System.out.println("Seguro inexistente");
    }
    scan.close();
  }

}
