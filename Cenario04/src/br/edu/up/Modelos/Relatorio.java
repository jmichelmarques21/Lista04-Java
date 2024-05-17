package br.edu.up.Modelos;

public class Relatorio {
    private Estacionamento estacionamento;

    public Relatorio(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    public void emitirRelatorio() {
        System.out.println("\n\n-----> Relatório do Período:");
        System.out.println("\nTotal de carros que entraram: " + estacionamento.carrosEntraram);
        System.out.println("Total de carros que saíram: " + estacionamento.carrosSairam);
        System.out.println("Receitas geradas: R$ " + estacionamento.carrosSairam * 5.0);
    }
}