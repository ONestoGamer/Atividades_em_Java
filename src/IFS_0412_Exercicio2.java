/* Crie um programa para gerar 5 números (até 20) e adicione em um vetor V.
A seguir, crie um vetor M que contém os elementos do vetor V multiplicados pelo
menor número do vetor V.
Exemplo:
V: 15 04 19 09 11
Menor Número: 04
M: 60 16 76 36 44 */

import java.util.Random;

public class IFS_0412_Exercicio2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] V = new int[5];
        int[] M = new int[5];
        int menor = 21;
        // Gerando 5 números aleatórios e encontrar o menor
        for (int i = 0; i < V.length; i++) {
            int numero = random.nextInt(20 + 1);
            V[i] = numero; // Números entre 0 e 20
            if (V[i] < menor) {
                menor = V[i];
            }
        }
        // Preenchendo o vetor M com os elementos de V multiplicados pelo menor número
        for (int i = 0; i < V.length; i++) {
            M[i] = V[i] * menor;
        }
        // Exibindo os vetores e o menor número
        System.out.print("V: ");
        for (int i = 0; i < V.length; i++) {
            System.out.print(" " + V[i]);
        }
        System.out.println("\nMenor Número: " + menor);
        System.out.print("M: ");
        for (int i = 0; i < M.length; i++) {
            int num = M[i];
            System.out.print(" " + num);
        }
    }
}
