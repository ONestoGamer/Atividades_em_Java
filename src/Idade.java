import java.time.OffsetDateTime;
import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        var anoBase = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        var nome = scanner.next();
        System.out.printf("Informe o seu ano de nascimento: ");
        var nascimento = scanner.nextInt();
        var idade = anoBase - nascimento;
        System.out.printf("Olá %s, você tem %d anos.\n", nome, idade);
    }
}