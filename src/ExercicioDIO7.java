import java.util.Scanner;

public class ExercicioDIO7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = leitor.nextInt();
        System.out.println("Informe um segundoo número maior que o primeiro: ");
        int numero2 = leitor.nextInt();
        System.out.println("Você quer os números pares ou ímpares desse intervalo? (P/I) ");
        String escolha = leitor.next();
        for(int i = numero2; i >= numero; i--){
            if(escolha.toLowerCase().charAt(0) == 'p'){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
            else if(escolha.toLowerCase().charAt(0) == 'i'){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }

    }
}
