package br.edu.up.Modelos;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private Competencia[] competencias;
    private Professor professor;
    private Aluno[] alunos;
    private int qtdCompetencias;
    private int qtdAlunos;

    public Disciplina(String nome, String identificador, String curriculo, int tamanhoCompetencias, int tamanhoAlunos) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.competencias = new Competencia[tamanhoCompetencias];
        this.alunos = new Aluno[tamanhoAlunos];
        this.qtdCompetencias = 0;
        this.qtdAlunos = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public Competencia[] getCompetencias() {
        return competencias;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void adicionarCompetencia(Competencia competencia) {
        if (qtdCompetencias < competencias.length) {
            competencias[qtdCompetencias++] = competencia;
        }
    }

    public void adicionarAluno(Aluno aluno) {
        if (qtdAlunos < alunos.length) {
            alunos[qtdAlunos++] = aluno;
        }
    }

    public String avaliarAluno(Aluno aluno, SituacaoAtingida[] situacoes) {
        int necessariasAtingidas = 0;
        int complementaresAtingidas = 0;
        int totalNecessarias = 0;
        int totalComplementares = 0;

        for (Competencia competencia : competencias) {
            if (competencia != null) {
                if (competencia.getTipo().equals("N")) {
                    totalNecessarias++;
                } else {
                    totalComplementares++;
                }
            }
        }

        for (int i = 0; i < competencias.length; i++) {
            Competencia competencia = competencias[i];
            SituacaoAtingida situacao = situacoes[i];
            if (competencia != null && situacao != null) {
                if (competencia.getTipo().equals("N") && situacao == SituacaoAtingida.S) {
                    necessariasAtingidas++;
                } else if (competencia.getTipo().equals("C") && situacao == SituacaoAtingida.S) {
                    complementaresAtingidas++;
                }
            }
        }

        if (necessariasAtingidas == totalNecessarias && complementaresAtingidas >= (totalComplementares / 2)) {
            return "Aprovado";
        } else if (necessariasAtingidas < (totalNecessarias / 2) || complementaresAtingidas < (totalComplementares / 2)) {
            return "Reprovado";
        } else {
            return "Pendente";
        }
    }
}