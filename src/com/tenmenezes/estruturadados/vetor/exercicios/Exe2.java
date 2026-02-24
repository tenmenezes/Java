package com.tenmenezes.estruturadados.vetor.exercicios;

import com.tenmenezes.estruturadados.vetor.Lista;

public class Exe2 {

    static void main(String[] args) {

        Lista<String> list = new Lista<String>(5);

        list.adicionar("A");
        list.adicionar("B");
        list.adicionar("B");
        list.adicionar("D");

        System.out.println(list);

        System.out.println(list.tamanho());

        System.out.println(list.ultimoIndiceDe("B")); // indice deve imprimir 2

    }

}
