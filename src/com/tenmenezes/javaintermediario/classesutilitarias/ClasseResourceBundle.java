package com.tenmenezes.javaintermediario.classesutilitarias;

import java.util.Locale;
import java.util.ResourceBundle;

public class ClasseResourceBundle {

    public static void main(String[] args) {

        System.out.println(STR."Locale atual \{Locale.getDefault()}");
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");

        System.out.println(STR."Hello EN: \{rb.getString("hello")}");
        System.out.println(STR."World EN: \{rb.getString("world")}");

        // Locale.setDefault(new Locale("pt_BR", "pt_BR"));
        rb = ResourceBundle.getBundle("meu-texto", new Locale("pt_BR", "pt_BR"));

        System.out.println(STR."Olá pt_BR: \{rb.getString("hello")}");
        System.out.println(STR."Mundo pt_BR: \{rb.getString("world")}");
    }

}
