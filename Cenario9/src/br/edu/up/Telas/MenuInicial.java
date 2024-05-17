package br.edu.up.Telas;

import java.util.Scanner;

public class MenuInicial {

  Scanner scan = new Scanner(System.in);
  public void menuInicial(){
    System.out.println("--------------------------------");
    System.out.println("1 - Incluir cliente pessoa: ");
    System.out.println("2 - Incluir cliente empresa: ");
    System.out.println("3 - Mostrar dados cliente pessoa: ");
    System.out.println("4 - Mostrar dados cliente empresa: ");
    System.out.println("5 - Emprestar para cliente pessoa: ");
    System.out.println("6 - Emprestar para pessoa empresa: ");
    System.out.println("7 - Devolução de cliente pessoa: ");
    System.out.println("8 - Devolução de cliente empresa: ");
    System.out.println("9 - Sair");

    scan.close();
  }

  public void lerOpcaoMenu(){
    int op = 0;
    switch (op) {
      case 1:
        
        break;
    
      default:
        break;
    }
  }

  

}
