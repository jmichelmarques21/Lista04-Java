package br.edu.up.Modelos;

public class Aluno extends Pessoa {
    private int anoIngresso;
    private String curso;
    private String turno;

    public Aluno(String nome, String rg, String matricula, int anoIngresso, String curso, String turno) {
        super(nome, rg, matricula);
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.turno = turno;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public String getCurso() {
        return curso;
    }

    public String getTurno() {
        return turno;
    }
}
