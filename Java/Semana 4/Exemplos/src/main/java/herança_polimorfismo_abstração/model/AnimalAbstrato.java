package herança_polimorfismo_abstração.model;

public abstract  class AnimalAbstrato {
    protected String nome;

    public AnimalAbstrato(String nome) {
        this.nome = nome;
    }

    // Método abstrato
    public abstract void fazerSom();

    // Método concreto
    public void comer() {
        System.out.println(nome + " está comendo.");
    }
}
