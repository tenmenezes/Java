package com.tenmenezes.estruturadados.lista.teste;

import com.tenmenezes.estruturadados.lista.ListaEncadeada;

import java.util.LinkedList;

public class TesteListaEncadeada {

    static void main(String[] args) {
//        adicionarPorPosicao();
//        removeInicio();
//        removeFinal();
//        removePosicao();
//        insereOrdenado();
        testeLinkedList();
    }

    public static void testeLinkedList() {
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(1);
        lista.addFirst(0);
        lista.addLast(3);

        System.out.println(lista.contains(1));

        lista.add(2, 2);

        System.out.println(lista);

        lista.remove();
        System.out.println(lista);

        lista.remove(0);
        lista.removeFirst();
        lista.removeLast();
        System.out.println(lista);
    }

    private static void insereOrdenado() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        CompararNumero comparator = new CompararNumero();
        lista.adicionarOrdenado(5, comparator);
        System.out.println(lista);
        lista.adicionarOrdenado(1, comparator);
        System.out.println(lista);
        lista.adicionarOrdenado(4, comparator);
        System.out.println(lista);
        lista.adicionarOrdenado(2, comparator);
        System.out.println(lista);
        lista.adicionarOrdenado(3, comparator);
        System.out.println(lista);
        lista.adicionarOrdenado(6, comparator);
        System.out.println(lista);
        lista.adicionarOrdenado(5, comparator);
        System.out.println(lista);
    }

    public static void removePosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.adicionar(4);
        lista.adicionar(5);

        System.out.println(STR."Elemento removido: \{lista.remover(2)}");
        System.out.println(STR."Lista: \{lista}");

    }

    public static void removeFinal() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

//         lista.removerDoFinal();

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);

        System.out.println(STR."Elemento removido: \{lista.removerDoFinal()}");
        System.out.println(STR."Lista: \{lista}");

        System.out.println(STR."Elemento removido: \{lista.removerDoFinal()}");
        System.out.println(STR."Lista: \{lista}");

        System.out.println(STR."Elemento removido: \{lista.removerDoFinal()}");
        System.out.println(STR."Lista: \{lista}");
    }

    public static void removeInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

//         lista.removerDoInicio();

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);

        System.out.println(STR."Elemento removido: \{lista.removerDoInicio()}");
        System.out.println(STR."Lista: \{lista}");

        System.out.println(STR."Elemento removido: \{lista.removerDoInicio()}");
        System.out.println(STR."Lista: \{lista}");

        System.out.println(STR."Elemento removido: \{lista.removerDoInicio()}");
        System.out.println(STR."Lista: \{lista}");
    }

    public static void adicionarPorPosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        // lista.adicionar(-1, 1);
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(4); // 1, 2, 4

        // lista.adiciona(5, 0);
        lista.adicionar(0, 0); // 0, 1, 2, 4
        lista.adicionar(4, 5); // 0, 1, 2, 4, 5
        lista.adicionar(2, 3); // 0, 1, 2, 3, 4, 5

        System.out.println(lista);
    }

    public static void adicionarNoInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionarNoInicio(3);
        lista.adicionarNoInicio(2);
        lista.adicionarNoInicio(1); // 1, 2, 3

        System.out.println(lista);
    }

    public static void testesIniciais() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        System.out.println(STR."Tamanho: \{lista.getTamanho()}");

        lista.adicionar(1);
        System.out.println(lista);

        lista.adicionar(2);
        System.out.println(lista);

        lista.adicionar(3);
        System.out.println(lista);

        System.out.println(STR."Tamanho: \{lista.getTamanho()}");

//        lista.limpar();
//        System.out.println(lista);

        System.out.println("------ busca por elemento ------");

        // busca por elemento
        System.out.println(lista.buscar(0));
        System.out.println(lista.buscar(1));
        System.out.println(lista.buscar(2));
        System.out.println(lista.buscar(3));

        System.out.println("------ busca por posição ------");

        // busca por posição
        System.out.println(lista.buscarPorPosicao(0));
        System.out.println(lista.buscarPorPosicao(1));
        System.out.println(lista.buscarPorPosicao(2));
//        System.out.println(lista.buscarPorPosicao(4));
//        System.out.println(lista.buscarPorPosicao(-1));
    }

}
