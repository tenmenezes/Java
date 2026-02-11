package com.tenmenezes.poo.interfacesexceptions;
// ========================== INTERFACES ==========================

// Interface base
interface SerVivo {
    void respirar();
}

// Interface herdando de outra interface
interface Animal extends SerVivo {
    void emitirSom();
}

// Outra interface para múltipla implementação
interface Treinavel {
    void treinar();
}

// ========================== EXCEÇÃO PERSONALIZADA ==========================

// Exceção CHECKED (obriga uso de throws ou try/catch)
class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem); // envia mensagem para classe Exception
    }
}

// ========================== CLASSE BASE ==========================

abstract class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) throws IdadeInvalidaException {
        this.nome = nome;
        setIdade(idade); // pode lançar exceção
    }

    // Metodo que pode lançar exceção
    public void setIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    // Sobrescrita de toString (herdado de Object)
    @Override
    public String toString() {
        return STR."Pessoa{nome='\{nome}', idade=\{idade}}";
    }

    // Sobrescrita de equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        com.tenmenezes.poo.heranca.Pessoa outra = (com.tenmenezes.poo.heranca.Pessoa) obj;
        return this.nome.equals(outra.nome) && this.idade == outra.idade;
    }

    // Sobrescrita de hashCode (regra: se sobrescrever equals, sobrescreva hashCode)
    @Override
    public int hashCode() {
        return java.util.Objects.hash(nome, idade);
    }
}

// ========================== CLASSE CONCRETA ==========================

class Cachorro extends com.tenmenezes.poo.heranca.Pessoa implements Animal, Treinavel {

    public Cachorro(String nome, int idade) throws IdadeInvalidaException {
        super(nome, idade); // uso de super
    }

    @Override
    public void trabalhar() {

    }

    @Override
    public void respirar() {
        System.out.println(STR."\{nome} está respirando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }

    @Override
    public void treinar() {
        System.out.println(STR."\{nome} está treinando");
    }
}

// ========================== MAIN ==========================

public class Interfaces_exceptions {

    public static void main(String[] args) {

        try {
            // ========================== POLIMORFISMO ==========================
            Animal animal = new Cachorro("Rex", 5); // Upcasting automático

            animal.emitirSom();
            animal.respirar();

            // ========================== CASTING ==========================

            if (animal instanceof Cachorro) {
                // Downcasting seguro
                Cachorro c = (Cachorro) animal;
                c.treinar();
            }

            // ========================== EXEMPLO DE UNCHECKED ==========================
            try {
                int resultado = 10 / 0; // ArithmeticException (Runtime)
            } catch (ArithmeticException e) {
                System.out.println("Erro de divisão por zero capturado");
            }

            // ========================== STACKTRACE ==========================
            try {
                String texto = null;
                texto.length(); // NullPointerException
            } catch (Exception e) {
                System.out.println("Stacktrace:");
                e.printStackTrace(); // mostra pilha de execução
            }

        } catch (IdadeInvalidaException e) {
            // Captura da exceção personalizada (Checked)
            System.out.println(STR."Erro ao criar pessoa: \{e.getMessage()}");
        } finally {
            // Sempre executa
            System.out.println("Finalizando programa...");
        }

        // ========================== getClass ==========================
        try {
            com.tenmenezes.poo.heranca.Pessoa p = new Cachorro("Bolt", 3);
            System.out.println(STR."Classe real: \{p.getClass().getName()}");
        } catch (IdadeInvalidaException e) {
            e.printStackTrace();
        }
    }
}

