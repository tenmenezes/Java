package com.tenmenezes.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Exe07 {

    static void main() {
        imprimirResultado(12);
        imprimirResultado(25);
        imprimirResultado(3467);
        imprimirResultado(10897);
        imprimirResultado(100000);
    }

    public static void imprimirResultado(int n) {
        System.out.println(STR."\{n} em binário é: \{decimalBinario(n)}");
    }

    public static String decimalBinario(int num) {

        Stack<Integer> pilha = new Stack<>();
        String binario = "";
        int resto;

        while(num > 0) {
            resto = num % 2;
            pilha.push(resto);
            num /= 2;
        }

        while (!pilha.isEmpty()) {
            binario += pilha.pop();
        }

        return binario;
    }

}
