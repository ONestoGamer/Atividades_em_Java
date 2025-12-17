/* Escreva um programa que, dados dois vetores ordenados de números
inteiros, produza um vetor ordenado com todos os números dos dois vetores
originais. O programa deve gerar dois vetores de 10 posições com números
inteiros aleatórios no intervalo de 0 a 100. Ambos os vetores devem ser
ordenados com a função Arrays.sort (importe assim: import java.util.Arrays).
O vetor final precisa ser construído e ordenado manualmente, sem o uso da
função Arrays.sort.
Exemplo de saída:
1 1 2 4 5 6 8 9 9 9
0 1 3 3 6 7 7 8 9 10
0 1 1 1 2 3 3 4 5 6 6 7 7 8 8 9 9 9 9 10 */

import java.util.Arrays;
import java.util.Random;

public class IFS_1112_Exercicio2 {
    public static void main(String[] args) {
        int [] vetor1 = new int[10];
        int [] vetor2 = new int[10];
        int numMax = 101;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            vetor1[i] = random.nextInt(numMax);
            vetor2[i] = random.nextInt(numMax);
        }

        Arrays.sort(vetor1);
        Arrays.sort(vetor2);

        for (int i = 0; i < 10; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();

        int [] vetorFinal = new int[20];
        int i = 0, j = 0, k = 0;

        while (i < 10 && j < 10) {
            if (vetor1[i] <= vetor2[j]) {
                vetorFinal[k++] = vetor1[i++];
            }
            else {
                vetorFinal[k++] = vetor2[j++];
            }
        }
        while (i < 10) {
            vetorFinal[k++] = vetor1[i++];
        }
        while (j < 10) {
            vetorFinal[k++] = vetor2[j++];
        }
        for (i = 0; i < 20; i++) {
            System.out.print(vetorFinal[i] + " ");
        }
    }
}
