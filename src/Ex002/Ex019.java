package Ex002;

import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        long n = in.nextLong();

        System.out.println("A Soma dos digitos é: " + sumDigits(n));
    }

    public static int sumDigits(long n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
