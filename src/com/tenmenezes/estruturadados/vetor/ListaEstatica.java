package com.tenmenezes.estruturadados.vetor;

import com.tenmenezes.estruturadados.estatica.EstruturaEstatica;

public class ListaEstatica<T> extends EstruturaEstatica<T> {

    public ListaEstatica(int capacidade) {
        super(capacidade);
    }

    public ListaEstatica() {
        super();
    }

    public boolean adicionar(T elemento) {
        return super.adicionar(elemento);
    }

    public boolean adicionar(int posicao, T elemento){
        return super.adicionar(posicao, elemento);
    }

    public void remover(int posicao){
        super.remover(posicao);
    }

    public T buscar(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao inválida");
        }
        return elementos[posicao];
    }

    public int buscar(T elemento){
        for (int i=0; i<tamanho ;i++){
            if (elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
}
