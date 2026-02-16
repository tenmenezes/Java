package com.tenmenezes.javaintermediario.enums.exercicio;

public class Calculadora {

    static void main(String[] args) {

        double x = 2;
        double y = 3;

        for(Operacoes op : Operacoes.values()) {
            System.out.print(STR."\{x} \{op.toString()} \{y} = \{String.format("%.2f", op.executarOperacao(x, y))}\n");
        }

    }

}
