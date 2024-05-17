package br.edu.up.Controles;

import br.edu.up.Modelos.*;

public class EstacionamentoControle {
    private Estacionamento estacionamento;

    public EstacionamentoControle(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    public void registrarEntrada(Carro carro) {
        estacionamento.estacionarCarro(carro);
    }

    public void registrarSaida(String placa) {
        estacionamento.removerCarro(placa);
    }

    public void emitirRelatorio() {
        Relatorio relatorio = new Relatorio(estacionamento);
        relatorio.emitirRelatorio();
    }
}
