package com.tenmenezes.poo.interfacesexceptions.exercicios.excecoes;

public class Contato {

    //  como esse atributo será incrementado entre todas as intancias de classe, o ideal é declara-lo como static.
    private static int contador;
    private int id;
    private String nome, telefone;

    public Contato() {
        contador++;
        this.id = contador; // a cada contato criado, id é automaticamente incrementando com ele mesmo +1
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return STR."Contato \{id}:\n ID: \{id}\n Nome: \{nome}\n Telefone: \{telefone}";
    }
}
