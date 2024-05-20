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
    do {
      System.out.println("Selecione uma opção: ");
      op = scan.nextInt();
      switch (op) {
        case 1:
          registrarPassageiro();
          break;
        case 2:
          alterarPassageiro();
          break;
        case 3:
          listarPassageiro();
          break;
        case 4:
          excluirPassageiro();
        default:
        System.out.println("Opção inválida!");
          break;

      }
    } while (op != 5);
  }


  public void registrarPassageiro(){
    System.out.println("-------------------------------------");
          System.out.println("Informe o RG do passageiro: ");
          passageiro.setRg(scan.nextLine());
          scan.next();
          System.out.println("Informe o nome do passageiro: ");
          passageiro.setNome(scan.nextLine());
          scan.nextLine();
          System.out.println("Informe o identificador da bagagem: ");
          passageiro.setIdBagagem(scan.nextInt());
          System.out.println("Informe a passagem: ");
          passageiro.setPassagem(scan.nextInt());
  }

  public void alterarPassageiro(){
    System.out.println("-------------------------------------");
          System.out.println("Informe o RG do passageiro: ");
          passageiro.setRg(scan.nextLine());
          scan.next();
          System.out.println("Informe o nome do passageiro: ");
          passageiro.setNome(scan.nextLine());
          scan.nextLine();
          System.out.println("Informe o identificador da bagagem: ");
          passageiro.setIdBagagem(scan.nextInt());
          System.out.println("Informe a passagem: ");
          passageiro.setPassagem(scan.nextInt());
  }

  public void listarPassageiro(){
    System.out.println("Nome do passageiro: " + passageiro.getNome());
    System.out.println("RG do passageiro: " + passageiro.getRg());
    System.out.println("Identificador da bagagem: " + passageiro.getIdBagagem());
    System.out.println("Id da passagem: " + passageiro.getPassagem());
  }

  public void excluirPassageiro(){
    System.out.println("-------------------------------------");
          passageiro.setRg(null);
          System.out.println("RG: " + passageiro.getRg());
          passageiro.setNome(null);
          System.out.println("Nome:" + passageiro.getNome());
          passageiro.setIdBagagem(0);
          System.out.println("ID da bagagem: " + passageiro.getIdBagagem());
          passageiro.setPassagem(0);
          System.out.println("Passagem: " + passageiro.getPassagem());
  }
}
