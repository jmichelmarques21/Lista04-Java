package br.edu.up.Modelos;

public class Endereco {
  private String rua;
  private String numero;
  private String bairro;
  private String cep;
  private Cidade cidade;
  public String getRua() {
    return rua;
  }
  public void setRua(String rua) {
    this.rua = rua;
  }
  public String getNumero() {
    return numero;
  }
  public void setNumero(String numero) {
    this.numero = numero;
  }
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }
  public Cidade getCidade() {
    return cidade;
  }
  public void setCidade(Cidade cidade) {
    this.cidade = cidade;
  }
  @Override
  public String toString() {
    return "Endereco [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade
        + "]";
  }

  
 
  


}
