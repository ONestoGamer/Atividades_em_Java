import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7 para saber o dia da semana correspondente: ");
        var opcao = scanner.nextInt();
        var mensagem = switch (opcao) {
            case 1, 7 -> "Fim de semana";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 ->  "Quinta-feira";
            case 6 -> "Sexta-feira";
            default -> "Número inválido! Por favor, insira um número entre 1 e 7.";
        };

        System.out.println(mensagem);
    }

}
