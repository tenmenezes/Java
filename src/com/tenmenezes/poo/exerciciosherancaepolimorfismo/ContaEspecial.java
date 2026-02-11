package com.tenmenezes.poo.exerciciosherancaepolimorfismo;

public class ContaEspecial extends ContaBancaria {

    private int limite;

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public boolean sacar(double valorDigitado) {
        double saldoComLimite = super.getSaldo() + limite;

        if ((saldoComLimite - valorDigitado) >= 0) {
            super.setSaldo(super.getSaldo() - valorDigitado);
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return STR."ContaEspecial { \n  limite: '\{limite}', \n \{super.toString()} \n}";
    }
}
