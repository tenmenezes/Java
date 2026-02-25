package com.tenmenezes.estruturadados.pilha.exercicios;

import com.tenmenezes.estruturadados.pilha.PilhaEstatica;

import java.util.Scanner;

public class Exe01 {

    static void main(String[] args) {

        PilhaEstatica<Integer> pilha = new PilhaEstatica<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            System.out.print(STR."Digite um número (\{i}/10): ");

            int num = scan.nextInt();

            if (num % 2 == 0) {
                pilha.empilhar(num);
            } else {
                Integer desempilhado = pilha.desempilhar();

                if (desempilhado == null) {
                    System.out.println("\nPilha vazia.\n");
                } else {
                    System.out.println(STR."\nNúmero ímpar detectado, desempilhando um elemento da pilha: "
                            + STR."\{desempilhado}\n");
                }

            }

        }

        System.out.println("\nNúmeros lidos, desempilhando elementos\n");

        while (!pilha.estaVazia()) {

            System.out.println(STR."Desempilhando elementos da pilha: "
                    + STR."\{pilha.desempilhar()}");

        }

        System.out.println("\nTodos os elementos foram desempilhados");

    }

}
