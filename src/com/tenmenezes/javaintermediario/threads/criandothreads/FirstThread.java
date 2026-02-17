package com.tenmenezes.javaintermediario.threads.criandothreads;

public class FirstThread extends Thread {

    private String nome;
    private int tempo;

    public FirstThread(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public void run(){

        try {
            for (int i=0; i<6; i++){
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nome + " terminou a execução");
    }

}
