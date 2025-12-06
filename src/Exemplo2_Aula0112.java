import java.util.Scanner;

public class Exemplo2_Aula0112 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = 5;

        String vetorDisciplina[] = new String[N];
        String vetorLinguagem[] = new String[N];
        int vetorPeriodo[] = new int[N];

        int contPeriodo = 0;
        int contJava = 0;
        int contFP = 0;
        int i = 1;

        for (int x = 0; x < N; x++) {
            System.out.println("*** Aluno " + (i++) + " ***");
            System.out.println("Informe a disciplina que você prefere: (FP, MD, CI, LP, LM, POO)");
            vetorDisciplina[x] = leitor.next();
            System.out.println("Informe sua lingua de programação favorita: (J = Java, P = Python, O = Outra)");
            vetorLinguagem[x] = leitor.next();
            System.out.println("Informe qual o melhor período 1º ao 8º: ");
            vetorPeriodo[x] = leitor.nextInt();

            if (vetorPeriodo[x] <= 2) {
                contPeriodo++;
            }
            if (vetorLinguagem[x].equalsIgnoreCase("J")) {
                contJava++;
            }
            if (vetorDisciplina[x].equalsIgnoreCase("FP")) {
                contFP++;
            }
        }
        leitor.close();

        float percentFP = ((float) contFP / N) * 100;
        float percentJava = ((float) contJava / N) * 100;
        float percentPeriodo = ((float) contPeriodo / N) * 100;
        System.out.printf("-----Resultados da Pesquisa----- %n");
        System.out.printf("%-6s %-6s %-6s%n", "DISC", "PER", "LING");
        System.out.println("------------------------------");
        for (int x = 0; x < N; x++) {
            System.out.printf("%-6s %-6d %-6s%n", vetorDisciplina[x].toUpperCase(), vetorPeriodo[x], vetorLinguagem[x].toUpperCase());
        }
        System.out.println("------------------------------");
        System.out.printf("Percentual de alunos que preferem FP (Fundamentos de Programação): %.2f%%%n", percentFP);
        System.out.printf("Percentual de alunos que preferem Java: %.2f%%%n", percentJava);
        System.out.printf("Percentual de alunos que consideram os dois primeiros períodos como os melhores: %.2f%%%n", percentPeriodo);
    }
}
