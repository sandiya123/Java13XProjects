package June23Tasks;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().toLowerCase().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.print("It is an Vowel");
        }
        else
        {
            System.out.print("It is an Consonant");
        }
    }
}
