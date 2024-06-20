import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("num1 = ");
        int num1 = sc.nextInt();
        System.out.print("num2 = ");
        int num2 = sc.nextInt();
        System.out.print("num3 = ");
        int num3 = sc.nextInt();

        int[] array = {num1, num2, num3};

        System.out.print("indice1 = ");
        int escolha1 = sc.nextInt();
        System.out.print("indice2 = ");
        int escolha2 = sc.nextInt();

        try {
            System.out.println("A divisão entre os índices solicitados é: "+ array[escolha1]/array[escolha2]);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
