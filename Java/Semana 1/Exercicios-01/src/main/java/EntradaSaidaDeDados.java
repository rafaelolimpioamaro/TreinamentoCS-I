import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um inteiro:");
        int i = scanner.nextInt();
        System.out.println("Insira um double:");
        double d = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.println("Insira uma string:");
        String s = scanner.nextLine();

        System.out.println("Você inseriu o número inteiro: " + i);
        System.out.println("Você inseriu o número double: " + d);
        System.out.println("Você inseriu a string: " + s);
    }
}
