package Ex002;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculando Area e Perimetro de um Retângulo");
        System.out.println("Digite a Largura: ");
        double largura = entrada.nextDouble();

        System.out.println("Digite a Altura: ");
        double altura = entrada.nextDouble();

        double area = largura * altura;
        double perimetro = 2 * (largura + altura);
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    }
}
