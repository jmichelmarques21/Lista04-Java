package br.edu.up.Modelos;

public class ClientePessoa extends Cliente{
  private String cpf;
  private double peso;
  private double altura;
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public double getPeso() {
    return peso;
  }
  public void setPeso(double peso) {
    this.peso = peso;
  }
  public double getAltura() {
    return altura;
  }
  public void setAltura(double altura) {
    this.altura = altura;
  }

  public void cadastroClientePessoa(){
    
  }
  public String getDados(){
    return "a";
  }
  @Override
  public String toString() {
    return "ClientePessoa [cpf=" + cpf + ", peso=" + peso + ", altura=" + altura + "]";
  }

  

}
