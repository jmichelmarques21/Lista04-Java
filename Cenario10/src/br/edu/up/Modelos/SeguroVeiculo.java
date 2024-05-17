package br.edu.up.Modelos;

public class SeguroVeiculo extends Seguro{



  public SeguroVeiculo(String numApolice, Segurado segurado, double vlrApolice, String dataInicio, String dataFim) {
    super(numApolice, segurado, vlrApolice, dataInicio, dataFim);
    //TODO Auto-generated constructor stub
  }

  private double valorFranquia;
  private boolean temCarroReserva;
  private boolean cobreVidros;
  public double getValorFranquia() {
    return valorFranquia;
  }
  public void setValorFranquia(double valorFranquia) {
    this.valorFranquia = valorFranquia;
  }
  public boolean isTemCarroReserva() {
    return temCarroReserva;
  }
  public void setTemCarroReserva(boolean temCarroReserva) {
    this.temCarroReserva = temCarroReserva;
  }
  public boolean isCobreVidros() {
    return cobreVidros;
  }
  public void setCobreVidros(boolean cobreVidros) {
    this.cobreVidros = cobreVidros;
  }

  public String getDados(){
    return "a";
  }

  
}
