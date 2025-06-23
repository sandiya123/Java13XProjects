package Exam1_6_19;
//Create a program to show the difference between ++i and i++.
public class incrementop {
    public static void main (String[] args)
    {
      int i=10;
      int j=20;
      int po=j++;
      int pe=++j;
      int pre=++i;
      System.out.println("Value of ++i is::"+pre+"Value of j++"+po);
      int post=i++;
        System.out.println("Value of i++ is::"+post+"Value of ++j"+pe);
    }
}
