import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine(); // lê a linha completa

        System.out.println("Olá " + nome + "!");

        System.out.println("Digite seu primeiro nome: ");
        String firstName = scan.next(); // lê apenas a primeira palavra antes do espaço

        System.out.println("Seu primeiro nome é: " + firstName);

        scan.close();

    }
}