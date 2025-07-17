package Ex002;
//FAZENDO TROCA ENTRE 2 VARIAVEIS

public class Ex014 {
    public static void main(String[] args) {

        int a, b, temp;

        a = 15;
        b = 27;

        System.out.println("Antes da troca a, b = " + a + "," +b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Depois da troca a, b = " + a + "," +b);


    }

}
