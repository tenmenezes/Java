package com.tenmenezes.poo;

public class ContaCorrente {

    private int numConta;
    private double saldoDaConta;
    private boolean contaEspecial;
    private double limiteDaConta;


//  definindo valores iniciais
    public ContaCorrente() {
        this.numConta = 0;
        this.saldoDaConta = 0;
        this.contaEspecial = false;
        this.limiteDaConta = 0;
    }

    public ContaCorrente(int numConta, double saldoDaConta, boolean contaEspecial, double limiteDaConta) {
        this.numConta = numConta;
        this.saldoDaConta = saldoDaConta;
        this.contaEspecial = contaEspecial;
        this.limiteDaConta = limiteDaConta;
    }

//  sobrecarga de construtor pra receber conta não especial (sem a possibilidade de utilizar limite)
    public ContaCorrente(int numConta, double saldoDaConta, boolean contaEspecial) {
        this.numConta = numConta;
        this.saldoDaConta = saldoDaConta;
        this.contaEspecial = contaEspecial;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public boolean isContaEspecial() {
        return contaEspecial;
    }

    public double getLimiteDaConta() {
        return limiteDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public void depositarDinheiro(double valorRecebido) {
        System.out.println(STR."\nR$ \{String.format("%.2f", valorRecebido)} depositado com sucesso!\n");

        saldoDaConta += valorRecebido;

        setSaldoDaConta(saldoDaConta);
    }

    public void sacarDinheiro(double valorDoSaque) {

        double valorMaximoDisponivel = isContaEspecial()
                ? getSaldoDaConta() + getLimiteDaConta()
                : getSaldoDaConta();

        boolean podeSacar = valorDoSaque <= valorMaximoDisponivel ;

        if (podeSacar) {
            System.out.println("\nSaque realizado com sucesso!\n");

            saldoDaConta -= valorDoSaque;

            setSaldoDaConta(saldoDaConta);
        } else {
            System.out.println("Erro: Saque negado.");
        }
    }

    public double verificaSaldoAtual() {
        return getSaldoDaConta();
    }

    public void usandoLimiteDaConta() {
        if (isContaEspecial() && getSaldoDaConta() < 0) {
            System.out.println("\nVocê atualmente está usando seu limite da conta.\n");
        } else if (isContaEspecial() && getSaldoDaConta() >= 0) {
            System.out.println("\nVocê não está usando seu limite da conta.\n");
        } else {
            System.out.println("\nVocê não pode verificar isto pois sua conta não é especial.\n");
        }
    }
}