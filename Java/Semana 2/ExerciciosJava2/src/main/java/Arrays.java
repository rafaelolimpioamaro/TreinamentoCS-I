public class Arrays {
    public static void main(String[] args) {

        //Exercício 1
        int[] array1 = {1, 2, 3, 4, 5};
        int soma = 0;
        for (int j : array1) {
            soma += j;
        }
        System.out.println("Soma dos elementos do array: " + soma);

        //Exercício 2
        int[] array2 = {5, 2, 9, 1, 5, 6};
        java.util.Arrays.sort(array2);

        System.out.println("Array ordenado:");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
