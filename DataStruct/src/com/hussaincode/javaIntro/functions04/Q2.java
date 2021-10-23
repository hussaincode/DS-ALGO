package com.hussaincode.javaIntro.functions04;

import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        evenOdd(num);
    }

    static void evenOdd(int input) {
        if (input%2==0){
            System.out.println(input+" is even");
        }else{
            System.out.println(input+" is odd");
        }
    }
}
