package com.tenmenezes.estruturadados.pilha.exercicios;

import com.tenmenezes.estruturadados.pilha.PilhaEstatica;

public class Exe06 {

    final static String ABERTURA = "([{";
    final static String FECHAMENTO = ")]}";

    static void main(String[] args) {

        imprimirResultado("A + B");
        imprimirResultado("A + B + (C - D)");
        imprimirResultado("([{}])()[]{}");
        imprimirResultado("([{]])()[]{}");
        imprimirResultado("A + B + C - D)");

    }

    public static void imprimirResultado(String expressao) {
        System.out.println(STR."\{expressao} está balanceado?"
                + STR." \{verificandoSimbolosBalanceados(expressao)}");
    }

    public static boolean verificandoSimbolosBalanceados(String expressao) {

        boolean balanceado = true;
        int index = 0;
        char simbolo, topo;

        PilhaEstatica<Character>  pilha = new PilhaEstatica<>();

        while(index < expressao.length()) {
            simbolo = expressao.charAt(index);

            if(ABERTURA.indexOf(simbolo) > -1) {
                pilha.empilhar(simbolo);
            } else if (FECHAMENTO.indexOf(simbolo) > -1) {
                if(pilha.estaVazia()) {
                    return false;
                } else {
                    topo = pilha.desempilhar();

                    if(ABERTURA.indexOf(topo) != FECHAMENTO.indexOf(simbolo)) {
                        return false;
                    }
                }
            }
            index++;
        }

        return true;
    }

}
