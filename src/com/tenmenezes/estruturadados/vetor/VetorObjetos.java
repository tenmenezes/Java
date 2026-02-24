package com.tenmenezes.estruturadados.vetor;

public class VetorObjetos {

    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    private void verificarPosicao(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
    }

    private void aumentarTamanho() {
        if (this.tamanho == this.elementos.length) {
            Object[] newElements = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                newElements[i] = this.elementos[i];
            }
            this.elementos = newElements;
        }
    }

    public boolean adicionar(Object elemento) {
        this.aumentarTamanho();
        if (this.tamanho <= this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public void adicionar(int posicao, Object elemento) {
        this.aumentarTamanho();
        verificarPosicao(posicao);
        for (int i = tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    public Object buscar(int posicao) {
        verificarPosicao(posicao);
        return this.elementos[posicao];
    }

    public int buscar(Object elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void remover(int posicao) {
        verificarPosicao(posicao);

        for (int i = posicao; i < tamanho - 1; i--) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
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
