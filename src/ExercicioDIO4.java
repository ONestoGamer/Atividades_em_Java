import java.util.Scanner;
public class ExercicioDIO4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe o nome da pessoa mais velha: ");
        var nome1 = scanner.next();
        System.out.println("Agora informe a idade da pessoa mais velha: ");
        var idade1 = scanner.nextInt();
        System.out.print("Informe o nome da segunda pessoa: ");
        var nome2 = scanner.next();
        System.out.println("Agora informe a idade da segunda pessoa: ");
        var idade2 = scanner.nextInt();
        var diferenca = idade1 - idade2;
        System.out.printf("A diferença de idade entre %s e %s é de %d anos.\n", nome1, nome2, diferenca);

        if (idade1 >= 18 && idade2 >= 18) System.out.printf("%s e %s são maiores de idade e podem dirigir.\n", nome1, nome2);
        else if (idade1 >= 18 && idade2 < 18) System.out.printf("%s é maior de idade e pode dirigir, já %s não pode dirigir.\n", nome1, nome2);
        else if (idade1 < 18 && idade2 >= 18) System.out.printf("%s é maior de idade e pode dirigir, já %s não pode dirigir.\n", nome2, nome1);
        else System.out.printf("%s e %s são menores de idade e não podem dirigir.\n", nome1, nome2);
    }
}
