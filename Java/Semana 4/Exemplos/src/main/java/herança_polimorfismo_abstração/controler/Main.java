package herança_polimorfismo_abstração.controler;

import herança_polimorfismo_abstração.model.Animal;
import herança_polimorfismo_abstração.model.AnimalAbstrato;
import herança_polimorfismo_abstração.model.Cachorro;
import herança_polimorfismo_abstração.model.CachorroHerdaAbstrato;

public class Main {
    public static void main(String[] args) {

        // Herança
        Animal animalQualquer = new Animal("Animal Qualquer");
        animalQualquer.fazerSom();

        Cachorro cachorro = new Cachorro("Bidu");
        cachorro.fazerSom();

        // Polimorfismo
        Animal meuCachorro;
        meuCachorro = new Cachorro("Spike");
        meuCachorro.fazerSom();

        // Classes e metodos Abstratos
        AnimalAbstrato cachorro2 = new CachorroHerdaAbstrato("Rex");

        cachorro2.fazerSom();
        cachorro2.comer();
    }
}
