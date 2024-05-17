package br.edu.up.Controle;

import br.edu.up.Modelos.*;

public class ControleProfessor {
    private Professor[] professores;
    private int qtdProfessores;

    public ControleProfessor(int tamanho) {
        this.professores = new Professor[tamanho];
        this.qtdProfessores = 0;
    }

    public void adicionarProfessor(Professor professor) {
        if (qtdProfessores < professores.length) {
            professores[qtdProfessores++] = professor;
        }
    }

    public Professor buscarProfessor(String matricula) {
        for (int i = 0; i < qtdProfessores; i++) {
            if (professores[i].getMatricula().equals(matricula)) {
                return professores[i];
            }
        }
        return null;
    }
}
