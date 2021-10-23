package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

// 5.Calculate Distance Between Two Points
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of 1st point");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        System.out.println("Enter the co-ordinates of 2nd point");
        int y1=sc.nextInt();
        int y2=sc.nextInt();

        double distanceBetTwoPoints= Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("Distance between 2 points is "+distanceBetTwoPoints);
    }
}
