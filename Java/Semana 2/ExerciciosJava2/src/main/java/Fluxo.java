public class Fluxo {
    public static void main(String[] args) {
        //Exercício 1
        int limite = 100;

        for (int i = 1; i <= limite; i++) {
            if (i % 7 == 0 && i % 11 == 0) {
                System.out.println("O primeiro número divisível por 7 e 11 é: " + i);
                break;
            }
        }

        //Exercício 2
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
