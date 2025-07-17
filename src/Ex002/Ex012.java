package Ex002;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double num1 = in.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double num2 = in.nextDouble();
        System.out.println("Digite o Terceiro numero: ");
        double num3 = in.nextDouble();

        double media =  (num1 + num2 + num3) / 3;
        System.out.println("Media: " + media);

    }
}
