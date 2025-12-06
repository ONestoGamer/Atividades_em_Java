import java.util.Random;
import java.util.Scanner;

public class Exemplo0112 {
    public static void main(String[] args) {
        Random random = new Random();
        int idade, peso, contIdoso, i;
        int N = 5;
        int vetor[] = new int[N];

        contIdoso = 0;
        i = 0;
        for (int x = 1; x <= N; x++) {
            idade = random.nextInt(120);
            System.out.println("Idade Gerada " + x + ": " + idade);
            System.out.println("Informe o Peso " + x + ": ");
            Scanner dado = new Scanner(System.in);
            peso = dado.nextInt();
            if (idade >= 65){
                contIdoso++;
            }
            if (peso % 2 == 0) {
                vetor[i] = peso;
                i++;
            }
        }
        System.out.println("Quantidade de idosos: " + contIdoso);
        System.out.println("Vetor com os números pares informados:");
        for (int x = 0; x <= i-1; x++) {
            System.out.println(vetor[x] + " ");
        }
    }
}