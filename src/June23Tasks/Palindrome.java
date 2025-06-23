package June23Tasks;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
         String input = sc.nextLine();

         String Cleandata=input.replaceAll("[^a-zA-Z0-9]]","").toLowerCase();
        String reversed = new StringBuilder(Cleandata).reverse().toString();
        if(Cleandata.equals(reversed))
        {
            System.out.println("The input is a palindrome.");
        }else {
            System.out.println("The input is not a palindrome.");
        }

    }
}
