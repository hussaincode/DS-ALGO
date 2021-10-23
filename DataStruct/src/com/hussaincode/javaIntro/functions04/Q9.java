package com.hussaincode.javaIntro.functions04;

import java.util.Scanner;

//Write a program to print the factorial of a number by defining a method named 'Factorial'
public class Q9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        factorial(num);
    }

     static void factorial(int num) {
        int fact=1;
        for (int i=1;i<=num;i++){
            fact*=i;
        }
         System.out.println("Factorial of "+num+" is "+fact);
    }
}
