package com.hussaincode.javaIntro.functions04;

import java.util.Scanner;

//Write a function to check if a given triplet is a Pythagorean triplet or not.
//(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter triplet: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        triplet(num1,num2,num3);

    }

     static void triplet(int num1, int num2, int num3) {
        if ((num1*num1)+(num2*num2)==(num3*num3) || (num1*num1)+(num3*num3)==(num2*num2) || (num3*num3)+(num2*num2)==(num1*num1)){
            System.out.println("Pythagorean triplet");
        }else
            System.out.println("Not Pythagorean triplet");
    }
}
