import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
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

//        Lampada lampada = new Lampada();
//
//        lampada.ligarLampada();
//        lampada.estadoAtualDaLampada();
//
//        System.out.println();
//
//        lampada.desligarLampada();
//        lampada.estadoAtualDaLampada();

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
//        ContaCorrente cc = new ContaCorrente();
//
//        System.out.println("Sistema Bancário");
//
//        int numDaConta = rand.nextInt(1000);
//        int resp;
//        boolean contaEspecial;
//        double saldoDaConta, limiteDaConta;
//        String opc;
//        System.out.print("\nDigito saldo inicial que sua conta terá: ");
//        saldoDaConta = scan.nextDouble();
//
//        do {
//            System.out.print("Quer configurar sua conta como especial? (S/N): ");
//            opc = scan.next();
//
//            if (opc.equals("S")) {
//                System.out.print("Digite o limite da sua conta: ");
//                limiteDaConta = scan.nextDouble();
//
//                cc.limiteDaConta = limiteDaConta;
//                cc.contaEspecial = true;
//                cc.numConta = numDaConta;
//                cc.saldoDaConta = saldoDaConta;
//
//                System.out.println("\nConta criada com sucesso! \n");
//
//                System.out.println("Suas opções: \n");
//
//                break;
//            } else if (opc.equals("N")) {
//                cc.contaEspecial = false;
//                cc.numConta = numDaConta;
//                cc.saldoDaConta = saldoDaConta;
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
//
//            if (resp == 1) {
//
//                System.out.print("Digite a quantidade que deseja depositar: ");
//                double deposito = scan.nextDouble();
//
//                cc.depositarDinheiro(deposito);
//
//                System.out.println("Seu saldo atualizado: " + String.format("%.2f", saldoDaConta));
//
//            } else if (resp == 2) {
//
//                System.out.print("Digite a quantidade que deseja sacar: ");
//                double saque = scan.nextDouble();
//
//                cc.sacarDinheiro(saque);
//
//                System.out.println("Seu saldo atualizado: " + String.format("%.2f", saldoDaConta));
//
//            } else if (resp == 3) {
//
//                if (!cc.contaEspecial) {
//                    System.out.println("Seu saldo atual: R$ " + String.format("%.2f", cc.verificaSaldoAtual()));
//                } else {
//                    System.out.println("Seu saldo atual: R$ " + String.format("%.2f", cc.verificaSaldoAtual()));
//                    System.out.println("Limite: R$ " + String.format("%.2f", cc.limiteDaConta));
//                }
//
//            } else if (resp == 4) {
//
//                cc.usandoLimiteDaConta();
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

//        Scanner scan = new Scanner(System.in);
//        Random rand = new Random();
//
//        Aluno aluno = new Aluno();
//
//        String nome, curso;
//        int matricula;
//        String[] disciplinas = new String[3];
//        double[] notasDasDisciplinas = new double[3];
//
//        System.out.print("Digite seu nome: ");
//        nome = scan.nextLine();
//
//        System.out.print("Digite seu curso: ");
//        curso = scan.nextLine();
//
//        for (int i = 0; i < disciplinas.length; i++) {
//            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
//            disciplinas[i] = scan.nextLine();
//
//            aluno.nomeDasDisciplinas[i] = disciplinas[i];
//        }
//
//        matricula = rand.nextInt(1000);
//
//        aluno.gerandoNotas(notasDasDisciplinas);
//
//        aluno.nomeAluno = nome;
//        aluno.curso = curso;
//
//        System.out.println("\nNome do aluno: " + nome);
//        System.out.println("Matrícula....: " + matricula);
//        System.out.println("Curso........: " + curso);
//
//        System.out.println("\nDisciplinas: ");
//        for (int j = 0; j < 3; j++) {
//
//            System.out.println(disciplinas[j] + ": " + String.format("%.2f", notasDasDisciplinas[j])
//                    + " - " + aluno.resultadoDasNotas(j, notasDasDisciplinas));
//
//        }

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

        JogoDaVelha jdv = new JogoDaVelha();

        System.out.println(" >  JOGO DA VELHA < \n");
        System.out.print("Escolha com qual deseja jogar (X / O): ");
        String escolhaDoJogador = scan.next();

        if (escolhaDoJogador.equals("X") || escolhaDoJogador.equals("O")) {
            jdv.inicializarJogo(escolhaDoJogador);
            System.out.println("\nJogo inicializado\n");
            while(!jdv.verificarVencedor()) {
                jdv.exibirTabuleiro();
                System.out.println("\nJogador " + jdv.vezDoJogador + ": ");
                System.out.print("Digite a posição da linha: ");
                int linha = scan.nextInt();
                System.out.print("Digite a posição da coluna: ");
                int coluna = scan.nextInt();
                System.out.println();
                if (!jdv.realizarJogada(linha, coluna)) {
                    System.out.println("Erro: Jogada inválida.\n");
                    continue;
                } else {
                    jdv.realizarJogada(linha, coluna);
                }
                if (jdv.verificarVencedor()) {
                    System.out.println("\nJogador " + jdv.vezDoJogador + " é o vencedor! Obrigado por jogar!");
                    break;
                }
                if (jdv.verificarEmpate()) {
                    System.out.println("\nDeu velha! Obrigado por jogar!");
                    break;
                }
                jdv.vezDoJogador = jdv.vezDoJogador.equals("X") ? "O" : "X";
            }
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}