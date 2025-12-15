
import java.util.Random;

public class IFS_1512_Exercicio1 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 5;
        int numero;
        int matriz[][] = new int[n][n];
        int vetor[] = new int[n];
        // Preenchendo a matriz com números aleatórios
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                numero = random.nextInt(99);
                matriz[i][j] = numero;
            }
        }
        // Percorrendo a matriz
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (i == j) {
                    vetor[i] = (matriz[j][i]) * 2;
                }
            }
        }
        // Exibindo a matriz e o vetor
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        System.out.println(vetor[0] + "\t" + vetor[1] + "\t" + vetor[2] + "\t" + vetor[3] + "\t" + vetor[4]);
    }
}
