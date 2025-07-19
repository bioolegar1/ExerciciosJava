package Ex002;

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva uma frase com letras numeros e espaços para contarmos o caracteres!");
        String frase = in.nextLine();
        
        count(frase);
    }
    
    
    
    public static void count(String frase) {
        char[] ch = frase.toCharArray();
        
        
        int letras = 0;
        int espacos = 0;
        int numero = 0;
        int outros = 0;
        
        
        for(int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letras++;
            }
            else if (Character.isDigit(ch[0])) {
                numero++;
            }
            else if (Character.isSpaceChar(ch[i])) {
                espacos++;
            }
            else {
                outros++;
            }

        }
        System.out.println("A frase: \n" + frase);

        System.out.println("letras: " + letras);
        System.out.println("numero: " + numero);
        System.out.println("espacos : " + espacos);
        System.out.println("outros : " + outros);

    }

}
