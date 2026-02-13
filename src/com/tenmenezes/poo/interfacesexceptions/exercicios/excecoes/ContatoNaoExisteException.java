package com.tenmenezes.poo.interfacesexceptions.exercicios.excecoes;

public class ContatoNaoExisteException extends RuntimeException {

   private String nome;

    @Override
    public String toString() {
        return STR."Erro: Contato \{nome} não encontrado.";
    }
}
