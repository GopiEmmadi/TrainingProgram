package Day3;

abstract class Animal {
    abstract void makeSound();
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meuw Meuw");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("bouw bouw");
    }
}

public class ImplementInterface{
    public static void main(String[] args) {

        Cat garfield=new Cat();
        Dog snoopy=new Dog();
        garfield.makeSound();snoopy.makeSound();
    }
}