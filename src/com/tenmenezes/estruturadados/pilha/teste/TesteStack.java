package com.tenmenezes.estruturadados.pilha.teste;

import com.tenmenezes.estruturadados.pilha.PilhaEstatica;

import java.util.Stack;

public class TesteStack {

    public static void main(String[] args) {

        PilhaEstatica<Integer> pilha = new PilhaEstatica<Integer>();

        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty()); // mesmo que 'estaVazia'

        stack.push(1); // mesmo que 'empilhar'
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size()); // mesmo que 'tamanho'
        System.out.println(stack);

        System.out.println(stack.peek()); // mesmo que 'topo' ou 'espiar'

        System.out.println(stack.pop()); // mesmo que 'desempilhar'

        System.out.println(stack);
    }

}
