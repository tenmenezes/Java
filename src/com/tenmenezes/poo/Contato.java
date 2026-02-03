package com.tenmenezes.poo;

public class Contato {

    String nome, email, telefone;

    void exibirDadosDoContato() {

        System.out.println("\nNome..............: " + nome);
        System.out.println("E-mail............: " + email);
        System.out.println("Número de Telefone: " + telefone + "\n");

    }

    void atualizarTelefone(String novoTelefone) {

        telefone = novoTelefone;

    }

}