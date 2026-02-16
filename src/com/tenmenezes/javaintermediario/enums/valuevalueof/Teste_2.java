package com.tenmenezes.javaintermediario.enums.valuevalueof;

import com.tenmenezes.javaintermediario.enums.construtorsemetodos.DiaSemana;

public class Teste_2 {

    public static void main(String[] args) {

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);
    }

}
