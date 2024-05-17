package br.edu.up.Modelos;

public class Mes {
  private String nome;
  private int qtdeDias;
  private Dia[] dias;

  public Mes(int qtdeDias, String nome) {
      this.qtdeDias = qtdeDias;
      this.nome = nome;
      this.dias = new Dia[qtdeDias];
      for (int i = 0; i < qtdeDias; i++) {
          dias[i] = new Dia(i + 1);
      }
  }

  public String getNome() {
      return nome;
  }

  public void adicionarDia(Dia dia) {
      int diaMes = dia.diaMes;
      if (diaMes > 0 && diaMes <= qtdeDias) {
          dias[diaMes - 1] = dia;
      } else {
          System.out.println("\nDia inválido!");
      }
  }

  public void adicionarCompromisso(Compromisso comp, int diaMes) {
      if (diaMes > 0 && diaMes <= qtdeDias) {
          dias[diaMes - 1].adicionarCompromisso(comp);
      } else {
          System.out.println("\nDia inválido!");
      }
  }

  public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes) {
      Compromisso comp = new Compromisso(pessoa, local, assunto, hora);
      adicionarCompromisso(comp, diaMes);
  }

  public void excluirCompromisso(int diaMes, int hora) {
      if (diaMes > 0 && diaMes <= qtdeDias) {
          dias[diaMes - 1].excluirCompromisso(hora);
      } else {
          System.out.println("\nDia inválido!");
      }
  }

  public String listarCompromissos(int diaMes) {
      if (diaMes > 0 && diaMes <= qtdeDias) {
          return dias[diaMes - 1].listarCompromissos();
      } else {
          return "\nDia inválido!";
      }
  }

  public String listarCompromissos() {
      StringBuilder sb = new StringBuilder();
      for (Dia dia : dias) {
          sb.append("Dia ").append(dia.diaMes).append(":\n");
          sb.append(dia.listarCompromissos());
      }
      return sb.toString();
  }
}
