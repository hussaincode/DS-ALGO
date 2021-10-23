package com.hussaincode.javaIntro.functions04;

import java.util.Scanner;

//Write a function that returns the sum of first n natural numbers.
public class Q14 {
     static int sum=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sumOfNaturalNum(num);
    }

     static void sumOfNaturalNum(int num) {
        for (int i=1;i<=num;i++){
            sum+=i;
        }
         System.out.println(sum);
    }
}
