package herança_polimorfismo_abstração.model;

public class CachorroHerdaAbstrato extends AnimalAbstrato{
    public CachorroHerdaAbstrato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Woof");
    }
}
