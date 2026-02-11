package com.tenmenezes.poo.heranca.exerciciosherancaepolimorfismo;

public abstract class Pessoa {

    private String nome;
    private double rendaBruta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public abstract double calcularImposto();

    @Override
    public String toString() {
        return STR."\n Nome: '\{nome}', \n Renda Bruta: \{rendaBruta},\n";
    }
}
