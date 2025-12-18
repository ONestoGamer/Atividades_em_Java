/* gerar uma matriz 5x5 e separe o maior valor das linhas pares e o menor valor das colunas
impares.
 */
import java.util.Random;

public class IFS_1812_Exercicio1 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matriz = new int[n][n];
        int maiorPar = 0;
        int menorImpar = 999;
        Random rand = new Random();

        // Preenchendo a matriz com valores aleatórios e encontrar maior em linhas pares
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
                if ((i % 2 == 0) && (matriz[i][j] > maiorPar)) {
                    maiorPar = matriz[i][j];
                }
                if ((j % 2 != 0) && (matriz[i][j] < menorImpar)) {
                    menorImpar = matriz[i][j];
                }
                matriz[i][j] = rand.nextInt(100); // Valores aleatórios entre 0 e 99

            }
            System.out.println();
        }


            System.out.println("Maior valor nas linhas pares: " + maiorPar);
            System.out.println("Menor valor nas colunas ímpares: " + menorImpar);

    }
}
