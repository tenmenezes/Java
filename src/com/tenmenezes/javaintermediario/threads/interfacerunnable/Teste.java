package com.tenmenezes.javaintermediario.threads.interfacerunnable;

public class Teste {

    public static void main(String[] args) {

        ThreadRunnable thread1 = new ThreadRunnable("#1", 900);
        //Thread t1 = new Thread(thread1);
        //t1.start();

        ThreadRunnable thread2 = new ThreadRunnable("#2", 650);

        ThreadRunnable thread3 = new ThreadRunnable("#3", 1100);
    }

}
