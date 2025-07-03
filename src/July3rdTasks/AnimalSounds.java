package July3rdTasks;

public class AnimalSounds {
    public static void main(String[] args) {
        // Animal sounds
        Animal a1 = new Animal();
        a1.sound();

        //Dog sound
        Dog d1 = new Dog();
        d1.sound();

        // Cow sound
        Cow c1 = new Cow();
        c1.sound();

        //Cat sound
        Cat b1 = new Cat();
        b1.sound();


    }
}

class Animal {
    void sound() {
        System.out.println("describes sounds  ");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Moo");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}