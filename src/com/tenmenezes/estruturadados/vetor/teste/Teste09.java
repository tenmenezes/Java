package com.tenmenezes.estruturadados.vetor.teste;

import com.tenmenezes.estruturadados.vetor.VetorObjetos;

public class Teste09 {
    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");

        Contato c4 = new Contato("Contato 1", "1234-4567", "contato1@email.com");

        vetor.adicionar(c1);
        vetor.adicionar(c2);
        vetor.adicionar(c3);

        System.out.println(STR."Tamanho = \{vetor.tamanho()}");

        int pos = vetor.buscar(c4);
        if (pos > -1){
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);
    }
}
