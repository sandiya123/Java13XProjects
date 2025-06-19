import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        System.out.println("Enter the year:");
        if ((year%4==0 && year%400==0) || (year%100!=0))
        {
            System.out.println("This is Leap year");
        }
        else {
            System.out.println("This is not leap year");

        }

    }
}
