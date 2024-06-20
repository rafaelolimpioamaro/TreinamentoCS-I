public class Exercicio1 {
    public static void main(String[] args) {

        String str = "A vida feliz consiste na tranquilidade da mente";

        int vogal = 0;
        int consoante = 0;

        for (char c : str.toLowerCase().toCharArray()) {
            if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                vogal++;
            } else if (c == ' ') {
                continue;
            } else{
                consoante++;
            }
        }

        System.out.println("Vogal: " + vogal);
        System.out.println("Consoante: " + consoante);
    }
}
