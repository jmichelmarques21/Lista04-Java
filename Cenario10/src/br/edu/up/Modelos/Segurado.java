package br.edu.up.Modelos;

public class Segurado {
  private String nome;
  private String rg;
  private String cpf;
  private String sexo;
  private String telefone;
  private String endereco;
  private String cep;
  private String cidade;
  


  
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }
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
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  @Override
  public String toString() {
    return "Segurado [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", sexo=" + sexo + ", telefone=" + telefone
        + ", endereco=" + endereco + ", cep=" + cep + ", cidade=" + cidade + "]";
  }

  

  

  

}
