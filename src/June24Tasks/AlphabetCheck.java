package June24Tasks;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet any:");
        char ch=sc.next().charAt(0);
        if ((ch>= 'A' && ch<='Z') || (ch>= 'a' && ch<='z'))
        {

            System.out.println(ch + " is an alphabet.");

        }else {
            System.out.println(ch + " not an alphabet.");
        }

    }
}
