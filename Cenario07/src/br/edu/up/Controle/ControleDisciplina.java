package br.edu.up.Controle;

import br.edu.up.Modelos.*;

public class ControleDisciplina {
    private Disciplina[] disciplinas;
    private int qtdDisciplinas;

    public ControleDisciplina(int tamanho) {
        this.disciplinas = new Disciplina[tamanho];
        this.qtdDisciplinas = 0;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (qtdDisciplinas < disciplinas.length) {
            disciplinas[qtdDisciplinas++] = disciplina;
        }
    }

    public Disciplina buscarDisciplina(String identificador) {
        for (int i = 0; i < qtdDisciplinas; i++) {
            if (disciplinas[i].getIdentificador().equals(identificador)) {
                return disciplinas[i];
            }
        }
        return null;
    }
}
