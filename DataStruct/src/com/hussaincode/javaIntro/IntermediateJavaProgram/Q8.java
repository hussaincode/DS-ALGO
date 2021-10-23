package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base value of asset: ");
        double depBase=sc.nextDouble();
        System.out.print("Enter the life span of asset: ");
        double lifeSpan=sc.nextDouble();
        double DepreciationValue=(depBase)/lifeSpan;
        System.out.println(DepreciationValue);
    }
}

