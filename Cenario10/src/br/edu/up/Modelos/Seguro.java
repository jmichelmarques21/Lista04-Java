package br.edu.up.Modelos;

public class Seguro {
  private String numeroApolice;
  private Segurado segurado;
  private double vlrApolice;
  private String dataInicio;
  private String dataFim;

  public Seguro(String numApolice, Segurado segurado, double vlrApolice, String dataInicio, String dataFim) {
    this.numeroApolice = numApolice;
    this.segurado = segurado;
    this.vlrApolice = vlrApolice;
    this.dataInicio = dataInicio;
    this.dataFim = dataFim;
  }

  
  public String getNumeroApolice() {
    return numeroApolice;
  }
  public void setNumeroApolice(String numeroApolice) {
    this.numeroApolice = numeroApolice;
  }
  public Segurado getSegurado() {
    return segurado;
  }
  public void setSegurado(Segurado segurado) {
    this.segurado = segurado;
  }
  public String getDataInicio() {
    return dataInicio;
  }
  public void setDataInicio(String dataInicio) {
    this.dataInicio = dataInicio;
  }
  public String getDataFim() {
    return dataFim;
  }
  public void setDataFim(String dataFim) {
    this.dataFim = dataFim;
  }

  public String getDados(){
    return "Número da apólice: " + getNumeroApolice() +
    "Nome do segurado: " + segurado.getNome() +
    "Valor da apólice: " + getVlrApolice() +
    "Data início: " +  getDataInicio() + 
    "Data fim: " + getDataFim();
  }
  public double getVlrApolice() {
    return vlrApolice;
  }
  public void setVlrApolice(double vlrApolice) {
    this.vlrApolice = vlrApolice;
  }



  
  

}