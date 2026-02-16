package com.tenmenezes.javaintermediario.enums.construtorsemetodos;

public class Teste {

    static void main(String[] args) {
        DiaSemana dia = DiaSemana.SEGUNDA;

        System.out.println(STR."\{dia.toString()} - \{dia.getValor()}");


        Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
    }

}
