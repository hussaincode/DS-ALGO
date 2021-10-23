package com.hussaincode.javaIntro.functions04;

import java.util.Scanner;

//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double rad=sc.nextDouble();
        circ(rad);
        area(rad);
    }
     static void area(double rad) {
         System.out.println("Area of circle: "+Math.PI*rad*rad);
    }

    private static void circ(double rad) {
        System.out.println("Circumference of circle: "+2*Math.PI*rad);
    }
}
