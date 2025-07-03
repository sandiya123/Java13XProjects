package July3rdTasks;

public class Greet {

    public static void main(String[] args) {

        Greeter g1=new Greeter();
        g1.greet();
        g1.greet("Sandhya");

    }
}
class Greeter{

    void greet(){
        System.out.println("Hello!");
    }

    String greet(String name){
        System.out.println("Hello!"+name);
        return name;
    }
}
