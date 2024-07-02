package interfaces.model;

public class Cachorro implements Animal {


    @Override
    public void fazerSom() {
        System.out.println("Au Au!");
    }

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo.");
    }

}
