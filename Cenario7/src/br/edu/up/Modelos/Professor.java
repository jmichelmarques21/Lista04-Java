package br.edu.up.Modelos;

public class Professor extends Pessoa {
    private String identificacaoCurriculo;
    private Titulacao[] titulacoes;
    private int qtdTitulacoes;

    public Professor(String nome, String rg, String matricula, String identificacaoCurriculo, int tamanho) {
        super(nome, rg, matricula);
        this.identificacaoCurriculo = identificacaoCurriculo;
        this.titulacoes = new Titulacao[tamanho];
        this.qtdTitulacoes = 0;
    }

    public String getIdentificacaoCurriculo() {
        return identificacaoCurriculo;
    }

    public Titulacao[] getTitulacoes() {
        return titulacoes;
    }

    public void adicionarTitulacao(Titulacao titulacao) {
        if (qtdTitulacoes < titulacoes.length) {
            titulacoes[qtdTitulacoes++] = titulacao;
        }
    }
}
