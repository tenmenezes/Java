package com.tenmenezes.poo.exerciciosherancaepolimorfismo;

public class Exercicios_Heranca_e_Polimorfismo {

    static void main(String[] args) {

        System.out.println("Exercício 1 - CONTA BANCÁRIA");

        System.out.println("\n*** Teste ContaBancária ***");

        ContaBancaria cb = new ContaBancaria();

        cb.setNomeCliente("Conta simples");
        cb.setNumConta("1111");

        cb.depositar(100);

        System.out.println(cb);

        realizarSaque(cb, 50);

        realizarSaque(cb, 70);

        System.out.println(cb);

        System.out.println("*** Teste ContaPoupança ***");
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.setNomeCliente("Conta Poupança");
        contaPoupanca.setNumConta("2222");
        contaPoupanca.setDiaRendimento(10);
        contaPoupanca.depositar(100);

        System.out.println(contaPoupanca);

        realizarSaque(contaPoupanca, 50);

        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println(STR."Rendimento feito, novo saldo: \{contaPoupanca.getSaldo()}");
        } else {
            System.out.println("Não é dia de rendimento, novo saldo não aplicado.");
        }

        System.out.println(contaPoupanca);

        System.out.println("*** Teste ContaEspecial ***");
        ContaEspecial contaEspecial = new ContaEspecial();

        contaEspecial.setNomeCliente("Conta Especial");
        contaEspecial.setNumConta("3333");
        contaEspecial.depositar(100);

        System.out.println(contaEspecial);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 70);

        System.out.println(contaEspecial);

        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("Exercício 2 - IMPOSTO DE RENDA");
        System.out.println();

        Fisica pessoaFisica_01 = new Fisica();
        pessoaFisica_01.setNome("Contribuinte 01");
        pessoaFisica_01.setRendaBruta(1000);
        pessoaFisica_01.setCpf("222.715.310-55");


        Juridica pessoaJuridica_01 = new Juridica();
        pessoaJuridica_01.setNome("Contribuinte 02");
        pessoaJuridica_01.setRendaBruta(5000);
        pessoaJuridica_01.setCnpj("43.860.189/0001-03");


        Fisica pessoaFisica_02 = new Fisica();
        pessoaFisica_02.setNome("Contribuinte 03");
        pessoaFisica_02.setRendaBruta(2000);
        pessoaFisica_02.setCpf("047.697.850-54");


        Juridica pessoaJuridica_02 = new Juridica();
        pessoaJuridica_02.setNome("Contribuinte 04");
        pessoaJuridica_02.setRendaBruta(3000);
        pessoaJuridica_02.setCnpj("07.474.082/0001-55");


        Fisica pessoaFisica_03 = new Fisica();
        pessoaFisica_03.setNome("Contribuinte 05");
        pessoaFisica_03.setRendaBruta(3700);
        pessoaFisica_03.setCpf("992.354.820-11");


        Juridica pessoaJuridica_03 = new Juridica();
        pessoaJuridica_03.setNome("Contribuinte 06");
        pessoaJuridica_03.setRendaBruta(4000);
        pessoaJuridica_03.setCnpj("45.674.263/0001-14");

        Pessoa[] pessoas = new Pessoa[6];
        pessoas[0] = pessoaFisica_01;
        pessoas[1] = pessoaFisica_02;
        pessoas[2] = pessoaFisica_03;
        pessoas[3] = pessoaJuridica_01;
        pessoas[4] = pessoaJuridica_02;
        pessoas[5] = pessoaJuridica_03;

        for (Pessoa p : pessoas) {
            System.out.println(p.toString());

            System.out.println();
        }

        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("Exercício 3 - ANIMAIS");
        System.out.println();

        Animal camelo = new Animal();

        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        System.out.println("Zoológico:");
        System.out.println();

        System.out.println(camelo);

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        Animal tubarao = new Peixe();

        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);
        System.out.println(tubarao);

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        Animal urso = new Mamifero();

        urso.setNome("Urso-do-Canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);

        System.out.println(urso);

    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println(STR."Novo saldo: \{conta.getSaldo()}");
        } else {
            System.out.println(STR."Saldo insuficiente para saque, saldo atual: \{conta.getSaldo()}");
        }
    }
}
