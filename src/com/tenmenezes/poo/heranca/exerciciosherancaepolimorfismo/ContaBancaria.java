package com.tenmenezes.poo.heranca.exerciciosherancaepolimorfismo;

public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valorDigitado) {
        saldo += valorDigitado;
    }

    public boolean sacar(double valorDigitado) {
        if ((saldo - valorDigitado) >= 0) {
            saldo -= valorDigitado;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return STR."ContaBancaria { \n  nomeCliente='\{nomeCliente}', \n  numConta='\{numConta}', \n  saldo=\{saldo} \n}";
    }
}
