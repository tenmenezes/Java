package com.tenmenezes.poo.interfacesexceptions.exercicios.excecoes;

public class AgendaCheiaException extends RuntimeException {
    @Override
    public String toString() {
        return STR."Erro: Agenda cheia no momento.";
    }
}
