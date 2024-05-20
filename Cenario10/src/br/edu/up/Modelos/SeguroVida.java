package br.edu.up.Modelos;

public class SeguroVida extends Seguro {
  public SeguroVida(int numApolice, Segurado segurado, double vlrApolice, String dataInicio, String dataFim) {
    super(numApolice, segurado, vlrApolice, dataInicio, dataFim);
  }

  private boolean cobreDoenca;
  private boolean cobreAcidente;

  public boolean CobreDoenca() {
    return cobreDoenca;
  }

  public void setCobreDoenca(boolean cobreDoenca) {
    this.cobreDoenca = cobreDoenca;
  }

  public boolean CobreAcidente() {
    return cobreAcidente;
  }

  public void setCobreAcidente(boolean cobreAcidente) {
    this.cobreAcidente = cobreAcidente;
  }

  public String getDados() {
    return "a";
  }
}
