package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;
// Compound Interest Java Program
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double principal=sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        double roi=sc.nextDouble();
        System.out.println("Enter the time in years: ");
        double time=sc.nextDouble();
//        P(1 + r/100)t - P .
            double compInterest=(principal*(Math.pow((1+(roi/100)),time)))-principal;
        System.out.println("Compound Interest "+compInterest);
    }
}
