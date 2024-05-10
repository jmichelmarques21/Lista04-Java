package br.edu.up.Modelos;

public class Estacionamento {
  private int capacidade;
  private Carro[] vagas;
  private String periodo;

  public Estacionamento(int capacidade){
    this.capacidade = capacidade;
    this.vagas = new Carro[capacidade];
  }

  public int vagaVazia(){
    int vagasDisponiveis = 0;
    for (Carro carro : vagas) {
      if (carro == null) {
        vagasDisponiveis++;
      }
    }
    return vagasDisponiveis;
  }

  private int encontraVaga(){
    for(int i = 0; i < capacidade; i++) {
      if (vagas[i] == null) {
        return i;
      }
    }
    return -1;
  }

  public void estacionarCarro(Carro carro){
    int vagaDisponivel = 0;
    if (vagaDisponivel != -1){
      vagas[vagaDisponivel] = carro;
      System.out.println("Veículo registrado!");
    } else {
      System.out.println("Estacionamento lotado!");
    }
  }

  public void removerCarro(String placa) {
    for (int i = 0; i < capacidade; i++) {
      if (vagas[i] != null && vagas[i].getPlaca().equals(placa)) {
        vagas[i] = null;
        System.out.println("Saída registrada!");
      } else {
        System.out.println("Não foi possível localizar o carro pela placa!");
      }
    }
  }



}
