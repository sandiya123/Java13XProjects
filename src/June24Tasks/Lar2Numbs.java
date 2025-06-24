package June24Tasks;

import java.util.Scanner;

public class Lar2Numbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input a:");
        int a = sc.nextInt();
        System.out.println("Enter Input b:");
        int b = sc.nextInt();
        if(a>b)
        {
            System.out.println("a is largest::"+a);
        }else
        {
            System.out.println("b is largest::"+b);
        }

    }
}