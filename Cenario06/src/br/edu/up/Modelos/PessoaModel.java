package br.edu.up.Modelos;

public abstract class PessoaModel {
  protected String nome;
  protected String rg;

  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getRg() {
    return rg;
  }
  public void setRg(String rg) {
    this.rg = rg;
  }
  @Override
  public String toString() {
    return "PessoaModel [nome=" + nome + ", rg=" + rg + "]";
  }

  


  
}
