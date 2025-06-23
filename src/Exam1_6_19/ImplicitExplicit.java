package Exam1_6_19;
/*Write a program to demonstrate type casting  (both implicit and explicit).*/

public class ImplicitExplicit {
    public static void main(String[] args)
    {

        byte b = 10;

        int a = b; // Valid Implicit Casting Widening

        byte c = 10;

        int a1 = (int)b; // Valid -> Explicit Casting

        System.out.println("Implicit casting"+a);
        System.out.println("Implicit casting"+a1);



    }
}
