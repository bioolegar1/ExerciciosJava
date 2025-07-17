package UseACabeca;

import java.util.Random;
import java.util.random.RandomGenerator;

public class PhraseOMatic {
    public static void main(String[] args) {

        String [] wordListOne = {"Streaming","Nitro V5","morte", "Sistema", "Java", "Karaokê", "Agnostico", "Pompt Engineer","Empreendedorismo","Churrrasco", "Fiasco"};
        String [] wordListTwo = {"Linguagem","Framework","HTML", "Hoje", "Água", "Colagem", "IA Dominando", "Espectador","Frontend","Backend", "Organização"};
        String [] wordListThree = {"Javascript","CSS","Sanduicheira", "Insider", "Pulso", "Irmandade", "Sexologa", "Pscicologa","Armazenando","Exercicios", "Frango"};

        //descubra quantas palavras estão em cada lista
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        //gere três numeros aleatorios
        Random randomGenerator = new Random();

        int rand1 = randomGenerator.nextInt(oneLenght);
        int rand2 = randomGenerator.nextInt(twoLenght);
        int rand3 = randomGenerator.nextInt(threeLenght);

        //Crie uma frase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Precisamos de " + phrase);
    }
}
