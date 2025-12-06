/* Em uma competição de ginástica, cada atleta recebe votos de sete jurados.
A melhor e a pior nota são eliminadas. A sua nota fica sendo a média dos votos restantes.
Elabore um programa que leia as notas dos sete jurados (vetor vNotas) alcançadas pelo
atleta em sua apresentação e
depois adicione em um vetor (vNotasValidas) somente as notas válidas para o cálculo da
média, conforme regras acima.
vNotas : 9.0 7.5 9.5 8.5 9.0 9.7 9.5
nNotasValidas : 9.0 9.5 8.5 9.0 9.5
Média : 9.1 */

import java.text.DecimalFormat;

public class Exercicio4IFS0412 {
    public static void main(String[] args) {
        double[] vNotas = {7.3, 7.5, 8.5, 7.8, 9.0, 9.7, 9.5};
        double[] vNotasValidas = new double[5];

        double maiorNota = -1;
        double menorNota = 11;

        // Encontrando a maior e a menor nota
        for (double nota : vNotas) {
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }
        // Adicionando notas válidas ao vetor vNotasValidas
        int i = 0;
        for (double nota : vNotas) {
            if (nota != maiorNota && nota != menorNota) {
                vNotasValidas[i] = nota;
                i++;
            }
        }

        // Calculando a média das notas válidas
        double soma = 0;
        for (double nota : vNotasValidas) {
            soma += nota;
        }
        double media = soma / vNotasValidas.length;
        DecimalFormat df = new DecimalFormat("0.0");

        // Exibindo os resultados
        System.out.print("vNotas : ");
        for (double nota : vNotas) {
            System.out.print(nota + " ");
        }
        System.out.println();

        System.out.print("nNotasValidas : ");
        for (double nota : vNotasValidas) {
            System.out.print(nota + " ");
        }
        System.out.println();

        System.out.print("Média : " + df.format(media));
    }
}
