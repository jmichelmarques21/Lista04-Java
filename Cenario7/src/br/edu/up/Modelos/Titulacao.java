package br.edu.up.Modelos;

public class Titulacao {
    private String nomeInstituicao;
    private int anoConclusao;
    private String nomeTitulo;
    private String tituloTrabalhoConclusao;

    public Titulacao(String nomeInstituicao, int anoConclusao, String nomeTitulo, String tituloTrabalhoConclusao) {
        this.nomeInstituicao = nomeInstituicao;
        this.anoConclusao = anoConclusao;
        this.nomeTitulo = nomeTitulo;
        this.tituloTrabalhoConclusao = tituloTrabalhoConclusao;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public String getTituloTrabalhoConclusao() {
        return tituloTrabalhoConclusao;
    }
}
