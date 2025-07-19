package Ex002;

import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1, number2;

        System.out.println("Vamos comparar os números!");
        System.out.println("Digite o primeiro número: ");
        number1 = in.nextInt();
        System.out.println("Digite o Segundo numero: ");
        number2 = in.nextInt();

        if (number1 == number2) {
            System.out.printf("%d == %d\n", number1, number2);
        }
        if (number1 != number2) {
            System.out.printf("%d != %d\n", number1, number2);
        }
        if (number1 > number2) {
            System.out.printf("%d > %d\n", number1, number2);
        }
        if (number1 < number2) {
            System.out.printf("%d < %d\n", number1, number2);
        }
        if (number1 <= number2) {
            System.out.printf("%d >= %d\n", number1, number2);
        }
        if (number1 >= number2) {
            System.out.printf("%d <= %d\n", number1, number2);
        }
    }
}
