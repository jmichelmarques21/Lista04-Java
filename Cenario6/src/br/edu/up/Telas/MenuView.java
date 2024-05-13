package br.edu.up.Telas;

import br.edu.up.Modelos.PassageiroModel;

import java.util.Scanner;

public class MenuView {

  PassageiroModel passageiro = new PassageiroModel();

  public int op;

  Scanner scan = new Scanner(System.in);

  public void exibirMenuPrincipal() {
    System.out.println("-------------------------------------");
    System.out.println("1 - Registrar passageiro: ");
    System.out.println("2 - Alterar passageiro:  ");
    System.out.println("3 - Listar passageiro: ");
    System.out.println("4 - Excluir passageiro: ");
  }

  public void receberOpcao() {
    System.out.println("Selecione uma opção: ");
    op = scan.nextInt();
    while (op <= 5) {
      switch (op) {
        case 1:
          System.out.println("-------------------------------------");
          System.out.println("Informe o RG do passageiro: ");
          passageiro.setRg(scan.nextLine());
          scan.next();
          System.out.println("Informe o nome do passageiro: ");
          passageiro.setNome(scan.nextLine());
          scan.next();
          System.out.println("Informe o identificador da bagagem: ");
          passageiro.setIdBagagem(scan.nextInt());
          System.out.println("Informe a passagem: ");
          passageiro.setPassagem(scan.nextInt());
          break;
        case 2:
          System.out.println("-------------------------------------");
          System.out.println("Informe o RG do passageiro: ");
          passageiro.setRg(scan.nextLine());
          System.out.println("Informe o nome do passageiro: ");
          passageiro.setNome(scan.nextLine());
          System.out.println("Informe o identificador da bagagem: ");
          passageiro.setIdBagagem(scan.nextInt());
          System.out.println("Informe a passagem: ");
          passageiro.setPassagem(scan.nextInt());
          break;
        case 3:
          System.out.println("-------------------------------------");
          System.out.println("RG: " + passageiro.getRg());
          System.out.println("Nome: " + passageiro.getNome());
          System.out.println("ID da bagagem: " + passageiro.getIdBagagem());
          System.out.println("Passagem: " + passageiro.getPassagem());
          break;
        case 4:
          System.out.println("-------------------------------------");
          passageiro.setRg(null);
          System.out.println("RG: " + passageiro.getRg());
          passageiro.setNome(null);
          System.out.println("Nome:" + passageiro.getNome());
          passageiro.setIdBagagem(0);
          System.out.println("ID da bagagem: " + passageiro.getIdBagagem());
          passageiro.setPassagem(0);
          System.out.println("Passagem: " + passageiro.getPassagem());
        default:
        System.out.println("Opção inválida!");
          break;

      }
      scan.close();
    }
  }
}
// switch (op) {
// case 1:
// System.out.println("-------------------------------------");
// System.out.println("Informe o RG do passageiro: ");
// passageiro.setRg(scan.nextLine());
// System.out.println("Informe o nome do passageiro: ");
// passageiro.setNome(scan.nextLine());
// System.out.println("Informe o identificador da bagagem: ");
// passageiro.setIdBagagem(scan.nextInt());
// System.out.println("Informe a passagem: ");
// passageiro.setPassagem(scan.nextInt());
// break;
// case 2:
// System.out.println("-------------------------------------");
// System.out.println("Informe o RG do passageiro: ");
// passageiro.setRg(scan.nextLine());
// System.out.println("Informe o nome do passageiro: ");
// passageiro.setNome(scan.nextLine());
// System.out.println("Informe o identificador da bagagem: ");
// passageiro.setIdBagagem(scan.nextInt());
// System.out.println("Informe a passagem: ");
// passageiro.setPassagem(scan.nextInt());
// break;
// case 3:
// System.out.println("-------------------------------------");
// System.out.println("RG: " + passageiro.getRg());
// System.out.println("Nome: " + passageiro.getNome());
// System.out.println("ID da bagagem: " + passageiro.getIdBagagem());
// System.out.println("Passagem: " + passageiro.getPassagem());
// break;
// case 4:
// System.out.println("-------------------------------------");
// passageiro.setRg(null);
// System.out.println("RG: " + passageiro.getRg());
// passageiro.setNome(null);
// System.out.println("Nome:" + passageiro.getNome());
// passageiro.setIdBagagem(0);
// System.out.println("ID da bagagem: " + passageiro.getIdBagagem());
// passageiro.setPassagem(0);
// System.out.println("Passagem: " + passageiro.getPassagem());
// default:
// break;
// }

// scan.close();
