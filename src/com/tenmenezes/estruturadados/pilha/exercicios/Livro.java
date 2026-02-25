package com.tenmenezes.estruturadados.pilha.exercicios;

public class Livro {

    private String nome, iSBN, ano_lancamento, autor;

    public Livro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(String ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }

    @Override
    public String toString() {
        return STR."  {\n    nome: '\{nome}',\n    ano_lancamento: '\{ano_lancamento}',\n    autor: '\{autor}',\n"
                + STR."    iSBN: \{iSBN}\n  }";
    }
}
