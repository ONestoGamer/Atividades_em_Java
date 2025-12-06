import java.util.Scanner;
public class ExercicioDIO2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do lado do quadrado: ");
        var lado = scanner.nextFloat();
        var area = lado * lado;
        System.out.printf("A área do quadrado de lado %.2f é %.2f\n", lado, area);
    }

}
