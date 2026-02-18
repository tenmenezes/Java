package com.tenmenezes.javaintermediario.threads.exercicio;

public class Semaforo implements Runnable {

    enum Cor {
        VERDE,
        AMARELO,
        VERMELHO;
    }

    private Cor corAtual;

    private int tempoVerde, tempoVermelho, tempoAmarelo;

    private int i = 0;

    public Semaforo() {
        this.corAtual = Cor.VERDE;
        this.tempoVerde = 500;
        this.tempoAmarelo = 800;
        this.tempoVermelho = 700;
    }

    @Override
    public void run() {
        try {
            while (true) {
                switch (corAtual) {
                    case VERDE:
                        System.out.println("VERDE");
                        Thread.sleep(tempoVerde);
                        corAtual = Cor.AMARELO;
                        break;

                    case AMARELO:
                        System.out.println("AMARELO");
                        Thread.sleep(tempoAmarelo);
                        corAtual = Cor.VERMELHO;
                        break;

                    case VERMELHO:
                        System.out.println("VERMELHO");
                        Thread.sleep(tempoVermelho);
                        i++;
                        System.out.println(STR."\nCiclo \{i + 1}:");
                        corAtual = Cor.VERDE;
                        break;

                    default:
                        System.out.println("\nSistema fora de funcionamento.\n");
                        break;
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
