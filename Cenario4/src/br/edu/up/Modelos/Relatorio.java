package br.edu.up.Modelos;

public class Relatorio {
  private Estacionamento estacionamento;

  public Relatorio(Estacionamento estacionamento) {
    this.estacionamento = estacionamento;
  }

  public void emitirRelatorio() {
    int carrosEntraram = 0;
    int carrosSairam = 0;
    double receitas = 0;

    for (Carro carro : estacionamento.getVagas()) {
      if (carro != null) {
        carrosEntraram++;
      }
    }

    for (Carro carro : estacionamento.getVagas()) {
      if (carro == null) {
        carrosSairam++;
      }
    }

    receitas = carrosSairam * 5.0;

    System.out.println("Relatório do Período:");
    System.out.println("Total de carros que entraram: " + carrosEntraram);
    System.out.println("Total de carros que saíram: " + carrosSairam);
    System.out.println("Receitas geradas: R$ " + receitas);
  }
}
