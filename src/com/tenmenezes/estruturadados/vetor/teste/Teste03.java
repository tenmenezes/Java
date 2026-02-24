package com.tenmenezes.estruturadados.vetor.teste;

import com.tenmenezes.estruturadados.vetor.Vetor;

public class Teste03 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("elemento 1");
        vetor.adicionar("elemento 2");
        vetor.adicionar("elemento 3");

        System.out.println(vetor.tamanho());

        System.out.println(vetor);
    }

}
