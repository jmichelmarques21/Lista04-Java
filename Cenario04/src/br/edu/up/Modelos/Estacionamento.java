package br.edu.up.Modelos;

public class Estacionamento {
  protected int capacidade;
  protected Carro[] vagas;
  protected int vagasOcupadas = 0;
  protected int carrosSairam = 0;
  protected int carrosEntraram = 0;

  public Estacionamento(int capacidade) {
    this.capacidade = capacidade;
    this.vagas = new Carro[capacidade];
  }

  public Carro[] getVagas() {
    return vagas;
  }

  public int vagaVazia() {
    for (int i = 0; i < capacidade; i++) {
      if (vagas[i] == null) {
        return i;
      }
    }
    return -1;
  }

  public void estacionarCarro(Carro carro) {
    int vagaDisponivel = vagaVazia();
    if (vagaDisponivel != -1) {
        vagas[vagaDisponivel] = carro;
        vagasOcupadas++;
        carrosEntraram++;
        System.out.println("Veículo registrado!");
        System.out.println("Vaga: " + (vagaDisponivel + 1));
        System.out.println("Vagas restantes: " + (capacidade - vagasOcupadas));
    } else {
        System.out.println("Estacionamento lotado!");
    }
}

  public void removerCarro(String placa) {
    boolean encontrado = false;
    for (int i = 0; i < capacidade; i++) {
      if (vagas[i] != null && vagas[i].getPlaca().equals(placa)) {
        vagas[i] = null;
        vagasOcupadas--;
        encontrado = true;
        System.out.println("Saída registrada!");
        System.out.println("Vaga liberada: " + (i + 1));
        System.out.println("Vagas restantes: " + (capacidade - vagasOcupadas));
        break;
      }
    }
    if (encontrado) {
      carrosSairam++;
    }
  }
}