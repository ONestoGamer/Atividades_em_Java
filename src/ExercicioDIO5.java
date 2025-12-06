public class ExercicioDIO5 {
    public static void main(String[] args) {
        var leitor = new java.util.Scanner(System.in);
        System.out.println("Informe um numero pra ver sua tabuada: ");
        var numero = leitor.nextInt();
        System.out.printf("Tabuada do %d:\n", numero);
        for (int i = 1; i <= 10; i++) {
            var resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }
    }
}
