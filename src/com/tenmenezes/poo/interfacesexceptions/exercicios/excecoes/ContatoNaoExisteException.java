package com.tenmenezes.poo.interfacesexceptions.exercicios.excecoes;

public class ContatoNaoExisteException extends Exception {
    public ContatoNaoExisteException(String nome) {
        super(STR."\nErro: Contato {\{nome}} não encontrado.");
    }
}
