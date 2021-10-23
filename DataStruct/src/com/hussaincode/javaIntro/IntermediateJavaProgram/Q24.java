package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

//Check Leap Year Or Not
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year=sc.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
