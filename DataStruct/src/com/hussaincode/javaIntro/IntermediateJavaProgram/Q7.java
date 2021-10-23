package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num=sc.nextInt();
        System.out.print("Enter the number of power: ");
        double numPow=sc.nextInt();
        double pow=Math.pow(num,numPow);
        System.out.println(pow);

    }
}
