package com.tenmenezes.poo.interfacesexceptions.exercicios.interfaces1;

public class Interfaces {
    static void main(String[] args) {

        Quadrado fig_1 = new Quadrado();
        fig_1.setLado(2);

        Circulo fig_2 = new Circulo();
        fig_2.setRaio(2);

        Triangulo fig_3 = new Triangulo();
        fig_3.setBase(3);
        fig_3.setAltura(2);

        Cubo fig_4 = new Cubo();
        fig_4.setLado(3);

        Cilindro fig_5= new Cilindro();
        fig_5.setAltura(3);
        fig_5.setRaio(2);

        Piramide fig_6 = new Piramide();
        fig_6.setAltura(3);
        fig_6.setApotema(4);
        fig_6.setArestaBase(2);
        fig_6.setNumPoliBase(4);
        fig_6.setBase(fig_1);

        fig_1.setNome("Quadrado");
        fig_2.setNome("Circulo");
        fig_3.setNome("Triangulo");
        fig_4.setNome("Cubo");
        fig_5.setNome("Cilindro");
        fig_6.setNome("Piramide");

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];

        figuras[0] = fig_1;
        figuras[1] = fig_2;
        figuras[2] = fig_3;
        figuras[3] = fig_4;
        figuras[4] = fig_5;
        figuras[5] = fig_6;

        for(FiguraGeometrica f : figuras) {

            System.out.println("---------");
            System.out.println(f.getNome());

            if(f instanceof Figura2D) {
                Figura2D f2d = (Figura2D) f;
                System.out.printf("%.2f%n", f2d.calcularArea());
            }

            if(f instanceof Figura3D) {
                Figura3D f3d = (Figura3D) f;
                System.out.printf("%.2f%n", f3d.calcularArea());
                System.out.printf("%.2f%n", f3d.calcularVolume());
            }

            System.out.println();

        }

    }
}
