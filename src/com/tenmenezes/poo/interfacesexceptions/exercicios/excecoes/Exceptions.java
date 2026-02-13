package com.tenmenezes.poo.interfacesexceptions.exercicios.excecoes;

import java.util.Scanner;

public class Exceptions {

    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc = 1;
        Agenda agenda = new Agenda();

        while(opc != 3) {
            opc = obterOpcaoDoMenu(scan);
            if (opc == 1) {
                consultarContato(scan, agenda);
            } else if (opc == 2) {
                adicionarContato(scan, agenda);
            }
            else {
                System.out.println("\nEncerrando...");
            }
        }
    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {
        try {
            System.out.println("Criando contato, entre com as informações:");
            String nome = lerinformacaoDaString(scan, "Nome: ");
            String telefone = lerinformacaoDaString(scan, "Telefone: ");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);

            System.out.println("\nContato criado com sucesso!");

            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e);
            System.out.println("Contatos da agenda:");
            System.out.println(agenda);
        }
    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeDoContato = lerinformacaoDaString(scan, "Entre com o nome do contato desejado: ");
        try {
            if (agenda.consultarContatosPorNome(nomeDoContato) >= 0) {
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());;
        }
    }

    public static String lerinformacaoDaString(Scanner scan, String msg) {
        System.out.print(msg);
        return scan.nextLine();
    }

    public static int obterOpcaoDoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opc = 3;


        while(!entradaValida) {
            System.out.println("\n1 - Consultar contato");
            System.out.println("2 - Adicionar novo contato");
            System.out.println("3 - Encerrar sistema");

            System.out.print("\nDigite a opção desejada: ");

            try {
                String entrada = scan.nextLine();
                opc = Integer.parseInt(entrada);

                if(opc == 1 || opc == 2 || opc == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida.");
                }

            } catch (Exception e) {
                System.out.println("\nEntrada inválida. Tente novamente\n");
            }
        }
        return opc;
    }

}
