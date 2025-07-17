package Ex002;

import java.util.Scanner;

public class Ex006 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = in.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = in.nextInt();


        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2) );
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) );
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2) );

    }

}
