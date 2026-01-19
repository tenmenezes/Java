import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine(); // lê a linha completa
        System.out.println("Olá " + nome + "!");

        System.out.println("Digite seu primeiro nome: ");
        String firstName = scan.next(); // lê apenas a primeira palavra antes do espaço
        System.out.println("Seu primeiro nome é: " + firstName);

        System.out.println("Digite sua idade: " );
        int idd = scan.nextInt();
        System.out.println("Olá " + firstName + ", que bom saber que você tem " + idd + " anos.");

        System.out.println("Digite sua altura: ");
        double h = scan.nextDouble();
        System.out.println("Sua altura é: " + h);
        */

        // também é possível ler vários elementos em uma mesma linha de código
        System.out.println("Digite seu primeiro nome, idade, altura e se tem pet: ");
        String nome = scan.next();
        int idade = scan.nextInt();
        double altura = scan.nextDouble();
        boolean pet = scan.nextBoolean();

        System.out.println("Seus dados são:");

        System.out.println("Primeiro nome: " + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Sua altura: " + altura);
        System.out.println("Tem pet? " + pet);

        scan.close(); // obrigatóriamente precisa ter o fechamento do scan

    }
}