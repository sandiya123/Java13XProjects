package June23Tasks;

import java.util.Scanner;

public class Votecal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age=sc.nextInt();
        if(age>=18 && age<=60)
        {
            System.out.print("Can Vote");
        }
        else
        {
            System.out.print("Cannot vote");
        }

    }
}
