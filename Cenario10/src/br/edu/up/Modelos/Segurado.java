package br.edu.up.Modelos;

public class Segurado {
  protected String nome;
  protected String rg;
  protected String cpf;
  protected String sexo;
  protected String telefone;
  protected String endereco;
  protected String cep;
  protected String cidade;


  public Segurado(String nome, String rg, String cpf, String sexo, String telefone, String endereco, String cep, String cidade) {
    this.nome = nome;
    this.rg = rg;
    this.cpf = cpf;
    this.sexo = sexo;
    this.telefone = telefone;
    this.endereco = endereco;
    this.cep = cep;
    this.cidade = cidade;
  }
  


  
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
