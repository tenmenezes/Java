package com.tenmenezes.javaintermediario.classesutilitarias;

import java.util.Date;

public class ClasseDate {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje);

        System.out.println(STR."Milisegundos desde 1 Jan 1970 \{hoje.getTime()}");

        System.out.println(hoje.getDate());

    }

}
