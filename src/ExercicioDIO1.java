import java.util.Scanner;
public class ExercicioDIO1 {
    public static void main(String[] args) {
        System.out.println("Informe o seu nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.println("Informe o ano do seu nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.printf("Olá %s, você tem %d anos.%n", nome, 2025 - anoNascimento);
    }
}
