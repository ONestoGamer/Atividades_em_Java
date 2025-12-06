import java.util.Random;

public class Exercicio1IFS0412 {
        public static void main(String[] args) {
            Random random = new Random();
            int contMenor5 = 0;
            int menor = 21;
            int maior = -1;
            int percentMenor5 = 0;
            int numero = -1;
            int total = 0;

            while (numero != 10) {
                numero = random.nextInt(20+1); // Gera número aleatório entre 0 e 20
                if (numero < 5){
                    contMenor5++;
                }
                if (numero > 0){
                    total++;
                }
                if (numero > maior){
                    maior = numero;
                }
                if (numero < menor){
                    menor = numero;
                }
                System.out.printf("%d ", numero);
            }
            System.out.println();

            percentMenor5 = (int) (((float) contMenor5 / total) * 100);

            int soma = menor + maior;

            System.out.println("Maior número gerado: " + maior);
            System.out.println("Menor número gerado: " + menor);
            System.out.println("Total de números gerados: " + total);
            System.out.println("Percentual de números menores que 5: " + percentMenor5 + "%");
        }
    }
