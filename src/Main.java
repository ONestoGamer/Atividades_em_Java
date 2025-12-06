//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public class Main {

    public static void main(String[] args) {
        var value1 = -9;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operção %s (representação binária %s)\n", value1, binary1);
        var value2 = 8;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operção %s (representação binária %s)\n", value2, binary2);
        var result = value1 >> value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s >> %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);
    }
}
