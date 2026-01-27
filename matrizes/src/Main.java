public class Main {

    public static void main(String[] args) {

        // Matriz armazenando 4 notas por aluno com 30 alunos
        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 7;
        notasAlunos[2][1] = 10;
        notasAlunos[2][2] = 7.5;
        notasAlunos[2][3] = 8;

        // exibindo todos os valores presentes na matriz
//        for (int i = 0; i < notasAlunos.length; i++) {
//            for (int j = 0; j < notasAlunos[i].length; j++) {
//                System.out.print(notasAlunos[i][j] + " | ");
//            }
//            System.out.println();
//        }

        //alterando valor de uma célula da matriz
        notasAlunos[1][3] = 8;

//        Calculando média dos alunos

        System.out.println("\nMédia de cada aluno:\n");

        double soma;
        for (int i = 0; i < notasAlunos.length; i++) {

            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {

                soma += notasAlunos[i][j];
            }

            System.out.println("Média do aluno " + (i + 1) + " é = " + (soma / 4));
        }

    }
}