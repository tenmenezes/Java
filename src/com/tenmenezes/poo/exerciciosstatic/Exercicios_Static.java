package com.tenmenezes.poo.exerciciosstatic;

class Contador {

//  uma variável para a classe inteira, por causa do static, todas as instancias
//  'count' - 'count_2' - 'count_3' apontam para a MESMA variável -> contador
    static int contador;

    public Contador() {
        contador += 1;
    }

    public static void zerarContador() {
        contador = 0;
    }

    public static int incrementarContador(int incremento) {
        return contador += incremento;
    }

    public static int retornarValorDoContador(){
        return contador;
    }

}

class Calculadora {

    public static double somar(double num_1, double num_2) {
        return num_1 + num_2;
    }

    public static double subtrair(double num_1, double num_2) {
        return num_1 - num_2;
    }

    public static double multiplicar(double num_1, double num_2) {
        return num_1 * num_2;
    }

    public static double dividir(double num_1, double num_2) {
        return num_1 / num_2;
    }

    public static double elevarPotencia(double num, double potencia) {
        return Math.pow(num, potencia);
    }

    public static String calcularFatorial(int num) {
        int fat = num;
        System.out.print(STR."\{num} . ");
        for(int i = (num - 1); i >= 2; i--) {
            System.out.print(STR."\{i} . ");

            fat *= i;

        }
        return STR."1 = \{fat}";
    }

}

public class Exercicios_Static {
    public static void main(String[] args) {

        /*
        * 1)
        * Crie uma classe chamada Contador que possua um atributo estático que seja incrementado toda
        * vez que a classe for instanciada. Implemente métodos para zerar, incrementar e retornar o valor
        * do contador. Desenvolva um programa para testar essa classe.
        */

//        new Contador();
//        new Contador();
//        new Contador();
//        new Contador();
//
//        System.out.println(Contador.retornarValorDoContador());
//
//        Contador.incrementarContador(2);
//
//        System.out.println(Contador.retornarValorDoContador());
//
//        Contador.zerarContador();
//
//        System.out.println(Contador.retornarValorDoContador());

        /*
        * 2)
        * Desenvolva uma classe Calculadora
        * com os seguintes métodos: somar, subtrair, multiplicar, dividir (dois números) e elevar à potência n.
        * Crie um programa para testar essa classe.
        */

        System.out.println(Calculadora.somar(1.2, 1.2));
        System.out.println(Calculadora.subtrair(10, 5));
        System.out.println(Calculadora.multiplicar(2, 2));
        System.out.println(Calculadora.dividir(25, 5));
        System.out.println(Calculadora.elevarPotencia(2, 4));

        /*
        * 3)
        * Acrescente à classe Calculadora do exercício anterior um metodo para calcular o fatorial de um número.
        */

        System.out.println(Calculadora.calcularFatorial(3));

    }
}
