package July4thTasks;

public class SuperConstructor {
    public static void main(String[] args) {
        child obj = new child();

    }

}
class parent
{
    parent()
    {
        System.out.println("Parent constuctor called");
    }
}

class child extends parent
{

    child()
    {
          super(); // always call parent construtcor
        //System.out.println("child constuctor called");

    }

}
