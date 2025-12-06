import java.util.Scanner;

public class ExercicioDIO3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe a base do retângulo: ");
        var base = scanner.nextFloat();
        System.out.println("Informe a altura do retângulo: ");
        var altura = scanner.nextFloat();
        var area = base  * altura;
        System.out.printf("A área do retângulo de largura %.2f e altura %.2f é %.2f\n", base, altura, area);
    }
}
