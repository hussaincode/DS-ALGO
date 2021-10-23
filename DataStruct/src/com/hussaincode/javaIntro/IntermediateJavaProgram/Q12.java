package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;
// Calculate Average Marks
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of physics: ");
        int phy=sc.nextInt();
        System.out.println("Enter the marks of chemistry: ");
        int chem = sc.nextInt();
        System.out.println("Enter the marks of math");
        int math= sc.nextInt();
        double avgMarks=(phy+chem+math)/3;
        System.out.println("Avg marks : "+avgMarks);

    }
}
