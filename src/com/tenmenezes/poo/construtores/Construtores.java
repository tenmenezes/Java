package com.tenmenezes.poo.construtores;

public class Construtores {

    // Contructor padrão (Sem argumentos)
    public class Carro {
        String modelo;

        public Carro() {
            System.out.println("Novo carro fabricado!");
            this.modelo = "Básico"; // Valor inicial padrão
        }

    }

    //  Uso:
    Carro c1 = new Carro();

    //  Construtor com parâmetros (mais comum)
    public class Aluno {
        String nome;
        int matricula;

        public Aluno(String nome, int matricula) {
            this.nome = nome;
            this.matricula = matricula;
        }

    }

    //  Uso:
//  Aluno a1 = new Aluno(); -> Daria erro, agora é obrigatório passar os dados
    Aluno a1 = new Aluno("Menezes", 12345);

    //  Sobrecarga de Construtores (Tendo várias formas)
    public class Produto {
        private String nome;
        private double preco;
        private double desconto;

        Produto() {
        }

        //      Getter - Deixa visivel para outras classes os valores desses atributos
        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public double getDesconto() {
            return desconto;
        }

        //      Setter - Possivel alterar e implementar valores a esses atributos
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public void setDesconto(double desconto) {
            this.desconto = desconto;
        }

        // Opção 1: Nome e Preço - metodo de sobrecarga de construtor
        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        // Opção 2: Nome, Preço e um Desconto especial - metodo de sobrecarga de construtor
        public Produto(String nome, double preco, double desconto) {
            this.nome = nome;
            this.preco = preco;
            this.desconto = desconto;
        }
    }

    //  O uso do this() para encadeamento
    public class Smartphone {
        String marca;
        int ram;

        public Smartphone(String marca) {
            this(marca, 4); // Chama o construtor abaixo passando 4 como padrão
        }

        public Smartphone(String marca, int ram) {
            this.marca = marca;
            this.ram = ram;
        }
    }

}
