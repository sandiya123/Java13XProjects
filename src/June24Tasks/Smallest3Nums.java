package June24Tasks;

import java.util.Scanner;

public class Smallest3Nums {
    public static  void main(String[] args)


    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input a:");
        int a=sc.nextInt();
        System.out.println("Enter Input b:");
        int b=sc.nextInt();
        System.out.println("Enter Input c:");
        int c=sc.nextInt();
        if(a<b && a<c)
        {
            System.out.println("a is smallest"+a);
        }
        else if (b<a && b<c)
        {
            System.out.println("b is smallest"+b);
        }
        else
        {
            System.out.println("c is smallest"+c);
        }


    }
}
