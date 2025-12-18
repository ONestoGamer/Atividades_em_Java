/* gerar uma matrix 5x3 e adicione:
em um vetor vetSomaL a soma dos valores de cada linha da matrix
em um vetor vetSomaC a soma dos valores de cada coluna da matrix
 */

import java.util.Random;

public class IFS_1812_Exercicio2 {
    public static void main(String[] args) {
        int nLinhas = 5;
        int nColunas = 3;
        int[][] matriz = new int[nLinhas][nColunas];
        int[] vetSomaL = new int[nLinhas];
        int[] vetSomaC = new int[nColunas];
        Random rand = new Random();

        // Preenchendo a matriz com valores e calculando as somas
        for (int i = 0; i < nLinhas; i++) {
            for (int j = 0; j < nColunas; j++) {
                matriz[i][j] = rand.nextInt(10); // Valores aleatórios entre 0 e 9
                vetSomaL[i] += matriz[i][j]; // Soma da linha
                vetSomaC[j] += matriz[i][j]; // Soma da coluna
            }
        }
        // Exibindo a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < nLinhas; i++) {
            for (int j = 0; j < nColunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Exibindo as somas das linhas
        System.out.println("\nSoma das linhas:");
        for (int i = 0; i < nLinhas; i++) {
            System.out.println("Linha " + i + ": " + vetSomaL[i]);
        }

        // Exibindo as somas das colunas
        System.out.println("\nSoma das colunas:");
        for (int j = 0; j < nColunas; j++) {
            System.out.println("Coluna " + j + ": " + vetSomaC[j]);
        }
    }
}
