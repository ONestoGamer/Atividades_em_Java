/* Supondo que a população de um cidade A seja da ordem de 100.000 habitantes com uma
taxa anual de crescimento de 4% e
que a população de uma cidade B seja 120.000 habitantes com uma taxa de crescimento de
1%.
Elabore um programa que calcule e escreva o número de anos necessários para que a
população da cidade A ultrapasse
ou iguale a população da cidade B, mantidas as taxas de crescimento.
Número de anos: 8 */

public class Exercicio3IFS0412 {

    public static void main(String[] args) {

        int populacaoA = 100000;
        int populacaoB = 120000;
        double taxaCrescimentoA = 0.04; // 4%
        double taxaCrescimentoB = 0.01; // 1%
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaCrescimentoA;
            populacaoB += populacaoB * taxaCrescimentoB;
            anos++;
        }
        System.out.println("Número de anos: " + anos);
    }
}
