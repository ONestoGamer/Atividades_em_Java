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

public class IFS_0412_Exercicio4 {
    public static void main(String[] args) {
        double[] vNotas = {9.0, 7.5, 9.5, 8.5, 9.0, 9.7, 9.5};
        double[] vNotasValidas = new double[5];

        double maiorNota = -1;
        double menorNota = 11;

        // Encontrando a maior e a menor nota
        for (int j = 0; j < vNotas.length; j++) {
            double nota = vNotas[j];
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }
        // Adicionando notas válidas ao vetor vNotasValidas
        int i = 0;
        for (int j = 0; j < vNotas.length; j++) {
            double nota = vNotas[j];
            if (nota != maiorNota && nota != menorNota) {
                if (i < vNotasValidas.length) {
                    vNotasValidas[i] = nota;
                    i++;
                }
            }
        }
        // Calculando a média das notas
        double soma = 0;
        for (int j = 0; j < vNotasValidas.length; j++) {
            soma += vNotasValidas[j];
        }
        double media = soma / vNotasValidas.length;
        DecimalFormat df = new DecimalFormat("0.0");

        // Exibindo os resultados
        System.out.print("vNotas : ");
        for (int j = 0; j < vNotas.length; j++) {
            System.out.print(vNotas[j] + " ");
        }
        System.out.println();

        System.out.print("nNotasValidas: ");
        for (int j = 0; j < vNotasValidas.length; j++) {
            System.out.print(vNotasValidas[j] + " ");
        }
        System.out.println();

        System.out.print("Média: " + df.format(media));
    }
}