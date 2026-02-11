package com.tenmenezes.poo.heranca.exerciciosherancaepolimorfismo;

public class Animal {

    private String nome, cor, ambiente;
    private double comprimento, velocidade;
    private int numPatas;

    public Animal() {
        this.numPatas = 4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    @Override
    public String toString() {
        return STR."Animal: '\{nome}'\nComprimento: \{comprimento} cm\nPatas: \{numPatas}\nCor: '\{cor}'\nAmbiente: \{ambiente}\nVelocidade: \{velocidade} m/s";
    }
}
