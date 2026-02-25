package com.tenmenezes.estruturadados.pilha;

import com.tenmenezes.estruturadados.estatica.EstruturaEstatica;

public class PilhaEstatica<T> extends EstruturaEstatica<T> {

    public PilhaEstatica() {
        super();
    }

    public PilhaEstatica(int capacidade) {
        super(capacidade);
    }

    public void empilhar(T elemento) {
        super.adicionar(elemento);
    }

    public T topo() {

        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[tamanho - 1];
    }

    public T desempilhar() {

        if (this.estaVazia()) {
            return null;
        }

		/*T elemento = this.elementos[tamanho-1];
		tamanho--;

		return elemento;*/

        return this.elementos[--tamanho];
    }

}
