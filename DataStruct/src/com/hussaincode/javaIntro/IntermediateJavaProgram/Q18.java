package com.hussaincode.javaIntro.IntermediateJavaProgram;

import java.util.Scanner;
//Find if a number is palindrome or not
public class Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while (num>0){
            int rem=num%10;
            sum=(sum*10)+rem;
            num/=10;
        }
        if (temp==sum){
            System.out.println("Pelindrome");
        }else{
            System.out.println("Not Pelindrome");
        }
    }
}
