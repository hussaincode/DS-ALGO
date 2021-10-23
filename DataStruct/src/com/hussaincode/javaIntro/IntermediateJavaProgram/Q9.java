package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the run scored by batsman: ");
        double runs=sc.nextInt();
        System.out.println("Enter the number of times batsman got out: ");
        double out=sc.nextInt();
        double battingAvg=runs/out;
        System.out.println("Avg of batsman is "+battingAvg);
    }
}
