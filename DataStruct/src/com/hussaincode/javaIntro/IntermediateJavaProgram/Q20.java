package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;
//HCF Of Two Numbers Program
public class Q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt(), b = sc.nextInt(), gcd = 1;
        for(int i = 1; i <= a && i <= b; ++i)
        {
            //divides both the numbers by i, if the remainder is 0 the number is completely divisible by i
            // Checks that i is present in both or not
            //returns true if both conditions are true
            if(a % i == 0 && b % i == 0)
                //assigns i into gcd
                gcd = i;
        }
        System.out.printf("The HCF of %d and %d is %d.", a, b, gcd);
    }
}
