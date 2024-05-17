package br.edu.up.Tela;

import br.edu.up.Modelos.*;
import br.edu.up.Controle.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleProfessor controleProfessor = new ControleProfessor(10); // Capacidade inicial para 10 professores
        ControleAluno controleAluno = new ControleAluno(50); // Capacidade inicial para 50 alunos
        ControleDisciplina controleDisciplina = new ControleDisciplina(20); // Capacidade inicial para 20 disciplinas
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n1. Registrar Professor");
            System.out.println("2. Registrar Aluno");
            System.out.println("3. Registrar Disciplina");
            System.out.println("4. Avaliar Aluno");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    registrarProfessor(scanner, controleProfessor);
                    break;
                case 2:
                    registrarAluno(scanner, controleAluno);
                    break;
                case 3:
                    registrarDisciplina(scanner, controleProfessor, controleAluno, controleDisciplina);
                    break;
                case 4:
                    avaliarAluno(scanner, controleDisciplina);
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        scanner.close();
    }

    private static void registrarProfessor(Scanner scanner, ControleProfessor controleProfessor) {
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("RG: ");
        String rg = scanner.next();
        System.out.print("Matrícula: ");
        String matricula = scanner.next();
        System.out.print("Identificação Currículo Lattes: ");
        String identificacaoCurriculo = scanner.next();

        System.out.print("Quantidade de titulações: ");
        int qtdTitulacoes = scanner.nextInt();
        Professor professor = new Professor(nome, rg, matricula, identificacaoCurriculo, qtdTitulacoes);
        for (int i = 0; i < qtdTitulacoes; i++) {
            System.out.print("Nome da instituição: ");
            String nomeInstituicao = scanner.next();
            System.out.print("Ano de conclusão: ");
            int anoConclusao = scanner.nextInt();
            System.out.print("Nome do título: ");
            String nomeTitulo = scanner.next();
            System.out.print("Título do trabalho de conclusão: ");
            String tituloTrabalhoConclusao = scanner.next();
            Titulacao titulacao = new Titulacao(nomeInstituicao, anoConclusao, nomeTitulo, tituloTrabalhoConclusao);
            professor.adicionarTitulacao(titulacao);
        }

        controleProfessor.adicionarProfessor(professor);
    }

    private static void registrarAluno(Scanner scanner, ControleAluno controleAluno) {
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("RG: ");
        String rg = scanner.next();
        System.out.print("Matrícula: ");
        String matricula = scanner.next();
        System.out.print("Ano de ingresso: ");
        int anoIngresso = scanner.nextInt();
        System.out.print("Curso: ");
        String curso = scanner.next();
        System.out.print("Turno: ");
        String turno = scanner.next();

        Aluno aluno = new Aluno(nome, rg, matricula, anoIngresso, curso, turno);
        controleAluno.adicionarAluno(aluno);
    }

    private static void registrarDisciplina(Scanner scanner, ControleProfessor controleProfessor, ControleAluno controleAluno, ControleDisciplina controleDisciplina) {
        System.out.print("Nome da disciplina: ");
        String nomeDisciplina = scanner.next();
        System.out.print("Identificador da disciplina: ");
        String identificador = scanner.next();
        System.out.print("Currículo: ");
        String curriculo = scanner.next();

        System.out.print("Quantidade de competências: ");
        int qtdCompetencias = scanner.nextInt();
        Disciplina disciplina = new Disciplina(nomeDisciplina, identificador, curriculo, qtdCompetencias, 50); // Capacidade inicial para 50 alunos
        for (int i = 0; i < qtdCompetencias; i++) {
            System.out.print("Nome da competência: ");
            String nomeCompetencia = scanner.next();
            System.out.print("Tipo (Necessária[N]/Complementar[C]): ");
            String tipo = scanner.next();
            Competencia competencia = new Competencia(nomeCompetencia, tipo);
            disciplina.adicionarCompetencia(competencia);
        }

        System.out.print("Matrícula do professor: ");
        String matriculaProfessor = scanner.next();
        Professor professor = controleProfessor.buscarProfessor(matriculaProfessor);
        if (professor == null) {
            System.out.println("Professor não encontrado!");
            return;
        }
        disciplina.setProfessor(professor);

        System.out.print("Quantidade de alunos matriculados: ");
        int qtdAlunos = scanner.nextInt();
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("Matrícula do aluno: ");
            String matriculaAluno = scanner.next();
            Aluno aluno = controleAluno.buscarAluno(matriculaAluno);
            if (aluno != null) {
                disciplina.adicionarAluno(aluno);
            }
        }

        controleDisciplina.adicionarDisciplina(disciplina);
    }

    private static void avaliarAluno(Scanner scanner, ControleDisciplina controleDisciplina) {
        System.out.print("Identificador da disciplina: ");
        String identificador = scanner.next();
        Disciplina disciplina = controleDisciplina.buscarDisciplina(identificador);
        if (disciplina == null) {
            System.out.println("Disciplina não encontrada!");
            return;
        }

        System.out.print("Matrícula do aluno: ");
        String matriculaAluno = scanner.next();
        Aluno aluno = null;
        for (Aluno a : disciplina.getAlunos()) {
            if (a != null && a.getMatricula().equals(matriculaAluno)) {
                aluno = a;
                break;
            }
        }
        if (aluno == null) {
            System.out.println("Aluno não encontrado!");
            return;
        }

        SituacaoAtingida[] situacoes = new SituacaoAtingida[disciplina.getCompetencias().length];
        for (int i = 0; i < disciplina.getCompetencias().length; i++) {
            Competencia competencia = disciplina.getCompetencias()[i];
            if (competencia != null) {
                System.out.print("Competência \"" + competencia.getNome() + "\" Atingida? (S/N)");
                String situacaoStr = scanner.next();
                SituacaoAtingida situacao = SituacaoAtingida.valueOf(situacaoStr);
                situacoes[i] = situacao;
            }
        }

        String resultado = disciplina.avaliarAluno(aluno, situacoes);
        System.out.println("\n---> Situação do aluno: " + resultado);
    }
}
