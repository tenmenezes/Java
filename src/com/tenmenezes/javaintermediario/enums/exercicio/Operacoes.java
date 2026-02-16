package com.tenmenezes.javaintermediario.enums.exercicio;

public enum Operacoes {

    SOMA("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRACAO("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICACAO("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVISAO("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private String operador;

    Operacoes(String operador) {
        this.operador = operador;
    }

    public abstract double executarOperacao(double x, double y);

    @Override
    public String toString() {
        return operador;
    }
}
