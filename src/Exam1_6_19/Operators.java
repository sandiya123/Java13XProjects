package Exam1_6_19;
// Create a program to demonstrate all types of operators.
import java.util.Scanner;

public class Operators {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
              Scanner scanner = new Scanner(System.in);

System.out.println("Choose operator type to demonstrate:");
System.out.println("1. Arithmetic");
System.out.println("2. Relational");
System.out.println("3. Logical");
System.out.println("4. Bitwise");
System.out.println("5. Assignment");
System.out.println("6. Unary");
System.out.println("7. Ternary");

System.out.print("Enter your choice (1-7): ");
int choice = scanner.nextInt();

int a = 10, b = 5;
boolean x = true, y = false;

switch (choice) {
case 1:
System.out.println("Arithmetic Operators:");
System.out.println("a + b = " + (a + b));
System.out.println("a - b = " + (a - b));
System.out.println("a * b = " + (a * b));
System.out.println("a / b = " + (a / b));
System.out.println("a % b = " + (a % b));
break;

case 2:
System.out.println("Relational Operators:");
System.out.println("a == b: " + (a == b));
System.out.println("a != b: " + (a != b));
System.out.println("a > b: " + (a > b));
System.out.println("a < b: " + (a < b));
System.out.println("a >= b: " + (a >= b));
System.out.println("a <= b: " + (a <= b));
break;

case 3:
System.out.println("Logical Operators:");
System.out.println("x && y: " + (x && y));
System.out.println("x || y: " + (x || y));
System.out.println("!x: " + (!x));
break;

case 4:
System.out.println("Bitwise Operators:");
System.out.println("a & b: " + (a & b));
System.out.println("a | b: " + (a | b));
System.out.println("a ^ b: " + (a ^ b));
System.out.println("~a: " + (~a));
System.out.println("a << 1: " + (a << 1));
System.out.println("a >> 1: " + (a >> 1));
break;

case 5:
System.out.println("Assignment Operators:");
int c = a;
c += b;
System.out.println("c += b: " + c);
c -= b;
System.out.println("c -= b: " + c);
c *= b;
System.out.println("c *= b: " + c);
c /= b;
System.out.println("c /= b: " + c);
c %= b;
System.out.println("c %= b: " + c);
break;

case 6:
System.out.println("Unary Operators:");
System.out.println("+a: " + (+a));
System.out.println("-b: " + (-b));
System.out.println("++a: " + (++a));
System.out.println("--b: " + (--b));
break;

case 7:
System.out.println("Ternary Operator:");
int max = (a > b) ? a : b;
System.out.println("Max of a and b: " + max);
break;


}


            }
}
