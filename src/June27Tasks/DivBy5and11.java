package June27Tasks;
import java.util.Scanner;
//Check if a Number is Divisible by 5 and 11

public class DivBy5and11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n");
        int n=sc.nextInt();

        if(n%5==0 && n%11==0)
        {
            System.out.println("Number divisible by 5 and 11");
        }else {
            System.out.println("Number not divisible ");
        }



    }
}
