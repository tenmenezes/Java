package com.tenmenezes.poo.exerciciosclassesassociativas;

import java.util.ArrayList;
import java.util.Scanner;

class Contato {

    private String nome, telefone, email;

    public Contato() {
    }

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

class Agenda {

    /*
     * 1)
     * Crie uma classe chamada Agenda que armazene vários contatos do tipo Contato.
     * Cada contato deve ter nome, telefone e email. A Agenda também deve possuir um nome.
     * Desenvolva um programa teste que solicite ao usuário o nome da Agenda e, em seguida, três contatos.
     * Implemente métodos que retornem uma String com as informações de cada contato e outro que retorne todas
     * as informações dos contatos da agenda.
     */

    private String nome;
    private ArrayList<Contato> contatos = new ArrayList<Contato>(3);

    public Agenda() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public void exibirIndivual(int opc) {

        int indiceDoArrayList = opc - 1;

        if (indiceDoArrayList >= 0 && indiceDoArrayList < getContatos().size()) {

            Contato cont = getContatos().get(indiceDoArrayList);

            System.out.println(STR."Contato \{opc}: ");
            System.out.println(cont.getNome());
            System.out.println(cont.getTelefone());
            System.out.println(cont.getEmail());

        } else {
            System.out.println("Escolha inválida.");
        }
    }

    public void exibirTodos() {
        for (Contato cont : getContatos()) {
            System.out.println(STR."Nome....: \{cont.getNome()}");
            System.out.println(STR."Telefone: \{cont.getTelefone()}");
            System.out.println(STR."E-mail..: \{cont.getEmail()}");
            System.out.println("\n---------\n");
        }
    }
}

class Curso {


    /*
     * 2)
     * Desenvolva uma classe Curso com nome e horário. Cada curso possui um Professor, que tem nome, departamento
     * e email. Além disso, o curso pode ter vários alunos (do tipo Aluno), e cada aluno possui nome, matrícula
     * e quatro notas. Crie um programa teste que instancie um Curso com cinco alunos e peça ao usuário para
     * inserir as quatro notas de cada aluno. Ao final, exiba a média de cada aluno, informe se ele está aprovado
     * (média maior ou igual a 7) e mostre a média geral da turma.
     */

    private String nome, horario;
    Professor prof;
    ArrayList<Aluno> alunos = new ArrayList<Aluno>(5);

    public Curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public double calculaMediaGeralDaTurma() {
        double soma = 0;
        double media;

        for(Aluno al : alunos) {
            soma += al.calcularMedia();
        }

        return media = soma / alunos.size();

    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

}

class Professor {
    private String nome, departamento, email;

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Aluno {
    private String nome;
    private int matricula;
    private double[] notas = new double[4];

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public double getNotasIndi(int indice) {
        return notas[indice];
    }

    public void setNotas(int indice, double nota) {
        this.notas[indice] = nota;
    }

    public double calcularMedia() {
        double soma = 0;
        double media;

        for (int i = 0; i < getNotas().length; i++) {

            soma += getNotasIndi(i);

        }

        return media = soma / getNotas().length;

    }

    public boolean verificarAprovacao() {
        if (calcularMedia() >= 7) {
            return true;
        }
        return false;
    }

}

public class Exercicios_Classes_Associativas {

    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Curso curso = new Curso();
        Professor prof = new Professor();
        Aluno aluno = null;

        System.out.print("Digite o nome do seu curso: ");
        String nomeCurso = scan.nextLine();

        System.out.print("Horário das aulas: ");
        String horarioCurso = scan.nextLine();

        System.out.println();

        System.out.print("Nome do professor do curso: ");
        String nomeProf = scan.nextLine();

        System.out.print("Departamento do professor: ");
        String departamento = scan.nextLine();

        System.out.print("Email: ");
        String email = scan.nextLine();

        prof.setNome(nomeProf);
        prof.setDepartamento(departamento);
        prof.setEmail(email);

        System.out.println();

        for(int i = 0; i < 5; i++) {
           aluno = new Aluno();

            System.out.println(STR."\nAluno \{i+1}: ");

            System.out.print("Nome: ");
            String nome = scan.nextLine();

            scan.nextLine();
            System.out.print("\nMatricula: ");
            int mat = scan.nextInt();

            aluno.setNome(nome);
            aluno.setMatricula(mat);

            System.out.println();

            for(int j = 0; j < 4; j++) {
                System.out.print(STR."\nNota \{j+1}: ");
                double nota = scan.nextDouble();

                aluno.setNotas(j, nota);
            }
            curso.adicionarAluno(aluno);
        }

        System.out.println();

        curso.setNome(nomeCurso);
        curso.setHorario(horarioCurso);
        curso.setProf(prof);

        for(Aluno al : curso.getAlunos()) {
            System.out.println(STR."Média do aluno \{al.getNome()}: \{String.format("%.2f", al.calcularMedia())}");

            if(al.verificarAprovacao()) {
                System.out.println("Aluno Aprovado.\n");
            } else {
                System.out.println("Aluno reprovado.\n");
            }

        }

        System.out.println(STR."Média da turma: \{String.format("%.2f", curso.calculaMediaGeralDaTurma())}");

//        Agenda agenda = new Agenda();
//
//        System.out.print("Digite o nome da sua Agenda: ");
//        String nomeDaAgenda = scan.nextLine();
//
//        agenda.setNome(nomeDaAgenda);
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(STR."Contato \{i + 1}: ");
//            System.out.print("Digite o nome: ");
//            String nome = scan.nextLine();
//
//            System.out.print("Digite o telefone: ");
//            String telefone = scan.nextLine();
//
//            System.out.print("Digite o email: ");
//            String email = scan.nextLine();
//
//            Contato contato = new Contato(nome, telefone, email);
//
//            agenda.adicionarContato(contato);
//            System.out.println("\nContato criado com sucesso!\n");
//
//        }
//
//        System.out.println(STR."Agenda \{agenda.getNome()}");
//
//        System.out.println("O que deseja fazer?");
//
//        System.out.println("1 - Ver contato separadamente");
//        System.out.println("2 - Ver todos os contatos");
//
//        System.out.print("R: ");
//        int opc = scan.nextInt();
//
//        if (opc == 1) {
//
//            System.out.print("Qual contato deseja visualizar (1 - 3): ");
//            opc = scan.nextInt();
//
//            agenda.exibirIndivual(opc);
//
//        } else {
//            System.out.println("Todos os contatos: ");
//
//            agenda.exibirTodos();
//
//        }

    }

}
