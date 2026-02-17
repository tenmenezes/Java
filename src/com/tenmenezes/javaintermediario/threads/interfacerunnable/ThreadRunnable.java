package com.tenmenezes.javaintermediario.threads.interfacerunnable;

public class ThreadRunnable implements Runnable {
    private String nome;
    private int tempo;

    public ThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(nome + " terminou a execução");
    }
}
