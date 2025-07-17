package Ex002;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Vamos fazer a tabuada!");
        System.out.println("Digite qual numero vc quer a tabuada: ");

        int num = in.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(num + " x" +(i+1) + " = " + num * (i+1));

        }
    }
}
