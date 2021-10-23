package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

//Sum Of A Digits Of Number
public class Q25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int sum=0;
        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        System.out.println("Sum is "+sum);
    }
}
