package com.tenmenezes.estruturadados.fila;

public class FilaComPrioridade<T> extends FilaEstatica<T> {

    public void enfileirar(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i;
        for (i = 0; i < super.tamanho; i++) {
            if (chave.compareTo(super.elementos[i]) < 0) {
                break;
            }
        }
        super.adicionar(i, elemento);
    }

}
