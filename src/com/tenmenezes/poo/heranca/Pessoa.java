package com.tenmenezes.poo.heranca;

// Classe abstrata (não pode ser instanciada)
public abstract class Pessoa {

    // protected → visível para subclasses
    public String nome;
    public int idade;

    // Construtor da superclasse
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Metodo concreto (já possui implementação)
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }

    // Metodo abstrato (obriga a subclasse a implementar)
    public abstract void trabalhar();

    // ========================== OBJECT METHODS ==========================

    // Sobrescrevendo toString() da classe Object
    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + "}";
    }

    // Sobrescrevendo equals()
    @Override
    public boolean equals(Object obj) {

        // 1️⃣ Se for o mesmo objeto na memória
        if (this == obj) return true;

        // 2️⃣ Se for nulo ou classe diferente
        if (obj == null || getClass() != obj.getClass()) return false;

        // 3️⃣ Cast seguro
        Pessoa outra = (Pessoa) obj;

        // 4️⃣ Comparação lógica
        return this.nome.equals(outra.nome) && this.idade == outra.idade;
    }

    // Regra: se sobrescrever equals, sobrescreva hashCode
    @Override
    public int hashCode() {
        return java.util.Objects.hash(nome, idade);
    }
}
