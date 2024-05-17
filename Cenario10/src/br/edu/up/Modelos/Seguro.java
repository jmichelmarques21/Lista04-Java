package br.edu.up.Modelos;

import java.time.LocalDate;

public abstract class Seguro {
  private String numeroApolice;
  private Segurado segurado;
  private LocalDate dataInicio;
  private LocalDate dataFim;
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
  public LocalDate getDataInicio() {
    return dataInicio;
  }
  public void setDataInicio(LocalDate dataInicio) {
    this.dataInicio = dataInicio;
  }
  public LocalDate getDataFim() {
    return dataFim;
  }
  public void setDataFim(LocalDate dataFim) {
    this.dataFim = dataFim;
  }

  public String getDados(){
    return "a";
  }



  
  

}