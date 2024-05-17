package br.edu.up.Modelos;

public class Ano {
  protected int ano;
  private boolean bissexto;
  public Mes[] meses;

  public Ano(int ano, boolean bissexto) {
      this.ano = ano;
      this.bissexto = bissexto;
      this.meses = new Mes[12];
      inicializarMeses();
  }

  private void inicializarMeses() {
      meses[0] = new Mes(31, "Jan");
      meses[1] = new Mes(28, "Fev");
      if (bissexto) {
          meses[1] = new Mes(29, "Fev");
      }
      meses[2] = new Mes(31, "Mar");
      meses[3] = new Mes(30, "Abr");
      meses[4] = new Mes(31, "Mai");
      meses[5] = new Mes(30, "Jun");
      meses[6] = new Mes(31, "Jul");
      meses[7] = new Mes(31, "Ago");
      meses[8] = new Mes(30, "Set");
      meses[9] = new Mes(31, "Out");
      meses[10] = new Mes(30, "Nov");
      meses[11] = new Mes(31, "Dez");
  }

  public void adicionarMes(Mes mes) {
      for (int i = 0; i < meses.length; i++) {
          if (meses[i].getNome().equals(mes.getNome())) {
              meses[i] = mes;
              break;
          }
      }
  }

  public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
      for (Mes mes : meses) {
          if (mes.getNome().equals(nomeMes)) {
              mes.excluirCompromisso(diaMes, hora);
              break;
          }
      }
  }

  public String listarCompromissos(String nomeMes) {
      for (Mes mes : meses) {
          if (mes.getNome().equals(nomeMes)) {
              return mes.listarCompromissos();
          }
      }
      return "\nMês não encontrado!";
  }

  public String listarCompromissos() {
      StringBuilder sb = new StringBuilder();
      for (Mes mes : meses) {
          sb.append("\n--->").append(mes.getNome()).append(":\n");
          sb.append(mes.listarCompromissos());
      }
      return sb.toString();
  }
}
