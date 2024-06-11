public class Incrementadores {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Valor inicial de i: " + i); // i é 5

        System.out.println("Usando pré-incremento (++i): " + ++i); // i é incrementado para 6 antes de ser impresso
        System.out.println("Valor de i após pré-incremento: " + i); // i é 6

        System.out.println("Usando pós-incremento (i++): " + i++); // i é 6 ao ser impresso, então é incrementado para 7
        System.out.println("Valor de i após pós-incremento: " + i); // i é 7
    }
}
