package com.tenmenezes.poo.exerciciosherancaepolimorfismo;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero() {
        super.setCor("Castanho");
        super.setAmbiente("Terra");
        this.alimento = "Mel";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return STR."\{super.toString()} \nAlimento: '\{alimento}'";
    }
}
