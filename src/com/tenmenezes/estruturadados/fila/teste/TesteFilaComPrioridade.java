package com.tenmenezes.estruturadados.fila.teste;

import com.tenmenezes.estruturadados.fila.FilaComPrioridade;

public class TesteFilaComPrioridade {

    static void main(String[] args) {

        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(2);

        System.out.println(fila); // impresso [1, 2, 3]

    }

}
