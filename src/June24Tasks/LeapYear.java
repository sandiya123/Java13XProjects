package June24Tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input year:");
        int year = sc.nextInt();

        if((year%4==0 && year%100!=0) || (year%400 ==0))
        {
            System.out.println("Its Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
