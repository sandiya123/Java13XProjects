package Exam1_6_19;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd number");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(+a+"::is the greatest number");
        } else if (b>a && b>c)
        {
            System.out.println(+b+"::is the greatest number");
        }else {
            System.out.println(+c+"::is the greatest number");
        }






    }
}
