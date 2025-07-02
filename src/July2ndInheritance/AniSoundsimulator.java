package July2ndInheritance;

public class AniSoundsimulator {

    public static void main(String[] args) {

Cat c1=new Cat();
c1.meow();
c1.makesound();



    }
}

class Animal{
   void makesound()
    {
        System.out.println("Animal Parent class makesound");
    }
}

class Cat extends Animal{
    void meow()
    {
        System.out.println("Cat meow");
    }


}
