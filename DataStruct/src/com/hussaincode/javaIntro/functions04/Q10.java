package com.hussaincode.javaIntro.functions04;

import java.util.Scanner;

//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        pelindrome(num);
    }

     static void pelindrome(int num) {
        int temp=num;
        int rev=0;
        while (num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if (temp==rev){
            System.out.println("Pelindrome");
        }else
            System.out.println("Not Pelindrome");
    }
}
