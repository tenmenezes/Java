package com.tenmenezes.poo.exerciciosmetodorecursivo;

public class Exercicios_Metodo_Recursivo {
        /*
        * 1)
        * Crie um metodo estático e recursivo que calcule e retorne o N-esimo termo da sequência de Fibonacci.
        * Alguns números dessa sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
        */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Digite um número inteiro: ");
//        int n = scan.nextInt();
//
//        int a = 1;
//        int b = 1;
//
//        System.out.print("Sequência de Fibonacci: ");
//
//        System.out.print(a + " " + b + " ");
//
//        for(int i = 3; i <= n; i++) {
//            int proximo = a + b;
//            System.out.print(proximo + " ");
//            a = b;
//            b = proximo;
//        }

    public static int fibonacci(int num) {

        if(num < 2) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);

    }


        /*
        * 2)
        * Desenvolva um metodo estático e recursivo que receba um número inteiro positivo N
        * e calcule a soma dos números de 1 até N.
        */

    public static int somaDosNumeros(int num) {

        if (num == 1) {
            return 1;
        }

        return num + somaDosNumeros(num - 1);
    }

    static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(STR."\{fibonacci(i)} ");
        }

        System.out.println("\n");

        System.out.println(somaDosNumeros(3));
    }

}
