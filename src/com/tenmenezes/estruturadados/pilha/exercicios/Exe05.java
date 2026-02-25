package com.tenmenezes.estruturadados.pilha.exercicios;

import com.tenmenezes.estruturadados.pilha.PilhaEstatica;

public class Exe05 {

    static void main(String[] args) {

        imprimirResultado("ADA");
        imprimirResultado("ABCD");
        imprimirResultado("ABCCBA");
        imprimirResultado("Maria");

    }

    public static void imprimirResultado(String palavra) {
        System.out.println(STR."\{palavra} é um palíndromo? \{testandoPalindromo(palavra)}");
    }

    public static boolean testandoPalindromo(String palavra) {

        PilhaEstatica<Character> pilha = new  PilhaEstatica<>();

        for(int i = 0; i < palavra.length(); i++) {
            pilha.empilhar(palavra.charAt(i));
        }

        String palavraInversa = "";

        while(!pilha.estaVazia()) {
            palavraInversa += pilha.desempilhar();
        }

        if(palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }

        return false;
    }

}
