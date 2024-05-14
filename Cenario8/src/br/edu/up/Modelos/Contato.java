package br.edu.up.Modelos;

public abstract class Contato {

  protected int codigo;
  protected String nome;
  protected String telefone;

  public Contato(int codigo, String nome, String telefone){
    this.codigo = codigo;
    this.nome = nome;
    this.telefone = telefone;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  @Override
  public String toString() {
    return "Contato: " + codigo + ", nome: " + nome + ", telefone: " + telefone + ".";
  }

  

}
