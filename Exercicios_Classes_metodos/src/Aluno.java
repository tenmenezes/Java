import java.util.Random;

public class Aluno {

    String nomeAluno, curso;
    String[] nomeDasDisciplinas = new String[3];

    void gerandoNotas(double[] notas) {

        Random rand = new Random();

        for (int i = 0; i < notas.length; i++) {
            notas[i] = rand.nextDouble() * 10;
        }
    }

    String resultadoDasNotas(int indice, double[] notas) {

        if (notas[indice] >= 7) {
            return "Aluno aprovado.";
        } else {
            return "Aluno reprovado.";
        }

    }

}
