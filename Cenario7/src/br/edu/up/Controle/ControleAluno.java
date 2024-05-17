package br.edu.up.Controle;

import br.edu.up.Modelos.*;

public class ControleAluno {
    private Aluno[] alunos;
    private int qtdAlunos;

    public ControleAluno(int tamanho) {
        this.alunos = new Aluno[tamanho];
        this.qtdAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (qtdAlunos < alunos.length) {
            alunos[qtdAlunos++] = aluno;
        }
    }

    public Aluno buscarAluno(String matricula) {
        for (int i = 0; i < qtdAlunos; i++) {
            if (alunos[i].getMatricula().equals(matricula)) {
                return alunos[i];
            }
        }
        return null;
    }
}
