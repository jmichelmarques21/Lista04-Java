package br.edu.up.Modelos;

public class Seguro {
  private int numeroApolice;
  private Segurado segurado;
  private double vlrApolice;
  private String dataInicio;
  private String dataFim;


  public Seguro(){

  }

  public Seguro(int numApolice, Segurado segurado, double vlrApolice, String dataInicio, String dataFim) {
    this.numeroApolice = numApolice;
    this.segurado = segurado;
    this.vlrApolice = vlrApolice;
    this.dataInicio = dataInicio;
    this.dataFim = dataFim;
  }

  
  public int getNumeroApolice() {
    return numeroApolice;
  }
  public void setNumeroApolice(int numeroApolice) {
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
    return "\n\nNúmero da apólice: " + getNumeroApolice() +
    "\nNome do segurado: " + segurado.getNome() +
    "\nValor da apólice: " + getVlrApolice() +
    "\nData início: " +  getDataInicio() + 
    "\nData fim: " + getDataFim();
  }
  public double getVlrApolice() {
    return vlrApolice;
  }
  public void setVlrApolice(double vlrApolice) {
    this.vlrApolice = vlrApolice;
  }



  
  

}