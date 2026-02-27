package com.tenmenezes.estruturadados.fila;

import com.tenmenezes.estruturadados.estatica.EstruturaEstatica;

public class FilaEstatica<T> extends EstruturaEstatica<T> {

    private final int POS = 0;

    public FilaEstatica() {
        super();
    }

    public FilaEstatica(int capacidade) {
        super(capacidade);
    }

    public void enfileirar(T elemento) {
        super.adicionar(elemento);
    }

    public T desenfileirar(T elemento) {
        if (this.estaVazia()) {
            return null;
        }

        T removedItem = super.elementos[POS];

        super.remover(POS);

        return removedItem;
    }

    public T topo() {
        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[0];
    }



}
