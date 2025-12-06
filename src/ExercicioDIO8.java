import java.util.Scanner;

public class ExercicioDIO8 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        var numero = scanner.nextInt();
        while (true) {
            System.out.println("Digite outro número para verificação: ");
            var numero2 = scanner.nextInt();
            if (numero2 < numero) {
                System.out.printf("Informe um número maior que %s .\n", numero);
                continue;
            }
            var resultado = numero2 % numero;
            System.out.printf("%d %% %d é = %d \n", numero2, numero, resultado);
            if (resultado != 0) break;
        }
    }
}
