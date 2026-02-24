package com.tenmenezes.estruturadados.vetor.teste;

import com.tenmenezes.estruturadados.vetor.Vetor;

public class Teste07 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("E");
        vetor.adicionar("F");
        vetor.adicionar("G");

        System.out.println(vetor);
    }

}
