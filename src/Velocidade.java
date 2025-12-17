import java.util.Scanner;

public class Velocidade {
    public static void main(String[] args) {
        int velocidadeKmH = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a velocidade em km/h: ");
        velocidadeKmH = input.nextInt();
        double velocidadeMS = velocidadeKmH / 3.6;
        double velocidadeMilhasH = velocidadeKmH / 1.609;
        System.out.printf("A velocidade em milhas por hora é: %.2f mph%n", velocidadeMilhasH);
        System.out.printf("A velocidade em metros por segundo é: %.2f m/s%n", velocidadeMS);
        input.close();
    }
}
