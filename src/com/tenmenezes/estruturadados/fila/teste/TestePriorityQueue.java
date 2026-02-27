package com.tenmenezes.estruturadados.fila.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestePriorityQueue {

    static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        q.add(2);
        q.add(1);

        System.out.println(q);
    }

}
