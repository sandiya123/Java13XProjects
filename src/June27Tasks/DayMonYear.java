package June27Tasks;
import java.util.Scanner;

public class DayMonYear {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of days: ");
int totalDays = scanner.nextInt();

        int years = totalDays / 365;
int remainingDays = totalDays % 365;

int months = remainingDays / 30;
int days = remainingDays % 30;


System.out.println(totalDays + " days = " + years + " years, " + months + " months, and " + days + " days.");




    }
}
