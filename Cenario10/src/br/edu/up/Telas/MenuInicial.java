package br.edu.up.Telas;
import br.edu.up.Modelos.Segurado;
import java.util.Scanner;
public class MenuInicial {
  Scanner scan = new Scanner(System.in);

  public void Inicio() {

    System.out.println("-----------------------");
    System.out.println("1 - Incluir seguro: ");
    System.out.println("2 - Localizar seguro: ");
    System.out.println("3 - Excluir seguro: ");
    System.out.println("4 - Excluir todos os seguros: ");
    System.out.println("5 - Listar todos os seguros: ");
    System.out.println("6 - Ver quantidade de seguros: ");
    System.out.println("7 - Sair...");
    System.out.println("-----------------------");
    scan.close();
  }

  public void lerMenuInicial(){
    int op = 0;
    switch(op){
      case 1:
      System.out.println("-------------------------");
      System.out.println("Informe o nome do segurado: ");
      scan.nextLine();
      Segurado segurado = new Segurado();
      segurado.setNome(scan.nextLine());
      System.out.println("Informe o RG: ");
      segurado.setRg(scan.nextLine()); 
      System.out.println("informe o CPF: ");
      segurado.setCpf(scan.nextLine());
      System.out.println("Informe o gênero: ");
      segurado.setSexo(scan.nextLine());
      System.out.println("Informe o telefone: ");
      segurado.setTelefone(scan.nextLine());
      System.out.println("Informe o endereço: ");
      segurado.setTelefone(scan.nextLine());
      System.out.println("Informe o CEP: ");
      segurado.setCep(scan.nextLine());
      System.out.println("Informe a cidade: ");
      segurado.setCidade(scan.nextLine());  

      break;
      case 2:

      break;
      case 3:

      break;
      case 4:

      break;
      case 5:

      break;
      case 6:

      break;
      case 7:

      break;
      default:
        System.out.println("Opção inválida!");
        break;
    }
  }

}
