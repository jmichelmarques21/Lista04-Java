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
          int apolice = scan.nextInt();
          localizarSeguro(apolice);
          break;
        case 3:
          System.out.println("Informe o número da apólice: ");
          apolice = scan.nextInt();
          excluirSeguro(apolice);          
          break;
        case 4:
          System.out.println("Excluindo todos os seguros...");
          break;
        case 5:
          System.out.println("Listar todos os seguros: ");
          System.out.println(seguro.getDados());
          break;
        case 6:
          System.out.println("Ver quantidade de seguros: ");
          break;
        case 7:
          break;
        default:
          System.out.println("Opção inválida");
          break;
      }
    }
  }

  public void incluirSeguro() {
    seguro = new Seguro(123, segurado, 1250, "01/01/2024", "31/12/2024");
    System.out.println("Seguro incluído com sucesso!");
  }

  public void localizarSeguro(int apolice) {
    if (apolice == seguro.getNumeroApolice()) {
      System.out.println("Apólice localizada: " + apolice + "\nDados: " + seguro.getDados());
    } else {
      System.out.println("Seguro inexistente");
    }
  }

  public void excluirSeguro(int apolice){
    if(apolice == seguro.getNumeroApolice()) {
      seguro.setNumeroApolice(0);
      seguro.setSegurado(null);
      seguro.setDataInicio(null);
      seguro.setDataFim(null);
      seguro.setVlrApolice(0);
      seguro.getDados();
    } else {
      System.out.println("Número de apólice não encontrado!");
    }
  }

}
