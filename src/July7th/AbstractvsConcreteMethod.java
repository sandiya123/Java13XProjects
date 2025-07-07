package July7th;

public class AbstractvsConcreteMethod {
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.display(); // Calling concrete method
        obj.show();    // Calling implemented abstract method
    }
}
abstract class Parent
{

    abstract void show();

    // Concrete method (has body)
    void display()
    {
        System.out.println("Concrete method in abstract class");
    }
}

// Concrete subclass
class Child extends Parent{

    @Override
    void show() {
        System.out.println("Abstract method implemented");
    }
}