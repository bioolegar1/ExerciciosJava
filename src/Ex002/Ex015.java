package Ex002;

import java.util.Scanner;

//Programa para somar 2 numeros binarios - - - - PRATICAR ISSO DEPOIS
public class Ex015 {
    public static void main(String[] args) {
        long binary1, binary2;
        int i = 0, remainder = 0;
        //matriz para armazenar a soma dos numeros binarios
        int[] sum = new int[20];

        //create a scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        //Prompt the user to input the first binary number
        System.out.println("Input first binary number: ");
        binary1 = in.nextLong();
        
        //Prompt the user to input the second binary number
        System.out.println("Input second binary number: ");
        binary2 = in.nextLong();
        
        //Calculate the sum of binary digits and update the remainder
        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder)% 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder)/ 2);
            binary1 = binary1 /10;
            binary2 = binary2 /10;
        }
        
        //If there is a remaing carry, and it to the sum
        if (remainder != 0) {
            sum [i++] = remainder;
        }
        
        //Decrement the index to preapare for printing
        --i;

        System.out.println("Sum of two binary numbers: ");
        while(i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");

    }
}
