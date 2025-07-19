package Ex002;

import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of sides on the polygon: ");
        int ns = in.nextInt();

        System.out.println("input the length of the one of the sires: ");
        double side = in.nextDouble();

        System.out.println("The Area is: " + polygonArea(ns, side) +"\n");
        in.close();

    }

    public static double polygonArea(int ns, double side){
        return (ns * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / ns));
    }
}
