/* Uma empresa de pesquisas precisa tabular os resultados da seguinte
enquete feita a um grande quantidade de organizações: "Qual o melhor
Sistema Operacional para uso em servidores?"
As possíveis respostas são:
1. Windows Server
2. Unix
3. Linux
4. Netware
5. Mac OS
6. Outro
Você foi contratado para desenvolver um programa que leia o resultado da
enquete e informe ao final o resultado. O programa deverá gerar os valores
até ser obtido o valor 0, que encerra a entrada dos dados. No mínimo 50
resultados precisam ser gerados. Não deverão ser aceitos valores além dos
válidos para o programa (0 a 6). Os valores referentes a cada uma das
opções devem ser armazenados num vetor. Após os dados terem sido
        completamente informados, o programa deverá calcular o percentual de cada
um dos concorrentes e informar o vencedor da enquete.
Dica: No Java, você pode definir um vetor com valores iniciais com a seguinte
sintaxe:
String[] sistemasOperacionais = { "Windows Server", "Unix", "Linux",
"Netware", "Mac OS", "Outro"};  */

import java.util.Random;

public class IFS_1112_Exercicio1 {
    public static void main(String[] args) {
        String[] sistemasOperacionais = { "Windows Server", "Unix", "Linux",
                "Netware", "Mac OS", "Outro"};
        int[] votos = new int[6];
        int totalVotos = 0;
        Random random = new Random();

        while (true) {
            int resposta = random.nextInt(7);
            if (resposta == 0 && totalVotos >= 50) {
                break;
            }
            if (resposta >= 1 && resposta <= 6) {
                votos[resposta - 1]++;
                totalVotos++;
            }
        }
        System.out.println("Sistema Operacional\t\tVotos\t\t%");
        System.out.println("-------------------    --------   ----------");

        int maiorVotos = 0;

        for (int i = 0; i < votos.length; i++) {
            double percentual = (votos[i] * 100.0) / totalVotos;

            if (votos[i] > votos[maiorVotos]) {
                maiorVotos = i;
            }
            System.out.printf("%-18s\t\t%5d\t\t%3.2f%%\n",
                    sistemasOperacionais[i], votos[i], percentual);
        }
        System.out.println("----------------------   --------");
        System.out.printf("Total                \t %4d%n%n", totalVotos);

        double percVencedor = (votos[maiorVotos] * 100.0) / totalVotos;
        System.out.printf(
                "O Sistema Operacional mais votado foi o %s, com %d votos, correspondendo a %.0f%% dos votos.%n",
                sistemasOperacionais[maiorVotos], votos[maiorVotos],percVencedor);
    }
}
