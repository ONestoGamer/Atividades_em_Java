import java.util.Random;

public class Conceito {
    public static void main(String[] args) {
        int aprovado = 0, reprovado = 0, recuperacao = 0;
        float media = 0;
        int totalAlunos = 50;
        int notaMaxima = 10;
        Random random = new Random();
        int vetorNotas[] = new int[totalAlunos];

        for (int i = 0; i < totalAlunos; i++) {
            vetorNotas[i] = random.nextInt(notaMaxima) + 1;
            if (reprovado <= 3) {
                if (vetorNotas[i] >= 6) {
                    aprovado++;
                } else if (vetorNotas[i] >= 5) {
                    recuperacao++;
                } else {
                    reprovado++;
                }
            } else {
                reprovado++;
            }
            int totalNotas = 0;
            for (int j = 0; j < totalAlunos; j++) {
            }        totalNotas += vetorNotas[i];
        }

        System.out.println("Total de alunos aprovados: " + aprovado);
        System.out.println("Total de alunos em recuperação: " + recuperacao);
        System.out.println("Total de alunos reprovados: " + reprovado);
        System.out.printf("Média da turma: %.2f%n", media);
    }
}
