package June23Tasks;
import java.util.Scanner;

public class PosAndNeg {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int inp=sc.nextInt();
        if (inp>0)
        {
            System.out.print("Number is positive");
        }else if (inp<0)
        {
            System.out.print("Number is negative");
        }else
        {
            System.out.print("Its not a number");
        }


    }
}
