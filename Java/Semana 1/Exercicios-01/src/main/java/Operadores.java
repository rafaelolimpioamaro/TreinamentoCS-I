public class Operadores {

    static int a = 10, b = 5;
    int soma = a + b; // Adição
    int sub = a - b; // Subtração
    int produto = a * b; // Multiplicação
    int quociente = a / b; // Divisão
    int remainder = a % b; // Módulo

    public static void main(String[] args) {

        boolean result;

        //Exemplo de operadores lógicos

        result = (a < b) && (a > 0);
        System.out.println("a = "+a+" b = "+b);
        System.out.println("Resultado de (a < b) && (a > 0): " + result);

        result = (a > b) || (a > 0);
        System.out.println("Resultado de (a > b) || (a > 0): " + result);

        boolean flag = true;
        result = !flag;
        System.out.println("Resultado de !flag: " + result);
    }
}
