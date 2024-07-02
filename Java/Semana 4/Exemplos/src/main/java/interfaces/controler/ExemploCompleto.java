package interfaces.controler;

public class ExemploCompleto {
    public interface Animal {
        void makeSound();
        void eat();

        default void sleep() {
            System.out.println("Sleeping...");
        }

        static void printInfo() {
            System.out.println("This is an Animal interface.");
        }
    }

    public static class Dog implements Animal {

        @Override
        public void makeSound() {
            System.out.println("Woof");
        }

        @Override
        public void eat() {
            System.out.println("Dog is eating.");
        }
    }

    public static class Cat implements Animal {

        @Override
        public void makeSound() {
            System.out.println("Meow");
        }

        @Override
        public void eat() {
            System.out.println("Cat is eating.");
        }
    }


    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();

        myDog.eat();
        myCat.eat();

        myDog.sleep();
        myCat.sleep();

        Animal.printInfo();
    }

}
