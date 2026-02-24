package com.tenmenezes.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

//    public Lista() {
//    }

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // solução do livro effective java second edition
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    private void verificarPosicao(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
    }

    private void aumentarTamanho() {
        if (this.tamanho == this.elementos.length) {
            T[] newElements = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                newElements[i] = this.elementos[i];
            }
            this.elementos = newElements;
        }
    }

    public boolean adicionar(T elemento) {
        this.aumentarTamanho();
        if (this.tamanho <= this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public void adicionar(int posicao, T elemento) {
        this.aumentarTamanho();
        verificarPosicao(posicao);
        for (int i = tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    public T buscar(int posicao) {
        verificarPosicao(posicao);
        return this.elementos[posicao];
    }

    public int buscar(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public T obtem(int posicao) {
        verificarPosicao(posicao);

        T elemento = null;

        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(this.elementos[posicao])) {
                elemento = this.elementos[i];
            }
        }
        return elemento;
    }

    public void remover(int posicao) {
        verificarPosicao(posicao);
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public void remover(T elemento) {
        int pos = buscar(elemento);

        if (pos > -1) {
            remover(pos);
        }

    }

    public void limpar() {
        // opção 1
        this.elementos = (T[]) new Object[this.tamanho];

        // opção 2
        this.tamanho = 0;
    }

    public boolean contem(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int ultimoIndiceDe(T elemento) {

        int index = 0;

        for (int i = tamanho - 1; i >= 0; i--) {

            verificarPosicao(i);

            if (this.elementos[i].equals(elemento)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(this.elementos[i]);
            sb.append(", ");
        }

        if (this.tamanho > 0) {
            sb.append(this.elementos[this.tamanho - 1]);
        }

        sb.append("]");

        return sb.toString();
    }

}
