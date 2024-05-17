package br.edu.up.Modelos;

public class Comercial extends Contato{
  private String cnpj;

  public Comercial(int codigo, String nome, String telefone, String cnpj){
    super(codigo,nome,telefone);
    this.cnpj = cnpj;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  @Override
  public String toString() {
    return "Comercial - Codigo: " + codigo 
    + ", CNPJ: " + cnpj 
    + ", Nome: " + nome 
    + ", Telefone: " + telefone + ".";
  }

  

}
