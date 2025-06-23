package June23Tasks;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int inp=sc.nextInt();
        if (inp%2==0)
        {
            System.out.print("It is an even number");
        }
        else
        {
            System.out.print("It is an odd number");
        }
    }
}
