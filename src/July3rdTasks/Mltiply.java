package July3rdTasks;

public class Mltiply {
    public static void main(String[] args) {
        MathOperations m1=new MathOperations();
        System.out.println(m1.multiply(2,3));
        System.out.println(m1.multiply(3,4,5));


    }
}

class MathOperations {

   int multiply(int a,int b)
    {
        int c=a*b;
        System.out.println("2 nos");
        return c;
    }

    int multiply(int a,int b,int c)
    {
        int d=a*b*c;
        System.out.println("3 nos");
        return d;
    }


}
