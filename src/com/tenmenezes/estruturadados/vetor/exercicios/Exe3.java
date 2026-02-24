package com.tenmenezes.estruturadados.vetor.exercicios;

import com.tenmenezes.estruturadados.vetor.Lista;

public class Exe3 {

    static void main(String[] args) {

        Lista<String> list = new Lista<>(10);

        list.adicionar("A");
        list.adicionar("B");
        list.adicionar("C");
        list.adicionar("C");
        list.adicionar("E");
        list.adicionar("F");

        System.out.println(list);

        list.remover("A");

        System.out.println(list);

        list.remover("C");

        System.out.println(list);

        list.remover("E");

        System.out.println(list);

    }

}
