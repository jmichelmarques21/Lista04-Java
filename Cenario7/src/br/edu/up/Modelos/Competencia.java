package br.edu.up.Modelos;

public class Competencia {
    private String nome;
    private String tipo;

    public Competencia(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
