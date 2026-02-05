package com.tenmenezes.poo;

class Lampada {

    /*
    * Usar String para "Ligada" ou "Desligada" funciona,
    * mas em programação o ideal é boolean para estados de dois valores (Sim/Não, Verdadeiro/Falso).
    * Isso evita erros de digitação como "Ligado" <--> "ligada".
    */

    private boolean ligada;

    public Lampada() {
        this.ligada = false; // Estado inicial da lampada
    }

    public Lampada(boolean estadoInicial) {
        this.ligada = estadoInicial;
    }

//  Convenção: em métodos booleanos GETTERS o padrão é utilizar 'is' ao invés de 'get'
    public boolean isLigada() { return ligada; }

    public void setModo(boolean ligada) { this.ligada = ligada; }

    public void ligar() {
        setModo(true);
    }

    public void desligar() {
        setModo(false);
    }

    public void estadoAtualDaLampada() {
        String status = isLigada() ? "Ligada" : "Desligada";
        System.out.println(STR."A lâmpada atualmente está: \{status}");
    }
}