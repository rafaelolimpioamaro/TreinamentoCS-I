package herança_polimorfismo_abstração.model;

public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom() {
        System.out.println("Som de animal qualquer");
    }
}
