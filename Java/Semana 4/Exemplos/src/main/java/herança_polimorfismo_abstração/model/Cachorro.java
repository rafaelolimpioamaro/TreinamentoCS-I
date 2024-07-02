package herança_polimorfismo_abstração.model;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Au Au!");
    }
}
