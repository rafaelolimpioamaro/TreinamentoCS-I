package interfaces.model;

public interface Animal {
    void fazerSom();
    void comer();

    default void dormir(){
        System.out.println("O animal está dormindo.");
    }
}
