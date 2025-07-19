package Ex002;
//Listar conjuntos de caracteres disponíveis

import java.nio.charset.Charset;

public class Ex025 {
    public static void main(String[] args) {
        System.out.println("List of avaliable character sets: ");


        //iterate through the avaliable character sets and print their names
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
}
