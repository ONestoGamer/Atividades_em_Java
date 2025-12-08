/* Leia a idade de 10 alunos e armazene em um vetor V. A seguir, crie 04 vetores:
- adicione em um vetor P as idades pares do vetor V;
- adicione em um vetor I as idades ímpares do vetor V;
- adicione em um vetor IDMAIMEDP as idades maiores que a média dos valores do vetor P;
- adicione em um vetor IDMENMENI as idades menores que a média dos valores do vetor I; */

import java.util.Scanner;

public class IFS_Lista8_Q01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] V = new int[10];
        int[] P = new int[10];
        int[] I = new int[10];
        int countP = 0, countI = 0;

        // Lê e separa idades pares e ímpares
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade do aluno: ");
            int idade = scanner.nextInt();
            if (idade % 2 == 0) {
                P[countP++] = idade;
            } else {
                I[countI++] = idade;
            }
        }
        // Calculando a média das idades pares
        double mediaP = 0;
        for (int i = 0; i < countP; i++) {
            mediaP += P[i];
        }
        mediaP /= countP;

        // Calcular média das idades ímpares
        double mediaI = 0;
        for (int i = 0; i < countI; i++) {
            mediaI += I[i];
        }
        mediaI /= countI;

        // Adicionando as idades maiores que a média dos pares
        int[] IDMAIMEDP = new int[countP];
        int countIDMAIMEDP = 0;
        for (int i = 0; i < countP; i++) {
            if (P[i] > mediaP) {
                IDMAIMEDP[countIDMAIMEDP++] = P[i];
            }
        }
        // Adicionando as idades menores que a média dos ímpares
        int[] IDMENMENI = new int[countI];
        int countIDMENMENI = 0;
        for (int i = 0; i < countI; i++) {
            if (I[i] < mediaI) {
                IDMENMENI[countIDMENMENI++] = I[i];
            }
        }

        // Exibindo os resultados
        System.out.println("Idades Pares: ");
        for (int i = 0; i < countP; i++) {
            System.out.print(P[i] + " ");
        }
        System.out.println("\nMédia das Idades Pares: " + mediaP);

        System.out.println("Media das Idades Ímpares: " + mediaI);
        for (int i = 0; i < countI; i++) {
            System.out.print(I[i] + " ");
        }
    }
}
