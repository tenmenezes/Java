package com.tenmenezes.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {

    static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1); // enfileirar
        q.add(2);

        System.out.println(q);
        System.out.println(q.peek()); // espiar
        System.out.println(q.remove()); // desenfileirar
        System.out.println(q);

    }

}
