package br.edu.up.Modelos;

public class Dia {
  int diaMes;
  private Compromisso[] compromissos;

  public Dia(int diaMes) {
      this.diaMes = diaMes;
      this.compromissos = new Compromisso[24];
  }

  public void adicionarCompromisso(Compromisso comp) {
      int hora = comp.getHora();
      if (hora >= 0 && hora < 24) {
          compromissos[hora] = comp;
      } else {
          System.out.println("\nHora inválida!");
      }
  }

  public Compromisso consultarCompromisso(int hora) {
      if (hora >= 0 && hora < 24) {
          return compromissos[hora];
      } else {
          System.out.println("\nHora inválida!");
          return null;
      }
  }

  public void excluirCompromisso(int hora) {
      if (hora >= 0 && hora < 24) {
          compromissos[hora] = null;
      } else {
          System.out.println("\nHora inválida!");
      }
  }

  public String listarCompromissos() {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < compromissos.length; i++) {
          if (compromissos[i] != null) {
              sb.append(compromissos[i].toString()).append("\n");
          }
      }
      return sb.toString();
  }
}
