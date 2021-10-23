package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total marks");
        double totalMarks=sc.nextInt();
        System.out.println("Enter marks java programmer got");
        double javaProgrMarks=sc.nextInt();
        double cgpa=((javaProgrMarks/totalMarks)*100)/9.5;
        System.out.println(cgpa);
    }
}
