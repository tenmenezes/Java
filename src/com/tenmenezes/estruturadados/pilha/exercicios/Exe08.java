package com.tenmenezes.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Exe08 {

    static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        Stack<Integer> dest = new Stack<>();
        Stack<Integer> aux = new Stack<>();

        original.push(3);
        original.push(2);
        original.push(1);

        torreDeHanoi(original.size(), original, dest, aux);

    }

    // Função recursiva
    public static void torreDeHanoi(int n, Stack<Integer> original,
                                    Stack<Integer> dest, Stack<Integer> aux) {
        if (n > 0) {
            torreDeHanoi(n - 1, original, aux, dest);
            dest.push(original.pop());
            System.out.println("-------");
            System.out.println(STR."Original: \{original}");
            System.out.println(STR."Destino.: \{dest}");
            System.out.println(STR."Aux.....: \{aux}");
            torreDeHanoi(n - 1, aux, dest, original);
        }
    }
}
