package com.hussaincode.javaIntro.functions04;

import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        sum(num1,num2);
    }
     static void sum(int num1, int num2) {
         System.out.println(num1+num2);
    }
}
