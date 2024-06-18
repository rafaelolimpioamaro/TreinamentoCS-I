import java.util.Scanner;

public class Strings {

    public static int contaCaractere(String input, char ch) {
        int cont = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                cont++;
            }
        }
        return cont;
    }

    public static String maiorPalavra(String input) {
        String[] palavras = input.split(" ");
        String maior = "";

        for (String word : palavras) {
            if (word.length() > maior.length()) {
                maior = word;
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        //Exercício 1
        System.out.println(contaCaractere("abcdc", 'c'));

        //Exercício 2
        System.out.println("Maior palavra: " + maiorPalavra("Eu adoro programar em Java"));
    }
}
