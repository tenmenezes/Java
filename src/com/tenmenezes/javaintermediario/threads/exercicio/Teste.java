package com.tenmenezes.javaintermediario.threads.exercicio;

public class Teste {

    public static void main(String[] args) {

        Semaforo s = new Semaforo();
        Thread t = new Thread(s);
        t.start();

    }
}
