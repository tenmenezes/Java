package com.tenmenezes.poo.exerciciosherancaepolimorfismo;

public class Fisica extends Pessoa{

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public double calcularImposto() {

        double renda = super.getRendaBruta();

        if(renda <= 1400) {
            return 0;
        }

        if(renda <= 2100) {
            return (renda * 0.1) - 100;
        }

        if(renda <= 2800) {
            return (renda * 0.15) - 270;
        }

        if(renda <= 3600) {
            return (renda * 0.25) - 500;
        }

        if(renda > 3600) {
            return (renda * 0.3) - 700;
        }

        return 0;
    }

    @Override
    public String toString() {
        return STR."Pessoa Física {\{super.toString()} CPF: '\{cpf}', \n Imposto a ser pago: \{calcularImposto()}\n}";
    }
}
