package br.edu.up.Telas;
import br.edu.up.Modelos.Pessoal;
import br.edu.up.Modelos.Comercial;
import java.util.Scanner;

public class Menu {

  Pessoal pessoal = new Pessoal(0, null, null, null);
  Comercial comercial = new Comercial(0, null, null, null);

  Scanner scan = new Scanner(System.in);
  public void MenuPrincipal(){
    System.out.println("----------------------------------");
    System.out.println("1 - Incluir um contato pessoal: ");
    System.out.println("2 - Incluir um contato comercial: ");
    System.out.println("3 - Excluir um contato pelo código: ");
    System.out.println("4 - Consultar um contato pelo código: ");
    System.out.println("5 - Listar todos os contatos: ");
    System.out.println("6 - Sair do programa");
  }


  public void opcaoMenu(){
    int op = 0;

    System.out.println("----------------------------------");
    System.out.println("Digite a opção desejada: ");
    op = scan.nextInt();
    
    if (op == 1) {
      System.out.println("----------------");
      System.out.println("1 - Incluir um contato pessoal: ");
      System.out.println("Informe o nome do contato: ");
      int codigo = scan.nextInt();
      System.out.println("Informe o nome do contato: ");
      String nome = scan.nextLine();
      System.out.println("Informe o telefone: ");
      String telefone = scan.nextLine();
      System.out.println("Informe o aniversário: ");
      String aniversario = scan.nextLine();
      pessoal = new Pessoal(codigo, nome, telefone, aniversario);      
    } else if (op == 2) {
      System.out.println("----------------");
      System.out.println("1 - Incluir um contato comercial: ");
      System.out.println("Informe o código do contato: ");
      int codigo = scan.nextInt();
      System.out.println("informe o nome do contato: ");
      String nome = scan.nextLine();
      System.out.println("Informe o telefone do contato: ");
      String telefone = scan.nextLine();
      System.out.println("Informe o CNPJ do contato: ");
      String cnpj = scan.nextLine();
      comercial = new Comercial(codigo, nome, telefone, cnpj);
    } else if (op == 3){
      System.out.println("----------------");
      System.out.println("3 - Excluir um contato pelo código: ");
      op = scan.nextInt();
      if (pessoal.getCodigo() == op || comercial.getCodigo() == op){
        pessoal.setCodigo(0);
        comercial.setCodigo(0);
      } else {
        System.out.println("Código informado inválido.");
      }
    } else if (op == 4){
      System.out.println("----------------");
      System.out.println("4 - Consultar um contato pelo código: ");
      op = scan.nextInt();
      if (pessoal.getCodigo() == op) {
        System.out.println("Contato: " + pessoal.getCodigo());
      } else if (comercial.getCodigo() == op) {
        System.out.println("Contato: " + comercial.getCodigo());
      } else {
        System.out.println("Código informado inválido.");
      }
    } else if (op == 5) {
      System.out.println("----------------");
      System.out.println("5 - Listar todos os contatos: ");
      System.out.println(pessoal.toString());
      System.out.println(comercial.toString());
    } else {
      System.exit(0);
    }
  }



}
