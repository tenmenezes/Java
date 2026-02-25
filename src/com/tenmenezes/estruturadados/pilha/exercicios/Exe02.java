package com.tenmenezes.estruturadados.pilha.exercicios;

import com.tenmenezes.estruturadados.pilha.PilhaEstatica;

import java.util.Scanner;

public class Exe02 {

    static void main(String[] args) {

        PilhaEstatica<Integer> pilhaPar = new PilhaEstatica<>();
        PilhaEstatica<Integer> pilhaImpar = new PilhaEstatica<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            System.out.print(STR."Digite um numero (\{i}/10): ");

            int num = sc.nextInt();

            if (num == 0) {
                Integer desempilhado = pilhaPar.desempilhar();

                if (desempilhado == null) {
                    System.out.println("\nPilha par está vazia.\n");
                } else {
                    System.out.println(STR."\nDesempilhando da pilha par: \{desempilhado}");
                }

                desempilhado = pilhaImpar.desempilhar();

                if (desempilhado == null) {
                    System.out.println("Pilha ímpar está vazia.\n");
                } else {
                    System.out.println(STR."Desempilhando da pilha ímpar: \{desempilhado}\n");
                }
            } else if (num % 2 == 0) {
                System.out.println(STR."\nEmpilhando número \{num} na pilha par\n");
                pilhaPar.empilhar(num);
            } else {
                System.out.println(STR."\nEmpilhando número \{num} na pilha ímpar\n");
                pilhaImpar.empilhar(num);
            }
        }

        System.out.println("\nNúmeros lidos, desempilhando elementos\n");

        while (!pilhaPar.estaVazia()) {
            System.out.println(STR."Desempilhando elementos da pilha par: "
                    + STR."\{pilhaPar.desempilhar()}");
        }

        System.out.println();

        while (!pilhaImpar.estaVazia()) {
            System.out.println(STR."Desempilhando elementos da pilha ímpar: "
                    + STR."\{pilhaImpar.desempilhar()}");
        }

        System.out.println("\nTodos os elementos foram desempilhados");

    }

}
