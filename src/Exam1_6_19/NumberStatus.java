package Exam1_6_19;
//. Write a program to check if a number is positive, negative, or zero.

import java.util.Scanner;

public class NumberStatus {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number::");
        int a=sc.nextInt();
    if (a>0)
    {
        System.out.println("Number is positive");

    }
    else if (a<0)
    {
        System.out.println("Number is negative");
    }else
    {
        System.out.println("Number is zero");
    }
}}
