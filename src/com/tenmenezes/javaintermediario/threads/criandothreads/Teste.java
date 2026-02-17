package com.tenmenezes.javaintermediario.threads.criandothreads;

public class Teste {

    static void main(String[] args) {

        FirstThread thread = new FirstThread("Thread #1", 600);
        //thread.start();

        FirstThread thread2 = new FirstThread("Thread #2", 900);

        FirstThread thread3 = new FirstThread("Thread #3", 500);

    }

}
