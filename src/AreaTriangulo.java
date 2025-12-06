import java.util.Scanner;

public class AreaTriangulo {
    
    public static void main(String[] args) {
        System.out.println("Informe a altura do triângulo:");
        Scanner scanner = new Scanner(System.in);
        float altura = scanner.nextFloat();
        System.out.println("Informe a base do triângulo:");
        float base = scanner.nextFloat();
        float area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
    }
}
