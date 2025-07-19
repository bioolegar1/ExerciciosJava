package Ex002;

import java.util.Scanner;


//Calculo hexagonoal
public class Ex023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the length of a side of the hexagon: ");

        double s = in.nextDouble();

        System.out.println("The area of the hexagon is: " + hexagonArea(s) + "\n");
    }

    public static double hexagonArea(double s) {
        return (6 *(s * s)) / (4 * Math.tan(Math.PI/6));
    }
}
