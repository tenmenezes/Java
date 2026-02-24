package com.tenmenezes.estruturadados.vetor.teste;

import com.tenmenezes.estruturadados.vetor.Vetor;

public class Teste08 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adicionar("B");
        vetor.adicionar("G");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("F");

        System.out.println(vetor);

        vetor.remover(1);

        System.out.println(vetor);

        System.out.println("Remover o elemento A");

        int pos = vetor.buscar("A");
        if (pos > -1){
            vetor.remover(pos);
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);
    }


}
