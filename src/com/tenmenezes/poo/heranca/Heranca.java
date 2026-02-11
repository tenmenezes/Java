package com.tenmenezes.poo.heranca;
// ========================== CLASSE BASE ==========================

// ========================== SUBCLASSE ==========================

class Funcionario extends Pessoa {

    protected double salario;

    // Uso de super para chamar o construtor da classe pai
    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    // Implementação obrigatória do metodo abstrato
    @Override
    public void trabalhar() {
        System.out.println(STR."\{nome} está trabalhando.");
    }

    // ========================== SOBRECARGA ==========================
    // Polimorfismo em tempo de compilação

    public double calcularBonus() {
        return salario * 0.1;
    }

    public double calcularBonus(double percentual) {
        return salario * percentual;
    }

    // Sobrescrita de metodo (polimorfismo em tempo de execução)
    @Override
    public void apresentar() {
        super.apresentar(); // chama metodo da superclasse
        System.out.println("Sou um funcionário.");
    }
}

// ========================== FINAL ==========================

// Classe final → não pode ser herdada
final class Diretor extends Funcionario {

    public Diretor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    // Metodo final → não pode ser sobrescrito
    public final void tomarDecisao() {
        System.out.println("Diretor tomando decisão estratégica.");
    }

    @Override
    public void trabalhar() {
        System.out.println(STR."\{nome} está dirigindo a empresa.");
    }
}

// ========================== MAIN ==========================

public class Heranca {

    public static void main(String[] args) {

        // ========================== POLIMORFISMO ==========================
        Pessoa p1 = new Funcionario("Carlos", 30, 3000);
        Pessoa p2 = new Diretor("Ana", 45, 10000);

        // Decisão ocorre em tempo de execução
        p1.trabalhar();
        p2.trabalhar();

        // ========================== SOBRECARGA ==========================
        Funcionario f = new Funcionario("João", 28, 4000);

        // Java decide em tempo de compilação qual método usar
        System.out.println(STR."Bônus padrão: \{f.calcularBonus()}");
        System.out.println(STR."Bônus personalizado: \{f.calcularBonus(0.2)}");

        // ========================== toString ==========================
        System.out.println(f.toString());

        // ========================== equals ==========================
        Funcionario f2 = new Funcionario("João", 28, 4000);
        System.out.println(STR."São iguais? \{f.equals(f2)}");

        // ========================== getClass ==========================
        System.out.println(STR."Classe real de p2: \{p2.getClass().getName()}");

        // ========================== protected ==========================
        // salario é protected → acessível na subclasse
        System.out.println(STR."Salário do funcionário: \{f.salario}");
    }
}

