package July7th;

public class Animal {
    public static void main(String[] args)
    {
    Animal1 dog = new Dog();
    Animal1 cat = new Cat();

        dog.makeSound();
        cat.makeSound();

}}

abstract class Animal1 {
    abstract void makeSound();
}

class Dog extends Animal1 {

    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Abstract_Examples.Cat class extending Abstract_Examples.Animal
class Cat extends Animal1 {

    void makeSound() {
        System.out.println("Cat meows");
    }
}

