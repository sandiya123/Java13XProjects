package June23Tasks;

import java.util.Scanner;

public class MaxTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number a: ");
        int a=sc.nextInt();
        System.out.print("Enter Number b: ");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.print("a is greater");
        }
        else
        {
            System.out.print("B is greater");
        }
    }
}
