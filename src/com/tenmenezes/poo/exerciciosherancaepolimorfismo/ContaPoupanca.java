package com.tenmenezes.poo.exerciciosherancaepolimorfismo;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

    private double diaRendimento;

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaDeRendimento) {
        Calendar hoje = Calendar.getInstance();

        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            super.setSaldo(super.getSaldo()+ (super.getSaldo() * taxaDeRendimento));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return STR."ContaPoupança { \n  diaRendimento: '\{diaRendimento}', \n \{super.toString()} \n}";
    }
}
