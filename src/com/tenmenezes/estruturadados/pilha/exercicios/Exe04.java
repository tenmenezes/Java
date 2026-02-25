package com.tenmenezes.estruturadados.pilha.exercicios;

import com.tenmenezes.estruturadados.pilha.PilhaEstatica;

import java.util.Stack;

public class Exe04 {

    static void main(String[] args) {

        Livro livro01 = new Livro();
        Livro livro02 = new Livro();
        Livro livro03 = new Livro();
        Livro livro04 = new Livro();
        Livro livro05 = new Livro();
        Livro livro06 = new Livro();

        livro01.setNome("Clean Code: A Handbook of Agile Software Craftsmanship");
        livro01.setiSBN("978-0132350884");
        livro01.setAno_lancamento("2008");
        livro01.setAutor("Robert C. Martin");

        livro02.setNome("The Pragmatic Programmer: Your Journey to Mastery (20th Anniversary Edition)");
        livro02.setiSBN("978-0135957059");
        livro02.setAno_lancamento("2019");
        livro02.setAutor("Andrew Hunt e David Thomas");

        livro03.setNome("Design Patterns: Elements of Reusable Object-Oriented Software");
        livro03.setiSBN("978-0201633610");
        livro03.setAno_lancamento("1994");
        livro03.setAutor("Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides");

        livro04.setNome("Refactoring: Improving the Design of Existing Code (2nd Edition)");
        livro04.setiSBN("978-0134757599");
        livro04.setAno_lancamento("2018");
        livro04.setAutor("Martin Fowler");

        livro05.setNome("Código Limpo: Habilidades Práticas do Agile Software");
        livro05.setiSBN("978-8576082675");
        livro05.setAno_lancamento("2009");
        livro05.setAutor("Robert C. Martin");

        livro06.setNome("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos");
        livro06.setiSBN("978-8575225638");
        livro06.setAno_lancamento("2017");
        livro06.setAutor("Aditya Y. Bhargava");

        Stack<Livro> pilhaLivros = new Stack<>();

        System.out.println(STR."Pilha vazia? \{pilhaLivros.isEmpty()}");

        pilhaLivros.push(livro01);
        pilhaLivros.push(livro02);
        pilhaLivros.push(livro03);
        pilhaLivros.push(livro04);
        pilhaLivros.push(livro05);
        pilhaLivros.push(livro06);

        System.out.println(pilhaLivros);

        System.out.println(STR."\nPilha vazia? \{pilhaLivros.isEmpty()}");

        System.out.println();

        System.out.println(STR."Objeto que está no topo da pilha:\n\n \{pilhaLivros.peek()}");

        System.out.println(STR."\nTamanho atual da pilha: \{pilhaLivros.size()}");

        System.out.println();

        System.out.println(STR."Desempilhando item da pilha:\n\n \{pilhaLivros.pop()}");

        System.out.println();

        System.out.println(STR."Objeto que está no topo da pilha após desempilhado:\n\n \{pilhaLivros.peek()}");

        System.out.println(STR."\nTamanho atual da pilha: \{pilhaLivros.size()}");

    }

}
