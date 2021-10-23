package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;
//Sum Of N Numbers
public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total number");
        int num=sc.nextInt();
        int sum=0;
        System.out.println("Enter the numbers");
        for (int i=0;i<num;i++){
            int n=sc.nextInt();
            sum=sum+n;
        }
        System.out.println("sum of "+num+" is "+sum);

    }
}
