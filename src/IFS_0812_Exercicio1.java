/* Crie um vetor de 20 posições e preencha-o com números aleatórios no intervalo de 0
a 100. Informe todos os números com mais de uma ocorrência (repetição) dentro do
vetor e quantas vezes eles se repetem, sem usar vetor adicional. Caso não haja
números repetidos, informe ao usuário.
Exemplos:
99 5 42 80 86 52 28 40 69 50 30 66 64 90 88 72 22 83 99 21
O número 99 tem 2 ocorrência (s)
72 68 38 14 28 15 89 93 30 17 36 33 99 100 92 18 88 32 37 57
Não há números repetidos. */

import java.util.Random;

public class IFS_0812_Exercicio1 {
    public static void main(String[] args) {
                Random random = new Random();
                int[] v = new int[20];
                int n = v.length;

                for (int i = 0; i < n; i++) {
                    v[i] = random.nextInt(100 + 1); // 0 a 100
                    System.out.print(v[i] + " ");
                }
                System.out.println();

                boolean temRepetido = false;

                for (int i = 0; i < n; i++) {
                    int cont = 1;
                    boolean contou = false;

                    for (int k = 0; k < i; k++) {
                        if (v[k] == v[i]) {
                            contou = true;
                            break;
                        }
                    }
                    if (contou) {
                        continue;
                    }
                    for (int j = i + 1; j < n; j++) {
                        if (v[i] == v[j]) {
                            cont++;
                        }
                    }
                    if (cont > 1) {
                        temRepetido = true;
                        System.out.println("O número " + v[i] +
                                " tem " + cont + " ocorrência(s).");
                    }
                }
                if (!temRepetido) {
                    System.out.println("Não há números repetidos.");
                }
            }
        }
