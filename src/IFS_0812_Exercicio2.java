/* Escrever um algoritmo que preencha um vetor de 20 posições com números inteiros
positivos de 0 a 20. Imprima o conteúdo deste vetor na tela do computador. Após,
reorganize a ordem dos valores do vetor trocando o valor do 1o elemento com o valor
do último elemento, do 2o com o penúltimo e assim por diante sem usar vetor
adicional. Após reorganizar os elementos do vetor imprima os valores na tela do
computador.
Exemplo:
13 2 2 12 10 18 13 19 17 7 5 5 16 1 7 8 19 11 17 9
9 17 11 19 8 7 1 16 5 5 7 17 19 13 18 10 12 2 2 13 */

import java.util.Random;

public class IFS_0812_Exercicio2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] v = new int[20];
        int n = v.length;

        for (int i = 0; i < n; i++) {
            v[i] = random.nextInt(20 + 1);
            System.out.print(v[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n / 2; i++) {
            int posicao = v[i];
            v[i] = v[n - 1 - i];
            v[n - 1 - i] = posicao;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
