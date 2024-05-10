package br.edu.up.Modelos;

public class Ano {
  
  private int ano;
  private boolean bissexto;
  private Mes[] meses;

  public Ano(int ano, boolean bissexto) {
    this.ano = ano;
    this.bissexto = bissexto;
  }

}
