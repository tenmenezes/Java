package com.tenmenezes.estruturadados.vetor.exercicios;

import com.tenmenezes.estruturadados.vetor.Lista;

public class Exe4 {

    static void main(String[] args) {

        Lista<String> list = new Lista<>(10);

        list.adicionar("A");
        list.adicionar("B");
        list.adicionar("C");
        list.adicionar("C");
        list.adicionar("E");
        list.adicionar("F");

        System.out.println(list);

        System.out.println(list.obtem(2)); // deve aparecer 'C'

    }

}
