package com.tenmenezes.estruturadados.vetor.teste;

import com.tenmenezes.estruturadados.vetor.Vetor;

public class Teste05 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("elemento 1"); //0
        vetor.adicionar("elemento 2"); //1
        vetor.adicionar("elemento 3"); //2

        System.out.println(vetor.buscar("elemento 1"));
        System.out.println(vetor.buscar("elemento 4"));
    }

}
