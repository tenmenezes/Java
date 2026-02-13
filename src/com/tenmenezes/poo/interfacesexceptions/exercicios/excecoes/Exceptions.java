package com.tenmenezes.poo.interfacesexceptions.exercicios.excecoes;

import java.util.Scanner;

public class Exceptions {

    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, telefone;
        Contato c = null;
        Agenda agenda = new Agenda();

        int opc = 0;

        try {
            do {
                System.out.println("1 - Consultar contatos na agenda");

                System.out.println("2 - Adicionar novo contato");

                System.out.println("0 - Sair do sistema");

                System.out.print("Escolha uma opção: ");
                opc = scan.nextInt();

                if (opc == 1 && c == null) {
                    throw new ContatoNaoExisteException();
                }

                if (opc == 2) {

                    System.out.print("Digite o nome: ");
                    nome = scan.nextLine();

                    System.out.print("Digite o número: ");
                    telefone = scan.nextLine();

                    assert c != null;
                    c.setNome(nome);
                    c.setTelefone(telefone);
                    agenda.adicionarContato(c);

                    continue;
                }

                if (opc == 1) {

                    System.out.print("Digite o nome do contato que deseja consultar: ");
                    nome = scan.nextLine();
                    agenda.consultarContatosPorNome(nome);
                    continue;
                }

                if(opc == 0) {
                    System.out.println("\nSaindo do sistema...");
                }

            } while (opc != 0);

        } catch (NullPointerException e) {
            e.getMessage();
        }

    }

}
