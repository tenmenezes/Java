package com.tenmenezes.fundamentos;

import java.util.Scanner;

public class ExerciciosLoop {

    static void main(String[] args) {

        /*
         * 1)
         * Faça um programa que peça uma nota, entre zero e dez.
         * Mostre uma mensagem caso o valor seja inválido e continue
         * pedindo até que o usuário informe um valor válido.
         */

//        Scanner scan = new Scanner(System.in);
//        int i = 0;
//
//        while (i == 0) {
//
//            System.out.println("Digite uma nota entre 0 e 10: ");
//            double nota = scan.nextDouble();
//
//            if (nota <= 10 && nota >= 0) {
//
//                System.out.println("\nNota  válida, valor armazenado: " + nota + "\n");
//                break;
//
//            } else {
//
//                System.out.println("\nNota inválida, digite uma nota válida.\n");
//
//            }
//
//            continue;
//
//        }

        /*
         * 2)
         * Faça um programa que leia um nome de usuário e a sua senha e não aceite
         * a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando
         * a pedir as informações.
         */

//        Scanner scan = new Scanner(System.in);
//        int i  = 0;
//
//        while (i == 0) {
//
//            System.out.println("Digite seu nome: ");
//            String nome = scan.nextLine();
//
//            System.out.println("\nAgora digite sua senha: ");
//            String senha = scan.nextLine();
//
//            if (nome.equals(senha)) {
//                System.out.println("\nErro: sua senha não pode ser a mesma que seu nome.\n");
//            } else {
//                System.out.println("\nUsuário criado com sucesso!\n");
//                break;
//            }
//
//            continue;
//
//        }

        /*
        3. Faça um programa que leia e valide as seguintes informações:
            - Nome: maior que 3 caracteres;
            - Idade: entre 0 e 150;
            - Salário: maior que zero;
            - Sexo: 'f' ou 'm';
            - Estado Civil: 's', 'c', 'v', 'd';
        */

//        Scanner scan = new Scanner(System.in);
//        int i = 0;
//
//        while (i == 0) {
//            System.out.print("\nDigite seu nome........................: ");
//            String nome = scan.nextLine();
//
//            if (nome.length() < 3) {
//                System.out.println("\nNome inválido. O nome é muito pequeno.\n");
//                break;
//            }
//
//            System.out.print("Digite sua idade.......................: ");
//            int idade = scan.nextInt();
//
//            if (idade < 0 && idade > 150) {
//                System.out.println("\nIdade inválida. digite uma idade entre 0 e 150.\n");
//                break;
//            }
//
//            System.out.print("Digite o valor do seu salário..........: ");
//            double sal = scan.nextDouble();
//
//            if (sal < 0) {
//                System.out.println("\nSalário inválido. Digite um salário acima de 0.\n");
//                break;
//            }
//
//            System.out.print("Digite seu sexo (f | m)................: ");
//            String sexo = scan.next().trim();
//
//            if (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
//                System.out.println("\nSexo inválido. Digite o seu sexo apenas com 'f' ou 'm'.\n");
//                break;
//            }
//
//            System.out.print("Digite seu estado civil (s | c | v | d): ");
//            String sc = scan.next().trim();
//
//            if (!sc.equalsIgnoreCase("s")
//                    && !sc.equalsIgnoreCase("c")
//                    && !sc.equalsIgnoreCase("v")
//                    && !sc.equalsIgnoreCase("d") ) {
//                System.out.println("\nEstado civil inválido. Digite apenas 's' | 'c' | 'v' | 'd'.\n");
//                break;
//            }
//
//            else {
//                System.out.println("\nDados de usuário salvos!\n\nSeus Dados:\n");
//                System.out.println("Nome........: " + nome);
//                System.out.println("Idade.......: " + idade);
//                System.out.println("Salário.....: " + String.format("%.2f", sal));
//                System.out.println("Sexo........: " + sexo);
//                System.out.println("Estado Civil: " + sc);
//                break;
//            }
//        }

        /*
        4)
        * Supondo que a população de um país A seja da ordem de 80.000 habitantes com uma taxa anual
        * de crescimento de 3% e que a população de B seja 200.000 habitantes com uma taxa de crescimento de 1.5%.
        * Faça um programa que calcule e escreva o número de anos necessários para que a população do país
        * A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
        */

//        double P_A = 80000;  // População A
//        double P_B = 200000; // População B
//        int anos = 0;
//
//        while (P_A <= P_B) {
//            P_A += (P_A * 0.03);  // População A + 3%/a
//            P_B += (P_B * 0.015); // População B + 1.5%/a
//            anos++; // a cada incremento adiciona +1 ano necessário
//        }
//
//        System.out.println("A quantidade de anos necessários é de: " + anos + " anos.");

        /*
        5)
        * Altere o programa anterior permitindo ao usuário informar as populações
        * e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
        */

//        Scanner scan = new Scanner(System.in);
//        int anos = 0;
//
//        System.out.print("Digite a quantidade de habitantes de um local A: ");
//        double pA = scan.nextDouble();
//
//        System.out.print("Digite quantos % essa população irá crescer a cada ano: ");
//        double tcA = scan.nextDouble();
//
//        System.out.print("\nDigite a quantidade de habitantes de um local B: ");
//        double pB = scan.nextDouble();
//
//        System.out.print("Digite quantos % essa população irá crescer a cada ano: ");
//        double tcB = scan.nextDouble();
//
//        if (tcA <= tcB) {
//            System.out.println("\nErro: Quando a taxa de crescimento de A é menor ou igual à de B,"
//                    + " A nunca ultrapassará B.");
//        } else {
//
//            while(pA <= pB) {
//
//                pA += (pA * (tcA / 100));
//                pB += (pB * (tcB / 100));
//                anos++;
//
//            }
//
//            System.out.println("\nA quantidade de anos necessários para sua população A "
//                    + "utrapassar a população B é de: "
//                    + anos + " anos.");
//
//        }

        /*
        6)
        * Faça um programa que imprima na tela os números de 1 a 20,
        * um abaixo do outro. Depois modifique o programa para que ele
        * mostre os números um ao lado do outro.
        */

//        for (int i = 1; i <= 20; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println("---------------");
//
//        for (int i = 1; i <= 20; i++) {
//            System.out.print(i + " | ");
//        }

        /*
        7)
        * Faça um programa que leia 5 números e informe o maior número.
        */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Digite um número (" + 1 + "): ");
//        double maior = scan.nextDouble();
//
//        for (int i = 1; i <= 4; i++) {
//
//            System.out.print("\nDigite um número (" + (i + 1) + "): ");
//            double num = scan.nextDouble();
//
//            if (num > maior) {
//                maior = num;
//            }
//
//        }
//
//        System.out.println("\nO maior número dentre eles é: " + maior);

        /*
        8)
        * Faça um programa que leia 5 números e informe a soma e a média dos números.
        */

//        Scanner scan = new Scanner(System.in);
//
//        double soma = 0;
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("\nDigite um numero "+ i + ": ");
//            double num = scan.nextDouble();
//
//            soma += num;
//        }
//
//        double media = soma / 5;
//
//        System.out.print("\nSoma.: " + soma);
//        System.out.print("\nMédia: " + String.format("%.2f", media) + "\n");

        /*
        9)
        * Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
        */

//        for (int i = 1; i <= 50; i++) {
//            if (i % 2 == 1) {
//                System.out.print(i + " | ");
//            }
//        }

        /*
        10)
        * Faça um programa que receba dois números inteiros e gere os números inteiros
        * que estão no intervalo compreendido por eles.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite um número: ");
        int n1 = scan.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = scan.nextInt();

        System.out.println(" ");

        int aux = n1;

        if (n1 > n2) {
            n1 = n2;

            n2 = aux;
        }

        for (int i = (n1 + 1); i <= (n2 - 1); i++) {

            System.out.print(i + " | ");

        }

    }
}