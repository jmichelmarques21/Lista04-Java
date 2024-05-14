package br.edu.up.Modelos;

public abstract class Pessoa {
    private String nome;
    private String rg;
    private String matricula;

    public Pessoa(String nome, String rg, String matricula) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getMatricula() {
        return matricula;
    }
}
