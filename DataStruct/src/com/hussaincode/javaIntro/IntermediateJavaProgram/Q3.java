package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;

// 3.Calculate Average Of N Numbers
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of elements");
        int numOfEle=sc.nextInt();
        System.out.println("Total num of elements "+numOfEle);
        System.out.println("Enter numbers");
        for (int i=1;i<=numOfEle;i++){
            int num = sc.nextInt();
            sum=sum+num;
        }
        double avg= sum/numOfEle;
        System.out.println("average of "+numOfEle+ " is "+avg);
    }
}
