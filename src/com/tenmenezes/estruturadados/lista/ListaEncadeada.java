package com.tenmenezes.estruturadados.lista;

import java.util.Comparator;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;


    // CONSTANTES
    private final int NAO_ENCONTRADO = -1;
    private final String NAO_EXISTE = "Posição não existe.";
    private final String LISTA_VAZIA = "Lista está vazia.";
    private static final int MENOR = -1;
    private static final int IGUAL_MAIOR = 0;

    // Métodos privados
    private boolean posicaoNaoExiste(int posicao) {
        return !(posicao >= 0 && posicao <= this.tamanho);
    }

    private No<T> buscarPorNo(int posicao) {

        if (this.posicaoNaoExiste(posicao)) {
            throw new PosicaoInvalidaException(NAO_EXISTE);
        }

        No<T> noAtual = this.inicio;

        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }

    // Métodos públicos
    public void adicionar(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }

        this.ultimo = celula;
        this.tamanho++;
    }

    public void adicionarNoInicio(T elemento) {
        if (this.tamanho == 0) {
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            this.inicio = new No<>(elemento, this.inicio);
        }
        this.tamanho++;
    }

    public void adicionar(int posicao, T elemento) {

        if (this.posicaoNaoExiste(posicao)) {
            throw new PosicaoInvalidaException(NAO_EXISTE);
        }

        if (posicao == 0) { // está vazia
            this.adicionarNoInicio(elemento);
        } else if (posicao == this.tamanho) { // adiciona
            this.adicionar(elemento);
        } else { // meio
            No<T> noAnterior = this.buscarPorNo(posicao);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento, proximoNo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    public void adicionarOrdenado(T elemento, Comparator<T> comparator) {
        if (this.tamanho == 0) { // esta vazia
            this.adicionarNoInicio(elemento);
        } else if (comparator.compare(this.inicio.getElemento(), elemento) >= IGUAL_MAIOR) {
            this.adicionarNoInicio(elemento);
        } else {
            No<T> atual = this.inicio;
            while (atual.getProximo() != null
                    && comparator.compare(atual.getProximo().getElemento(), elemento) == MENOR) {
                atual = atual.getProximo();
            }
            No<T> celula = new No<>(elemento, atual.getProximo());
            atual.setProximo(celula);
            this.tamanho++;
        }
    }

    public T removerDoInicio() {
        if (this.tamanho == 0) {
            throw new ListaVaziaException(LISTA_VAZIA);
        }

        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        if (this.tamanho == 0) {
            this.ultimo = null;
        }
        return removido;
    }

    public T removerDoFinal() {
        if (this.tamanho == 0) {
            throw new ListaVaziaException(LISTA_VAZIA);
        }

        if (this.tamanho == 1) {
            return this.removerDoInicio();
        }

        No<T> penultimoNo = this.buscarPorNo(this.tamanho - 2);
        T removido = penultimoNo.getProximo().getElemento();
        penultimoNo.setProximo(null);
        this.ultimo = penultimoNo;
        this.tamanho--;
        return removido;
    }

    public T remover(int posicao) {
        if (this.posicaoNaoExiste(posicao)) {
            throw new PosicaoInvalidaException(NAO_EXISTE);
        }

        if (posicao == 0) {
            return this.removerDoInicio();
        }
        if (posicao == this.tamanho - 1) {
            return this.removerDoFinal();
        }

        No<T> noAnterior = this.buscarPorNo(posicao - 1);
        No<T> atual = noAnterior.getProximo();
        No<T> proximo = atual.getProximo();
        noAnterior.setProximo(proximo);
        atual.setProximo(null);
        this.tamanho--;

        return atual.getElemento();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void limpar() {
        for (No<T> atual = this.inicio; atual != null; ) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public T buscarPorPosicao(int posicao) {
        return this.buscarPorNo(posicao).getElemento();
    }

    public int buscar(T elemento) {

        No<T> noAtual = this.inicio;
        int pos = 0;

        while (noAtual != null) {

            if (noAtual.getElemento().equals(elemento)) {
                return pos;
            }
            pos++;
            noAtual = noAtual.getProximo();

        }

        return NAO_ENCONTRADO;
    }

    @Override
    public String toString() {

        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");

        No<T> atual = this.inicio;

        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(atual.getElemento()).append(',');
            atual = atual.getProximo();
        }
        sb.append(atual.getElemento()).append(']');

//        sb.append(atual.getElemento()).append(',');
//        while(atual.getProximo() != null) {
//            atual = atual.getProximo();
//            sb.append(atual.getElemento()).append(',');
//        }

        return sb.toString();
    }
}
