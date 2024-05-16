package br.edu.up.Modelos;

public abstract class Cliente {
  private String nome;
  private String telefone;
  private String email;
  private String endereco;
  private double vlrMaximoCredito;
  private double vlrEmprestado;
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
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  public double getVlrMaximoCredito() {
    return vlrMaximoCredito;
  }
  public void setVlrMaximoCredito(double vlrMaximoCredito) {
    this.vlrMaximoCredito = vlrMaximoCredito;
  }
  public double getVlrEmprestado() {
    return vlrEmprestado;
  }
  public void setVlrEmprestado(double vlrEmprestado) {
    this.vlrEmprestado = vlrEmprestado;
  }

  public double emprestar(){
    return 0;
  }

  public double devolver(){
    return 0;
  }

  public void getSaldo(){

  }
  @Override
  public String toString() {
    return "Cliente [nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", endereco=" + endereco
        + ", vlrMaximoCredito=" + vlrMaximoCredito + ", vlrEmprestado=" + vlrEmprestado + "]";
  }

  

}
