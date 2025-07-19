package Ex002;

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva uma frase para e veja a mágica");
        char[] letters = in.nextLine().toCharArray();

        System.out.println("A Frase no espelho: <<<<<----");

        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }

        System.out.println("\n");


    }
}
