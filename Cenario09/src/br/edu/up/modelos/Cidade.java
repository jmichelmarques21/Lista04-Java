package br.edu.up.modelos;

public class Cidade {
    private String nome;
    private String UF;

    public Cidade(String nome, String UF) {
        this.nome = nome;
        this.UF = UF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    @Override
    public String toString() {
        return nome + "/" + UF;
    }
}
