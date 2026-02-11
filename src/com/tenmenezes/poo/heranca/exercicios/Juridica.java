package com.tenmenezes.poo.heranca.exercicios;

public class Juridica extends Pessoa {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return super.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        return STR."Pessoa Jurídica {\{super.toString()} CNPJ: '\{cnpj}', \n Imposto a ser pago: \{calcularImposto()}\n}";
    }
}
