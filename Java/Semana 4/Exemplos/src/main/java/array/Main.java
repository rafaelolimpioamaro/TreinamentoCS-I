package array;

import java.util.Arrays;

public class Main {

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i * 2;
        }
        return array;
    }

    public static void printArray2D(int[][] array) {
        for (int[] row : array) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void printNums(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        //Passagem de Arrays para Métodos
        int[] myArray = {1, 2, 3, 4, 5};
        printArray(myArray);
        System.out.println();

        //Retorno de Arrays de Métodos
        int[] newArray = generateArray(5);
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Arrays Multidimensionais
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printArray2D(matriz);

        //Arrays como Parâmetros Variáveis (Varargs)
        printNums(1, 2, 3, 4, 5);
        System.out.println();

        //Manipulação Avançada de Arrays
        int[] array = {5, 3, 8, 1, 2};

        // Ordenar o array
        Arrays.sort(array);

        // Imprimir o array ordenado
        System.out.println(Arrays.toString(array));

        // Buscar um elemento no array
        int index = Arrays.binarySearch(array, 3);
        System.out.println("Índice do número 3: " + index);

        // Copiar o array
        int[] copiedArray = Arrays.copyOf(array, array.length);
        System.out.println("Array copiado: " + Arrays.toString(copiedArray));
    }

}
