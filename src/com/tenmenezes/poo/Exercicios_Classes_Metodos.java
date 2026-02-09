package com.tenmenezes.poo;

import java.util.Random;
import java.util.Scanner;

static class Contato {

    String nome, email, telefone;

    public Contato(String nome, String telefone, String email) {
    }

    void exibirDadosDoContato() {

        System.out.println(STR."Nome..............: \{nome}");
        System.out.println(STR."E-mail............: \{email}");
        System.out.println(STR."Número de Telefone: \{telefone}");

    }

    void atualizarTelefone(String novoTelefone) {

        telefone = novoTelefone;

    }

}
 static class ContaCorrente {

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

        boolean podeSacar = valorDoSaque <= valorMaximoDisponivel;

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

static class Aluno {
    private int matricula;
    private String nomeAluno, curso;
    private String[] nomeDasDisciplinas = new String[3];
    private double[] notasDasDisciplinas = new double[3];

    Random rand = new Random();

    public Aluno() {
        matricula = rand.nextInt(1000);
        nomeAluno = null;
        curso = null;
        nomeDasDisciplinas = new String[3];
        notasDasDisciplinas = new double[3];
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getCurso() {
        return curso;
    }

    public String getNomeDasDisciplinas(int indice) {
        return nomeDasDisciplinas[indice];
    }

    public double getNotasDasDisciplinas(int indice) {
        return notasDasDisciplinas[indice];
    }


    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNomeDasDisciplinas(String nome, int indice) {
        this.nomeDasDisciplinas[indice] = nome;
    }

    public void setNotasDasDisciplinas(double notas, int indice) {
        this.notasDasDisciplinas[indice] = notas;
    }

    public void gerandoNotas() {

        Random rand = new Random();

        for (int i = 0; i < notasDasDisciplinas.length; i++) {
            setNotasDasDisciplinas(rand.nextDouble() * 10, i);
        }
    }

    public String resultadoDasNotas(int indice) {

        if (notasDasDisciplinas[indice] >= 7) {
            return "Aluno aprovado.";
        } else {
            return "Aluno reprovado.";
        }
    }
}

public class Exercicios_Classes_Metodos {
    static void main(String[] args) {

        /*
         * 1)
         * Crie uma classe chamada Lampada que represente uma lâmpada comum.
         *
         * A classe deve possuir:
         * - Um atributo que indique se a lâmpada está ligada ou desligada.
         *
         * Métodos:
         * - Um métodosdv para ligar a lâmpada.
         * - Um métododsv para desligar a lâmpada.
         * - Um métodosvsd sem retorno que exiba o estado atual da lâmpada.
         *
         * Programa principal:
         * - Crie um objeto do tipo Lampada.
         * - Ligue a lâmpada.
         * - Exiba o estado.
         * - Desligue a lâmpada.
         * - Exiba o estado novamente.
         *
         * 📌 Objetivo: entender atributos + métodos sem retorno.
         *
         */

//         Lampada lampada = new Lampada();
//
//         System.out.println("Estado inicial: ");
//         lampada.estadoAtualDaLampada();
//
//         System.out.println();
//
//         System.out.println("Estado inicial com sobrecarga: ");
//         Lampada lampada_2 = new Lampada(true);
//         lampada_2.estadoAtualDaLampada();
//
//         System.out.println();
//
//         System.out.println("Estado após função de ligar: ");
//         lampada.ligar();
//         lampada.estadoAtualDaLampada();
//
//         System.out.println();
//
//         System.out.println("Estado após função de desligar: ");
//         lampada.desligar();
//         lampada.estadoAtualDaLampada();

        /*
         * 2)
         * Crie uma classe chamada ContaCorrente.
         *
         * Atributos:
         * - Número da conta.
         * - Saldo.
         * - Um atributo que indique se a conta é especial (`true` ou `false`).
         * - Limite da conta.
         *
         * Métodos:
         * - Um métodosdvsd para depositar dinheiro.
         * - Um métodosavsdv para sacar, verificando se o saldo é suficiente (se for especial, considerar o limite).
         * - Um métodosdvsd que retorne o saldo atual.
         * - Um métododvs que retorne se o cliente está usando o limite ou não.
         *
         * Programa principal:
         * - Crie uma conta.
         * - Faça depósitos e saques.
         * - Mostre o saldo.
         * - Informe se está usando o limite.
         *
         * 📌 Objetivo: métodos com retorno + lógica usando atributos.
         *
         */

//        Scanner scan = new Scanner(System.in);
//        Random rand = new Random();
//
//        System.out.println("Sistema Bancário");
//
//        int numDaConta = rand.nextInt(1000);
//        int resp;
//        boolean contaEspecial = false;
//        double saldoDaConta;
//        double limiteDaConta;
//        String opc;
//
//        System.out.print("\nDigito saldo inicial que sua conta terá: ");
//        saldoDaConta = scan.nextDouble();
//
////      instanciando objeto para que os valores sejam armazenados e vistos por todo codigo
//        ContaCorrente conta = null;
//
//        do {
//            System.out.print("Quer configurar sua conta como especial? (S/N): ");
//            opc = scan.next();
//
//            if (opc.equals("S")) {
//                contaEspecial = true;
//                System.out.print("Digite o limite da sua conta: ");
//                limiteDaConta = scan.nextDouble();
//
//                conta = new ContaCorrente(numDaConta, saldoDaConta, contaEspecial, limiteDaConta);
//
//                System.out.println("\nConta criada com sucesso! \n");
//
//                System.out.println("Suas opções: \n");
//
//                break;
//            } else if (opc.equals("N")) {
//
//                conta = new ContaCorrente(numDaConta, saldoDaConta, contaEspecial);
//
//                System.out.println("\nConta criada com sucesso! \n");
//
//                System.out.println("Suas opções: \n");
//
//                break;
//            } else {
//                System.out.println("Erro: Digite apenas S ou N.\n");
//            }
//        } while(!(opc.equals("S")) && !(opc.equals("N")));
//
//
//        System.out.println("1 - Depositar");
//        System.out.println("2 - Sacar");
//        System.out.println("3 - Ver Saldo");
//        System.out.println("4 - Ver Limite");
//        System.out.println("5 - Encerrar");
//
//
//        do {
//            System.out.println("\nO que deseja fazer agora?\n");
//
//            System.out.print("R: ");
//            resp = scan.nextInt();
//
//            if (resp == 1) {
//
//                System.out.print("Digite a quantidade que deseja depositar: ");
//                double deposito = scan.nextDouble();
//
//                conta.depositarDinheiro(deposito);
//
//                System.out.println(STR."Seu saldo atualizado: \{String.format("%.2f", conta.getSaldoDaConta())}");
//
//            } else if (resp == 2) {
//
//                System.out.print("Digite a quantidade que deseja sacar: ");
//                double saque = scan.nextDouble();
//
//                conta.sacarDinheiro(saque);
//
//                System.out.println(STR."Seu saldo atualizado: \{String.format("%.2f", conta.getSaldoDaConta())}");
//
//            } else if (resp == 3) {
//
//                if (!conta.isContaEspecial()) {
//                    System.out.println(STR."Seu saldo atual: R$ \{String.format("%.2f", conta.verificaSaldoAtual())}");
//                } else {
//                    System.out.println(STR."Seu saldo atual: R$ \{String.format("%.2f", conta.verificaSaldoAtual())}");
//                    System.out.println(STR."Limite: R$ \{String.format("%.2f", conta.getLimiteDaConta())}");
//                }
//
//            } else if (resp == 4) {
//
//                conta.usandoLimiteDaConta();
//
//            } else if (resp == 5) {
//
//                System.out.println("Encerrando programa...");
//
//            }
//        } while(resp != 5);

        /*
         * 3)
         * Crie uma classe chamada Aluno.
         *
         * Atributos:
         * - Nome do aluno.
         * - Matrícula.
         * - Curso.
         * - Nome de 3 disciplinas.
         * - Nota de cada uma das 3 disciplinas.
         *
         * Métodos:
         * - Um métodosfdhd que receba o indice da disciplina e retorne se o aluno foi aprovado ou não (nota ≥ 7).
         *
         * Programa principal:
         * - Peça os dados do aluno ao usuário.
         *
         * - Mostre:
         *     - Nome das disciplinas
         *     - Notas
         *     - Situação (aprovado ou reprovado) de cada uma
         *
         * 📌 Objetivo: métodofj com parâmetro + retorno + uso de arrays simples.
         *
         */

//         Scanner scan = new Scanner(System.in);
//         Aluno aluno = new Aluno();
//
//         String nome, curso;
//         String[] disciplinas = new String[3];
//         double[] notasDasDisciplinas = new double[3];
//
//         System.out.print("Digite seu nome: ");
//         nome = scan.nextLine();
//
//         System.out.print("Digite seu curso: ");
//         curso = scan.nextLine();
//
//         for (int i = 0; i < disciplinas.length; i++) {
//             System.out.print(STR."Digite o nome da disciplina \{i + 1}: ");
//             disciplinas[i] = scan.nextLine();
//
//             aluno.setNomeDasDisciplinas(disciplinas[i], i);
//         }
//
//         aluno.gerandoNotas();
//
//         aluno.setNomeAluno(nome);
//         aluno.setCurso(curso);
//
//         System.out.println(STR."\nNome do aluno: \{aluno.getNomeAluno()}");
//         System.out.println(STR."Matrícula....: \{aluno.getMatricula()}");
//         System.out.println(STR."Curso........: \{aluno.getCurso()}");
//
//         System.out.println("\nDisciplinas: ");
//         for (int j = 0; j < 3; j++) {
//             System.out.println(STR."\{aluno.getNomeDasDisciplinas(j)}: "
//                     + STR."\{String.format("%.2f", aluno.getNotasDasDisciplinas(j))} "
//                     + STR."- \{aluno.resultadoDasNotas(j)}");
//         }

        /*
         * 4)
         * Crie uma classe chamada Contato.
         *
         * Atributos:
         * - Nome.
         * - Telefone.
         * - Email.
         *
         * Métodos:
         * - Um métodofg sem retorno para exibir os dados do contato.
         * - Um métododh que receba um novo telefone e atualize o telefone do contato.
         *
         * Programa principal:
         * - Crie um contato.
         * - Mostre os dados.
         * - Atualize o telefone.
         * - Mostre os dados novamente.
         *
         * 📌 Objetivo: reforçar que métodos alteram o estado do objeto.
         *
         */

//        Scanner scan = new Scanner(System.in);
//        Contato contato = new Contato();
//
//        int opc;
//
//        System.out.print("Digite seu nome: ");
//        contato.nome = scan.nextLine();
//
//        System.out.print("Digite seu e-mail: ");
//        contato.email = scan.nextLine();
//
//        System.out.print("Digite seu número de telefone: ");
//        contato.telefone = scan.nextLine();
//
//        System.out.println("\nContato criado com sucesso!\n");
//
//        do {
//            System.out.println("O que deseja fazer agora? \n");
//            System.out.println("1 - Ver dados");
//            System.out.println("2 - Alterar número de telefone");
//            System.out.println("3 - encerrar programa");
//
//            System.out.print("\nOpção: ");
//            opc = scan.nextInt();
//
//            if (opc == 1) {
//                contato.exibirDadosDoContato();
//            } else if (opc == 2) {
//
//                System.out.print("\nDigite o novo número de telefone: ");
//                String novoTelefone = scan.next();
//                contato.atualizarTelefone(novoTelefone);
//                System.out.println("\nNúmero alterado com sucesso!\n");
//
//            } else if (opc == 3) {
//                System.out.println("\nEncerrando programa...\n");
//            } else {
//                System.out.println("Ação indiponível. Tente outra.");
//            }
//        } while(opc != 3);

        /*
         * 5)
         * Crie uma classe chamada JogoDaVelha.
         *
         * Atributos:
         * - Uma matriz 3x3 que represente o tabuleiro.
         * - Um atributo que indique de quem é a vez (`'X'` ou `'O'`).
         *
         * Métodos:
         * - Um métodoxfb para exibir o tabuleiro.
         * - Um métodobdfb para realizar uma jogada, recebendo linha e coluna.
         * - Um métododb que verifique se o jogo terminou.
         * - Um métododb que verifique se existe um vencedor.
         *
         * Programa principal:
         * - Crie um objeto `JogoDaVelha`.
         * - Permita que dois jogadores joguem alternadamente.
         * - O jogo deve impedir jogadas inválidas.
         * - O jogo deve parar quando houver vencedor ou empate.
         *
         * 📌 Objetivo: unir:
         * - classe
         * - atributos
         * - métodos
         * - matriz
         * - lógica
         *
         */

        Scanner scan = new Scanner(System.in);

        JogoDaVelha jdv = null;

        System.out.println(" >  JOGO DA VELHA  < \n");
        System.out.print("Escolha com qual deseja jogar (X / O): ");
        String escolhaDoJogador = scan.next();

        if (escolhaDoJogador.equals("X") || escolhaDoJogador.equals("O")) {
            jdv = new JogoDaVelha(escolhaDoJogador);
            jdv.inicializarJogo(jdv.getVezDoJogador());
            System.out.println("\nJogo inicializado\n");
            while (!jdv.respostaDoVencedor()) {
                jdv.exibirTabuleiro();
                System.out.println(STR."\nJogador \{jdv.getVezDoJogador()}: ");
                System.out.print("Digite a posição da linha: ");
                int linha = scan.nextInt();
                System.out.print("Digite a posição da coluna: ");
                int coluna = scan.nextInt();
                System.out.println();
                if (!jdv.realizarJogada(linha, coluna)) {
                    System.out.println("Erro: Jogada inválida.\n");
                    continue;
                }
                if (jdv.respostaDoVencedor()) {
                    String vencedor = jdv.getVezDoJogador().equals("X") ? "O" : "X";
                    System.out.println(STR."\nJogador \{vencedor} é o vencedor! \uD83C\uDFC6");
                    break;
                }
                if (jdv.respostaDoEmpate()) {
                    System.out.println("\nDeu velha! Obrigado por jogar!");
                    break;
                }
            }
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}