package com.tenmenezes.poo;

public class JogoDaVelha {

    String[][] tabuleiro = new String[3][3];
    String vezDoJogador;

    void inicializarJogo(String caracterDoJogdor) {

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = "-";
            }
        }
        vezDoJogador = caracterDoJogdor;
    }

    void exibirTabuleiro() {
        System.out.print("   ");
        for (int h = 0; h < tabuleiro.length; h++) {
            System.out.print("[" + h + "]");
        }
        System.out.println();
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print("[" + i + "]" + " ");
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + "  ");
            }
            System.out.println();
        }
    }

    boolean realizarJogada(int linha, int coluna) {
        if ((linha >= 0 && linha <= 2) && (coluna >= 0 && coluna <= 2)) {
            if (tabuleiro[linha][coluna].equals("-")) {
                tabuleiro[linha][coluna] = vezDoJogador;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    boolean verificarVencedor() {
        for (int i = 0; i < tabuleiro.length; i++) {
//             verificação de vencedor por linha
            if (!tabuleiro[i][0].equals("-") &&
                    tabuleiro[i][0].equals(tabuleiro[i][1]) &&
                    tabuleiro[i][1].equals(tabuleiro[i][2])) {
                return true;
            }
//           verificação de vencedor por coluna
            if (!tabuleiro[0][i].equals("-") &&
                    tabuleiro[0][i].equals(tabuleiro[1][i]) &&
                    tabuleiro[1][i].equals(tabuleiro[2][i])) {
                return true;
            }

        }
//      verificação de vencedor por diagonal (principal)
        if (!tabuleiro[0][0].equals("-") &&
                tabuleiro[0][0].equals(tabuleiro[1][1]) &&
                tabuleiro[1][1].equals(tabuleiro[2][2])) {
            return true;
        }
//     verificação de vencedor por diagonal (secundária)
        if (!tabuleiro[0][2].equals("-") &&
                tabuleiro[0][2].equals(tabuleiro[1][1]) &&
                tabuleiro[1][1].equals(tabuleiro[2][0])) {
            return true;
        }
        return false;
    }

    boolean verificarEmpate() {
        if (verificarVencedor()) {
            return false;
        }
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }
}