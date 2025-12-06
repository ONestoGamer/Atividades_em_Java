import java.util.Scanner;

public class ExercicioDIO6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        var altura = scanner.nextFloat();
        System.out.println("Informe o seu peso: ");
        var peso = scanner.nextFloat();
        var imc = peso / (altura * altura);
        if (imc <= 18.5) {
            System.out.printf("Seu IMC é %.2f, você está abaixo do peso.\n", imc);
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.printf("Seu IMC é %.2f, você está com o peso ideal.\n", imc);
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.printf("Seu IMC é %.2f, você está levemente acima do peso ideal.\n", imc);
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.printf("Seu IMC é %.2f, você está com obesidade grau I.\n", imc);
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.printf("Seu IMC é %.2f, você está com obesidade grau II (Severa).\n", imc);
        } else {
            System.out.printf("Seu IMC é %.2f, você está com obesidade grau III (Mórbida).\n", imc);
        }
    }
}
