package June24Tasks;

import java.util.Scanner;

public class Validtraingle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side1:");
        int side1 = sc.nextInt();
        System.out.println("Enter side2:");
        int side2 = sc.nextInt();
        System.out.println("Enter side3:");
        int side3 = sc.nextInt();

        if (((side1+side2)>side3) && ((side2+side3)>side1) && ((side3+side1)>side2))
        {
            System.out.println("Valid Traingle");
        }else {
            System.out.println("Not a Valid Traingle");
        }

    }
}
