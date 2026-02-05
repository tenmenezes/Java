package com.tenmenezes.poo;

import java.util.Random;

public class Aluno {
    private int matricula;
    private String nomeAluno, curso;
    private String[] nomeDasDisciplinas = new String[3];
    private double[] notasDasDisciplinas = new double[3];

    Random rand = new Random();

    public Aluno() {
        matricula = rand.nextInt(1000);
        nomeAluno = null;
        curso = null;
        nomeDasDisciplinas = new String[3];
        notasDasDisciplinas = new double[3];
    }

    public int getMatricula() { return matricula; }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getCurso() {
        return curso;
    }

    public String getNomeDasDisciplinas(int indice) { return nomeDasDisciplinas[indice]; }

    public double getNotasDasDisciplinas(int indice) { return notasDasDisciplinas[indice]; }



    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNomeDasDisciplinas(String nome, int indice) {
        this.nomeDasDisciplinas[indice] = nome;
    }

    public void setNotasDasDisciplinas(double notas, int indice) { this.notasDasDisciplinas[indice] = notas; }

    public void gerandoNotas() {

        Random rand = new Random();

        for (int i = 0; i < notasDasDisciplinas.length; i++) {
            setNotasDasDisciplinas(rand.nextDouble() * 10, i);
        }
    }

    public String resultadoDasNotas(int indice) {

        if (notasDasDisciplinas[indice] >= 7) {
            return "Aluno aprovado.";
        } else {
            return "Aluno reprovado.";
        }
    }
}