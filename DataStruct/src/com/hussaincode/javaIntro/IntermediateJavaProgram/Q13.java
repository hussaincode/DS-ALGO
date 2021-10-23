package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;
// Addition Of Two Numbers
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2= sc.nextInt();
        int add= num1+num2;
        System.out.println("Addition of two number : "+add);

    }
}
