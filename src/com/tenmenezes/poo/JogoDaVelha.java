package com.tenmenezes.poo;

public class JogoDaVelha {

    private String[][] tabuleiro = new String[3][3];
    private String vezDoJogador;

    public JogoDaVelha() {
        tabuleiro = new String[3][3];
        vezDoJogador = null;
    }

    public JogoDaVelha(String vezDoJogador) {
        this.vezDoJogador = vezDoJogador;
    }

    public String getTabuleiro(int linha, int coluna) {
        return tabuleiro[linha][coluna];
    }

    public String getVezDoJogador() {
        return vezDoJogador;
    }

    public void setTabuleiro(int linha, int coluna, String jogada) {
        this.tabuleiro[linha][coluna] = jogada;
    }

    public void setVezDoJogador(String vezDoJogador) {
        this.vezDoJogador = vezDoJogador;
    }

    void inicializarJogo(String jogada) {

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                setTabuleiro(i, j, "-");
            }
        }
        setVezDoJogador(jogada);
    }

    void exibirTabuleiro() {
        System.out.print("   ");
        for (int h = 0; h < tabuleiro.length; h++) {
            System.out.print(STR."[\{h}]");
        }
        System.out.println();
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print(STR."[\{i}] ");
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(STR."\{getTabuleiro(i, j)}  ");
            }
            System.out.println();
        }
    }

    boolean realizarJogada(int linha, int coluna) {
        if ((linha >= 0 && linha <= 2) && (coluna >= 0 && coluna <= 2)) {
            if (tabuleiro[linha][coluna].equals("-")) {
                setTabuleiro(linha, coluna, getVezDoJogador());
                setVezDoJogador(getVezDoJogador().equals("X") ? "O" : "X");
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean verificaVencedor() {
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

    boolean respostaDoVencedor() {
        return verificaVencedor();
    }

    private boolean verificaEmpate() {
        if (respostaDoVencedor()) {
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

    boolean respostaDoEmpate() {
        return verificaEmpate();
    }
}