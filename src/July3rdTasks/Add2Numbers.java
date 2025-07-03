package July3rdTasks;

public class Add2Numbers {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        System.out.println(c1.add(5, 17));
        System.out.println(c1.add(9.98,17.90));




    }
}
class Calculator {

    int add (int a, int b) {
        return a + b;
    }

    double add (double a, double b) {
        return a + b;
    }
}
