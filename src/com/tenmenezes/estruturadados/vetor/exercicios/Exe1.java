package com.tenmenezes.estruturadados.vetor.exercicios;

import com.tenmenezes.estruturadados.vetor.Lista;

public class Exe1 {

    static void main(String[] args) {

        Lista<String> lista = new Lista<String>(5);

        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("D");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("D"));
        System.out.println(lista.contem("F"));

    }

}