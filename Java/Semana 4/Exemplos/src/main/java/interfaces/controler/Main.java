package interfaces.controler;

import interfaces.model.Animal;
import interfaces.model.Cachorro;
import interfaces.model.InterfaceFuncional;

public class Main {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro();

        cachorro.fazerSom();

        cachorro.comer();

        cachorro.dormir();

        // Avançado
        InterfaceFuncional func = () -> System.out.println("Executando...");
        func.execute(); // Output: Executing...
    }
}
