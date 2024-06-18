import java.util.Scanner;

public class ExceçõesArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o índice do elemento a ser acessado:");
        int indice = scanner.nextInt();

        try {
            int elemento = array[indice];
            System.out.println("Elemento no índice " + indice + ": " + elemento);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora do intervalo do array.");
        }
    }
}
