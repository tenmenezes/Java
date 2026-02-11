package com.tenmenezes.poo.heranca.exerciciosherancaepolimorfismo;

public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe() {
        super.setNumPatas(0);
        super.setAmbiente("Mar");
        super.setCor("Cinzento");
        this.caracteristicas = "Barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return STR."\{super.toString()} \ncaracteristicas: '\{caracteristicas}'";
    }
}
