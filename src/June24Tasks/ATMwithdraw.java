package June24Tasks;

import java.util.Scanner;

public class ATMwithdraw {
    public static void main(String[] args) {

        double bal=10000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the withdrawl Amount");
        double input=sc.nextDouble();
        if (input>0 && input%100==0 && input<=bal)
        {
            double Wbal=bal-input;
            System.out.println("Available balance after Withdrawl is"+Wbal);

        }else
        {
            System.out.println("Withdrawl Fail");
        }




    }
}
