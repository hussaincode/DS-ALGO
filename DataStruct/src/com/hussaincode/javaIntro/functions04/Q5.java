package com.hussaincode.javaIntro.functions04;

import java.util.Scanner;

//Define a method that returns the product of two numbers entered by user.
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        prod(num1,num2);
    }
    static void prod(int num1, int num2) {
        System.out.println(num1*num2);
    }
}
